/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.ExternalLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Link Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference#getReferencedExternalLink <em>Referenced External Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getExternalLinkReference()
 * @model
 * @generated
 */
public interface ExternalLinkReference extends WritableReference {
	/**
	 * Returns the value of the '<em><b>Referenced External Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced External Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced External Link</em>' reference.
	 * @see #setReferencedExternalLink(ExternalLink)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getExternalLinkReference_ReferencedExternalLink()
	 * @model
	 * @generated
	 */
	ExternalLink getReferencedExternalLink();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference#getReferencedExternalLink <em>Referenced External Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced External Link</em>' reference.
	 * @see #getReferencedExternalLink()
	 * @generated
	 */
	void setReferencedExternalLink(ExternalLink value);

} // ExternalLinkReference
