/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.ArrayTypeDefinition#getIndexTypes <em>Index Types</em>}</li>
 *   <li>{@link TTMCConstraint.ArrayTypeDefinition#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getArrayTypeDefinition()
 * @model
 * @generated
 */
public interface ArrayTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Index Types</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Types</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getArrayTypeDefinition_IndexTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getIndexTypes();

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(Type)
	 * @see TTMCConstraint.TTMCConstraintPackage#getArrayTypeDefinition_ElementType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getElementType();

	/**
	 * Sets the value of the '{@link TTMCConstraint.ArrayTypeDefinition#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Type value);

} // ArrayTypeDefinition
