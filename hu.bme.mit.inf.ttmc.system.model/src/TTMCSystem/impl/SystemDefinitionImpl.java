/**
 */
package TTMCSystem.impl;

import TTMCSystem.DefinitionDeclaration;
import TTMCSystem.SystemConstraintDefinition;
import TTMCSystem.SystemDefinition;
import TTMCSystem.TTMCSystemPackage;
import TTMCSystem.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TTMCSystem.impl.SystemDefinitionImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link TTMCSystem.impl.SystemDefinitionImpl#getDefinitionDeclarations <em>Definition Declarations</em>}</li>
 *   <li>{@link TTMCSystem.impl.SystemDefinitionImpl#getSystemConstraintDefinitions <em>System Constraint Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemDefinitionImpl extends SystemImpl implements SystemDefinition {
	/**
	 * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> variableDeclarations;

	/**
	 * The cached value of the '{@link #getDefinitionDeclarations() <em>Definition Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionDeclaration> definitionDeclarations;

	/**
	 * The cached value of the '{@link #getSystemConstraintDefinitions() <em>System Constraint Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConstraintDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemConstraintDefinition> systemConstraintDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCSystemPackage.Literals.SYSTEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariableDeclarations() {
		if (variableDeclarations == null) {
			variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS);
		}
		return variableDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionDeclaration> getDefinitionDeclarations() {
		if (definitionDeclarations == null) {
			definitionDeclarations = new EObjectContainmentEList<DefinitionDeclaration>(DefinitionDeclaration.class, this, TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS);
		}
		return definitionDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemConstraintDefinition> getSystemConstraintDefinitions() {
		if (systemConstraintDefinitions == null) {
			systemConstraintDefinitions = new EObjectContainmentEList<SystemConstraintDefinition>(SystemConstraintDefinition.class, this, TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS);
		}
		return systemConstraintDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS:
				return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS:
				return ((InternalEList<?>)getDefinitionDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS:
				return ((InternalEList<?>)getSystemConstraintDefinitions()).basicRemove(otherEnd, msgs);
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
			case TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS:
				return getVariableDeclarations();
			case TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS:
				return getDefinitionDeclarations();
			case TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS:
				return getSystemConstraintDefinitions();
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
			case TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS:
				getDefinitionDeclarations().clear();
				getDefinitionDeclarations().addAll((Collection<? extends DefinitionDeclaration>)newValue);
				return;
			case TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS:
				getSystemConstraintDefinitions().clear();
				getSystemConstraintDefinitions().addAll((Collection<? extends SystemConstraintDefinition>)newValue);
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
			case TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				return;
			case TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS:
				getDefinitionDeclarations().clear();
				return;
			case TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS:
				getSystemConstraintDefinitions().clear();
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
			case TTMCSystemPackage.SYSTEM_DEFINITION__VARIABLE_DECLARATIONS:
				return variableDeclarations != null && !variableDeclarations.isEmpty();
			case TTMCSystemPackage.SYSTEM_DEFINITION__DEFINITION_DECLARATIONS:
				return definitionDeclarations != null && !definitionDeclarations.isEmpty();
			case TTMCSystemPackage.SYSTEM_DEFINITION__SYSTEM_CONSTRAINT_DEFINITIONS:
				return systemConstraintDefinitions != null && !systemConstraintDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemDefinitionImpl
