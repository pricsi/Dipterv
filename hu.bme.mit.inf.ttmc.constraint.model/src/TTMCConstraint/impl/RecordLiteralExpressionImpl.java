/**
 */
package TTMCConstraint.impl;

import TTMCConstraint.FieldAssignment;
import TTMCConstraint.RecordLiteralExpression;
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
 * An implementation of the model object '<em><b>Record Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TTMCConstraint.impl.RecordLiteralExpressionImpl#getFieldAssignments <em>Field Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordLiteralExpressionImpl extends LiteralExpressionImpl implements RecordLiteralExpression {
	/**
	 * The cached value of the '{@link #getFieldAssignments() <em>Field Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldAssignment> fieldAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTMCConstraintPackage.Literals.RECORD_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldAssignment> getFieldAssignments() {
		if (fieldAssignments == null) {
			fieldAssignments = new EObjectContainmentEList<FieldAssignment>(FieldAssignment.class, this, TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS);
		}
		return fieldAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS:
				return ((InternalEList<?>)getFieldAssignments()).basicRemove(otherEnd, msgs);
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
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS:
				return getFieldAssignments();
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
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS:
				getFieldAssignments().clear();
				getFieldAssignments().addAll((Collection<? extends FieldAssignment>)newValue);
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
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS:
				getFieldAssignments().clear();
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
			case TTMCConstraintPackage.RECORD_LITERAL_EXPRESSION__FIELD_ASSIGNMENTS:
				return fieldAssignments != null && !fieldAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordLiteralExpressionImpl
