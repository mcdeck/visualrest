/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ListResourceType#getListElementType <em>List Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getListResourceType()
 * @model
 * @generated
 */
public interface ListResourceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>List Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Element Type</em>' reference.
	 * @see #setListElementType(ResourceType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getListResourceType_ListElementType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getListElementType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ListResourceType#getListElementType <em>List Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Element Type</em>' reference.
	 * @see #getListElementType()
	 * @generated
	 */
	void setListElementType(ResourceType value);

} // ListResourceType
