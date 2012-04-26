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
 * A representation of the model object '<em><b>Representation Link Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getCorrespondingLinkCollection <em>Corresponding Link Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLinkCollection()
 * @model
 * @generated
 */
public interface RepresentationLinkCollection extends EObject {
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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLinkCollection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Link Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Link Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Link Collection</em>' reference.
	 * @see #setCorrespondingLinkCollection(MediaTypeLinkCollection)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLinkCollection_CorrespondingLinkCollection()
	 * @model
	 * @generated
	 */
	MediaTypeLinkCollection getCorrespondingLinkCollection();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getCorrespondingLinkCollection <em>Corresponding Link Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Link Collection</em>' reference.
	 * @see #getCorrespondingLinkCollection()
	 * @generated
	 */
	void setCorrespondingLinkCollection(MediaTypeLinkCollection value);

} // RepresentationLinkCollection
