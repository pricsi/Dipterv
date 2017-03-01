/**
 */
package TTMCConstraint;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rational Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.RationalLiteralExpression#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link TTMCConstraint.RationalLiteralExpression#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see TTMCConstraint.TTMCConstraintPackage#getRationalLiteralExpression()
 * @model
 * @generated
 */
public interface RationalLiteralExpression extends ArithmeticLiteralExpression {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #setNumerator(BigInteger)
	 * @see TTMCConstraint.TTMCConstraintPackage#getRationalLiteralExpression_Numerator()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumerator();

	/**
	 * Sets the value of the '{@link TTMCConstraint.RationalLiteralExpression#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(BigInteger)
	 * @see TTMCConstraint.TTMCConstraintPackage#getRationalLiteralExpression_Denominator()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getDenominator();

	/**
	 * Sets the value of the '{@link TTMCConstraint.RationalLiteralExpression#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(BigInteger value);

} // RationalLiteralExpression
