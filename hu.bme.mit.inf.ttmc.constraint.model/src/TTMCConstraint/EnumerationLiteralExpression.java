/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.EnumerationLiteralExpression#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getEnumerationLiteralExpression()
 * @model
 * @generated
 */
public interface EnumerationLiteralExpression extends NullaryExpression, LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EnumerationLiteralDefinition)
	 * @see TTMCConstraint.TTMCConstraintPackage#getEnumerationLiteralExpression_Reference()
	 * @model required="true"
	 * @generated
	 */
	EnumerationLiteralDefinition getReference();

	/**
	 * Sets the value of the '{@link TTMCConstraint.EnumerationLiteralExpression#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EnumerationLiteralDefinition value);

} // EnumerationLiteralExpression
