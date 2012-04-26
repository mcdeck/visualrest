/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.MTLinkReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Link Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.MTLinkReferenceImpl#getReferencedMTLink <em>Referenced MT Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MTLinkReferenceImpl extends MTReferenceImpl implements MTLinkReference {
	/**
	 * The cached value of the '{@link #getReferencedMTLink() <em>Referenced MT Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMTLink()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeLink referencedMTLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTLinkReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.MT_LINK_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLink getReferencedMTLink() {
		if (referencedMTLink != null && referencedMTLink.eIsProxy()) {
			InternalEObject oldReferencedMTLink = (InternalEObject)referencedMTLink;
			referencedMTLink = (MediaTypeLink)eResolveProxy(oldReferencedMTLink);
			if (referencedMTLink != oldReferencedMTLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK, oldReferencedMTLink, referencedMTLink));
			}
		}
		return referencedMTLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLink basicGetReferencedMTLink() {
		return referencedMTLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMTLink(MediaTypeLink newReferencedMTLink) {
		MediaTypeLink oldReferencedMTLink = referencedMTLink;
		referencedMTLink = newReferencedMTLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK, oldReferencedMTLink, referencedMTLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK:
				if (resolve) return getReferencedMTLink();
				return basicGetReferencedMTLink();
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
			case RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK:
				setReferencedMTLink((MediaTypeLink)newValue);
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
			case RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK:
				setReferencedMTLink((MediaTypeLink)null);
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
			case RestBehaviorPackage.MT_LINK_REFERENCE__REFERENCED_MT_LINK:
				return referencedMTLink != null;
		}
		return super.eIsSet(featureID);
	}

} //MTLinkReferenceImpl
