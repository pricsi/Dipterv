/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.constraint.language.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import hu.bme.mit.inf.ttmc.constraint.language.ui.internal.TTMCConstraintLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TTMCConstraintLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TTMCConstraintLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TTMCConstraintLanguageActivator.getInstance().getInjector(TTMCConstraintLanguageActivator.HU_BME_MIT_INF_TTMC_CONSTRAINT_LANGUAGE_TTMCCONSTRAINTLANGUAGE);
	}
	
}