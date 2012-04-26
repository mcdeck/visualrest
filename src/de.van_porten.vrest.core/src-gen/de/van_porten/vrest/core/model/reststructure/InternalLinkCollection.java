/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.InternalLinkCollection#getIntElements <em>Int Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getInternalLinkCollection()
 * @model
 * @generated
 */
public interface InternalLinkCollection extends LinkCollection {
	/**
	 * Returns the value of the '<em><b>Int Elements</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Elements</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getInternalLinkCollection_IntElements()
	 * @model
	 * @generated
	 */
	EList<InternalLink> getIntElements();

} // InternalLinkCollection
