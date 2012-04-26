/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.provider;


import de.van_porten.vrest.core.model.restbehavior.BinaryOperation;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOperationItemProvider
	extends OperationItemProvider
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
	public BinaryOperationItemProvider(AdapterFactory adapterFactory) {
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

			addOptypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Optype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryOperation_optype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryOperation_optype_feature", "_UI_BinaryOperation_type"),
				 RestBehaviorPackage.Literals.BINARY_OPERATION__OPTYPE,
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
			childrenFeatures.add(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP);
			childrenFeatures.add(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP);
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
	 * This returns BinaryOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinaryOperation_type");
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

		switch (notification.getFeatureID(BinaryOperation.class)) {
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
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
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createInternalLinkReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createMTLinkReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createMtElementReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP,
				 RestBehaviorFactory.eINSTANCE.createExternalLinkReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createInternalLinkReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createMTLinkReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createMtElementReference()));

		newChildDescriptors.add
			(createChildParameter
				(RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP,
				 RestBehaviorFactory.eINSTANCE.createExternalLinkReference()));
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
			childFeature == RestBehaviorPackage.Literals.BINARY_OPERATION__FIRST_OP ||
			childFeature == RestBehaviorPackage.Literals.BINARY_OPERATION__SECOND_OP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
