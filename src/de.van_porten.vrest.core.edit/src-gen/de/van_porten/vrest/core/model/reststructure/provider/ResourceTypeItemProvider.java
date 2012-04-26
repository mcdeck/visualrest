/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.provider;


import de.van_porten.vrest.core.model.rest.provider.RestEditPlugin;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.van_porten.vrest.core.model.reststructure.ResourceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeItemProvider
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
	public ResourceTypeItemProvider(AdapterFactory adapterFactory) {
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

			addInitialStatePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIsSingletonPropertyDescriptor(object);
			addCreateOnStartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_initialState_feature", "_UI_ResourceType_type"),
				 RestStructurePackage.Literals.RESOURCE_TYPE__INITIAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_name_feature", "_UI_ResourceType_type"),
				 RestStructurePackage.Literals.RESOURCE_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Singleton feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingletonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isSingleton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isSingleton_feature", "_UI_ResourceType_type"),
				 RestStructurePackage.Literals.RESOURCE_TYPE__IS_SINGLETON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create On Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateOnStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_createOnStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_createOnStart_feature", "_UI_ResourceType_type"),
				 RestStructurePackage.Literals.RESOURCE_TYPE__CREATE_ON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(RestStructurePackage.Literals.RESOURCE_TYPE__IDENTIFER);
			childrenFeatures.add(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS);
			childrenFeatures.add(RestStructurePackage.Literals.RESOURCE_TYPE__METHODS);
			childrenFeatures.add(RestStructurePackage.Literals.RESOURCE_TYPE__CREATORS);
			childrenFeatures.add(RestStructurePackage.Literals.RESOURCE_TYPE__STATES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceType_type") :
			getString("_UI_ResourceType_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceType.class)) {
			case RestStructurePackage.RESOURCE_TYPE__NAME:
			case RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON:
			case RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
			case RestStructurePackage.RESOURCE_TYPE__STATES:
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
				(RestStructurePackage.Literals.RESOURCE_TYPE__IDENTIFER,
				 RestStructureFactory.eINSTANCE.createSimpleIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__IDENTIFER,
				 RestStructureFactory.eINSTANCE.createComplexIdentifierPattern()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createLinkCollection()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createExternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createExternalLinkCollection()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__RESOURCEELEMENTS,
				 RestStructureFactory.eINSTANCE.createInternalLinkCollection()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__METHODS,
				 RestStructureFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__CREATORS,
				 RestBehaviorFactory.eINSTANCE.createCreator()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__STATES,
				 RestBehaviorFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(RestStructurePackage.Literals.RESOURCE_TYPE__STATES,
				 RestBehaviorFactory.eINSTANCE.createDeletedState()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RestEditPlugin.INSTANCE;
	}

}
