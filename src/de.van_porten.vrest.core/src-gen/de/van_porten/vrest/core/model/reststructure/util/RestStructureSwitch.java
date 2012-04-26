/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.util;

import de.van_porten.vrest.core.model.reststructure.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage
 * @generated
 */
public class RestStructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = RestStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RestStructurePackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.RESOURCE_ELEMENT: {
				ResourceElement resourceElement = (ResourceElement)theEObject;
				T result = caseResourceElement(resourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.RESOURCE_IDENTIFIER_PATTERN: {
				ResourceIdentifierPattern resourceIdentifierPattern = (ResourceIdentifierPattern)theEObject;
				T result = caseResourceIdentifierPattern(resourceIdentifierPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseResourceElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseResourceElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.LINK_COLLECTION: {
				LinkCollection linkCollection = (LinkCollection)theEObject;
				T result = caseLinkCollection(linkCollection);
				if (result == null) result = caseResourceElement(linkCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.MEDIA_TYPE: {
				MediaType mediaType = (MediaType)theEObject;
				T result = caseMediaType(mediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.REPRESENTATION_ELEMENT: {
				RepresentationElement representationElement = (RepresentationElement)theEObject;
				T result = caseRepresentationElement(representationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.METHOD_TYPE: {
				MethodType methodType = (MethodType)theEObject;
				T result = caseMethodType(methodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.RELATION_TYPE: {
				RelationType relationType = (RelationType)theEObject;
				T result = caseRelationType(relationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.INTERNAL_LINK: {
				InternalLink internalLink = (InternalLink)theEObject;
				T result = caseInternalLink(internalLink);
				if (result == null) result = caseLink(internalLink);
				if (result == null) result = caseResourceElement(internalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.EXTERNAL_LINK: {
				ExternalLink externalLink = (ExternalLink)theEObject;
				T result = caseExternalLink(externalLink);
				if (result == null) result = caseLink(externalLink);
				if (result == null) result = caseResourceElement(externalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.EXTERNAL_LINK_COLLECTION: {
				ExternalLinkCollection externalLinkCollection = (ExternalLinkCollection)theEObject;
				T result = caseExternalLinkCollection(externalLinkCollection);
				if (result == null) result = caseLinkCollection(externalLinkCollection);
				if (result == null) result = caseResourceElement(externalLinkCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.INTERNAL_LINK_COLLECTION: {
				InternalLinkCollection internalLinkCollection = (InternalLinkCollection)theEObject;
				T result = caseInternalLinkCollection(internalLinkCollection);
				if (result == null) result = caseLinkCollection(internalLinkCollection);
				if (result == null) result = caseResourceElement(internalLinkCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.PRIMITIVE_DATA_TYPE: {
				PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
				T result = casePrimitiveDataType(primitiveDataType);
				if (result == null) result = caseDataType(primitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseDataType(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.SIMPLE_IDENTIFIER: {
				SimpleIdentifier simpleIdentifier = (SimpleIdentifier)theEObject;
				T result = caseSimpleIdentifier(simpleIdentifier);
				if (result == null) result = caseResourceIdentifierPattern(simpleIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN: {
				ComplexIdentifierPattern complexIdentifierPattern = (ComplexIdentifierPattern)theEObject;
				T result = caseComplexIdentifierPattern(complexIdentifierPattern);
				if (result == null) result = caseResourceIdentifierPattern(complexIdentifierPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.MEDIA_TYPE_ELEMENT: {
				MediaTypeElement mediaTypeElement = (MediaTypeElement)theEObject;
				T result = caseMediaTypeElement(mediaTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.SUBRESOURCE_TYPE: {
				SubresourceType subresourceType = (SubresourceType)theEObject;
				T result = caseSubresourceType(subresourceType);
				if (result == null) result = caseResourceType(subresourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.AGGREGATION_RESOURCE_TYPE: {
				AggregationResourceType aggregationResourceType = (AggregationResourceType)theEObject;
				T result = caseAggregationResourceType(aggregationResourceType);
				if (result == null) result = caseResourceType(aggregationResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.PRIMARY_RESOURCE_TYPE: {
				PrimaryResourceType primaryResourceType = (PrimaryResourceType)theEObject;
				T result = casePrimaryResourceType(primaryResourceType);
				if (result == null) result = caseResourceType(primaryResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.ACTIVITY_RESOURCE_TYPE: {
				ActivityResourceType activityResourceType = (ActivityResourceType)theEObject;
				T result = caseActivityResourceType(activityResourceType);
				if (result == null) result = caseResourceType(activityResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.PAGING_RESOURCE_TYPE: {
				PagingResourceType pagingResourceType = (PagingResourceType)theEObject;
				T result = casePagingResourceType(pagingResourceType);
				if (result == null) result = caseResourceType(pagingResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.PROJECTION_RESOURCE_TYPE: {
				ProjectionResourceType projectionResourceType = (ProjectionResourceType)theEObject;
				T result = caseProjectionResourceType(projectionResourceType);
				if (result == null) result = caseResourceType(projectionResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.LIST_RESOURCE_TYPE: {
				ListResourceType listResourceType = (ListResourceType)theEObject;
				T result = caseListResourceType(listResourceType);
				if (result == null) result = caseResourceType(listResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.FILTER_RESOURCE_TYPE: {
				FilterResourceType filterResourceType = (FilterResourceType)theEObject;
				T result = caseFilterResourceType(filterResourceType);
				if (result == null) result = caseListResourceType(filterResourceType);
				if (result == null) result = caseResourceType(filterResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.MEDIA_TYPE_LINK: {
				MediaTypeLink mediaTypeLink = (MediaTypeLink)theEObject;
				T result = caseMediaTypeLink(mediaTypeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.MEDIA_TYPE_LINK_COLLECTION: {
				MediaTypeLinkCollection mediaTypeLinkCollection = (MediaTypeLinkCollection)theEObject;
				T result = caseMediaTypeLinkCollection(mediaTypeLinkCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.REPRESENTATION_LINK: {
				RepresentationLink representationLink = (RepresentationLink)theEObject;
				T result = caseRepresentationLink(representationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestStructurePackage.REPRESENTATION_LINK_COLLECTION: {
				RepresentationLinkCollection representationLinkCollection = (RepresentationLinkCollection)theEObject;
				T result = caseRepresentationLinkCollection(representationLinkCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceElement(ResourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Identifier Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Identifier Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceIdentifierPattern(ResourceIdentifierPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkCollection(LinkCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaType(MediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationElement(RepresentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodType(MethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationType(RelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink(InternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLink(ExternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Link Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLinkCollection(ExternalLinkCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLinkCollection(InternalLinkCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataType(PrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleIdentifier(SimpleIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Identifier Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Identifier Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexIdentifierPattern(ComplexIdentifierPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaTypeElement(MediaTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subresource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subresource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubresourceType(SubresourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationResourceType(AggregationResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryResourceType(PrimaryResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityResourceType(ActivityResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paging Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paging Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagingResourceType(PagingResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectionResourceType(ProjectionResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListResourceType(ListResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterResourceType(FilterResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaTypeLink(MediaTypeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type Link Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaTypeLinkCollection(MediaTypeLinkCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationLink(RepresentationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Link Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationLinkCollection(RepresentationLinkCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RestStructureSwitch
