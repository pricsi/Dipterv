/**
 */
package TTMCHybrid.impl;

import TTMCConstraint.impl.ConstraintSpecificationImpl;

import TTMCHybrid.HybridAutomatonDeclaration;
import TTMCHybrid.HybridSpecification;
import TTMCHybrid.PropertyDeclaration;
import TTMCHybrid.TTMCHybridPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.impl.HybridSpecificationImpl#getHybridAutomatonDeclarations <em>Hybrid Automaton Declarations</em>}</li>
 *   <li>{@link TTMCHybrid.impl.HybridSpecificationImpl#getPropertyDeclarations <em>Property Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridSpecificationImpl extends ConstraintSpecificationImpl implements HybridSpecification {
	/**
	 * The cached value of the '{@link #getHybridAutomatonDeclarations() <em>Hybrid Automaton Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridAutomatonDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<HybridAutomatonDeclaration> hybridAutomatonDeclarations;

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
	protected HybridSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCHybridPackage.Literals.HYBRID_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HybridAutomatonDeclaration> getHybridAutomatonDeclarations() {
		if (hybridAutomatonDeclarations == null) {
			hybridAutomatonDeclarations = new EObjectContainmentEList<HybridAutomatonDeclaration>(HybridAutomatonDeclaration.class, this, TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS);
		}
		return hybridAutomatonDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyDeclaration> getPropertyDeclarations() {
		if (propertyDeclarations == null) {
			propertyDeclarations = new EObjectContainmentEList<PropertyDeclaration>(PropertyDeclaration.class, this, TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS);
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS:
				return ((InternalEList<?>)getHybridAutomatonDeclarations()).basicRemove(otherEnd, msgs);
			case TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS:
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS:
				return getHybridAutomatonDeclarations();
			case TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS:
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS:
				getHybridAutomatonDeclarations().clear();
				getHybridAutomatonDeclarations().addAll((Collection<? extends HybridAutomatonDeclaration>)newValue);
				return;
			case TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS:
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS:
				getHybridAutomatonDeclarations().clear();
				return;
			case TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS:
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
			case TTMCHybridPackage.HYBRID_SPECIFICATION__HYBRID_AUTOMATON_DECLARATIONS:
				return hybridAutomatonDeclarations != null && !hybridAutomatonDeclarations.isEmpty();
			case TTMCHybridPackage.HYBRID_SPECIFICATION__PROPERTY_DECLARATIONS:
				return propertyDeclarations != null && !propertyDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HybridSpecificationImpl
