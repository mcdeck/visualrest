/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paging Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.PagingResourceTypeImpl#getPagedType <em>Paged Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagingResourceTypeImpl extends ResourceTypeImpl implements PagingResourceType {
	/**
	 * The cached value of the '{@link #getPagedType() <em>Paged Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagedType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType pagedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagingResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.PAGING_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getPagedType() {
		if (pagedType != null && pagedType.eIsProxy()) {
			InternalEObject oldPagedType = (InternalEObject)pagedType;
			pagedType = (ResourceType)eResolveProxy(oldPagedType);
			if (pagedType != oldPagedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE, oldPagedType, pagedType));
			}
		}
		return pagedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetPagedType() {
		return pagedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagedType(ResourceType newPagedType) {
		ResourceType oldPagedType = pagedType;
		pagedType = newPagedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE, oldPagedType, pagedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE:
				if (resolve) return getPagedType();
				return basicGetPagedType();
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
			case RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE:
				setPagedType((ResourceType)newValue);
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
			case RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE:
				setPagedType((ResourceType)null);
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
			case RestStructurePackage.PAGING_RESOURCE_TYPE__PAGED_TYPE:
				return pagedType != null;
		}
		return super.eIsSet(featureID);
	}

} //PagingResourceTypeImpl
