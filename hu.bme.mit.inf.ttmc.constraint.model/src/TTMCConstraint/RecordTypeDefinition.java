/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.RecordTypeDefinition#getFieldDeclarations <em>Field Declarations</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getRecordTypeDefinition()
 * @model
 * @generated
 */
public interface RecordTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Field Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.FieldDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getRecordTypeDefinition_FieldDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldDeclaration> getFieldDeclarations();

} // RecordTypeDefinition
