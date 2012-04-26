/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.rest.RestFactory
 * @model kind="package"
 * @generated
 */
public interface RestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = de.van_porten.vrest.core.model.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl <em>Application Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl
	 * @see de.van_porten.vrest.core.model.rest.impl.RestPackageImpl#getRestApplicationModel()
	 * @generated
	 */
	int REST_APPLICATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__METHOD_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__DATA_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Media Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__MEDIA_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__RESOURCE_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Rel Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__REL_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Optypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL__OPTYPES = 6;

	/**
	 * The number of structural features of the '<em>Application Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_APPLICATION_MODEL_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel <em>Application Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Model</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel
	 * @generated
	 */
	EClass getRestApplicationModel();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getName()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EAttribute getRestApplicationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getMethodTypes <em>Method Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Types</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getMethodTypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_MethodTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getDataTypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getMediaTypes <em>Media Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media Types</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getMediaTypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_MediaTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getResourceTypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_ResourceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getRelTypes <em>Rel Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rel Types</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getRelTypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_RelTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.rest.RestApplicationModel#getOptypes <em>Optypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optypes</em>'.
	 * @see de.van_porten.vrest.core.model.rest.RestApplicationModel#getOptypes()
	 * @see #getRestApplicationModel()
	 * @generated
	 */
	EReference getRestApplicationModel_Optypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl <em>Application Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl
		 * @see de.van_porten.vrest.core.model.rest.impl.RestPackageImpl#getRestApplicationModel()
		 * @generated
		 */
		EClass REST_APPLICATION_MODEL = eINSTANCE.getRestApplicationModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_APPLICATION_MODEL__NAME = eINSTANCE.getRestApplicationModel_Name();

		/**
		 * The meta object literal for the '<em><b>Method Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__METHOD_TYPES = eINSTANCE.getRestApplicationModel_MethodTypes();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__DATA_TYPES = eINSTANCE.getRestApplicationModel_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Media Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__MEDIA_TYPES = eINSTANCE.getRestApplicationModel_MediaTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__RESOURCE_TYPES = eINSTANCE.getRestApplicationModel_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Rel Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__REL_TYPES = eINSTANCE.getRestApplicationModel_RelTypes();

		/**
		 * The meta object literal for the '<em><b>Optypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_APPLICATION_MODEL__OPTYPES = eINSTANCE.getRestApplicationModel_Optypes();

	}

} //RestPackage
