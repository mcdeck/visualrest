/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.AttributeImpl#getAttrType <em>Attr Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends ResourceElementImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getAttrType() <em>Attr Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrType()
	 * @generated
	 * @ordered
	 */
	protected DataType attrType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAttrType() {
		if (attrType != null && attrType.eIsProxy()) {
			InternalEObject oldAttrType = (InternalEObject)attrType;
			attrType = (DataType)eResolveProxy(oldAttrType);
			if (attrType != oldAttrType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.ATTRIBUTE__ATTR_TYPE, oldAttrType, attrType));
			}
		}
		return attrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAttrType() {
		return attrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrType(DataType newAttrType) {
		DataType oldAttrType = attrType;
		attrType = newAttrType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.ATTRIBUTE__ATTR_TYPE, oldAttrType, attrType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.ATTRIBUTE__ATTR_TYPE:
				if (resolve) return getAttrType();
				return basicGetAttrType();
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
			case RestStructurePackage.ATTRIBUTE__ATTR_TYPE:
				setAttrType((DataType)newValue);
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
			case RestStructurePackage.ATTRIBUTE__ATTR_TYPE:
				setAttrType((DataType)null);
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
			case RestStructurePackage.ATTRIBUTE__ATTR_TYPE:
				return attrType != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
