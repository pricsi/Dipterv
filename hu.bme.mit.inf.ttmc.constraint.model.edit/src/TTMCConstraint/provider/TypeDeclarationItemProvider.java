/**
 */
package TTMCConstraint.provider;


import TTMCConstraint.TTMCConstraintFactory;
import TTMCConstraint.TTMCConstraintPackage;
import TTMCConstraint.TypeDeclaration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TTMCConstraint.TypeDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeDeclarationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclarationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE);
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
	 * This returns TypeDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TypeDeclaration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TypeDeclaration_type") :
			getString("_UI_TypeDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(TypeDeclaration.class)) {
			case TTMCConstraintPackage.TYPE_DECLARATION__TYPE:
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
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createIntegerTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createNaturalTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createBooleanTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createRealTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createSubrangeTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createSubTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createEnumerationTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createFunctionTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createArrayTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createTupleTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCConstraintPackage.Literals.TYPE_DECLARATION__TYPE,
				 TTMCConstraintFactory.eINSTANCE.createRecordTypeDefinition()));
	}

}
