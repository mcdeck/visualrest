/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mt Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.MtElementReference#getReferencedMTElement <em>Referenced MT Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getMtElementReference()
 * @model
 * @generated
 */
public interface MtElementReference extends MTReference {
	/**
	 * Returns the value of the '<em><b>Referenced MT Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced MT Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced MT Element</em>' reference.
	 * @see #setReferencedMTElement(MediaTypeElement)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getMtElementReference_ReferencedMTElement()
	 * @model required="true"
	 * @generated
	 */
	MediaTypeElement getReferencedMTElement();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.MtElementReference#getReferencedMTElement <em>Referenced MT Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced MT Element</em>' reference.
	 * @see #getReferencedMTElement()
	 * @generated
	 */
	void setReferencedMTElement(MediaTypeElement value);

} // MtElementReference
