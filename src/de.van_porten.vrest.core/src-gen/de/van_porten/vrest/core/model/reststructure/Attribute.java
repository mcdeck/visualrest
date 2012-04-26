/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Attribute#getAttrType <em>Attr Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Attr Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Type</em>' reference.
	 * @see #setAttrType(DataType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getAttribute_AttrType()
	 * @model required="true"
	 * @generated
	 */
	DataType getAttrType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Attribute#getAttrType <em>Attr Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Type</em>' reference.
	 * @see #getAttrType()
	 * @generated
	 */
	void setAttrType(DataType value);

} // Attribute
