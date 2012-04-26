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
 * A representation of the model object '<em><b>Media Type Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getMtelemType <em>Mtelem Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaTypeElement()
 * @model
 * @generated
 */
public interface MediaTypeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Mtelem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtelem Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtelem Type</em>' reference.
	 * @see #setMtelemType(DataType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaTypeElement_MtelemType()
	 * @model
	 * @generated
	 */
	DataType getMtelemType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getMtelemType <em>Mtelem Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtelem Type</em>' reference.
	 * @see #getMtelemType()
	 * @generated
	 */
	void setMtelemType(DataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaTypeElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MediaTypeElement
