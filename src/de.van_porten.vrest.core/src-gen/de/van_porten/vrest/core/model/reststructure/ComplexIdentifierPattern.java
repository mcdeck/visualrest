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
 * A representation of the model object '<em><b>Complex Identifier Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdParams <em>Id Params</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdAttrs <em>Id Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getComplexIdentifierPattern()
 * @model
 * @generated
 */
public interface ComplexIdentifierPattern extends ResourceIdentifierPattern {
	/**
	 * Returns the value of the '<em><b>Id Params</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Params</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getComplexIdentifierPattern_IdParams()
	 * @model
	 * @generated
	 */
	EList<Parameter> getIdParams();

	/**
	 * Returns the value of the '<em><b>Id Attrs</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Attrs</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getComplexIdentifierPattern_IdAttrs()
	 * @model
	 * @generated
	 */
	EList<Attribute> getIdAttrs();

} // ComplexIdentifierPattern
