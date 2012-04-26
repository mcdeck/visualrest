/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl#getFirstOpType <em>First Op Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl#getSecondOpType <em>Second Op Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinOpTypeImpl extends OpTypeImpl implements BinOpType {
	/**
	 * The cached value of the '{@link #getFirstOpType() <em>First Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOpType()
	 * @generated
	 * @ordered
	 */
	protected DataType firstOpType;

	/**
	 * The cached value of the '{@link #getSecondOpType() <em>Second Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOpType()
	 * @generated
	 * @ordered
	 */
	protected DataType secondOpType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinOpTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.BIN_OP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFirstOpType() {
		if (firstOpType != null && firstOpType.eIsProxy()) {
			InternalEObject oldFirstOpType = (InternalEObject)firstOpType;
			firstOpType = (DataType)eResolveProxy(oldFirstOpType);
			if (firstOpType != oldFirstOpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE, oldFirstOpType, firstOpType));
			}
		}
		return firstOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetFirstOpType() {
		return firstOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOpType(DataType newFirstOpType) {
		DataType oldFirstOpType = firstOpType;
		firstOpType = newFirstOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE, oldFirstOpType, firstOpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSecondOpType() {
		if (secondOpType != null && secondOpType.eIsProxy()) {
			InternalEObject oldSecondOpType = (InternalEObject)secondOpType;
			secondOpType = (DataType)eResolveProxy(oldSecondOpType);
			if (secondOpType != oldSecondOpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE, oldSecondOpType, secondOpType));
			}
		}
		return secondOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSecondOpType() {
		return secondOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOpType(DataType newSecondOpType) {
		DataType oldSecondOpType = secondOpType;
		secondOpType = newSecondOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE, oldSecondOpType, secondOpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE:
				if (resolve) return getFirstOpType();
				return basicGetFirstOpType();
			case RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE:
				if (resolve) return getSecondOpType();
				return basicGetSecondOpType();
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
			case RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE:
				setFirstOpType((DataType)newValue);
				return;
			case RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE:
				setSecondOpType((DataType)newValue);
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
			case RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE:
				setFirstOpType((DataType)null);
				return;
			case RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE:
				setSecondOpType((DataType)null);
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
			case RestBehaviorPackage.BIN_OP_TYPE__FIRST_OP_TYPE:
				return firstOpType != null;
			case RestBehaviorPackage.BIN_OP_TYPE__SECOND_OP_TYPE:
				return secondOpType != null;
		}
		return super.eIsSet(featureID);
	}

} //BinOpTypeImpl
