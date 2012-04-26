/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.AttributeReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.reststructure.Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.AttributeReferenceImpl#getReferencedAttribute <em>Referenced Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeReferenceImpl extends WritableReferenceImpl implements AttributeReference {
	/**
	 * The cached value of the '{@link #getReferencedAttribute() <em>Referenced Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute referencedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.ATTRIBUTE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getReferencedAttribute() {
		if (referencedAttribute != null && referencedAttribute.eIsProxy()) {
			InternalEObject oldReferencedAttribute = (InternalEObject)referencedAttribute;
			referencedAttribute = (Attribute)eResolveProxy(oldReferencedAttribute);
			if (referencedAttribute != oldReferencedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE, oldReferencedAttribute, referencedAttribute));
			}
		}
		return referencedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetReferencedAttribute() {
		return referencedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedAttribute(Attribute newReferencedAttribute) {
		Attribute oldReferencedAttribute = referencedAttribute;
		referencedAttribute = newReferencedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE, oldReferencedAttribute, referencedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
				if (resolve) return getReferencedAttribute();
				return basicGetReferencedAttribute();
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
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
				setReferencedAttribute((Attribute)newValue);
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
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
				setReferencedAttribute((Attribute)null);
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
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE:
				return referencedAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeReferenceImpl
