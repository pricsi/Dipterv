package hu.bme.mit.inf.ttmc.hybrid.verification

import TTMCHybrid.FlowCondition
import TTMCHybrid.HybridAutomaton
import TTMCHybrid.Location
import java.util.List

import hu.bme.mit.inf.ttmc.hybrid.verification.Smtlib2Helper.*
import TTMCHybrid.*
import TTMCConstraint.*
import java.util.Map
import java.util.HashMap
import TTMCHybrid.Transition
import java.io.File
import java.io.PrintWriter
import java.io.BufferedReader
import java.io.InputStreamReader

class PathChecker {
	HybridAutomaton automaton
	Expression tempExpression
	List<Location> locList
	List<Location> path
	List<LocalVariableDeclaration> localVals
	Map<LocalVariableDeclaration, Double> upperLimits = new HashMap<LocalVariableDeclaration, Double>
	Map<LocalVariableDeclaration, Double> lowerLimits = new HashMap<LocalVariableDeclaration, Double>
	double infty = 1000
	public double t_infty = 100
	val extension Smtlib2Helper helper = new Smtlib2Helper
	public boolean needProof = false
	public boolean visualize = false

	new(HybridAutomaton automaton, List<Location> path, Expression tempExpression) {
		this.automaton = automaton
		this.path = path
		this.tempExpression = tempExpression
		this.localVals = automaton.eContents.filter(LocalVariableDeclaration).toList
		localVals.forEach[x|upperLimits.put(x, infty); lowerLimits.put(x, 0 - infty)]
		locList = automaton.eContents.filter(Location).toList
		setLimits
		locList.forEach[x, i|dictionary.put(x, '''«i»''')]
		needProof = false
		visualize = false
	}

	def setLimits() {
		localVals.forEach [ x |
			x.eContents.filter(SubrangeTypeDefinition).forEach [ t |
				if (t.lowerBound == null) {
					lowerLimits.put(x, -infty)
				} else {
					lowerLimits.put(x, Double.parseDouble(t.lowerBound.toSmtLib2))
				}
				if (t.upperBound == null) {
					lowerLimits.put(x, infty)
				} else {
					upperLimits.put(x, Double.parseDouble(t.upperBound.toSmtLib2))
				}
			]
		]
	}

	def checkPath() {
		val prog = '''
		«printSetLogic»
		«printDeclareFuns»
		«printDefineOdes»
		«printAssertLimits»
		(assert (and
		«printAssertInitials»
		«printLocations»
		«printAssertFinals»
		))
		«printCheckSat»'''
		//println(prog.replaceAll("\\(","("))
		val writer = new PrintWriter("system.smt2", "UTF-8");
		writer.print(prog);
		writer.close();
		var String s;
        var Process p;
        var ret = ''''''
        var runString = "dReal --proof system.smt2"
        if (visualize)
        	runString += " --visualize"
        //path.forEach[x|print('''«x.name» ''')]
        try {
            p = Runtime.getRuntime().exec(runString);
            val BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                ret += s
            p.waitFor();
            //println(" exit: " + p.exitValue());
            p.destroy();
            } catch (Exception e) {
            	print(e.message)
            }
		//val out = new File("macsek.smt2")
		return ret
	}

	def printSetLogic() {
		'''(set-logic QF_NRA_ODE)''' // Real arithmetic with ODEs
	}

	def printCheckSat() {
		'''
		(check-sat)
		(exit)
		'''
	}

	def printDeclareFuns() {
		'''
			«FOR x : localVals»
				(declare-fun «x.name» () Real)
			«ENDFOR»		
			«FOR x : localVals»
				«FOR i:0..<path.size»
					(declare-fun «x.name»_«i»_0 () Real)
					(declare-fun «x.name»_«i»_t () Real)
				«ENDFOR»
			«ENDFOR»
			«FOR i : 0..<path.size»(declare-fun time_«i» () Real)
			«ENDFOR»
			«FOR i : 0..<path.size»(declare-fun mode_«i» () Real)
			«ENDFOR»
		'''
	}

	def printDefineOdes() {
		'''«FOR loc : locList»
		«loc.eContents.filter(FlowCondition).toList.toSmtLib2('''flow_«locList.indexOf(loc)»''')»
		«ENDFOR»'''
	}

