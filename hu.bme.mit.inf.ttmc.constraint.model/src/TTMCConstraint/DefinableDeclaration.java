/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.DefinableDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getDefinableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface DefinableDeclaration extends Declaration {
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
	 * @see TTMCConstraint.TTMCConstraintPackage#getDefinableDeclaration_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link TTMCConstraint.DefinableDeclaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // DefinableDeclaration
