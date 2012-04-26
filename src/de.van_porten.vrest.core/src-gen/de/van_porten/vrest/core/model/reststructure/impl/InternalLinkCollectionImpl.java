/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.InternalLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.InternalLinkCollectionImpl#getIntElements <em>Int Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalLinkCollectionImpl extends LinkCollectionImpl implements InternalLinkCollection {
	/**
	 * The cached value of the '{@link #getIntElements() <em>Int Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink> intElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.INTERNAL_LINK_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink> getIntElements() {
		if (intElements == null) {
			intElements = new EObjectResolvingEList<InternalLink>(InternalLink.class, this, RestStructurePackage.INTERNAL_LINK_COLLECTION__INT_ELEMENTS);
		}
		return intElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.INTERNAL_LINK_COLLECTION__INT_ELEMENTS:
				return getIntElements();
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
			case RestStructurePackage.INTERNAL_LINK_COLLECTION__INT_ELEMENTS:
				getIntElements().clear();
				getIntElements().addAll((Collection<? extends InternalLink>)newValue);
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
			case RestStructurePackage.INTERNAL_LINK_COLLECTION__INT_ELEMENTS:
				getIntElements().clear();
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
			case RestStructurePackage.INTERNAL_LINK_COLLECTION__INT_ELEMENTS:
				return intElements != null && !intElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalLinkCollectionImpl
