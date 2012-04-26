/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.InternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.WritableReference;

import de.van_porten.vrest.core.model.reststructure.InternalLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl#getReferencedLink <em>Referenced Link</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl#getReferencedReference <em>Referenced Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalLinkReferenceImpl extends WritableReferenceImpl implements InternalLinkReference {
	/**
	 * The cached value of the '{@link #getReferencedLink() <em>Referenced Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedLink()
	 * @generated
	 * @ordered
	 */
	protected InternalLink referencedLink;

	/**
	 * The cached value of the '{@link #getReferencedReference() <em>Referenced Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedReference()
	 * @generated
	 * @ordered
	 */
	protected WritableReference referencedReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.INTERNAL_LINK_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink getReferencedLink() {
		if (referencedLink != null && referencedLink.eIsProxy()) {
			InternalEObject oldReferencedLink = (InternalEObject)referencedLink;
			referencedLink = (InternalLink)eResolveProxy(oldReferencedLink);
			if (referencedLink != oldReferencedLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK, oldReferencedLink, referencedLink));
			}
		}
		return referencedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink basicGetReferencedLink() {
		return referencedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedLink(InternalLink newReferencedLink) {
		InternalLink oldReferencedLink = referencedLink;
		referencedLink = newReferencedLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK, oldReferencedLink, referencedLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableReference getReferencedReference() {
		return referencedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedReference(WritableReference newReferencedReference, NotificationChain msgs) {
		WritableReference oldReferencedReference = referencedReference;
		referencedReference = newReferencedReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE, oldReferencedReference, newReferencedReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedReference(WritableReference newReferencedReference) {
		if (newReferencedReference != referencedReference) {
			NotificationChain msgs = null;
			if (referencedReference != null)
				msgs = ((InternalEObject)referencedReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE, null, msgs);
			if (newReferencedReference != null)
				msgs = ((InternalEObject)newReferencedReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE, null, msgs);
			msgs = basicSetReferencedReference(newReferencedReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE, newReferencedReference, newReferencedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE:
				return basicSetReferencedReference(null, msgs);
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
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK:
				if (resolve) return getReferencedLink();
				return basicGetReferencedLink();
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE:
				return getReferencedReference();
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
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK:
				setReferencedLink((InternalLink)newValue);
				return;
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE:
				setReferencedReference((WritableReference)newValue);
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
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK:
				setReferencedLink((InternalLink)null);
				return;
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE:
				setReferencedReference((WritableReference)null);
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
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_LINK:
				return referencedLink != null;
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE:
				return referencedReference != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalLinkReferenceImpl
