/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.ExternalLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Link Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ExternalLinkReferenceImpl#getReferencedExternalLink <em>Referenced External Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalLinkReferenceImpl extends WritableReferenceImpl implements ExternalLinkReference {
	/**
	 * The cached value of the '{@link #getReferencedExternalLink() <em>Referenced External Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedExternalLink()
	 * @generated
	 * @ordered
	 */
	protected ExternalLink referencedExternalLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.EXTERNAL_LINK_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink getReferencedExternalLink() {
		if (referencedExternalLink != null && referencedExternalLink.eIsProxy()) {
			InternalEObject oldReferencedExternalLink = (InternalEObject)referencedExternalLink;
			referencedExternalLink = (ExternalLink)eResolveProxy(oldReferencedExternalLink);
			if (referencedExternalLink != oldReferencedExternalLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK, oldReferencedExternalLink, referencedExternalLink));
			}
		}
		return referencedExternalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink basicGetReferencedExternalLink() {
		return referencedExternalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedExternalLink(ExternalLink newReferencedExternalLink) {
		ExternalLink oldReferencedExternalLink = referencedExternalLink;
		referencedExternalLink = newReferencedExternalLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK, oldReferencedExternalLink, referencedExternalLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK:
				if (resolve) return getReferencedExternalLink();
				return basicGetReferencedExternalLink();
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
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK:
				setReferencedExternalLink((ExternalLink)newValue);
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
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK:
				setReferencedExternalLink((ExternalLink)null);
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
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK:
				return referencedExternalLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalLinkReferenceImpl
