/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.FieldDeclaration;
import TTMCConstraint.RecordTypeDefinition;
import TTMCConstraint.TTMCConstraintPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.RecordTypeDefinitionImpl#getFieldDeclarations <em>Field Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeDefinitionImpl extends TypeDefinitionImpl implements RecordTypeDefinition {
	/**
	 * The cached value of the '{@link #getFieldDeclarations() <em>Field Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDeclaration> fieldDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.RECORD_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDeclaration> getFieldDeclarations() {
		if (fieldDeclarations == null) {
			fieldDeclarations = new EObjectContainmentEList<FieldDeclaration>(FieldDeclaration.class, this, TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS);
		}
		return fieldDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS:
				return ((InternalEList<?>)getFieldDeclarations()).basicRemove(otherEnd, msgs);
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
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS:
				return getFieldDeclarations();
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
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS:
				getFieldDeclarations().clear();
				getFieldDeclarations().addAll((Collection<? extends FieldDeclaration>)newValue);
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
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS:
				getFieldDeclarations().clear();
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
			case TTMCConstraintPackage.RECORD_TYPE_DEFINITION__FIELD_DECLARATIONS:
				return fieldDeclarations != null && !fieldDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordTypeDefinitionImpl
