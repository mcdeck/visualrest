/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.Link;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;
import de.van_porten.vrest.core.model.reststructure.RepresentationLink;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl#getCorrespondingLink <em>Corresponding Link</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl#getLinkValue <em>Link Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationLinkImpl extends EObjectImpl implements RepresentationLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespondingLink() <em>Corresponding Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingLink()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeLink correspondingLink;

	/**
	 * The cached value of the '{@link #getLinkValue() <em>Link Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkValue()
	 * @generated
	 * @ordered
	 */
	protected Link linkValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.REPRESENTATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLink getCorrespondingLink() {
		if (correspondingLink != null && correspondingLink.eIsProxy()) {
			InternalEObject oldCorrespondingLink = (InternalEObject)correspondingLink;
			correspondingLink = (MediaTypeLink)eResolveProxy(oldCorrespondingLink);
			if (correspondingLink != oldCorrespondingLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK, oldCorrespondingLink, correspondingLink));
			}
		}
		return correspondingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLink basicGetCorrespondingLink() {
		return correspondingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingLink(MediaTypeLink newCorrespondingLink) {
		MediaTypeLink oldCorrespondingLink = correspondingLink;
		correspondingLink = newCorrespondingLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK, oldCorrespondingLink, correspondingLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLinkValue() {
		if (linkValue != null && linkValue.eIsProxy()) {
			InternalEObject oldLinkValue = (InternalEObject)linkValue;
			linkValue = (Link)eResolveProxy(oldLinkValue);
			if (linkValue != oldLinkValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE, oldLinkValue, linkValue));
			}
		}
		return linkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLinkValue() {
		return linkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkValue(Link newLinkValue) {
		Link oldLinkValue = linkValue;
		linkValue = newLinkValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE, oldLinkValue, linkValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.REPRESENTATION_LINK__NAME:
				return getName();
			case RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK:
				if (resolve) return getCorrespondingLink();
				return basicGetCorrespondingLink();
			case RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE:
				if (resolve) return getLinkValue();
				return basicGetLinkValue();
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
			case RestStructurePackage.REPRESENTATION_LINK__NAME:
				setName((String)newValue);
				return;
			case RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK:
				setCorrespondingLink((MediaTypeLink)newValue);
				return;
			case RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE:
				setLinkValue((Link)newValue);
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
			case RestStructurePackage.REPRESENTATION_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK:
				setCorrespondingLink((MediaTypeLink)null);
				return;
			case RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE:
				setLinkValue((Link)null);
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
			case RestStructurePackage.REPRESENTATION_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestStructurePackage.REPRESENTATION_LINK__CORRESPONDING_LINK:
				return correspondingLink != null;
			case RestStructurePackage.REPRESENTATION_LINK__LINK_VALUE:
				return linkValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RepresentationLinkImpl
