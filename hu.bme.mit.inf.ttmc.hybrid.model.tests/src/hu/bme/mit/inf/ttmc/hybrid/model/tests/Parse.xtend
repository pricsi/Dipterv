package hu.bme.mit.inf.ttmc.hybrid.model.tests

import hu.bme.mit.inf.ttmc.hybrid.language.TTMCHybridLanguageStandaloneSetupGenerated
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import hu.bme.mit.inf.ttmc.constraint.language.TTMCConstraintLanguageStandaloneSetupGenerated
import TTMCHybrid.TTMCHybridPackage
import TTMCConstraint.TTMCConstraintPackage
import TTMCHybrid.HybridSpecification
import org.junit.Test
import hu.bme.mit.inf.ttmc.hybrid.verification.HybridVerifier

class Parse {
	@Test
	def void test() {
		TTMCConstraintPackage.eINSTANCE.eClass;
		TTMCHybridPackage.eINSTANCE.eClass;
		
		(new TTMCConstraintLanguageStandaloneSetupGenerated).createInjectorAndDoEMFRegistration;
		(new TTMCHybridLanguageStandaloneSetupGenerated).createInjectorAndDoEMFRegistration;
		
		val ResourceSet resSet = new ResourceSetImpl()
		val resource = resSet.getResource(URI.createURI('''models/damposc.hybrid''', true),true)
					
		//println(resource.getContents().get(0))
		
		val root = resource.getContents().get(0)
		val sys = root as HybridSpecification;
		val hvf = new HybridVerifier();
				hvf.verify(sys);
				//System.out.println("Rebus nagyonNAGYON says: :)");
		//SymbolicReachabilityAnalysis.generateZoneGraph(sys)
	}
}