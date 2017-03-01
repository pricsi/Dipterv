/**
 */
package TTMCSystem;

import TTMCConstraint.ParametrizedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.SystemReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getSystemReference()
 * @model
 * @generated
 */
public interface SystemReference extends TTMCSystem.System, ParametrizedElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(SystemDeclaration)
	 * @see TTMCSystem.TTMCSystemPackage#getSystemReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	SystemDeclaration getReference();

	/**
	 * Sets the value of the '{@link TTMCSystem.SystemReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(SystemDeclaration value);

} // SystemReference
