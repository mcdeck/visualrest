/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.MtElementReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mt Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.MtElementReferenceImpl#getReferencedMTElement <em>Referenced MT Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MtElementReferenceImpl extends MTReferenceImpl implements MtElementReference {
	/**
	 * The cached value of the '{@link #getReferencedMTElement() <em>Referenced MT Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMTElement()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeElement referencedMTElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MtElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.MT_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeElement getReferencedMTElement() {
		if (referencedMTElement != null && referencedMTElement.eIsProxy()) {
			InternalEObject oldReferencedMTElement = (InternalEObject)referencedMTElement;
			referencedMTElement = (MediaTypeElement)eResolveProxy(oldReferencedMTElement);
			if (referencedMTElement != oldReferencedMTElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT, oldReferencedMTElement, referencedMTElement));
			}
		}
		return referencedMTElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeElement basicGetReferencedMTElement() {
		return referencedMTElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMTElement(MediaTypeElement newReferencedMTElement) {
		MediaTypeElement oldReferencedMTElement = referencedMTElement;
		referencedMTElement = newReferencedMTElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT, oldReferencedMTElement, referencedMTElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT:
				if (resolve) return getReferencedMTElement();
				return basicGetReferencedMTElement();
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
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT:
				setReferencedMTElement((MediaTypeElement)newValue);
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
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT:
				setReferencedMTElement((MediaTypeElement)null);
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
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT:
				return referencedMTElement != null;
		}
		return super.eIsSet(featureID);
	}

} //MtElementReferenceImpl
