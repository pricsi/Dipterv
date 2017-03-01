/**
 */
package TTMCHybrid;

import TTMCConstraint.ConstraintSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.HybridSpecification#getHybridAutomatonDeclarations <em>Hybrid Automaton Declarations</em>}</li>
 *   <li>{@link TTMCHybrid.HybridSpecification#getPropertyDeclarations <em>Property Declarations</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getHybridSpecification()
 * @model
 * @generated
 */
public interface HybridSpecification extends ConstraintSpecification {
	/**
	 * Returns the value of the '<em><b>Hybrid Automaton Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.HybridAutomatonDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Automaton Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Automaton Declarations</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridSpecification_HybridAutomatonDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<HybridAutomatonDeclaration> getHybridAutomatonDeclarations();

	/**
	 * Returns the value of the '<em><b>Property Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.PropertyDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Declarations</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridSpecification_PropertyDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDeclaration> getPropertyDeclarations();

} // HybridSpecification
