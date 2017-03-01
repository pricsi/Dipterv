/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.RationalLiteralExpression;
import TTMCConstraint.TTMCConstraintPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rational Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.RationalLiteralExpressionImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link TTMCConstraint.impl.RationalLiteralExpressionImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RationalLiteralExpressionImpl extends ArithmeticLiteralExpressionImpl implements RationalLiteralExpression {
	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numerator = NUMERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DENOMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger denominator = DENOMINATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationalLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.RATIONAL_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(BigInteger newNumerator) {
		BigInteger oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__NUMERATOR, oldNumerator, numerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(BigInteger newDenominator) {
		BigInteger oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__NUMERATOR:
				return getNumerator();
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__DENOMINATOR:
				return getDenominator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__NUMERATOR:
				setNumerator((BigInteger)newValue);
				return;
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__DENOMINATOR:
				setDenominator((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__NUMERATOR:
				setNumerator(NUMERATOR_EDEFAULT);
				return;
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__DENOMINATOR:
				setDenominator(DENOMINATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__NUMERATOR:
				return NUMERATOR_EDEFAULT == null ? numerator != null : !NUMERATOR_EDEFAULT.equals(numerator);
			case TTMCConstraintPackage.RATIONAL_LITERAL_EXPRESSION__DENOMINATOR:
				return DENOMINATOR_EDEFAULT == null ? denominator != null : !DENOMINATOR_EDEFAULT.equals(denominator);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numerator: ");
		result.append(numerator);
		result.append(", denominator: ");
		result.append(denominator);
		result.append(')');
		return result.toString();
	}

} //RationalLiteralExpressionImpl
