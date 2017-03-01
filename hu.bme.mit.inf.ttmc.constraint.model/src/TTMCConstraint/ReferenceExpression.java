/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.ReferenceExpression#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getReferenceExpression()
 * @model
 * @generated
 */
public interface ReferenceExpression extends NullaryExpression {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(Declaration)
	 * @see TTMCConstraint.TTMCConstraintPackage#getReferenceExpression_Declaration()
	 * @model required="true"
	 * @generated
	 */
	Declaration getDeclaration();

	/**
	 * Sets the value of the '{@link TTMCConstraint.ReferenceExpression#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Declaration value);

} // ReferenceExpression
