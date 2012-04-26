/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import de.van_porten.vrest.core.model.restbehavior.Value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getCorrespondingElement <em>Corresponding Element</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getRepElemType <em>Rep Elem Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationElement()
 * @model
 * @generated
 */
public interface RepresentationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Corresponding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Element</em>' reference.
	 * @see #setCorrespondingElement(MediaTypeElement)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationElement_CorrespondingElement()
	 * @model
	 * @generated
	 */
	MediaTypeElement getCorrespondingElement();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getCorrespondingElement <em>Corresponding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Element</em>' reference.
	 * @see #getCorrespondingElement()
	 * @generated
	 */
	void setCorrespondingElement(MediaTypeElement value);

	/**
	 * Returns the value of the '<em><b>Rep Elem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rep Elem Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rep Elem Type</em>' reference.
	 * @see #setRepElemType(DataType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationElement_RepElemType()
	 * @model
	 * @generated
	 */
	DataType getRepElemType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getRepElemType <em>Rep Elem Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Elem Type</em>' reference.
	 * @see #getRepElemType()
	 * @generated
	 */
	void setRepElemType(DataType value);

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationElement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // RepresentationElement
