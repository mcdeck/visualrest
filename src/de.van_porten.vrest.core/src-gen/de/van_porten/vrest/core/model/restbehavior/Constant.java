/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Constant#getType <em>Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Constant#getStringRepresentation <em>String Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConstant_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.Constant#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Representation</em>' attribute.
	 * @see #setStringRepresentation(String)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConstant_StringRepresentation()
	 * @model required="true"
	 * @generated
	 */
	String getStringRepresentation();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.Constant#getStringRepresentation <em>String Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Representation</em>' attribute.
	 * @see #getStringRepresentation()
	 * @generated
	 */
	void setStringRepresentation(String value);

} // Constant
