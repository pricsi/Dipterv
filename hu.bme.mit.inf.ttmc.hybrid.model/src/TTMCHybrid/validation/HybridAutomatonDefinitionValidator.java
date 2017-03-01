/**
 *
 * $Id$
 */
package TTMCHybrid.validation;

import TTMCHybrid.Location;
import TTMCHybrid.Transition;
import TTMCHybrid.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link TTMCHybrid.HybridAutomatonDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HybridAutomatonDefinitionValidator {
	boolean validate();

	boolean validateVariableDeclarations(EList<VariableDeclaration> value);
	boolean validateLocations(EList<Location> value);
	boolean validateTransitions(EList<Transition> value);
}