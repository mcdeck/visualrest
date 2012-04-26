/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.AggregationResourceTypeImpl#getElementTypes <em>Element Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationResourceTypeImpl extends ResourceTypeImpl implements AggregationResourceType {
	/**
	 * The cached value of the '{@link #getElementTypes() <em>Element Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> elementTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.AGGREGATION_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getElementTypes() {
		if (elementTypes == null) {
			elementTypes = new EObjectResolvingEList<ResourceType>(ResourceType.class, this, RestStructurePackage.AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES);
		}
		return elementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES:
				return getElementTypes();
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
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES:
				getElementTypes().clear();
				getElementTypes().addAll((Collection<? extends ResourceType>)newValue);
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
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES:
				getElementTypes().clear();
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
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES:
				return elementTypes != null && !elementTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregationResourceTypeImpl
