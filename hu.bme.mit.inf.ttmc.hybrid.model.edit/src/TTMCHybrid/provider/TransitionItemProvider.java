/**
 */
package TTMCHybrid.provider;


import TTMCConstraint.TTMCConstraintFactory;

import TTMCConstraint.provider.ParametricElementItemProvider;

import TTMCHybrid.TTMCHybridFactory;
import TTMCHybrid.TTMCHybridPackage;
import TTMCHybrid.Transition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TTMCHybrid.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider extends ParametricElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_source_feature", "_UI_Transition_type"),
				 TTMCHybridPackage.Literals.TRANSITION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_target_feature", "_UI_Transition_type"),
				 TTMCHybridPackage.Literals.TRANSITION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(TTMCHybridPackage.Literals.TRANSITION__GUARDS);
			childrenFeatures.add(TTMCHybridPackage.Literals.TRANSITION__ASSIGNMENTS);
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
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Transition_type");
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

		switch (notification.getFeatureID(Transition.class)) {
			case TTMCHybridPackage.TRANSITION__GUARDS:
			case TTMCHybridPackage.TRANSITION__ASSIGNMENTS:
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
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCHybridFactory.eINSTANCE.createDotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCHybridFactory.eINSTANCE.createLocationReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createDecimalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createRationalLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createTrueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createFalseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createArrayLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createRecordLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createEnumerationLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createTupleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createIfThenElseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createLetExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createImplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createReleaseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createUntilExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createGloballyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createNextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalForallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createTemporalExistsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createInExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createPrimedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createInequalityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createGreaterEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createLessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createLessEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createAddExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createMultiplyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createUnaryPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createFunctionAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createArrayAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createTupleAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__GUARDS,
				 TTMCConstraintFactory.eINSTANCE.createRecordAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.TRANSITION__ASSIGNMENTS,
				 TTMCHybridFactory.eINSTANCE.createAssignment()));
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
