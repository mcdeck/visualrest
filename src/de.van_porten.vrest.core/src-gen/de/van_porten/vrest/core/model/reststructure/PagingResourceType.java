/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paging Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.PagingResourceType#getPagedType <em>Paged Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getPagingResourceType()
 * @model
 * @generated
 */
public interface PagingResourceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Paged Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paged Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paged Type</em>' reference.
	 * @see #setPagedType(ResourceType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getPagingResourceType_PagedType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getPagedType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.PagingResourceType#getPagedType <em>Paged Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paged Type</em>' reference.
	 * @see #getPagedType()
	 * @generated
	 */
	void setPagedType(ResourceType value);

} // PagingResourceType
