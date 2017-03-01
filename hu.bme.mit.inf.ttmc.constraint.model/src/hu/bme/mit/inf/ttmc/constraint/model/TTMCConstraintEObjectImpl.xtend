package hu.bme.mit.inf.ttmc.constraint.model

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import hu.bme.mit.inf.ttmc.constraint.model.utils.ConstraintPrettyPrinter
import hu.bme.mit.inf.ttmc.constraint.model.utils.impl.ConstraintPrettyPrinterImpl

class TTMCConstraintEObjectImpl extends MinimalEObjectImpl.Container {
	
	extension ConstraintPrettyPrinter printer = new ConstraintPrettyPrinterImpl
	
	override toString() {
		var String result
		try {
			result = this.asString
		} catch (Exception e) {
			return super.toString
		}
		return result
	}
	
}