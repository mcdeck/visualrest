/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ListResourceTypeImpl#getListElementType <em>List Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListResourceTypeImpl extends ResourceTypeImpl implements ListResourceType {
	/**
	 * The cached value of the '{@link #getListElementType() <em>List Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElementType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType listElementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.LIST_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getListElementType() {
		if (listElementType != null && listElementType.eIsProxy()) {
			InternalEObject oldListElementType = (InternalEObject)listElementType;
			listElementType = (ResourceType)eResolveProxy(oldListElementType);
			if (listElementType != oldListElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE, oldListElementType, listElementType));
			}
		}
		return listElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetListElementType() {
		return listElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListElementType(ResourceType newListElementType) {
		ResourceType oldListElementType = listElementType;
		listElementType = newListElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE, oldListElementType, listElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE:
				if (resolve) return getListElementType();
				return basicGetListElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE:
				setListElementType((ResourceType)newValue);
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
			case RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE:
				setListElementType((ResourceType)null);
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
			case RestStructurePackage.LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE:
				return listElementType != null;
		}
		return super.eIsSet(featureID);
	}

} //ListResourceTypeImpl
