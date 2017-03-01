/**
 */
package TTMCHybrid.provider;


import TTMCHybrid.HybridAutomatonDefinition;
import TTMCHybrid.TTMCHybridFactory;
import TTMCHybrid.TTMCHybridPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TTMCHybrid.HybridAutomatonDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridAutomatonDefinitionItemProvider extends HybridAutomatonItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridAutomatonDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS);
			childrenFeatures.add(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__LOCATIONS);
			childrenFeatures.add(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS);
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
	 * This returns HybridAutomatonDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HybridAutomatonDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_HybridAutomatonDefinition_type");
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

		switch (notification.getFeatureID(HybridAutomatonDefinition.class)) {
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS:
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__LOCATIONS:
			case TTMCHybridPackage.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS:
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
				(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS,
				 TTMCHybridFactory.eINSTANCE.createLocalVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__VARIABLE_DECLARATIONS,
				 TTMCHybridFactory.eINSTANCE.createGlobalVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__LOCATIONS,
				 TTMCHybridFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(TTMCHybridPackage.Literals.HYBRID_AUTOMATON_DEFINITION__TRANSITIONS,
				 TTMCHybridFactory.eINSTANCE.createTransition()));
	}

}
