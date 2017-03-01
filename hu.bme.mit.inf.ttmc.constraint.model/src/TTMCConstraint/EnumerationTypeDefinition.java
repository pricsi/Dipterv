/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.EnumerationTypeDefinition#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface EnumerationTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.EnumerationLiteralDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getEnumerationTypeDefinition_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteralDefinition> getLiterals();

} // EnumerationTypeDefinition
