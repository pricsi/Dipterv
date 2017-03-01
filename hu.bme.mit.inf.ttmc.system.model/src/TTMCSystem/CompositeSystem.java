/**
 */
package TTMCSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TTMCSystem.CompositeSystem#getLeftSystem <em>Left System</em>}</li>
 *   <li>{@link TTMCSystem.CompositeSystem#getRightSystem <em>Right System</em>}</li>
 * </ul>
 * </p>
 *
 * @see TTMCSystem.TTMCSystemPackage#getCompositeSystem()
 * @model abstract="true"
 * @generated
 */
public interface CompositeSystem extends TTMCSystem.System {
	/**
	 * Returns the value of the '<em><b>Left System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left System</em>' containment reference.
	 * @see #setLeftSystem(TTMCSystem.System)
	 * @see TTMCSystem.TTMCSystemPackage#getCompositeSystem_LeftSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TTMCSystem.System getLeftSystem();

	/**
	 * Sets the value of the '{@link TTMCSystem.CompositeSystem#getLeftSystem <em>Left System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left System</em>' containment reference.
	 * @see #getLeftSystem()
	 * @generated
	 */
	void setLeftSystem(TTMCSystem.System value);

	/**
	 * Returns the value of the '<em><b>Right System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right System</em>' containment reference.
	 * @see #setRightSystem(TTMCSystem.System)
	 * @see TTMCSystem.TTMCSystemPackage#getCompositeSystem_RightSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TTMCSystem.System getRightSystem();

	/**
	 * Sets the value of the '{@link TTMCSystem.CompositeSystem#getRightSystem <em>Right System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right System</em>' containment reference.
	 * @see #getRightSystem()
	 * @generated
	 */
	void setRightSystem(TTMCSystem.System value);

} // CompositeSystem
