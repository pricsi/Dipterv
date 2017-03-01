/**
 */
package TTMCHybrid.impl;

import TTMCHybrid.HybridAutomatonDefinition;
import TTMCHybrid.Location;
import TTMCHybrid.TTMCHybridPackage;
import TTMCHybrid.Transition;
import TTMCHybrid.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Automaton Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.impl.HybridAutomatonDefinitionImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link TTMCHybrid.impl.HybridAutomatonDefinitionImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link TTMCHybrid.impl.HybridAutomatonDefinitionImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridAutomatonDefinitionImpl extends HybridAutomatonImpl implements HybridAutomatonDefinition {
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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridAutomatonDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariableDeclarations() {
		if (variableDeclarations == null) {
			variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS);
		}
		return variableDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
				return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
				return getVariableDeclarations();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
				return getLocations();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
				return getTransitions();
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
				getLocations().clear();
				return;
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
				getTransitions().clear();
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
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
				return variableDeclarations != null && !variableDeclarations.isEmpty();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HybridAutomatonDefinitionImpl
