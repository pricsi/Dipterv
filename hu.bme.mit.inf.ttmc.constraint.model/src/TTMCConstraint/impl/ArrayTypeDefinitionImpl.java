/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.ArrayTypeDefinition;
import TTMCConstraint.TTMCConstraintPackage;
import TTMCConstraint.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.ArrayTypeDefinitionImpl#getIndexTypes <em>Index Types</em>}</li>
 *   <li>{@link TTMCConstraint.impl.ArrayTypeDefinitionImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeDefinitionImpl extends TypeDefinitionImpl implements ArrayTypeDefinition {
	/**
	 * The cached value of the '{@link #getIndexTypes() <em>Index Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> indexTypes;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Type elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.ARRAY_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getIndexTypes() {
		if (indexTypes == null) {
			indexTypes = new EObjectContainmentEList<Type>(Type.class, this, TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES);
		}
		return indexTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(Type newElementType, NotificationChain msgs) {
		Type oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE, oldElementType, newElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Type newElementType) {
		if (newElementType != elementType) {
			NotificationChain msgs = null;
			if (elementType != null)
				msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE, null, msgs);
			if (newElementType != null)
				msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE, null, msgs);
			msgs = basicSetElementType(newElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE, newElementType, newElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES:
				return ((InternalEList<?>)getIndexTypes()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
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
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES:
				return getIndexTypes();
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE:
				return getElementType();
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
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES:
				getIndexTypes().clear();
				getIndexTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE:
				setElementType((Type)newValue);
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
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES:
				getIndexTypes().clear();
				return;
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE:
				setElementType((Type)null);
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
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__INDEX_TYPES:
				return indexTypes != null && !indexTypes.isEmpty();
			case TTMCConstraintPackage.ARRAY_TYPE_DEFINITION__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeDefinitionImpl
