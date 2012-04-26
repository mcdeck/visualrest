/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestStructureFactoryImpl extends EFactoryImpl implements RestStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestStructureFactory init() {
		try {
			RestStructureFactory theRestStructureFactory = (RestStructureFactory)EPackage.Registry.INSTANCE.getEFactory("http://reststructure/1.0"); 
			if (theRestStructureFactory != null) {
				return theRestStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestStructurePackage.ATTRIBUTE: return createAttribute();
			case RestStructurePackage.LINK_COLLECTION: return createLinkCollection();
			case RestStructurePackage.PARAMETER: return createParameter();
			case RestStructurePackage.METHOD: return createMethod();
			case RestStructurePackage.MEDIA_TYPE: return createMediaType();
			case RestStructurePackage.REPRESENTATION: return createRepresentation();
			case RestStructurePackage.REPRESENTATION_ELEMENT: return createRepresentationElement();
			case RestStructurePackage.METHOD_TYPE: return createMethodType();
			case RestStructurePackage.RELATION_TYPE: return createRelationType();
			case RestStructurePackage.INTERNAL_LINK: return createInternalLink();
			case RestStructurePackage.EXTERNAL_LINK: return createExternalLink();
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION: return createExternalLinkCollection();
			case RestStructurePackage.INTERNAL_LINK_COLLECTION: return createInternalLinkCollection();
			case RestStructurePackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case RestStructurePackage.COLLECTION_TYPE: return createCollectionType();
			case RestStructurePackage.SIMPLE_IDENTIFIER: return createSimpleIdentifier();
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN: return createComplexIdentifierPattern();
			case RestStructurePackage.MEDIA_TYPE_ELEMENT: return createMediaTypeElement();
			case RestStructurePackage.SUBRESOURCE_TYPE: return createSubresourceType();
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE: return createAggregationResourceType();
			case RestStructurePackage.PRIMARY_RESOURCE_TYPE: return createPrimaryResourceType();
			case RestStructurePackage.ACTIVITY_RESOURCE_TYPE: return createActivityResourceType();
			case RestStructurePackage.PAGING_RESOURCE_TYPE: return createPagingResourceType();
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE: return createProjectionResourceType();
			case RestStructurePackage.LIST_RESOURCE_TYPE: return createListResourceType();
			case RestStructurePackage.FILTER_RESOURCE_TYPE: return createFilterResourceType();
			case RestStructurePackage.MEDIA_TYPE_LINK: return createMediaTypeLink();
			case RestStructurePackage.MEDIA_TYPE_LINK_COLLECTION: return createMediaTypeLinkCollection();
			case RestStructurePackage.REPRESENTATION_LINK: return createRepresentationLink();
			case RestStructurePackage.REPRESENTATION_LINK_COLLECTION: return createRepresentationLinkCollection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkCollection createLinkCollection() {
		LinkCollectionImpl linkCollection = new LinkCollectionImpl();
		return linkCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaType() {
		MediaTypeImpl mediaType = new MediaTypeImpl();
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationElement createRepresentationElement() {
		RepresentationElementImpl representationElement = new RepresentationElementImpl();
		return representationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodType() {
		MethodTypeImpl methodType = new MethodTypeImpl();
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationType() {
		RelationTypeImpl relationType = new RelationTypeImpl();
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink createInternalLink() {
		InternalLinkImpl internalLink = new InternalLinkImpl();
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink createExternalLink() {
		ExternalLinkImpl externalLink = new ExternalLinkImpl();
		return externalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkCollection createExternalLinkCollection() {
		ExternalLinkCollectionImpl externalLinkCollection = new ExternalLinkCollectionImpl();
		return externalLinkCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLinkCollection createInternalLinkCollection() {
		InternalLinkCollectionImpl internalLinkCollection = new InternalLinkCollectionImpl();
		return internalLinkCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleIdentifier createSimpleIdentifier() {
		SimpleIdentifierImpl simpleIdentifier = new SimpleIdentifierImpl();
		return simpleIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexIdentifierPattern createComplexIdentifierPattern() {
		ComplexIdentifierPatternImpl complexIdentifierPattern = new ComplexIdentifierPatternImpl();
		return complexIdentifierPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeElement createMediaTypeElement() {
		MediaTypeElementImpl mediaTypeElement = new MediaTypeElementImpl();
		return mediaTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubresourceType createSubresourceType() {
		SubresourceTypeImpl subresourceType = new SubresourceTypeImpl();
		return subresourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationResourceType createAggregationResourceType() {
		AggregationResourceTypeImpl aggregationResourceType = new AggregationResourceTypeImpl();
		return aggregationResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryResourceType createPrimaryResourceType() {
		PrimaryResourceTypeImpl primaryResourceType = new PrimaryResourceTypeImpl();
		return primaryResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityResourceType createActivityResourceType() {
		ActivityResourceTypeImpl activityResourceType = new ActivityResourceTypeImpl();
		return activityResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagingResourceType createPagingResourceType() {
		PagingResourceTypeImpl pagingResourceType = new PagingResourceTypeImpl();
		return pagingResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionResourceType createProjectionResourceType() {
		ProjectionResourceTypeImpl projectionResourceType = new ProjectionResourceTypeImpl();
		return projectionResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListResourceType createListResourceType() {
		ListResourceTypeImpl listResourceType = new ListResourceTypeImpl();
		return listResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterResourceType createFilterResourceType() {
		FilterResourceTypeImpl filterResourceType = new FilterResourceTypeImpl();
		return filterResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLink createMediaTypeLink() {
		MediaTypeLinkImpl mediaTypeLink = new MediaTypeLinkImpl();
		return mediaTypeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeLinkCollection createMediaTypeLinkCollection() {
		MediaTypeLinkCollectionImpl mediaTypeLinkCollection = new MediaTypeLinkCollectionImpl();
		return mediaTypeLinkCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationLink createRepresentationLink() {
		RepresentationLinkImpl representationLink = new RepresentationLinkImpl();
		return representationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationLinkCollection createRepresentationLinkCollection() {
		RepresentationLinkCollectionImpl representationLinkCollection = new RepresentationLinkCollectionImpl();
		return representationLinkCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructurePackage getRestStructurePackage() {
		return (RestStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestStructurePackage getPackage() {
		return RestStructurePackage.eINSTANCE;
	}

} //RestStructureFactoryImpl
