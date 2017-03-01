/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.FunctionTypeDefinition#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link TTMCConstraint.FunctionTypeDefinition#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getFunctionTypeDefinition()
 * @model
 * @generated
 */
public interface FunctionTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getFunctionTypeDefinition_ParameterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getParameterTypes();

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
	 * @see TTMCConstraint.TTMCConstraintPackage#getFunctionTypeDefinition_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link TTMCConstraint.FunctionTypeDefinition#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // FunctionTypeDefinition
