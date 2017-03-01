/**
 */
package TTMCConstraint;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.TupleAccessExpression#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getTupleAccessExpression()
 * @model
 * @generated
 */
public interface TupleAccessExpression extends AccessExpression {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see TTMCConstraint.TTMCConstraintPackage#getTupleAccessExpression_Index()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link TTMCConstraint.TupleAccessExpression#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

} // TupleAccessExpression
