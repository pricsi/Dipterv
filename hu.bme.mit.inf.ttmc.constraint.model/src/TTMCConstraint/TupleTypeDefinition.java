/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.TupleTypeDefinition#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getTupleTypeDefinition()
 * @model
 * @generated
 */
public interface TupleTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getTupleTypeDefinition_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // TupleTypeDefinition
