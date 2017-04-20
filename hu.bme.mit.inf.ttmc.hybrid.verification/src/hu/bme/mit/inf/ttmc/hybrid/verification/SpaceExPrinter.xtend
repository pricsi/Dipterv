package hu.bme.mit.inf.ttmc.hybrid.verification

import TTMCHybrid.FlowCondition
import TTMCHybrid.HybridAutomaton
import TTMCHybrid.Location
import java.util.List

import TTMCHybrid.*
import TTMCConstraint.*
import java.util.Map
import java.util.HashMap
import TTMCHybrid.Transition
import java.io.File
import java.io.PrintWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

class SpaceExPrinter {
	HybridAutomaton automaton
	//Expression tempExpression
	List<Location> locations
	List<Transition> transitions
	Map<Location, Integer> locId = new HashMap<Location, Integer>
	//List<Location> path
	List<LocalVariableDeclaration> localVals
	//Map<LocalVariableDeclaration, Double> upperLimits = new HashMap<LocalVariableDeclaration, Double>
	//Map<LocalVariableDeclaration, Double> lowerLimits = new HashMap<LocalVariableDeclaration, Double>
	//double infty = 1000
	//public double t_infty = 100
	//val extension Smtlib2Helper helper = new Smtlib2Helper
	//public boolean needProof = false
	//public boolean visualize = false

	new(HybridSpecification model) {
		this. automaton = model.propertyDeclarations.get(0).hybridAutomaton
		//this.path = path
		//this.tempExpression = tempExpression
		this.localVals = automaton.eContents.filter(LocalVariableDeclaration).toList
		this.locations = automaton.eContents.filter(Location).toList
		for (i : 0 ..< locations.size) {
			locId.put(locations.get(i),i+1)
		}
		this.transitions = automaton.eContents.filter(Transition).toList
		//localVals.forEach[x|upperLimits.put(x, infty); lowerLimits.put(x, 0 - infty)]
		//locList = automaton.eContents.filter(Location).toList
		//setLimits
		//locList.forEach[x, i|dictionary.put(x, '''«i»''')]
		//needProof = false
		//visualize = false
	}
	
	def printXml() {
		val xml='''
		<?xml version="1.0" encoding="iso-8859-1"?>
		<sspaceex xmlns="http://www-verimag.imag.fr/xml-namespaces/sspaceex" version="0.2" math="SpaceEx">
		  <component id="system">
		    «printVariables»
		    «printLocations»
		    «printTransitions»
		  </component>
		</sspaceex>
		'''
		val writer = new PrintWriter("system.xml", "iso-8859-1");
		writer.print(xml);
		writer.close();
	}
	
	def printVariables() {
		'''
			«FOR x : localVals»
				<param name="«x.name»" type="real" local="false" d1="1" d2="1" dynamics="any" />
			«ENDFOR»		
		'''
	}

	def printLocations() {
		'''
		«FOR x : locations»
			«printLocation(x)»
		«ENDFOR»		
		'''
	}
	
	def printLocation(Location loc) {
		val invts = loc.eContents.filter(InvariantCondition).toList
		'''
		<location id="«locId.get(loc)»" name="«loc.name»">
		  «printInvariants(loc)»
		  «printFlows(loc)»
		</location>
		'''
	}
	
	def printTransitions() {
		'''
		«FOR x : transitions»
			«printTransition(x)»
		«ENDFOR»		
		'''		
	}
	
	def printTransition(Transition trans) {
		'''
		<transition source="«locId.get(trans.source)»" target="«locId.get(trans.target)»">
		  «printGuards(trans)»
		  «printAssignments(trans)»
		</transition>
		'''
	}	
	
	def printInvariants(Location loc) {
		val invts = loc.eContents.filter(InvariantCondition).toList
		'''
		<invariant>
		  «FOR x:invts SEPARATOR " &amp; "»«x.expression.toSpaceEx»«ENDFOR»
		</invariant>
		'''
	}
	
	def printFlows(Location loc) {
		val flows = loc.eContents.filter(FlowCondition).toList
		'''
		<flow>
		  «FOR x:flows SEPARATOR " &amp; "»«x.expression.toSpaceEx»«ENDFOR»
		</flow>
		'''
	}
	
	def printGuards(Transition trans) {
		'''
		<guard>
		  «FOR x:trans.guards SEPARATOR " &amp; "»«x.toSpaceEx»«ENDFOR»
		</guard>
		'''
	}
	
	def printAssignments(Transition trans) {
		'''
		<assignment>
		  «FOR x:trans.assignments SEPARATOR " &amp; "»«x.toSpaceEx»«ENDFOR»
		</assignment>
		'''
	}

	def dispatch String toSpaceEx(Assignment ass){
		return '''(«ass.lhs.toSpaceEx»' == «ass.rhs.toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(LessEqualExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» &lt;= «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(GreaterEqualExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» &gt;= «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(LessExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» &lt; «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(GreaterExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» &gt; «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(EqualityExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» == «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(Integer value){
		return "" + value
	}
	
	def dispatch String toSpaceEx(DecimalLiteralExpression exp){
		return exp.value.toSpaceEx
	}
	
	def dispatch String toSpaceEx(Number value){
		val dValue = value.doubleValue() as double
		return "" + dValue
	}
	
	def dispatch String toSpaceEx(BigInteger value){
		return value.toString
	}
	
	def dispatch String toSpaceEx(IntegerLiteralExpression exp){
		return '''«exp.value.toSpaceEx»'''
	}
	
	def dispatch String toSpaceEx(Expression exp){
		'''unknown_expression «exp.eClass»'''
	}
	
	def dispatch String toSpaceEx(AndExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» &amp; «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(OrExpression exp){
		return '''(«exp.eContents.get(0).toSpaceEx» | «exp.eContents.get(1).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(ReferenceExpression exp){
		if (exp.declaration.eClass.name.equalsIgnoreCase('''LocalVariableDeclaration'''))
			return '''«exp.toString»'''
		else if (exp.declaration.eClass.name.equalsIgnoreCase('''ConstantDeclaration'''))
			return (exp.declaration as ConstantDeclaration).expression.toSpaceEx
		else return exp.toString
	}
	
	def dispatch String toSpaceEx(DotExpression exp){
		return '''«exp.operand.toSpaceEx»'«»'''
	}
	
	def dispatch String toSpaceEx(AddExpression exp){
		val terms = exp.eContents
		return '''«FOR x : terms BEFORE "(" SEPARATOR " + " AFTER ")"»«x.toSpaceEx»«ENDFOR»'''
	}
	
	def dispatch String toSpaceEx(MultiplyExpression exp){
		val terms = exp.eContents
		return '''«FOR x : terms BEFORE "(" SEPARATOR " * " AFTER ")"»«x.toSpaceEx»«ENDFOR»'''
	}
	
	def dispatch String toSpaceEx(DivideExpression exp){
		val terms = exp.eContents
		return '''«FOR x : terms BEFORE "(" SEPARATOR " / " AFTER ")"»«x.toSpaceEx»«ENDFOR»'''
	}
	
	def dispatch String toSpaceEx(SubtractExpression exp){
		val terms = exp.eContents
		return '''«FOR x : terms BEFORE "(" SEPARATOR " - " AFTER ")"»«x.toSpaceEx»«ENDFOR»'''
	}
	
	def dispatch String toSpaceEx(UnaryMinusExpression exp){
		return '''(-«exp.eContents.get(0).toSpaceEx»)'''
	}
	
	def dispatch String toSpaceEx(UnaryPlusExpression exp){
		return '''-«exp.eContents.get(0).toSpaceEx»'''
	}

}