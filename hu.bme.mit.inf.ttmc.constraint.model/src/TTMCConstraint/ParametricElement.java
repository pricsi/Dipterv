/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.ParametricElement#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getParametricElement()
 * @model abstract="true"
 * @generated
 */
public interface ParametricElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.ParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getParametricElement_ParameterDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDeclaration> getParameterDeclarations();

} // ParametricElement
