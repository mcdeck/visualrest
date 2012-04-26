/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ProjectionResourceType#getProjectedType <em>Projected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getProjectionResourceType()
 * @model
 * @generated
 */
public interface ProjectionResourceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Projected Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projected Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected Type</em>' reference.
	 * @see #setProjectedType(ResourceType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getProjectionResourceType_ProjectedType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getProjectedType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ProjectionResourceType#getProjectedType <em>Projected Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected Type</em>' reference.
	 * @see #getProjectedType()
	 * @generated
	 */
	void setProjectedType(ResourceType value);

} // ProjectionResourceType
