/**
 */
package TTMCHybrid;

import TTMCConstraint.ParametrizedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Automaton Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.HybridAutomatonReference#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonReference()
 * @model
 * @generated
 */
public interface HybridAutomatonReference extends HybridAutomaton, ParametrizedElement {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(HybridAutomatonDeclaration)
	 * @see TTMCHybrid.TTMCHybridPackage#getHybridAutomatonReference_Declaration()
	 * @model required="true"
	 * @generated
	 */
	HybridAutomatonDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link TTMCHybrid.HybridAutomatonReference#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(HybridAutomatonDeclaration value);

} // HybridAutomatonReference
