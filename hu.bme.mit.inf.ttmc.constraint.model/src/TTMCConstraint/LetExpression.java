/**
 */
package TTMCConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.LetExpression#getLetDeclarations <em>Let Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.LetExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getLetExpression()
 * @model
 * @generated
 */
public interface LetExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Let Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link TTMCConstraint.LetDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Declarations</em>' containment reference list.
	 * @see TTMCConstraint.TTMCConstraintPackage#getLetExpression_LetDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LetDeclaration> getLetDeclarations();

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
	 * @see TTMCConstraint.TTMCConstraintPackage#getLetExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link TTMCConstraint.LetExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // LetExpression
