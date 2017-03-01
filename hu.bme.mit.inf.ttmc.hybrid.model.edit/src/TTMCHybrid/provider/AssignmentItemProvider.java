/**
 */
package TTMCHybrid.provider;


import TTMCConstraint.TTMCConstraintFactory;

import TTMCHybrid.Assignment;
import TTMCHybrid.TTMCHybridFactory;
import TTMCHybrid.TTMCHybridPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TTMCHybrid.Assignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TTMCHybridPackage.Literals.ASSIGNMENT__LHS);
			childrenFeatures.add(TTMCHybridPackage.Literals.ASSIGNMENT__RHS);
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
	 * This returns Assignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Assignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Assignment_type");
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

		switch (notification.getFeatureID(Assignment.class)) {
			case TTMCHybridPackage.ASSIGNMENT__LHS:
			case TTMCHybridPackage.ASSIGNMENT__RHS:
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
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCHybridFactory.eINSTANCE.createDotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCHybridFactory.eINSTANCE.createLocationReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createDecimalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createRationalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createTrueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createFalseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createArrayLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createRecordLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createEnumerationLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createTupleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createIfThenElseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createLetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createReleaseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createUntilExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createGloballyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createNextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createInExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createPrimedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createInequalityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createLessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createLessEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createAddExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createMultiplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createArrayAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createTupleAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__LHS,
				 TTMCConstraintFactory.eINSTANCE.createRecordAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCHybridFactory.eINSTANCE.createDotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCHybridFactory.eINSTANCE.createLocationReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createDecimalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createRationalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createTrueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createFalseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createArrayLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createRecordLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createEnumerationLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createTupleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createIfThenElseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createLetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createReleaseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createUntilExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createGloballyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createNextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createInExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createPrimedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createInequalityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createLessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createLessEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createAddExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createMultiplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createArrayAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createTupleAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.ASSIGNMENT__RHS,
				 TTMCConstraintFactory.eINSTANCE.createRecordAccessExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TTMCHybridPackage.Literals.ASSIGNMENT__LHS ||
			childFeature == TTMCHybridPackage.Literals.ASSIGNMENT__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TTMCHybridEditPlugin.INSTANCE;
	}

}
