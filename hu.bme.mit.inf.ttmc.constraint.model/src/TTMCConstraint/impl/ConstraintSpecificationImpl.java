/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.BasicConstraintDefinition;
import TTMCConstraint.ConstantDeclaration;
import TTMCConstraint.ConstraintSpecification;
import TTMCConstraint.FunctionDeclaration;
import TTMCConstraint.ParameterDeclaration;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.TTMCConstraintPackage;
import TTMCConstraint.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.ConstraintSpecificationImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.impl.ConstraintSpecificationImpl#getTypeDeclarations <em>Type Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.impl.ConstraintSpecificationImpl#getConstantDeclarations <em>Constant Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.impl.ConstraintSpecificationImpl#getFunctionDeclarations <em>Function Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.impl.ConstraintSpecificationImpl#getBasicConstraintDefinitions <em>Basic Constraint Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintSpecificationImpl extends NamedElementImpl implements ConstraintSpecification {
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
	 * The cached value of the '{@link #getTypeDeclarations() <em>Type Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> typeDeclarations;

	/**
	 * The cached value of the '{@link #getConstantDeclarations() <em>Constant Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantDeclaration> constantDeclarations;

	/**
	 * The cached value of the '{@link #getFunctionDeclarations() <em>Function Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDeclaration> functionDeclarations;

	/**
	 * The cached value of the '{@link #getBasicConstraintDefinitions() <em>Basic Constraint Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicConstraintDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicConstraintDefinition> basicConstraintDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.CONSTRAINT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclaration> getParameterDeclarations() {
		if (parameterDeclarations == null) {
			parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS);
		}
		return parameterDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeclaration> getTypeDeclarations() {
		if (typeDeclarations == null) {
			typeDeclarations = new EObjectContainmentEList<TypeDeclaration>(TypeDeclaration.class, this, TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS);
		}
		return typeDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantDeclaration> getConstantDeclarations() {
		if (constantDeclarations == null) {
			constantDeclarations = new EObjectContainmentEList<ConstantDeclaration>(ConstantDeclaration.class, this, TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS);
		}
		return constantDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDeclaration> getFunctionDeclarations() {
		if (functionDeclarations == null) {
			functionDeclarations = new EObjectContainmentEList<FunctionDeclaration>(FunctionDeclaration.class, this, TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS);
		}
		return functionDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicConstraintDefinition> getBasicConstraintDefinitions() {
		if (basicConstraintDefinitions == null) {
			basicConstraintDefinitions = new EObjectContainmentEList<BasicConstraintDefinition>(BasicConstraintDefinition.class, this, TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS);
		}
		return basicConstraintDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS:
				return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS:
				return ((InternalEList<?>)getTypeDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS:
				return ((InternalEList<?>)getConstantDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS:
				return ((InternalEList<?>)getFunctionDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS:
				return ((InternalEList<?>)getBasicConstraintDefinitions()).basicRemove(otherEnd, msgs);
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
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS:
				return getParameterDeclarations();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS:
				return getTypeDeclarations();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS:
				return getConstantDeclarations();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS:
				return getFunctionDeclarations();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS:
				return getBasicConstraintDefinitions();
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
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS:
				getTypeDeclarations().clear();
				getTypeDeclarations().addAll((Collection<? extends TypeDeclaration>)newValue);
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS:
				getConstantDeclarations().clear();
				getConstantDeclarations().addAll((Collection<? extends ConstantDeclaration>)newValue);
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS:
				getFunctionDeclarations().clear();
				getFunctionDeclarations().addAll((Collection<? extends FunctionDeclaration>)newValue);
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS:
				getBasicConstraintDefinitions().clear();
				getBasicConstraintDefinitions().addAll((Collection<? extends BasicConstraintDefinition>)newValue);
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
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS:
				getTypeDeclarations().clear();
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS:
				getConstantDeclarations().clear();
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS:
				getFunctionDeclarations().clear();
				return;
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS:
				getBasicConstraintDefinitions().clear();
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
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS:
				return parameterDeclarations != null && !parameterDeclarations.isEmpty();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__TYPE_DECLARATIONS:
				return typeDeclarations != null && !typeDeclarations.isEmpty();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__CONSTANT_DECLARATIONS:
				return constantDeclarations != null && !constantDeclarations.isEmpty();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__FUNCTION_DECLARATIONS:
				return functionDeclarations != null && !functionDeclarations.isEmpty();
			case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__BASIC_CONSTRAINT_DEFINITIONS:
				return basicConstraintDefinitions != null && !basicConstraintDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParametricElement.class) {
			switch (derivedFeatureID) {
				case TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS: return TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParametricElement.class) {
			switch (baseFeatureID) {
				case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS: return TTMCConstraintPackage.CONSTRAINT_SPECIFICATION__PARAMETER_DECLARATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstraintSpecificationImpl
