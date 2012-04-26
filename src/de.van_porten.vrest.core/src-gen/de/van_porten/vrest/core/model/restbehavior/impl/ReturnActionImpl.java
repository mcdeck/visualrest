/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.Metadata;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.core.model.restbehavior.StatusCode;

import de.van_porten.vrest.core.model.reststructure.Representation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnActionImpl extends ActionImpl implements ReturnAction {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusCode status;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Representation representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.RETURN_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusCode newStatus, NotificationChain msgs) {
		StatusCode oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.RETURN_ACTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusCode newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.RETURN_ACTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.RETURN_ACTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.RETURN_ACTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, RestBehaviorPackage.RETURN_ACTION__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(Representation newRepresentation, NotificationChain msgs) {
		Representation oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.RETURN_ACTION__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(Representation newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject)representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.RETURN_ACTION__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject)newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.RETURN_ACTION__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.RETURN_ACTION__REPRESENTATION, newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.RETURN_ACTION__STATUS:
				return basicSetStatus(null, msgs);
			case RestBehaviorPackage.RETURN_ACTION__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case RestBehaviorPackage.RETURN_ACTION__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
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
			case RestBehaviorPackage.RETURN_ACTION__STATUS:
				return getStatus();
			case RestBehaviorPackage.RETURN_ACTION__METADATA:
				return getMetadata();
			case RestBehaviorPackage.RETURN_ACTION__REPRESENTATION:
				return getRepresentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestBehaviorPackage.RETURN_ACTION__STATUS:
				setStatus((StatusCode)newValue);
				return;
			case RestBehaviorPackage.RETURN_ACTION__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case RestBehaviorPackage.RETURN_ACTION__REPRESENTATION:
				setRepresentation((Representation)newValue);
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
			case RestBehaviorPackage.RETURN_ACTION__STATUS:
				setStatus((StatusCode)null);
				return;
			case RestBehaviorPackage.RETURN_ACTION__METADATA:
				getMetadata().clear();
				return;
			case RestBehaviorPackage.RETURN_ACTION__REPRESENTATION:
				setRepresentation((Representation)null);
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
			case RestBehaviorPackage.RETURN_ACTION__STATUS:
				return status != null;
			case RestBehaviorPackage.RETURN_ACTION__METADATA:
				return metadata != null && !metadata.isEmpty();
			case RestBehaviorPackage.RETURN_ACTION__REPRESENTATION:
				return representation != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnActionImpl
