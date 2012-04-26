/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Link#getRelType <em>Rel Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Rel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Type</em>' reference.
	 * @see #setRelType(RelationType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getLink_RelType()
	 * @model
	 * @generated
	 */
	RelationType getRelType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Link#getRelType <em>Rel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Type</em>' reference.
	 * @see #getRelType()
	 * @generated
	 */
	void setRelType(RelationType value);

} // Link
