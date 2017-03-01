/**
 */
package TTMCHybrid;

import TTMCConstraint.Expression;
import TTMCConstraint.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.PropertyDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}</li>
 *   <li>{@link TTMCHybrid.PropertyDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getPropertyDeclaration()
 * @model
 * @generated
 */
public interface PropertyDeclaration extends NamedElement {
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
	 * @see TTMCHybrid.TTMCHybridPackage#getPropertyDeclaration_HybridAutomaton()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HybridAutomaton getHybridAutomaton();

	/**
	 * Sets the value of the '{@link TTMCHybrid.PropertyDeclaration#getHybridAutomaton <em>Hybrid Automaton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid Automaton</em>' containment reference.
	 * @see #getHybridAutomaton()
	 * @generated
	 */
	void setHybridAutomaton(HybridAutomaton value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see TTMCHybrid.TTMCHybridPackage#getPropertyDeclaration_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link TTMCHybrid.PropertyDeclaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PropertyDeclaration
