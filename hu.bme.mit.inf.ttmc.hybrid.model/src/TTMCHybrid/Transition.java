/**
 */
package TTMCHybrid;

import TTMCConstraint.Expression;
import TTMCConstraint.ParametricElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link TTMCHybrid.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link TTMCHybrid.Transition#getGuards <em>Guards</em>}</li>
 *   <li>{@link TTMCHybrid.Transition#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ParametricElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see TTMCHybrid.TTMCHybridPackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link TTMCHybrid.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Location)
	 * @see TTMCHybrid.TTMCHybridPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	Location getTarget();

	/**
	 * Sets the value of the '{@link TTMCHybrid.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Location value);

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getTransition_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGuards();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCHybrid.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see TTMCHybrid.TTMCHybridPackage#getTransition_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignments();

} // Transition
