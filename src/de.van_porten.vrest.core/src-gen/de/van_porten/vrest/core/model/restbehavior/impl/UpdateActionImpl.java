/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.core.model.restbehavior.Value;
import de.van_porten.vrest.core.model.restbehavior.WritableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl#getElementForUpdate <em>Element For Update</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateActionImpl extends ActionImpl implements UpdateAction {
	/**
	 * The cached value of the '{@link #getElementForUpdate() <em>Element For Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementForUpdate()
	 * @generated
	 * @ordered
	 */
	protected WritableReference elementForUpdate;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected Value newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.UPDATE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableReference getElementForUpdate() {
		return elementForUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementForUpdate(WritableReference newElementForUpdate, NotificationChain msgs) {
		WritableReference oldElementForUpdate = elementForUpdate;
		elementForUpdate = newElementForUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE, oldElementForUpdate, newElementForUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementForUpdate(WritableReference newElementForUpdate) {
		if (newElementForUpdate != elementForUpdate) {
			NotificationChain msgs = null;
			if (elementForUpdate != null)
				msgs = ((InternalEObject)elementForUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE, null, msgs);
			if (newElementForUpdate != null)
				msgs = ((InternalEObject)newElementForUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE, null, msgs);
			msgs = basicSetElementForUpdate(newElementForUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE, newElementForUpdate, newElementForUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewValue(Value newNewValue, NotificationChain msgs) {
		Value oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE, oldNewValue, newNewValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(Value newNewValue) {
		if (newNewValue != newValue) {
			NotificationChain msgs = null;
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE, null, msgs);
			if (newNewValue != null)
				msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE, null, msgs);
			msgs = basicSetNewValue(newNewValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE, newNewValue, newNewValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE:
				return basicSetElementForUpdate(null, msgs);
			case RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE:
				return basicSetNewValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE:
				return getElementForUpdate();
			case RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE:
				return getNewValue();
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
			case RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE:
				setElementForUpdate((WritableReference)newValue);
				return;
			case RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE:
				setNewValue((Value)newValue);
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
			case RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE:
				setElementForUpdate((WritableReference)null);
				return;
			case RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE:
				setNewValue((Value)null);
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
			case RestBehaviorPackage.UPDATE_ACTION__ELEMENT_FOR_UPDATE:
				return elementForUpdate != null;
			case RestBehaviorPackage.UPDATE_ACTION__NEW_VALUE:
				return newValue != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateActionImpl
