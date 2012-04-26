/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection;
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
 * An implementation of the model object '<em><b>Media Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl#getContainedMTElements <em>Contained MT Elements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl#getContainedMTLinks <em>Contained MT Links</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl#getContainedMTLinkCollections <em>Contained MT Link Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaTypeImpl extends EObjectImpl implements MediaType {
	/**
	 * The cached value of the '{@link #getContainedMTElements() <em>Contained MT Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedMTElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaTypeElement> containedMTElements;

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
	 * The cached value of the '{@link #getContainedMTLinks() <em>Contained MT Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedMTLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaTypeLink> containedMTLinks;

	/**
	 * The cached value of the '{@link #getContainedMTLinkCollections() <em>Contained MT Link Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedMTLinkCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaTypeLinkCollection> containedMTLinkCollections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.MEDIA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaTypeElement> getContainedMTElements() {
		if (containedMTElements == null) {
			containedMTElements = new EObjectContainmentEList<MediaTypeElement>(MediaTypeElement.class, this, RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS);
		}
		return containedMTElements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.MEDIA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaTypeLink> getContainedMTLinks() {
		if (containedMTLinks == null) {
			containedMTLinks = new EObjectContainmentEList<MediaTypeLink>(MediaTypeLink.class, this, RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS);
		}
		return containedMTLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaTypeLinkCollection> getContainedMTLinkCollections() {
		if (containedMTLinkCollections == null) {
			containedMTLinkCollections = new EObjectContainmentEList<MediaTypeLinkCollection>(MediaTypeLinkCollection.class, this, RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS);
		}
		return containedMTLinkCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS:
				return ((InternalEList<?>)getContainedMTElements()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS:
				return ((InternalEList<?>)getContainedMTLinks()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS:
				return ((InternalEList<?>)getContainedMTLinkCollections()).basicRemove(otherEnd, msgs);
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
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS:
				return getContainedMTElements();
			case RestStructurePackage.MEDIA_TYPE__NAME:
				return getName();
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS:
				return getContainedMTLinks();
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS:
				return getContainedMTLinkCollections();
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
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS:
				getContainedMTElements().clear();
				getContainedMTElements().addAll((Collection<? extends MediaTypeElement>)newValue);
				return;
			case RestStructurePackage.MEDIA_TYPE__NAME:
				setName((String)newValue);
				return;
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS:
				getContainedMTLinks().clear();
				getContainedMTLinks().addAll((Collection<? extends MediaTypeLink>)newValue);
				return;
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS:
				getContainedMTLinkCollections().clear();
				getContainedMTLinkCollections().addAll((Collection<? extends MediaTypeLinkCollection>)newValue);
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
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS:
				getContainedMTElements().clear();
				return;
			case RestStructurePackage.MEDIA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS:
				getContainedMTLinks().clear();
				return;
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS:
				getContainedMTLinkCollections().clear();
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
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_ELEMENTS:
				return containedMTElements != null && !containedMTElements.isEmpty();
			case RestStructurePackage.MEDIA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINKS:
				return containedMTLinks != null && !containedMTLinks.isEmpty();
			case RestStructurePackage.MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS:
				return containedMTLinkCollections != null && !containedMTLinkCollections.isEmpty();
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

} //MediaTypeImpl
