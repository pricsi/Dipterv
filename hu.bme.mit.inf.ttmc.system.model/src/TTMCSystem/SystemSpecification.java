/**
 */
package TTMCSystem;

import TTMCConstraint.ConstraintSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.SystemSpecification#getSystemDeclarations <em>System Declarations</em>}</li>
 *   <li>{@link TTMCSystem.SystemSpecification#getPropertyDeclarations <em>Property Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getSystemSpecification()
 * @model
 * @generated
 */
public interface SystemSpecification extends ConstraintSpecification {
	/**
	 * Returns the value of the '<em><b>System Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCSystem.SystemDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Declarations</em>' containment reference list.
	 * @see TTMCSystem.TTMCSystemPackage#getSystemSpecification_SystemDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemDeclaration> getSystemDeclarations();

	/**
	 * Returns the value of the '<em><b>Property Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCSystem.PropertyDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Declarations</em>' containment reference list.
	 * @see TTMCSystem.TTMCSystemPackage#getSystemSpecification_PropertyDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDeclaration> getPropertyDeclarations();

} // SystemSpecification
