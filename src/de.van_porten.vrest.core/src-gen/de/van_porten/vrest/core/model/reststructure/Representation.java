/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepElements <em>Contained Rep Elements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Representation#getMediatype <em>Mediatype</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Representation#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinks <em>Contained Rep Links</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinkCollections <em>Contained Rep Link Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Rep Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.RepresentationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Rep Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Rep Elements</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation_ContainedRepElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationElement> getContainedRepElements();

	/**
	 * Returns the value of the '<em><b>Mediatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediatype</em>' reference.
	 * @see #setMediatype(MediaType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation_Mediatype()
	 * @model
	 * @generated
	 */
	MediaType getMediatype();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Representation#getMediatype <em>Mediatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediatype</em>' reference.
	 * @see #getMediatype()
	 * @generated
	 */
	void setMediatype(MediaType value);

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Representation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained Rep Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.RepresentationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Rep Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Rep Links</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation_ContainedRepLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationLink> getContainedRepLinks();

	/**
	 * Returns the value of the '<em><b>Contained Rep Link Collections</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Rep Link Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Rep Link Collections</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentation_ContainedRepLinkCollections()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationLinkCollection> getContainedRepLinkCollections();

} // Representation
