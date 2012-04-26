/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subresource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.SubresourceTypeImpl#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubresourceTypeImpl extends ResourceTypeImpl implements SubresourceType {
	/**
	 * The cached value of the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType containingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubresourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.SUBRESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getContainingType() {
		if (containingType != null && containingType.eIsProxy()) {
			InternalEObject oldContainingType = (InternalEObject)containingType;
			containingType = (ResourceType)eResolveProxy(oldContainingType);
			if (containingType != oldContainingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE, oldContainingType, containingType));
			}
		}
		return containingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetContainingType() {
		return containingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingType(ResourceType newContainingType) {
		ResourceType oldContainingType = containingType;
		containingType = newContainingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE, oldContainingType, containingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
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
			case RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE:
				setContainingType((ResourceType)newValue);
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
			case RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE:
				setContainingType((ResourceType)null);
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
			case RestStructurePackage.SUBRESOURCE_TYPE__CONTAINING_TYPE:
				return containingType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubresourceTypeImpl
