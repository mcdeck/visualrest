/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subresource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.SubresourceType#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getSubresourceType()
 * @model
 * @generated
 */
public interface SubresourceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see #setContainingType(ResourceType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getSubresourceType_ContainingType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getContainingType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.SubresourceType#getContainingType <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Type</em>' reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(ResourceType value);

} // SubresourceType
