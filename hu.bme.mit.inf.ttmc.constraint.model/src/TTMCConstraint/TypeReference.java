/**
 */
package TTMCConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.TypeReference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends Type {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(TypeDeclaration)
	 * @see TTMCConstraint.TTMCConstraintPackage#getTypeReference_Reference()
	 * @model
	 * @generated
	 */
	TypeDeclaration getReference();

	/**
	 * Sets the value of the '{@link TTMCConstraint.TypeReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TypeDeclaration value);

} // TypeReference
