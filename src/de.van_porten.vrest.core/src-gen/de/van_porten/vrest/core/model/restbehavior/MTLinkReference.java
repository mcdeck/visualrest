/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Link Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference#getReferencedMTLink <em>Referenced MT Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getMTLinkReference()
 * @model
 * @generated
 */
public interface MTLinkReference extends MTReference {
	/**
	 * Returns the value of the '<em><b>Referenced MT Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced MT Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced MT Link</em>' reference.
	 * @see #setReferencedMTLink(MediaTypeLink)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getMTLinkReference_ReferencedMTLink()
	 * @model required="true"
	 * @generated
	 */
	MediaTypeLink getReferencedMTLink();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference#getReferencedMTLink <em>Referenced MT Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced MT Link</em>' reference.
	 * @see #getReferencedMTLink()
	 * @generated
	 */
	void setReferencedMTLink(MediaTypeLink value);

} // MTLinkReference
