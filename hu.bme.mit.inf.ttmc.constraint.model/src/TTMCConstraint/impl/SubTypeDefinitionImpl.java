/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.Expression;
import TTMCConstraint.ParameterDeclaration;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.SubTypeDefinition;
import TTMCConstraint.TTMCConstraintPackage;

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
 * An implementation of the model object '<em><b>Sub Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.SubTypeDefinitionImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link TTMCConstraint.impl.SubTypeDefinitionImpl#getParameterDeclaration <em>Parameter Declaration</em>}</li>
 *   <li>{@link TTMCConstraint.impl.SubTypeDefinitionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubTypeDefinitionImpl extends TypeDefinitionImpl implements SubTypeDefinition {
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
	 * The cached value of the '{@link #getParameterDeclaration() <em>Parameter Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ParameterDeclaration parameterDeclaration;

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
	protected SubTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.SUB_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclaration> getParameterDeclarations() {
		if (parameterDeclarations == null) {
			parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS);
		}
		return parameterDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDeclaration getParameterDeclaration() {
		return parameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterDeclaration(ParameterDeclaration newParameterDeclaration, NotificationChain msgs) {
		ParameterDeclaration oldParameterDeclaration = parameterDeclaration;
		parameterDeclaration = newParameterDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION, oldParameterDeclaration, newParameterDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterDeclaration(ParameterDeclaration newParameterDeclaration) {
		if (newParameterDeclaration != parameterDeclaration) {
			NotificationChain msgs = null;
			if (parameterDeclaration != null)
				msgs = ((InternalEObject)parameterDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION, null, msgs);
			if (newParameterDeclaration != null)
				msgs = ((InternalEObject)newParameterDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION, null, msgs);
			msgs = basicSetParameterDeclaration(newParameterDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION, newParameterDeclaration, newParameterDeclaration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS:
				return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION:
				return basicSetParameterDeclaration(null, msgs);
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION:
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
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS:
				return getParameterDeclarations();
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION:
				return getParameterDeclaration();
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION:
				return getExpression();
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
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
				return;
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION:
				setParameterDeclaration((ParameterDeclaration)newValue);
				return;
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION:
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
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				return;
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION:
				setParameterDeclaration((ParameterDeclaration)null);
				return;
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION:
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
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS:
				return parameterDeclarations != null && !parameterDeclarations.isEmpty();
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATION:
				return parameterDeclaration != null;
			case TTMCConstraintPackage.SUB_TYPE_DEFINITION__EXPRESSION:
				return expression != null;
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
				case TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS: return TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS;
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
				case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS: return TTMCConstraintPackage.SUB_TYPE_DEFINITION__PARAMETER_DECLARATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubTypeDefinitionImpl
