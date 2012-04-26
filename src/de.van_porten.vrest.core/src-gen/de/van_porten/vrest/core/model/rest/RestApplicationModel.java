/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest;

import de.van_porten.vrest.core.model.restbehavior.OpType;

import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getMethodTypes <em>Method Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getMediaTypes <em>Media Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getRelTypes <em>Rel Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getOptypes <em>Optypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel()
 * @model
 * @generated
 */
public interface RestApplicationModel extends EObject {
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
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Types</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_MethodTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodType> getMethodTypes();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Media Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Types</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_MediaTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaType> getMediaTypes();

	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Rel Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Types</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_RelTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationType> getRelTypes();

	/**
	 * Returns the value of the '<em><b>Optypes</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.OpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optypes</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#getRestApplicationModel_Optypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpType> getOptypes();

} // RestApplicationModel
