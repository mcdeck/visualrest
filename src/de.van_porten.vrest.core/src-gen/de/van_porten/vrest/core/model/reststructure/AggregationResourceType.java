/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.AggregationResourceType#getElementTypes <em>Element Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getAggregationResourceType()
 * @model
 * @generated
 */
public interface AggregationResourceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Element Types</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Types</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getAggregationResourceType_ElementTypes()
	 * @model lower="2"
	 * @generated
	 */
	EList<ResourceType> getElementTypes();

} // AggregationResourceType
