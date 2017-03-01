/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.SubTypeDefinition#getParameterDeclaration <em>Parameter Declaration</em>}</li>
 *   <li>{@link TTMCConstraint.SubTypeDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getSubTypeDefinition()
 * @model
 * @generated
 */
public interface SubTypeDefinition extends TypeDefinition, ParametricElement {
	/**
	 * Returns the value of the '<em><b>Parameter Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Declaration</em>' containment reference.
	 * @see #setParameterDeclaration(ParameterDeclaration)
	 * @see TTMCConstraint.TTMCConstraintPackage#getSubTypeDefinition_ParameterDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterDeclaration getParameterDeclaration();

	/**
	 * Sets the value of the '{@link TTMCConstraint.SubTypeDefinition#getParameterDeclaration <em>Parameter Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Declaration</em>' containment reference.
	 * @see #getParameterDeclaration()
	 * @generated
	 */
	void setParameterDeclaration(ParameterDeclaration value);

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
	 * @see TTMCConstraint.TTMCConstraintPackage#getSubTypeDefinition_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link TTMCConstraint.SubTypeDefinition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // SubTypeDefinition
