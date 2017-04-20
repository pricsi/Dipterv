package hu.bme.mit.inf.ttmc.hybrid.verification

import TTMCHybrid.HybridAutomaton
import TTMCHybrid.HybridSpecification
import TTMCHybrid.InitialCondition
import TTMCHybrid.Location
import TTMCHybrid.Transition
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.ArrayList
import TTMCConstraint.Expression

class HybridVerifier {
	
	List<Location> locList
	List<Transition> transList
	HybridAutomaton automaton
	Expression tempExpression //temporal expression to be checked
	private List<Location> BMCList = new ArrayList<Location>
	Map<Location,Set<Location>> transPairList = new HashMap<Location,Set<Location>>
	boolean hasSat = false
	
	
	def collectLocations(HybridAutomaton automat) {
		locList = automat.eContents.filter(Location).toList
	}
	
	def collectTransactions(HybridAutomaton automat) {
		transList = automat.eContents.filter(Transition).toList
		locList.forEach[x|transPairList.put(x,new HashSet<Location>)]
		transList.forEach[x | transitionate(x)]
	}
	
	def transitionate(Transition trans) {
		transPairList.get(trans.source).add(trans.target)
	}
	
	def isInit(Location lok){
		return (! lok.eContents.filter(InitialCondition).empty)
	}
	
	def void recursiveBMCheck(int depth, int minDepth, int maxDepth) {
		if (hasSat)
			return
		val currLoc = BMCList.get(BMCList.size-1)
		if (depth >= minDepth) {
			checkPath(BMCList)
		}
		if (depth < maxDepth) {
			transPairList.get(currLoc).forEach[y|BMCList.add(y);recursiveBMCheck(depth+1,minDepth,maxDepth);BMCList.remove(BMCList.size-1)]
		}
	}
	
	def doBoundedModelCheck(int minDepth, int maxDepth) {
		hasSat = false
		locList.filter[x|isInit(x)].forEach[y|BMCList.add(y);recursiveBMCheck(0,minDepth,maxDepth);BMCList.remove(BMCList.size-1)]
	}
	
	def checkPath(List<Location> traj){
		if (hasSat)
			return
		val pathChecker = new PathChecker(automaton, BMCList.clone, tempExpression)
		pathChecker.t_infty = 100.0
		val result = pathChecker.checkPath
		printList()
		if (result.toString.equals("sat")) {
			println(''': SAT!''')
			hasSat = true
			visualizeSatPath(traj)
		}		
		else if (result.toString.equals("unsat"))
			println(''': unsat''')
		else println('''Something strange happened: «result.toString»''')
	}
	
	def visualizeSatPath(List<Location> traj) {
		val pathChecker = new PathChecker(automaton, BMCList.clone, tempExpression)
		pathChecker.t_infty = 100.0
		pathChecker.visualize = true
		val result = pathChecker.checkPath
		if (result.toString.equals("sat")) {
			println("nyuszi")
		}		
		else println('''What the actual ****: «result.toString»''')
	}
	
	def printList(){
		BMCList.forEach[x|print('''«x.name» ''')]
	}
	
	def dRealVerify(HybridSpecification model) {
		automaton = model.propertyDeclarations.get(0).hybridAutomaton
		tempExpression = model.propertyDeclarations.get(0).expression
		collectLocations(automaton)
		collectTransactions(automaton)
		doBoundedModelCheck(0,3)

	}
	
	def spaceExVerify(HybridSpecification model){
		val spaceExPrinter = new SpaceExPrinter(model)
		spaceExPrinter.printXml()
	}
	
	def verify(HybridSpecification model) {
		//println('''dReal verification result:''')
		//dRealVerify(model)
		println('''SpaceEx verification...''')
		spaceExVerify(model)	
	}

	
	
}