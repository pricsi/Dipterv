/**
 */
package TTMCSystem;

import TTMCConstraint.NamedElement;
import TTMCConstraint.ParametricElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.SystemDeclaration#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getSystemDeclaration()
 * @model
 * @generated
 */
public interface SystemDeclaration extends NamedElement, ParametricElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(TTMCSystem.System)
	 * @see TTMCSystem.TTMCSystemPackage#getSystemDeclaration_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TTMCSystem.System getSystem();

	/**
	 * Sets the value of the '{@link TTMCSystem.SystemDeclaration#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(TTMCSystem.System value);

} // SystemDeclaration
