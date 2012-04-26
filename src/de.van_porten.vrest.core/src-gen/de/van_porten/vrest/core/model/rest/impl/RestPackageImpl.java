/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest.impl;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestFactory;
import de.van_porten.vrest.core.model.rest.RestPackage;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl;

import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestPackageImpl extends EPackageImpl implements RestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restApplicationModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.van_porten.vrest.core.model.rest.RestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestPackageImpl() {
		super(eNS_URI, RestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestPackage init() {
		if (isInited) return (RestPackage)EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI);

		// Obtain or create and register package
		RestPackageImpl theRestPackage = (RestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RestStructurePackageImpl theRestStructurePackage = (RestStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI) instanceof RestStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI) : RestStructurePackage.eINSTANCE);
		RestBehaviorPackageImpl theRestBehaviorPackage = (RestBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI) instanceof RestBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI) : RestBehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theRestPackage.createPackageContents();
		theRestStructurePackage.createPackageContents();
		theRestBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theRestPackage.initializePackageContents();
		theRestStructurePackage.initializePackageContents();
		theRestBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestPackage.eNS_URI, theRestPackage);
		return theRestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestApplicationModel() {
		return restApplicationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestApplicationModel_Name() {
		return (EAttribute)restApplicationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_MethodTypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_DataTypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_MediaTypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_ResourceTypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_RelTypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestApplicationModel_Optypes() {
		return (EReference)restApplicationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestFactory getRestFactory() {
		return (RestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		restApplicationModelEClass = createEClass(REST_APPLICATION_MODEL);
		createEAttribute(restApplicationModelEClass, REST_APPLICATION_MODEL__NAME);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__METHOD_TYPES);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__DATA_TYPES);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__MEDIA_TYPES);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__RESOURCE_TYPES);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__REL_TYPES);
		createEReference(restApplicationModelEClass, REST_APPLICATION_MODEL__OPTYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RestStructurePackage theRestStructurePackage = (RestStructurePackage)EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI);
		RestBehaviorPackage theRestBehaviorPackage = (RestBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(restApplicationModelEClass, RestApplicationModel.class, "RestApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestApplicationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_MethodTypes(), theRestStructurePackage.getMethodType(), null, "methodTypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_DataTypes(), theRestStructurePackage.getDataType(), null, "dataTypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_MediaTypes(), theRestStructurePackage.getMediaType(), null, "mediaTypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_ResourceTypes(), theRestStructurePackage.getResourceType(), null, "resourceTypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_RelTypes(), theRestStructurePackage.getRelationType(), null, "relTypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestApplicationModel_Optypes(), theRestBehaviorPackage.getOpType(), null, "optypes", null, 0, -1, RestApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "describes an application"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the application"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all MethodTypes in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/methodTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all DataTypes in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/dataTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all MediaTypes in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/mediaTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all ResourceTypes in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/resourceTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all RelationTypes in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/relTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "all types of operators in this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RestApplicationModel/optypes")
		   });
	}

} //RestPackageImpl
