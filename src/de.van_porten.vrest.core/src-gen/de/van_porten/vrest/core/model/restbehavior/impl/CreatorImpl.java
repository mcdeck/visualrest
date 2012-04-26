/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.restbehavior.Creator;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl#getConsumedMT <em>Consumed MT</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl#getCreatorParams <em>Creator Params</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl#getCreatebehavior <em>Createbehavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatorImpl extends EObjectImpl implements Creator {
	/**
	 * The cached value of the '{@link #getConsumedMT() <em>Consumed MT</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedMT()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaType> consumedMT;

	/**
	 * The cached value of the '{@link #getCreatorParams() <em>Creator Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> creatorParams;

	/**
	 * The cached value of the '{@link #getCreatebehavior() <em>Createbehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatebehavior()
	 * @generated
	 * @ordered
	 */
	protected BehaviorSpecification createbehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.CREATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaType> getConsumedMT() {
		if (consumedMT == null) {
			consumedMT = new EObjectResolvingEList<MediaType>(MediaType.class, this, RestBehaviorPackage.CREATOR__CONSUMED_MT);
		}
		return consumedMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getCreatorParams() {
		if (creatorParams == null) {
			creatorParams = new EObjectContainmentEList<Parameter>(Parameter.class, this, RestBehaviorPackage.CREATOR__CREATOR_PARAMS);
		}
		return creatorParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification getCreatebehavior() {
		return createbehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatebehavior(BehaviorSpecification newCreatebehavior, NotificationChain msgs) {
		BehaviorSpecification oldCreatebehavior = createbehavior;
		createbehavior = newCreatebehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CREATOR__CREATEBEHAVIOR, oldCreatebehavior, newCreatebehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatebehavior(BehaviorSpecification newCreatebehavior) {
		if (newCreatebehavior != createbehavior) {
			NotificationChain msgs = null;
			if (createbehavior != null)
				msgs = ((InternalEObject)createbehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CREATOR__CREATEBEHAVIOR, null, msgs);
			if (newCreatebehavior != null)
				msgs = ((InternalEObject)newCreatebehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CREATOR__CREATEBEHAVIOR, null, msgs);
			msgs = basicSetCreatebehavior(newCreatebehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CREATOR__CREATEBEHAVIOR, newCreatebehavior, newCreatebehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.CREATOR__CREATOR_PARAMS:
				return ((InternalEList<?>)getCreatorParams()).basicRemove(otherEnd, msgs);
			case RestBehaviorPackage.CREATOR__CREATEBEHAVIOR:
				return basicSetCreatebehavior(null, msgs);
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
			case RestBehaviorPackage.CREATOR__CONSUMED_MT:
				return getConsumedMT();
			case RestBehaviorPackage.CREATOR__CREATOR_PARAMS:
				return getCreatorParams();
			case RestBehaviorPackage.CREATOR__CREATEBEHAVIOR:
				return getCreatebehavior();
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
			case RestBehaviorPackage.CREATOR__CONSUMED_MT:
				getConsumedMT().clear();
				getConsumedMT().addAll((Collection<? extends MediaType>)newValue);
				return;
			case RestBehaviorPackage.CREATOR__CREATOR_PARAMS:
				getCreatorParams().clear();
				getCreatorParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RestBehaviorPackage.CREATOR__CREATEBEHAVIOR:
				setCreatebehavior((BehaviorSpecification)newValue);
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
			case RestBehaviorPackage.CREATOR__CONSUMED_MT:
				getConsumedMT().clear();
				return;
			case RestBehaviorPackage.CREATOR__CREATOR_PARAMS:
				getCreatorParams().clear();
				return;
			case RestBehaviorPackage.CREATOR__CREATEBEHAVIOR:
				setCreatebehavior((BehaviorSpecification)null);
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
			case RestBehaviorPackage.CREATOR__CONSUMED_MT:
				return consumedMT != null && !consumedMT.isEmpty();
			case RestBehaviorPackage.CREATOR__CREATOR_PARAMS:
				return creatorParams != null && !creatorParams.isEmpty();
			case RestBehaviorPackage.CREATOR__CREATEBEHAVIOR:
				return createbehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //CreatorImpl
