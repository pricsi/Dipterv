/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.system.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTTMCSystemLanguageValidator extends hu.bme.mit.inf.ttmc.constraint.language.validation.TTMCConstraintLanguageValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.inf.mit.bme.hu/ttmc/TTMCSystem"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.inf.mit.bme.hu/ttmc/TTMCConstraint"));
		return result;
	}
}