/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Representation;
import de.van_porten.vrest.core.model.reststructure.RepresentationElement;
import de.van_porten.vrest.core.model.reststructure.RepresentationLink;
import de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl#getContainedRepElements <em>Contained Rep Elements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl#getMediatype <em>Mediatype</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl#getContainedRepLinks <em>Contained Rep Links</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl#getContainedRepLinkCollections <em>Contained Rep Link Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationImpl extends EObjectImpl implements Representation {
	/**
	 * The cached value of the '{@link #getContainedRepElements() <em>Contained Rep Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRepElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationElement> containedRepElements;

	/**
	 * The cached value of the '{@link #getMediatype() <em>Mediatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediatype()
	 * @generated
	 * @ordered
	 */
	protected MediaType mediatype;

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
	 * The cached value of the '{@link #getContainedRepLinks() <em>Contained Rep Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRepLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationLink> containedRepLinks;

	/**
	 * The cached value of the '{@link #getContainedRepLinkCollections() <em>Contained Rep Link Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRepLinkCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationLinkCollection> containedRepLinkCollections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationElement> getContainedRepElements() {
		if (containedRepElements == null) {
			containedRepElements = new EObjectContainmentEList<RepresentationElement>(RepresentationElement.class, this, RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS);
		}
		return containedRepElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType getMediatype() {
		if (mediatype != null && mediatype.eIsProxy()) {
			InternalEObject oldMediatype = (InternalEObject)mediatype;
			mediatype = (MediaType)eResolveProxy(oldMediatype);
			if (mediatype != oldMediatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.REPRESENTATION__MEDIATYPE, oldMediatype, mediatype));
			}
		}
		return mediatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType basicGetMediatype() {
		return mediatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediatype(MediaType newMediatype) {
		MediaType oldMediatype = mediatype;
		mediatype = newMediatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION__MEDIATYPE, oldMediatype, mediatype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationLink> getContainedRepLinks() {
		if (containedRepLinks == null) {
			containedRepLinks = new EObjectContainmentEList<RepresentationLink>(RepresentationLink.class, this, RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS);
		}
		return containedRepLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationLinkCollection> getContainedRepLinkCollections() {
		if (containedRepLinkCollections == null) {
			containedRepLinkCollections = new EObjectContainmentEList<RepresentationLinkCollection>(RepresentationLinkCollection.class, this, RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS);
		}
		return containedRepLinkCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS:
				return ((InternalEList<?>)getContainedRepElements()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS:
				return ((InternalEList<?>)getContainedRepLinks()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS:
				return ((InternalEList<?>)getContainedRepLinkCollections()).basicRemove(otherEnd, msgs);
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
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS:
				return getContainedRepElements();
			case RestStructurePackage.REPRESENTATION__MEDIATYPE:
				if (resolve) return getMediatype();
				return basicGetMediatype();
			case RestStructurePackage.REPRESENTATION__NAME:
				return getName();
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS:
				return getContainedRepLinks();
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS:
				return getContainedRepLinkCollections();
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
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS:
				getContainedRepElements().clear();
				getContainedRepElements().addAll((Collection<? extends RepresentationElement>)newValue);
				return;
			case RestStructurePackage.REPRESENTATION__MEDIATYPE:
				setMediatype((MediaType)newValue);
				return;
			case RestStructurePackage.REPRESENTATION__NAME:
				setName((String)newValue);
				return;
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS:
				getContainedRepLinks().clear();
				getContainedRepLinks().addAll((Collection<? extends RepresentationLink>)newValue);
				return;
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS:
				getContainedRepLinkCollections().clear();
				getContainedRepLinkCollections().addAll((Collection<? extends RepresentationLinkCollection>)newValue);
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
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS:
				getContainedRepElements().clear();
				return;
			case RestStructurePackage.REPRESENTATION__MEDIATYPE:
				setMediatype((MediaType)null);
				return;
			case RestStructurePackage.REPRESENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS:
				getContainedRepLinks().clear();
				return;
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS:
				getContainedRepLinkCollections().clear();
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
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_ELEMENTS:
				return containedRepElements != null && !containedRepElements.isEmpty();
			case RestStructurePackage.REPRESENTATION__MEDIATYPE:
				return mediatype != null;
			case RestStructurePackage.REPRESENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINKS:
				return containedRepLinks != null && !containedRepLinks.isEmpty();
			case RestStructurePackage.REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS:
				return containedRepLinkCollections != null && !containedRepLinkCollections.isEmpty();
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

} //RepresentationImpl
