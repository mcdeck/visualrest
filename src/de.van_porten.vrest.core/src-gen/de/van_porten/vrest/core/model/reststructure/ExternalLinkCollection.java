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
 * A representation of the model object '<em><b>External Link Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection#getExtElements <em>Ext Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getExternalLinkCollection()
 * @model
 * @generated
 */
public interface ExternalLinkCollection extends LinkCollection {
	/**
	 * Returns the value of the '<em><b>Ext Elements</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.ExternalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Elements</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getExternalLinkCollection_ExtElements()
	 * @model
	 * @generated
	 */
	EList<ExternalLink> getExtElements();

} // ExternalLinkCollection
