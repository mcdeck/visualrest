/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage
 * @generated
 */
public interface RestStructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestStructureFactory eINSTANCE = de.van_porten.vrest.core.model.reststructure.impl.RestStructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Collection</em>'.
	 * @generated
	 */
	LinkCollection createLinkCollection();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Type</em>'.
	 * @generated
	 */
	MediaType createMediaType();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Representation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Element</em>'.
	 * @generated
	 */
	RepresentationElement createRepresentationElement();

	/**
	 * Returns a new object of class '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Type</em>'.
	 * @generated
	 */
	MethodType createMethodType();

	/**
	 * Returns a new object of class '<em>Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Type</em>'.
	 * @generated
	 */
	RelationType createRelationType();

	/**
	 * Returns a new object of class '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link</em>'.
	 * @generated
	 */
	InternalLink createInternalLink();

	/**
	 * Returns a new object of class '<em>External Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Link</em>'.
	 * @generated
	 */
	ExternalLink createExternalLink();

	/**
	 * Returns a new object of class '<em>External Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Link Collection</em>'.
	 * @generated
	 */
	ExternalLinkCollection createExternalLinkCollection();

	/**
	 * Returns a new object of class '<em>Internal Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link Collection</em>'.
	 * @generated
	 */
	InternalLinkCollection createInternalLinkCollection();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Simple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Identifier</em>'.
	 * @generated
	 */
	SimpleIdentifier createSimpleIdentifier();

	/**
	 * Returns a new object of class '<em>Complex Identifier Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Identifier Pattern</em>'.
	 * @generated
	 */
	ComplexIdentifierPattern createComplexIdentifierPattern();

	/**
	 * Returns a new object of class '<em>Media Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Type Element</em>'.
	 * @generated
	 */
	MediaTypeElement createMediaTypeElement();

	/**
	 * Returns a new object of class '<em>Subresource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subresource Type</em>'.
	 * @generated
	 */
	SubresourceType createSubresourceType();

	/**
	 * Returns a new object of class '<em>Aggregation Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Resource Type</em>'.
	 * @generated
	 */
	AggregationResourceType createAggregationResourceType();

	/**
	 * Returns a new object of class '<em>Primary Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Resource Type</em>'.
	 * @generated
	 */
	PrimaryResourceType createPrimaryResourceType();

	/**
	 * Returns a new object of class '<em>Activity Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Resource Type</em>'.
	 * @generated
	 */
	ActivityResourceType createActivityResourceType();

	/**
	 * Returns a new object of class '<em>Paging Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paging Resource Type</em>'.
	 * @generated
	 */
	PagingResourceType createPagingResourceType();

	/**
	 * Returns a new object of class '<em>Projection Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection Resource Type</em>'.
	 * @generated
	 */
	ProjectionResourceType createProjectionResourceType();

	/**
	 * Returns a new object of class '<em>List Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Resource Type</em>'.
	 * @generated
	 */
	ListResourceType createListResourceType();

	/**
	 * Returns a new object of class '<em>Filter Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Resource Type</em>'.
	 * @generated
	 */
	FilterResourceType createFilterResourceType();

	/**
	 * Returns a new object of class '<em>Media Type Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Type Link</em>'.
	 * @generated
	 */
	MediaTypeLink createMediaTypeLink();

	/**
	 * Returns a new object of class '<em>Media Type Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Type Link Collection</em>'.
	 * @generated
	 */
	MediaTypeLinkCollection createMediaTypeLinkCollection();

	/**
	 * Returns a new object of class '<em>Representation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Link</em>'.
	 * @generated
	 */
	RepresentationLink createRepresentationLink();

	/**
	 * Returns a new object of class '<em>Representation Link Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Link Collection</em>'.
	 * @generated
	 */
	RepresentationLinkCollection createRepresentationLinkCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestStructurePackage getRestStructurePackage();

} //RestStructureFactory
