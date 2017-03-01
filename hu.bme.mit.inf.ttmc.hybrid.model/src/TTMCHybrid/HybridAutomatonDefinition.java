/**
 */
package TTMCHybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Automaton Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.HybridAutomatonDefinition#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link TTMCHybrid.HybridAutomatonDefinition#getLocations <em>Locations</em>}</li>
 *   <li>{@link TTMCHybrid.HybridAutomatonDefinition#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDefinition()
 * @model
 * @generated
 */
public interface HybridAutomatonDefinition extends HybridAutomaton {
	/**
	 * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declarations</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDefinition_VariableDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariableDeclarations();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDefinition_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDefinition_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // HybridAutomatonDefinition
