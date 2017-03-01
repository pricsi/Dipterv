/**
 */
package TTMCHybrid;

import TTMCConstraint.NamedElement;
import TTMCConstraint.ParametricElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Automaton Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.HybridAutomatonDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDeclaration()
 * @model
 * @generated
 */
public interface HybridAutomatonDeclaration extends NamedElement, ParametricElement {
	/**
	 * Returns the value of the '<em><b>Hybrid Automaton</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Automaton</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Automaton</em>' containment reference.
	 * @see #setHybridAutomaton(HybridAutomaton)
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonDeclaration_HybridAutomaton()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HybridAutomaton getHybridAutomaton();

	/**
	 * Sets the value of the '{@link TTMCHybrid.HybridAutomatonDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid Automaton</em>' containment reference.
	 * @see #getHybridAutomaton()
	 * @generated
	 */
	void setHybridAutomaton(HybridAutomaton value);

} // HybridAutomatonDeclaration
