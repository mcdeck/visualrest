/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ProjectionResourceTypeImpl#getProjectedType <em>Projected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionResourceTypeImpl extends ResourceTypeImpl implements ProjectionResourceType {
	/**
	 * The cached value of the '{@link #getProjectedType() <em>Projected Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType projectedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectionResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.PROJECTION_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getProjectedType() {
		if (projectedType != null && projectedType.eIsProxy()) {
			InternalEObject oldProjectedType = (InternalEObject)projectedType;
			projectedType = (ResourceType)eResolveProxy(oldProjectedType);
			if (projectedType != oldProjectedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE, oldProjectedType, projectedType));
			}
		}
		return projectedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetProjectedType() {
		return projectedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedType(ResourceType newProjectedType) {
		ResourceType oldProjectedType = projectedType;
		projectedType = newProjectedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE, oldProjectedType, projectedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE:
				if (resolve) return getProjectedType();
				return basicGetProjectedType();
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
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE:
				setProjectedType((ResourceType)newValue);
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
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE:
				setProjectedType((ResourceType)null);
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
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE:
				return projectedType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectionResourceTypeImpl
