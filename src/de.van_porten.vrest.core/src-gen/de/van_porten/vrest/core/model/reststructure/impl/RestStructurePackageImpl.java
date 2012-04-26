/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.rest.RestPackage;

import de.van_porten.vrest.core.model.rest.impl.RestPackageImpl;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl;

import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.CollectionType;
import de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.ExternalLink;
import de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection;
import de.van_porten.vrest.core.model.reststructure.FilterResourceType;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.InternalLinkCollection;
import de.van_porten.vrest.core.model.reststructure.Link;
import de.van_porten.vrest.core.model.reststructure.LinkCollection;
import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.PrimaryResourceType;
import de.van_porten.vrest.core.model.reststructure.PrimitiveDataType;
import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.Representation;
import de.van_porten.vrest.core.model.reststructure.RepresentationElement;
import de.van_porten.vrest.core.model.reststructure.RepresentationLink;
import de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.SimpleIdentifier;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;

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
public class RestStructurePackageImpl extends EPackageImpl implements RestStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceIdentifierPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalLinkCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexIdentifierPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subresourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagingResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeLinkCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationLinkCollectionEClass = null;

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestStructurePackageImpl() {
		super(eNS_URI, RestStructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RestStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestStructurePackage init() {
		if (isInited) return (RestStructurePackage)EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI);

		// Obtain or create and register package
		RestStructurePackageImpl theRestStructurePackage = (RestStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RestPackageImpl theRestPackage = (RestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI) instanceof RestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI) : RestPackage.eINSTANCE);
		RestBehaviorPackageImpl theRestBehaviorPackage = (RestBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI) instanceof RestBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI) : RestBehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theRestStructurePackage.createPackageContents();
		theRestPackage.createPackageContents();
		theRestBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theRestStructurePackage.initializePackageContents();
		theRestPackage.initializePackageContents();
		theRestBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestStructurePackage.eNS_URI, theRestStructurePackage);
		return theRestStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Identifer() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Resourceelements() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Methods() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Creators() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_States() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_InitialState() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Name() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsSingleton() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CreateOnStart() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceElement() {
		return resourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceElement_Name() {
		return (EAttribute)resourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceIdentifierPattern() {
		return resourceIdentifierPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttrType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_RelType() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkCollection() {
		return linkCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParamType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Consumed() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Produced() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Methodtype() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameters() {
		return (EReference)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Methodbehavior() {
		return (EReference)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaType() {
		return mediaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaType_ContainedMTElements() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaType_Name() {
		return (EAttribute)mediaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaType_ContainedMTLinks() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaType_ContainedMTLinkCollections() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_ContainedRepElements() {
		return (EReference)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Mediatype() {
		return (EReference)representationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Name() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_ContainedRepLinks() {
		return (EReference)representationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_ContainedRepLinkCollections() {
		return (EReference)representationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationElement() {
		return representationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationElement_CorrespondingElement() {
		return (EReference)representationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationElement_RepElemType() {
		return (EReference)representationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationElement_Name() {
		return (EAttribute)representationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationElement_Value() {
		return (EReference)representationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodType() {
		return methodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodType_Name() {
		return (EAttribute)methodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationType() {
		return relationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Name() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink() {
		return internalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_Target() {
		return (EReference)internalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLink() {
		return externalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLinkCollection() {
		return externalLinkCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalLinkCollection_ExtElements() {
		return (EReference)externalLinkCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLinkCollection() {
		return internalLinkCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLinkCollection_IntElements() {
		return (EReference)internalLinkCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDataType_Name() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_ElementType() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleIdentifier() {
		return simpleIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleIdentifier_Identifier() {
		return (EAttribute)simpleIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexIdentifierPattern() {
		return complexIdentifierPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexIdentifierPattern_IdParams() {
		return (EReference)complexIdentifierPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexIdentifierPattern_IdAttrs() {
		return (EReference)complexIdentifierPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaTypeElement() {
		return mediaTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaTypeElement_MtelemType() {
		return (EReference)mediaTypeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaTypeElement_Name() {
		return (EAttribute)mediaTypeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubresourceType() {
		return subresourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubresourceType_ContainingType() {
		return (EReference)subresourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationResourceType() {
		return aggregationResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationResourceType_ElementTypes() {
		return (EReference)aggregationResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryResourceType() {
		return primaryResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityResourceType() {
		return activityResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagingResourceType() {
		return pagingResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagingResourceType_PagedType() {
		return (EReference)pagingResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionResourceType() {
		return projectionResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionResourceType_ProjectedType() {
		return (EReference)projectionResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListResourceType() {
		return listResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListResourceType_ListElementType() {
		return (EReference)listResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterResourceType() {
		return filterResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaTypeLink() {
		return mediaTypeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaTypeLink_Name() {
		return (EAttribute)mediaTypeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaTypeLinkCollection() {
		return mediaTypeLinkCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaTypeLinkCollection_Name() {
		return (EAttribute)mediaTypeLinkCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationLink() {
		return representationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationLink_Name() {
		return (EAttribute)representationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationLink_CorrespondingLink() {
		return (EReference)representationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationLink_LinkValue() {
		return (EReference)representationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationLinkCollection() {
		return representationLinkCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationLinkCollection_Name() {
		return (EAttribute)representationLinkCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationLinkCollection_CorrespondingLinkCollection() {
		return (EReference)representationLinkCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructureFactory getRestStructureFactory() {
		return (RestStructureFactory)getEFactoryInstance();
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
		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__IDENTIFER);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__RESOURCEELEMENTS);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__METHODS);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__CREATORS);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__STATES);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__INITIAL_STATE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__IS_SINGLETON);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__CREATE_ON_START);

		resourceElementEClass = createEClass(RESOURCE_ELEMENT);
		createEAttribute(resourceElementEClass, RESOURCE_ELEMENT__NAME);

		resourceIdentifierPatternEClass = createEClass(RESOURCE_IDENTIFIER_PATTERN);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTR_TYPE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__REL_TYPE);

		linkCollectionEClass = createEClass(LINK_COLLECTION);

		dataTypeEClass = createEClass(DATA_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAM_TYPE);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__CONSUMED);
		createEReference(methodEClass, METHOD__PRODUCED);
		createEReference(methodEClass, METHOD__METHODTYPE);
		createEReference(methodEClass, METHOD__PARAMETERS);
		createEReference(methodEClass, METHOD__METHODBEHAVIOR);
		createEAttribute(methodEClass, METHOD__NAME);

		mediaTypeEClass = createEClass(MEDIA_TYPE);
		createEReference(mediaTypeEClass, MEDIA_TYPE__CONTAINED_MT_ELEMENTS);
		createEAttribute(mediaTypeEClass, MEDIA_TYPE__NAME);
		createEReference(mediaTypeEClass, MEDIA_TYPE__CONTAINED_MT_LINKS);
		createEReference(mediaTypeEClass, MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS);

		representationEClass = createEClass(REPRESENTATION);
		createEReference(representationEClass, REPRESENTATION__CONTAINED_REP_ELEMENTS);
		createEReference(representationEClass, REPRESENTATION__MEDIATYPE);
		createEAttribute(representationEClass, REPRESENTATION__NAME);
		createEReference(representationEClass, REPRESENTATION__CONTAINED_REP_LINKS);
		createEReference(representationEClass, REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS);

		representationElementEClass = createEClass(REPRESENTATION_ELEMENT);
		createEReference(representationElementEClass, REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT);
		createEReference(representationElementEClass, REPRESENTATION_ELEMENT__REP_ELEM_TYPE);
		createEAttribute(representationElementEClass, REPRESENTATION_ELEMENT__NAME);
		createEReference(representationElementEClass, REPRESENTATION_ELEMENT__VALUE);

		methodTypeEClass = createEClass(METHOD_TYPE);
		createEAttribute(methodTypeEClass, METHOD_TYPE__NAME);

		relationTypeEClass = createEClass(RELATION_TYPE);
		createEAttribute(relationTypeEClass, RELATION_TYPE__NAME);

		internalLinkEClass = createEClass(INTERNAL_LINK);
		createEReference(internalLinkEClass, INTERNAL_LINK__TARGET);

		externalLinkEClass = createEClass(EXTERNAL_LINK);

		externalLinkCollectionEClass = createEClass(EXTERNAL_LINK_COLLECTION);
		createEReference(externalLinkCollectionEClass, EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS);

		internalLinkCollectionEClass = createEClass(INTERNAL_LINK_COLLECTION);
		createEReference(internalLinkCollectionEClass, INTERNAL_LINK_COLLECTION__INT_ELEMENTS);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__NAME);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__ELEMENT_TYPE);

		simpleIdentifierEClass = createEClass(SIMPLE_IDENTIFIER);
		createEAttribute(simpleIdentifierEClass, SIMPLE_IDENTIFIER__IDENTIFIER);

		complexIdentifierPatternEClass = createEClass(COMPLEX_IDENTIFIER_PATTERN);
		createEReference(complexIdentifierPatternEClass, COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS);
		createEReference(complexIdentifierPatternEClass, COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS);

		mediaTypeElementEClass = createEClass(MEDIA_TYPE_ELEMENT);
		createEReference(mediaTypeElementEClass, MEDIA_TYPE_ELEMENT__MTELEM_TYPE);
		createEAttribute(mediaTypeElementEClass, MEDIA_TYPE_ELEMENT__NAME);

		subresourceTypeEClass = createEClass(SUBRESOURCE_TYPE);
		createEReference(subresourceTypeEClass, SUBRESOURCE_TYPE__CONTAINING_TYPE);

		aggregationResourceTypeEClass = createEClass(AGGREGATION_RESOURCE_TYPE);
		createEReference(aggregationResourceTypeEClass, AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES);

		primaryResourceTypeEClass = createEClass(PRIMARY_RESOURCE_TYPE);

		activityResourceTypeEClass = createEClass(ACTIVITY_RESOURCE_TYPE);

		pagingResourceTypeEClass = createEClass(PAGING_RESOURCE_TYPE);
		createEReference(pagingResourceTypeEClass, PAGING_RESOURCE_TYPE__PAGED_TYPE);

		projectionResourceTypeEClass = createEClass(PROJECTION_RESOURCE_TYPE);
		createEReference(projectionResourceTypeEClass, PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE);

		listResourceTypeEClass = createEClass(LIST_RESOURCE_TYPE);
		createEReference(listResourceTypeEClass, LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE);

		filterResourceTypeEClass = createEClass(FILTER_RESOURCE_TYPE);

		mediaTypeLinkEClass = createEClass(MEDIA_TYPE_LINK);
		createEAttribute(mediaTypeLinkEClass, MEDIA_TYPE_LINK__NAME);

		mediaTypeLinkCollectionEClass = createEClass(MEDIA_TYPE_LINK_COLLECTION);
		createEAttribute(mediaTypeLinkCollectionEClass, MEDIA_TYPE_LINK_COLLECTION__NAME);

		representationLinkEClass = createEClass(REPRESENTATION_LINK);
		createEAttribute(representationLinkEClass, REPRESENTATION_LINK__NAME);
		createEReference(representationLinkEClass, REPRESENTATION_LINK__CORRESPONDING_LINK);
		createEReference(representationLinkEClass, REPRESENTATION_LINK__LINK_VALUE);

		representationLinkCollectionEClass = createEClass(REPRESENTATION_LINK_COLLECTION);
		createEAttribute(representationLinkCollectionEClass, REPRESENTATION_LINK_COLLECTION__NAME);
		createEReference(representationLinkCollectionEClass, REPRESENTATION_LINK_COLLECTION__CORRESPONDING_LINK_COLLECTION);
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
		RestBehaviorPackage theRestBehaviorPackage = (RestBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeEClass.getESuperTypes().add(this.getResourceElement());
		linkEClass.getESuperTypes().add(this.getResourceElement());
		linkCollectionEClass.getESuperTypes().add(this.getResourceElement());
		internalLinkEClass.getESuperTypes().add(this.getLink());
		externalLinkEClass.getESuperTypes().add(this.getLink());
		externalLinkCollectionEClass.getESuperTypes().add(this.getLinkCollection());
		internalLinkCollectionEClass.getESuperTypes().add(this.getLinkCollection());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		collectionTypeEClass.getESuperTypes().add(this.getDataType());
		simpleIdentifierEClass.getESuperTypes().add(this.getResourceIdentifierPattern());
		complexIdentifierPatternEClass.getESuperTypes().add(this.getResourceIdentifierPattern());
		subresourceTypeEClass.getESuperTypes().add(this.getResourceType());
		aggregationResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		primaryResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		activityResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		pagingResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		projectionResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		listResourceTypeEClass.getESuperTypes().add(this.getResourceType());
		filterResourceTypeEClass.getESuperTypes().add(this.getListResourceType());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceType_Identifer(), this.getResourceIdentifierPattern(), null, "identifer", null, 1, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Resourceelements(), this.getResourceElement(), null, "resourceelements", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Methods(), this.getMethod(), null, "methods", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Creators(), theRestBehaviorPackage.getCreator(), null, "creators", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_States(), theRestBehaviorPackage.getState(), null, "states", null, 1, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_InitialState(), theRestBehaviorPackage.getState(), null, "initialState", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_IsSingleton(), ecorePackage.getEBoolean(), "isSingleton", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_CreateOnStart(), ecorePackage.getEBoolean(), "createOnStart", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceElementEClass, ResourceElement.class, "ResourceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceIdentifierPatternEClass, ResourceIdentifierPattern.class, "ResourceIdentifierPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_AttrType(), this.getDataType(), null, "attrType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_RelType(), this.getRelationType(), null, "relType", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkCollectionEClass, LinkCollection.class, "LinkCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_ParamType(), this.getDataType(), null, "paramType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_Consumed(), this.getMediaType(), null, "consumed", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Produced(), this.getMediaType(), null, "produced", null, 1, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Methodtype(), this.getMethodType(), null, "methodtype", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Methodbehavior(), theRestBehaviorPackage.getBehaviorSpecification(), null, "methodbehavior", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeEClass, MediaType.class, "MediaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaType_ContainedMTElements(), this.getMediaTypeElement(), null, "containedMTElements", null, 0, -1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaType_ContainedMTLinks(), this.getMediaTypeLink(), null, "containedMTLinks", null, 0, -1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaType_ContainedMTLinkCollections(), this.getMediaTypeLinkCollection(), null, "containedMTLinkCollections", null, 0, -1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentation_ContainedRepElements(), this.getRepresentationElement(), null, "containedRepElements", null, 0, -1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_Mediatype(), this.getMediaType(), null, "mediatype", null, 0, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_ContainedRepLinks(), this.getRepresentationLink(), null, "containedRepLinks", null, 0, -1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_ContainedRepLinkCollections(), this.getRepresentationLinkCollection(), null, "containedRepLinkCollections", null, 0, -1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationElementEClass, RepresentationElement.class, "RepresentationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentationElement_CorrespondingElement(), this.getMediaTypeElement(), null, "correspondingElement", null, 0, 1, RepresentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationElement_RepElemType(), this.getDataType(), null, "repElemType", null, 0, 1, RepresentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RepresentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationElement_Value(), theRestBehaviorPackage.getValue(), null, "value", null, 1, 1, RepresentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodTypeEClass, MethodType.class, "MethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationTypeEClass, RelationType.class, "RelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalLinkEClass, InternalLink.class, "InternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalLink_Target(), this.getResourceType(), null, "target", null, 1, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalLinkEClass, ExternalLink.class, "ExternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalLinkCollectionEClass, ExternalLinkCollection.class, "ExternalLinkCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalLinkCollection_ExtElements(), this.getExternalLink(), null, "extElements", null, 0, -1, ExternalLinkCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalLinkCollectionEClass, InternalLinkCollection.class, "InternalLinkCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalLinkCollection_IntElements(), this.getInternalLink(), null, "intElements", null, 0, -1, InternalLinkCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_ElementType(), this.getDataType(), null, "elementType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleIdentifierEClass, SimpleIdentifier.class, "SimpleIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleIdentifier_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, SimpleIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexIdentifierPatternEClass, ComplexIdentifierPattern.class, "ComplexIdentifierPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexIdentifierPattern_IdParams(), this.getParameter(), null, "idParams", null, 0, -1, ComplexIdentifierPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexIdentifierPattern_IdAttrs(), this.getAttribute(), null, "idAttrs", null, 0, -1, ComplexIdentifierPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeElementEClass, MediaTypeElement.class, "MediaTypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaTypeElement_MtelemType(), this.getDataType(), null, "mtelemType", null, 0, 1, MediaTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaTypeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MediaTypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subresourceTypeEClass, SubresourceType.class, "SubresourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubresourceType_ContainingType(), this.getResourceType(), null, "containingType", null, 1, 1, SubresourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationResourceTypeEClass, AggregationResourceType.class, "AggregationResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregationResourceType_ElementTypes(), this.getResourceType(), null, "elementTypes", null, 2, -1, AggregationResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryResourceTypeEClass, PrimaryResourceType.class, "PrimaryResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityResourceTypeEClass, ActivityResourceType.class, "ActivityResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagingResourceTypeEClass, PagingResourceType.class, "PagingResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPagingResourceType_PagedType(), this.getResourceType(), null, "pagedType", null, 1, 1, PagingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionResourceTypeEClass, ProjectionResourceType.class, "ProjectionResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectionResourceType_ProjectedType(), this.getResourceType(), null, "projectedType", null, 1, 1, ProjectionResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listResourceTypeEClass, ListResourceType.class, "ListResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListResourceType_ListElementType(), this.getResourceType(), null, "listElementType", null, 1, 1, ListResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterResourceTypeEClass, FilterResourceType.class, "FilterResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediaTypeLinkEClass, MediaTypeLink.class, "MediaTypeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaTypeLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, MediaTypeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeLinkCollectionEClass, MediaTypeLinkCollection.class, "MediaTypeLinkCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaTypeLinkCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, MediaTypeLinkCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationLinkEClass, RepresentationLink.class, "RepresentationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, RepresentationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationLink_CorrespondingLink(), this.getMediaTypeLink(), null, "correspondingLink", null, 0, 1, RepresentationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationLink_LinkValue(), this.getLink(), null, "linkValue", null, 1, 1, RepresentationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationLinkCollectionEClass, RepresentationLinkCollection.class, "RepresentationLinkCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationLinkCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, RepresentationLinkCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationLinkCollection_CorrespondingLinkCollection(), this.getMediaTypeLinkCollection(), null, "correspondingLinkCollection", null, 0, 1, RepresentationLinkCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "description", "the abstract classifier to define a resource type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "true if this resource type defines a singleton"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/isSingleton")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "true if the instance of this resource type is automatically created during the start of the application, only allowed when isSingleton is true"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/createOnStart")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the identifier patterns for this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/identifer")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements which describe the properties of this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/resourceelements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the methods which describe the behavior in the different states of this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/methods")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the creators which enable the creation of new resources of this type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/creators")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the states of this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/states")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the initial state of this ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceType/initialState")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "describes the properties of a ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceElement")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of a ResourceElement"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceElement/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the abstract classifier for a resource identifier pattern"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResourceIdentifierPattern")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a typed attribute of a Resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Attribute")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of an attribute"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Attribute/attrType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link contained in a ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Link")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the relation type of a link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Link/relType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a collection of links contained in a ResourceType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//LinkCollection")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a data type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DataType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a typed parameter of a method (or creator?)"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Parameter")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of a parameter"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Parameter/paramType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines the behavior of a resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the internal name of the Method (not visible to any client)"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the list of all MediaTypes which are accepted"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/consumed")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the list of all MediaTypes which can be returned"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/produced")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the Method (not the return value but, e.g., HTTP-GET)"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/methodtype")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the parameters of this Method"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/parameters")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the specified behavior of this Method"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Method/methodbehavior")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "only defines the possible contained data and no format information"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements of the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaType/containedMTElements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the links of the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaType/containedMTLinks")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the link collections of the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaType/containedMTLinkCollections")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines the data contained in a representation returned by the application to a client but no format information"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements of the representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation/containedRepElements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the mediatype of this representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation/mediatype")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the links of the representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation/containedRepLinks")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the link collections of this representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Representation/containedRepLinkCollections")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines one typed data element of a Representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationElement")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the representation element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationElement/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the corresponding element contained in the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationElement/correspondingElement")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the data type of the representation element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationElement/repElemType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the value of the representation element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationElement/value")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a method defining the response of a ResourceType to a message with specified MethodType dependent on the current state"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MethodType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines one type of the fixed set of method types, e.g., HTTP-GET"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MethodType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the method type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MethodType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines a link relation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RelationType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the relation type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RelationType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link to a resource which is part of this model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the resource type of the target"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLink/target")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link to any resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ExternalLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a collection of external links"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ExternalLinkCollection")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements of the collection"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ExternalLinkCollection/extElements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a collection of internal links"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLinkCollection")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements of the collection"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLinkCollection/intElements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a primitive data type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrimitiveDataType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the data type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrimitiveDataType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a type for defining collections"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CollectionType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the collection elements"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CollectionType/elementType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a simple identifier for a resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SimpleIdentifier")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the identifier as string"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SimpleIdentifier/identifier")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the pattern describing the identifier"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ComplexIdentifierPattern")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the parameter contained in the identifier"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ComplexIdentifierPattern/idParams")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the attributes contained in the identifier"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ComplexIdentifierPattern/idAttrs")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the elements defined by a media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeElement")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeElement/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeElement/mtelemType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type which is part of another resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SubresourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the containing resource type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SubresourceType/containingType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "an aggregated resource type of different other resources"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AggregationResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the aggregated resource types"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AggregationResourceType/elementTypes")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type representing a primary domain element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrimaryResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type representing (a part of) a process"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type which divides another resource in several (smaller) pages"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PagingResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the divided resource type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PagingResourceType/pagedType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type representing only a part of the information of another resource type; in case of a list, e.g. showing the most important information of all list elements"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ProjectionResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the projected resource type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ProjectionResourceType/projectedType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a resource type representing a list of other resource types"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ListResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the list elements"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ListResourceType/listElementType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a list which contains only resources of another list that fulfill the condition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FilterResourceType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link defined by a media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the media type link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeLink/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link collection defined by a media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeLinkCollection")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the media type link collection"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MediaTypeLinkCollection/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link contained in a representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the representation link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLink/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the corresponding link defined by the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLink/correspondingLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the concrete link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLink/linkValue")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a link collection contained in a representation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLinkCollection")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the link collection"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLinkCollection/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the corresponding link collection defined by the media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RepresentationLinkCollection/correspondingLinkCollection")
		   });
	}

} //RestStructurePackageImpl
