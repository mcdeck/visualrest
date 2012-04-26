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
 * A representation of the model object '<em><b>Representation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getCorrespondingLink <em>Corresponding Link</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getLinkValue <em>Link Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLink()
 * @model
 * @generated
 */
public interface RepresentationLink extends EObject {
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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Link</em>' reference.
	 * @see #setCorrespondingLink(MediaTypeLink)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLink_CorrespondingLink()
	 * @model
	 * @generated
	 */
	MediaTypeLink getCorrespondingLink();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getCorrespondingLink <em>Corresponding Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Link</em>' reference.
	 * @see #getCorrespondingLink()
	 * @generated
	 */
	void setCorrespondingLink(MediaTypeLink value);

	/**
	 * Returns the value of the '<em><b>Link Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Value</em>' reference.
	 * @see #setLinkValue(Link)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getRepresentationLink_LinkValue()
	 * @model required="true"
	 * @generated
	 */
	Link getLinkValue();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getLinkValue <em>Link Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Value</em>' reference.
	 * @see #getLinkValue()
	 * @generated
	 */
	void setLinkValue(Link value);

} // RepresentationLink
