/**
 */
package TTMCSystem.impl;

import TTMCSystem.CompositeSystem;
import TTMCSystem.TTMCSystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TTMCSystem.impl.CompositeSystemImpl#getLeftSystem <em>Left System</em>}</li>
 *   <li>{@link TTMCSystem.impl.CompositeSystemImpl#getRightSystem <em>Right System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompositeSystemImpl extends SystemImpl implements CompositeSystem {
	/**
	 * The cached value of the '{@link #getLeftSystem() <em>Left System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSystem()
	 * @generated
	 * @ordered
	 */
	protected TTMCSystem.System leftSystem;

	/**
	 * The cached value of the '{@link #getRightSystem() <em>Right System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSystem()
	 * @generated
	 * @ordered
	 */
	protected TTMCSystem.System rightSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCSystemPackage.Literals.COMPOSITE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCSystem.System getLeftSystem() {
		return leftSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSystem(TTMCSystem.System newLeftSystem, NotificationChain msgs) {
		TTMCSystem.System oldLeftSystem = leftSystem;
		leftSystem = newLeftSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM, oldLeftSystem, newLeftSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSystem(TTMCSystem.System newLeftSystem) {
		if (newLeftSystem != leftSystem) {
			NotificationChain msgs = null;
			if (leftSystem != null)
				msgs = ((InternalEObject)leftSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM, null, msgs);
			if (newLeftSystem != null)
				msgs = ((InternalEObject)newLeftSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM, null, msgs);
			msgs = basicSetLeftSystem(newLeftSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM, newLeftSystem, newLeftSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTMCSystem.System getRightSystem() {
		return rightSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSystem(TTMCSystem.System newRightSystem, NotificationChain msgs) {
		TTMCSystem.System oldRightSystem = rightSystem;
		rightSystem = newRightSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM, oldRightSystem, newRightSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSystem(TTMCSystem.System newRightSystem) {
		if (newRightSystem != rightSystem) {
			NotificationChain msgs = null;
			if (rightSystem != null)
				msgs = ((InternalEObject)rightSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM, null, msgs);
			if (newRightSystem != null)
				msgs = ((InternalEObject)newRightSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM, null, msgs);
			msgs = basicSetRightSystem(newRightSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM, newRightSystem, newRightSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM:
				return basicSetLeftSystem(null, msgs);
			case TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM:
				return basicSetRightSystem(null, msgs);
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
			case TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM:
				return getLeftSystem();
			case TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM:
				return getRightSystem();
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
			case TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM:
				setLeftSystem((TTMCSystem.System)newValue);
				return;
			case TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM:
				setRightSystem((TTMCSystem.System)newValue);
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
			case TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM:
				setLeftSystem((TTMCSystem.System)null);
				return;
			case TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM:
				setRightSystem((TTMCSystem.System)null);
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
			case TTMCSystemPackage.COMPOSITE_SYSTEM__LEFT_SYSTEM:
				return leftSystem != null;
			case TTMCSystemPackage.COMPOSITE_SYSTEM__RIGHT_SYSTEM:
				return rightSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeSystemImpl
