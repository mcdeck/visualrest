/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.InternalLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedLink <em>Referenced Link</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedReference <em>Referenced Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getInternalLinkReference()
 * @model
 * @generated
 */
public interface InternalLinkReference extends WritableReference {
	/**
	 * Returns the value of the '<em><b>Referenced Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Link</em>' reference.
	 * @see #setReferencedLink(InternalLink)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getInternalLinkReference_ReferencedLink()
	 * @model required="true"
	 * @generated
	 */
	InternalLink getReferencedLink();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedLink <em>Referenced Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Link</em>' reference.
	 * @see #getReferencedLink()
	 * @generated
	 */
	void setReferencedLink(InternalLink value);

	/**
	 * Returns the value of the '<em><b>Referenced Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Reference</em>' containment reference.
	 * @see #setReferencedReference(WritableReference)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getInternalLinkReference_ReferencedReference()
	 * @model containment="true"
	 * @generated
	 */
	WritableReference getReferencedReference();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedReference <em>Referenced Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Reference</em>' containment reference.
	 * @see #getReferencedReference()
	 * @generated
	 */
	void setReferencedReference(WritableReference value);

} // InternalLinkReference
