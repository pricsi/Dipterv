/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.RecordLiteralExpression#getFieldAssignments <em>Field Assignments</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getRecordLiteralExpression()
 * @model
 * @generated
 */
public interface RecordLiteralExpression extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Field Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.FieldAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Assignments</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getRecordLiteralExpression_FieldAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldAssignment> getFieldAssignments();

} // RecordLiteralExpression
