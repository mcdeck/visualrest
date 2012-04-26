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
 * A representation of the model object '<em><b>Media Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTElements <em>Contained MT Elements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaType#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinks <em>Contained MT Links</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinkCollections <em>Contained MT Link Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaType()
 * @model
 * @generated
 */
public interface MediaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained MT Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained MT Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained MT Elements</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaType_ContainedMTElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaTypeElement> getContainedMTElements();

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.MediaType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained MT Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaTypeLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained MT Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained MT Links</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaType_ContainedMTLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaTypeLink> getContainedMTLinks();

	/**
	 * Returns the value of the '<em><b>Contained MT Link Collections</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained MT Link Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained MT Link Collections</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMediaType_ContainedMTLinkCollections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaTypeLinkCollection> getContainedMTLinkCollections();

} // MediaType
