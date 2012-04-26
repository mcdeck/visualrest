/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.provider;


import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalActionItemProvider
	extends ActionItemProvider
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
	public ConditionalActionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_CONDITION);
			childrenFeatures.add(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE);
			childrenFeatures.add(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE);
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
	 * This returns ConditionalAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConditionalAction_type");
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

		switch (notification.getFeatureID(ConditionalAction.class)) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
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
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_CONDITION,
				 RestBehaviorFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createMessageAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createCreateAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createListAddAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createListRemoveAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createActionSequence()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createUpdateAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE,
				 RestBehaviorFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createMessageAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createCreateAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createListAddAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createListRemoveAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createActionSequence()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createUpdateAction()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE,
				 RestBehaviorFactory.eINSTANCE.createReturnAction()));
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
			childFeature == RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_TRUE ||
			childFeature == RestBehaviorPackage.Literals.CONDITIONAL_ACTION__ACTION_IF_FALSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
