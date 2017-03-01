/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.SubrangeTypeDefinition#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link TTMCConstraint.SubrangeTypeDefinition#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getSubrangeTypeDefinition()
 * @model
 * @generated
 */
public interface SubrangeTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(Expression)
	 * @see TTMCConstraint.TTMCConstraintPackage#getSubrangeTypeDefinition_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLowerBound();

	/**
	 * Sets the value of the '{@link TTMCConstraint.SubrangeTypeDefinition#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(Expression)
	 * @see TTMCConstraint.TTMCConstraintPackage#getSubrangeTypeDefinition_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUpperBound();

	/**
	 * Sets the value of the '{@link TTMCConstraint.SubrangeTypeDefinition#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Expression value);

} // SubrangeTypeDefinition
