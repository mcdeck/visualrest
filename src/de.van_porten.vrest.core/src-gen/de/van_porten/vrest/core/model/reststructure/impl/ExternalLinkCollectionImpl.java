/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.ExternalLink;
import de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Link Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkCollectionImpl#getExtElements <em>Ext Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalLinkCollectionImpl extends LinkCollectionImpl implements ExternalLinkCollection {
	/**
	 * The cached value of the '{@link #getExtElements() <em>Ext Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalLink> extElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.EXTERNAL_LINK_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalLink> getExtElements() {
		if (extElements == null) {
			extElements = new EObjectResolvingEList<ExternalLink>(ExternalLink.class, this, RestStructurePackage.EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS);
		}
		return extElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS:
				return getExtElements();
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
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS:
				getExtElements().clear();
				getExtElements().addAll((Collection<? extends ExternalLink>)newValue);
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
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS:
				getExtElements().clear();
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
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS:
				return extElements != null && !extElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalLinkCollectionImpl
