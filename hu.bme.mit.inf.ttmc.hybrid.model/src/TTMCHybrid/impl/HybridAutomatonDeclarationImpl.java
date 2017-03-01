/**
 */
package TTMCHybrid.impl;

import TTMCConstraint.ParameterDeclaration;
import TTMCConstraint.ParametricElement;
import TTMCConstraint.TTMCConstraintPackage;

import TTMCConstraint.impl.NamedElementImpl;

import TTMCHybrid.HybridAutomaton;
import TTMCHybrid.HybridAutomatonDeclaration;
import TTMCHybrid.TTMCHybridPackage;

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
 * An implementation of the model object '<em><b>Hybrid Automaton Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.impl.HybridAutomatonDeclarationImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link TTMCHybrid.impl.HybridAutomatonDeclarationImpl#getHybridAutomaton <em>Hybrid Automaton</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridAutomatonDeclarationImpl extends NamedElementImpl implements HybridAutomatonDeclaration {
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
	 * The cached value of the '{@link #getHybridAutomaton() <em>Hybrid Automaton</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridAutomaton()
	 * @generated
	 * @ordered
	 */
	protected HybridAutomaton hybridAutomaton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridAutomatonDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclaration> getParameterDeclarations() {
		if (parameterDeclarations == null) {
			parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS);
		}
		return parameterDeclarations;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON, oldHybridAutomaton, newHybridAutomaton);
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
				msgs = ((InternalEObject)hybridAutomaton).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON, null, msgs);
			if (newHybridAutomaton != null)
				msgs = ((InternalEObject)newHybridAutomaton).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON, null, msgs);
			msgs = basicSetHybridAutomaton(newHybridAutomaton, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON, newHybridAutomaton, newHybridAutomaton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS:
				return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON:
				return basicSetHybridAutomaton(null, msgs);
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS:
				return getParameterDeclarations();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON:
				return getHybridAutomaton();
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON:
				setHybridAutomaton((HybridAutomaton)newValue);
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS:
				getParameterDeclarations().clear();
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON:
				setHybridAutomaton((HybridAutomaton)null);
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS:
				return parameterDeclarations != null && !parameterDeclarations.isEmpty();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__HYBRID_AUTOMATON:
				return hybridAutomaton != null;
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
				case TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS: return TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS;
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
				case TTMCConstraintPackage.PARAMETRIC_ELEMENT__PARAMETER_DECLARATIONS: return TTMCHybridPackage.HYBRID_AUTOMATON_DECLARATION__PARAMETER_DECLARATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HybridAutomatonDeclarationImpl
