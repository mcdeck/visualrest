/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest.provider;


import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestPackage;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;

import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;

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
 * This is the item provider adapter for a {@link de.van_porten.vrest.core.model.rest.RestApplicationModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestApplicationModelItemProvider
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
	public RestApplicationModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_RestApplicationModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RestApplicationModel_name_feature", "_UI_RestApplicationModel_type"),
				 RestPackage.Literals.REST_APPLICATION_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__METHOD_TYPES);
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__DATA_TYPES);
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__MEDIA_TYPES);
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES);
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__REL_TYPES);
			childrenFeatures.add(RestPackage.Literals.REST_APPLICATION_MODEL__OPTYPES);
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
	 * This returns RestApplicationModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RestApplicationModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RestApplicationModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RestApplicationModel_type") :
			getString("_UI_RestApplicationModel_type") + " " + label;
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

		switch (notification.getFeatureID(RestApplicationModel.class)) {
			case RestPackage.REST_APPLICATION_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
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
				(RestPackage.Literals.REST_APPLICATION_MODEL__METHOD_TYPES,
				 RestStructureFactory.eINSTANCE.createMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__DATA_TYPES,
				 RestStructureFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__DATA_TYPES,
				 RestStructureFactory.eINSTANCE.createCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__MEDIA_TYPES,
				 RestStructureFactory.eINSTANCE.createMediaType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createSubresourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createAggregationResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createPrimaryResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createActivityResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createPagingResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createProjectionResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createListResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__RESOURCE_TYPES,
				 RestStructureFactory.eINSTANCE.createFilterResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__REL_TYPES,
				 RestStructureFactory.eINSTANCE.createRelationType()));

		newChildDescriptors.add
			(createChildParameter
				(RestPackage.Literals.REST_APPLICATION_MODEL__OPTYPES,
				 RestBehaviorFactory.eINSTANCE.createBinOpType()));
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
