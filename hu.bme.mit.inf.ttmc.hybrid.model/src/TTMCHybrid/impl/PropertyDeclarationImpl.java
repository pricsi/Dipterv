/**
 */
package TTMCHybrid.impl;

import TTMCConstraint.Expression;

import TTMCConstraint.impl.NamedElementImpl;

import TTMCHybrid.HybridAutomaton;
import TTMCHybrid.PropertyDeclaration;
import TTMCHybrid.TTMCHybridPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.impl.PropertyDeclarationImpl#getHybridAutomaton <em>Hybrid Automaton</em>}</li>
 *   <li>{@link TTMCHybrid.impl.PropertyDeclarationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDeclarationImpl extends NamedElementImpl implements PropertyDeclaration {
	/**
	 * The cached value of the '{@link #getHybridAutomaton() <em>Hybrid Automaton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridAutomaton()
	 * @generated
	 * @ordered
	 */
	protected HybridAutomaton hybridAutomaton;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCHybridPackage.Literals.PROPERTY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridAutomaton getHybridAutomaton() {
		return hybridAutomaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHybridAutomaton(HybridAutomaton newHybridAutomaton, NotificationChain msgs) {
		HybridAutomaton oldHybridAutomaton = hybridAutomaton;
		hybridAutomaton = newHybridAutomaton;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON, oldHybridAutomaton, newHybridAutomaton);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHybridAutomaton(HybridAutomaton newHybridAutomaton) {
		if (newHybridAutomaton != hybridAutomaton) {
			NotificationChain msgs = null;
			if (hybridAutomaton != null)
				msgs = ((InternalEObject)hybridAutomaton).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON, null, msgs);
			if (newHybridAutomaton != null)
				msgs = ((InternalEObject)newHybridAutomaton).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON, null, msgs);
			msgs = basicSetHybridAutomaton(newHybridAutomaton, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON, newHybridAutomaton, newHybridAutomaton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON:
				return basicSetHybridAutomaton(null, msgs);
			case TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON:
				return getHybridAutomaton();
			case TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION:
				return getExpression();
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
			case TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON:
				setHybridAutomaton((HybridAutomaton)newValue);
				return;
			case TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION:
				setExpression((Expression)newValue);
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
			case TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON:
				setHybridAutomaton((HybridAutomaton)null);
				return;
			case TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION:
				setExpression((Expression)null);
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
			case TTMCHybridPackage.PROPERTY_DECLARATION__HYBRID_AUTOMATON:
				return hybridAutomaton != null;
			case TTMCHybridPackage.PROPERTY_DECLARATION__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyDeclarationImpl
