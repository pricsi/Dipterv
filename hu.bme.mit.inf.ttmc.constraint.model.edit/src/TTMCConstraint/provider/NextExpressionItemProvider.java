/**
 */
package TTMCConstraint.provider;


import TTMCConstraint.NextExpression;
import TTMCConstraint.TTMCConstraintFactory;
import TTMCConstraint.TTMCConstraintPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TTMCConstraint.NextExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NextExpressionItemProvider extends TemporalPathExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NextExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NextExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NextExpression_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NextExpression.class)) {
			case TTMCConstraintPackage.NEXT_EXPRESSION__OPERAND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createDecimalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createRationalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createTrueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createFalseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createArrayLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createFunctionLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createRecordLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createEnumerationLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createTupleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createIfThenElseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createLetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createReleaseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createUntilExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createGloballyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createNextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createTemporalForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createTemporalExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createInExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createPrimedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createInequalityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createGreaterEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createLessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createLessEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createAddExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createMultiplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createUnaryMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createUnaryPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createFunctionAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createArrayAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createTupleAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.UNARY_EXPRESSION__OPERAND,
				 TTMCConstraintFactory.eINSTANCE.createRecordAccessExpression()));
	}

}
