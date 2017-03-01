/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.FunctionLiteralExpression#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getFunctionLiteralExpression()
 * @model
 * @generated
 */
public interface FunctionLiteralExpression extends UnaryExpression, LiteralExpression, ParametricElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Type)
	 * @see TTMCConstraint.TTMCConstraintPackage#getFunctionLiteralExpression_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link TTMCConstraint.FunctionLiteralExpression#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // FunctionLiteralExpression
