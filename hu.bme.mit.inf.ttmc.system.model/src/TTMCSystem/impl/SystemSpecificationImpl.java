/**
 */
package TTMCSystem.impl;

import TTMCConstraint.impl.ConstraintSpecificationImpl;

import TTMCSystem.PropertyDeclaration;
import TTMCSystem.SystemDeclaration;
import TTMCSystem.SystemSpecification;
import TTMCSystem.TTMCSystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TTMCSystem.impl.SystemSpecificationImpl#getSystemDeclarations <em>System Declarations</em>}</li>
 *   <li>{@link TTMCSystem.impl.SystemSpecificationImpl#getPropertyDeclarations <em>Property Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemSpecificationImpl extends ConstraintSpecificationImpl implements SystemSpecification {
	/**
	 * The cached value of the '{@link #getSystemDeclarations() <em>System Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemDeclaration> systemDeclarations;

	/**
	 * The cached value of the '{@link #getPropertyDeclarations() <em>Property Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDeclaration> propertyDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCSystemPackage.Literals.SYSTEM_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemDeclaration> getSystemDeclarations() {
		if (systemDeclarations == null) {
			systemDeclarations = new EObjectContainmentEList<SystemDeclaration>(SystemDeclaration.class, this, TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS);
		}
		return systemDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyDeclaration> getPropertyDeclarations() {
		if (propertyDeclarations == null) {
			propertyDeclarations = new EObjectContainmentEList<PropertyDeclaration>(PropertyDeclaration.class, this, TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS);
		}
		return propertyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS:
				return ((InternalEList<?>)getSystemDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS:
				return ((InternalEList<?>)getPropertyDeclarations()).basicRemove(otherEnd, msgs);
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
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS:
				return getSystemDeclarations();
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS:
				return getPropertyDeclarations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS:
				getSystemDeclarations().clear();
				getSystemDeclarations().addAll((Collection<? extends SystemDeclaration>)newValue);
				return;
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS:
				getPropertyDeclarations().clear();
				getPropertyDeclarations().addAll((Collection<? extends PropertyDeclaration>)newValue);
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
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS:
				getSystemDeclarations().clear();
				return;
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS:
				getPropertyDeclarations().clear();
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
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__SYSTEM_DECLARATIONS:
				return systemDeclarations != null && !systemDeclarations.isEmpty();
			case TTMCSystemPackage.SYSTEM_SPECIFICATION__PROPERTY_DECLARATIONS:
				return propertyDeclarations != null && !propertyDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemSpecificationImpl
