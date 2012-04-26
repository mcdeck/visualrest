/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Parameter#getParamType <em>Param Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Type</em>' reference.
	 * @see #setParamType(DataType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getParameter_ParamType()
	 * @model
	 * @generated
	 */
	DataType getParamType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Parameter#getParamType <em>Param Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Type</em>' reference.
	 * @see #getParamType()
	 * @generated
	 */
	void setParamType(DataType value);

} // Parameter
