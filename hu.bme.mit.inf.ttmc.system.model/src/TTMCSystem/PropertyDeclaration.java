/**
 */
package TTMCSystem;

import TTMCConstraint.Expression;
import TTMCConstraint.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.PropertyDeclaration#getSystem <em>System</em>}</li>
 *   <li>{@link TTMCSystem.PropertyDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getPropertyDeclaration()
 * @model
 * @generated
 */
public interface PropertyDeclaration extends NamedElement {
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
	 * @see TTMCSystem.TTMCSystemPackage#getPropertyDeclaration_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TTMCSystem.System getSystem();

	/**
	 * Sets the value of the '{@link TTMCSystem.PropertyDeclaration#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(TTMCSystem.System value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see TTMCSystem.TTMCSystemPackage#getPropertyDeclaration_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link TTMCSystem.PropertyDeclaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PropertyDeclaration