	def printAssertLimits() {
		'''
		«FOR i : 0..<path.size»
		«FOR x:localVals»
		(assert (<= «x.name»_«i»_0 «upperLimits.get(x).doubleValue.toSmtLib2»))
		(assert (<= «lowerLimits.get(x).doubleValue.toSmtLib2» «x.name»_«i»_0))
		(assert (<= «x.name»_«i»_t «upperLimits.get(x).doubleValue.toSmtLib2»))
		(assert (<= «lowerLimits.get(x).doubleValue.toSmtLib2» «x.name»_«i»_t))
		«ENDFOR»
		(assert (<= 0 time_«i» [0.000000]))
		(assert (<= time_«i» «t_infty» [0.000000]))
		(assert (<= 0 mode_«i»))
		(assert (<= mode_«i» «locList.size-1»))
		«ENDFOR»'''
	}

	def printAssertInitials() {
		val initCond = path.get(0).eContents.filter(InitialCondition)
		NamePostfix = "_0_0"
		val ret = '''«FOR x : initCond»
		«x.expression.toSmtLib2»
		«ENDFOR»'''
		NamePostfix = ""
		return ret
	}

	def printLocations() {
		'''
		«printLocation(0, path.get(0))»
		«FOR i : 1..<path.size»
		«printTransitions(i, path.get(i - 1), path.get(i))»
		«printLocation(i, path.get(i))»
		«ENDFOR»
		'''
	}

	def printLocation(
		int idx,
		Location loc
	) {
		var ret = '''
		(= mode_«idx» «locList.indexOf(loc)»)
		(= [«FOR v : localVals» «v.name»_«idx»_t «ENDFOR»] (integral 0. time_«idx» [«FOR v : localVals» «v.name»_«idx»_0 «ENDFOR»] flow_«locList.indexOf(loc)»))
		'''
		val invts = loc.eContents.filter(InvariantCondition).toList
		for (x : invts) {
			NamePostfix = '''_«idx»_0'''
			ret += ''' «x.expression.toSmtLib2»
			'''
			NamePostfix = '''_«idx»_t'''
			ret += ''' «x.expression.toSmtLib2»
			'''
			NamePostfix = '''_«idx»_t'''
			ret += ''' (forall_t «locList.indexOf(loc)» [0 time_«idx»] «x.expression.toSmtLib2»)
			'''
			NamePostfix = ""
		}
		return ret
	}

	def printTransitions(
		int toIdx,
		Location from,
		Location to
	) {
		var ret = ''''''
		val transList = automaton.eContents.filter(Transition).filter[x|(x.source == from) && (x.target == to)].toList
		if (transList.size == 1) {
			ret += '''«printTransition(toIdx, transList.get(0))»
			'''
		} else {
			ret += '''(or«FOR tr:transList»«printTransition(toIdx, tr)»«ENDFOR»)
			'''
		}
		return ret
	}

	def printTransition(int toIdx, Transition trans) {
		var ret = ''''''
		if (trans.eContents.size > 1) {
			ret += ''' (and'''
		}

		NamePostfix = '''_«toIdx-1»_t'''
		ret += '''«FOR x:trans.guards» «x.toSmtLib2»«ENDFOR»'''
		NamePostfix = ""

		val assList = trans.assignments.filter(Assignment)
		for (ass : assList) {
			NamePostfix = '''_«toIdx»_0'''
			ret+=''' (= «ass.lhs.toSmtLib2»'''
			NamePostfix = '''_«toIdx-1»_t'''
			ret+=''' «ass.rhs.toSmtLib2»)'''
			NamePostfix = ""
		}

		if (trans.eContents.size > 1) {
			ret+=''')'''
		}
		return ret
	}

	def printAssertFinals() {
		val tempPart = tempExpression.temporalString
		switch tempPart.toString {
			case "EF": printAssertPonatedFin(
				((tempExpression as TemporalExistsExpression).operand as FinallyExpression).operand)
			case "AG": printAssertNegatedFin(
				((tempExpression as TemporalForallExpression).operand as GloballyExpression).operand)
			case "G": printAssertNegatedFin((tempExpression as GloballyExpression).operand)
			case "": printAssertNegatedFin(tempExpression)
			default: '''(Unsupported temporal expression:«tempPart»)'''
		}
	}

	def printAssertPonatedFin(Expression exp) {
		NamePostfix = '''_«path.size-1»_t'''
		val ret = ''' «exp.toSmtLib2»'''
		NamePostfix = ""
		return ret
	}

	def printAssertNegatedFin(Expression exp) {
		NamePostfix = '''_«path.size-1»_t'''
		val ret = ''' (not «exp.toSmtLib2»)'''
		NamePostfix = ""
		return ret
	}

}