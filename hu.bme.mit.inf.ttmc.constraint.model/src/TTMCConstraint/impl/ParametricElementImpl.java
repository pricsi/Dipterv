/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.ParameterDeclaration;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.TTMCConstraintPackage;

import hu.bme.mit.inf.ttmc.constraint.model.TTMCConstraintEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametric Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.ParametricElementImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParametricElementImpl extends TTMCConstraintEObjectImpl implements ParametricElement {
	/**
	 * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDeclaration> parameterDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametricElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.PARAMETRIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclaration> getParameterDeclarations() {
		if (parameterDeclarations == null) {
			parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS);
		}
		return parameterDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS:
				return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
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
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS:
				return getParameterDeclarations();
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
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
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
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
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
			case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS:
				return parameterDeclarations != null && !parameterDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParametricElementImpl
