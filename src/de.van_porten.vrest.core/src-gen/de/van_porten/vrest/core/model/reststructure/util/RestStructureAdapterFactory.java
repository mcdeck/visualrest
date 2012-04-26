/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.util;

import de.van_porten.vrest.core.model.reststructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage
 * @generated
 */
public class RestStructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestStructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestStructureSwitch<Adapter> modelSwitch =
		new RestStructureSwitch<Adapter>() {
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseResourceElement(ResourceElement object) {
				return createResourceElementAdapter();
			}
			@Override
			public Adapter caseResourceIdentifierPattern(ResourceIdentifierPattern object) {
				return createResourceIdentifierPatternAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseLinkCollection(LinkCollection object) {
				return createLinkCollectionAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseMediaType(MediaType object) {
				return createMediaTypeAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseRepresentationElement(RepresentationElement object) {
				return createRepresentationElementAdapter();
			}
			@Override
			public Adapter caseMethodType(MethodType object) {
				return createMethodTypeAdapter();
			}
			@Override
			public Adapter caseRelationType(RelationType object) {
				return createRelationTypeAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseExternalLink(ExternalLink object) {
				return createExternalLinkAdapter();
			}
			@Override
			public Adapter caseExternalLinkCollection(ExternalLinkCollection object) {
				return createExternalLinkCollectionAdapter();
			}
			@Override
			public Adapter caseInternalLinkCollection(InternalLinkCollection object) {
				return createInternalLinkCollectionAdapter();
			}
			@Override
			public Adapter casePrimitiveDataType(PrimitiveDataType object) {
				return createPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseSimpleIdentifier(SimpleIdentifier object) {
				return createSimpleIdentifierAdapter();
			}
			@Override
			public Adapter caseComplexIdentifierPattern(ComplexIdentifierPattern object) {
				return createComplexIdentifierPatternAdapter();
			}
			@Override
			public Adapter caseMediaTypeElement(MediaTypeElement object) {
				return createMediaTypeElementAdapter();
			}
			@Override
			public Adapter caseSubresourceType(SubresourceType object) {
				return createSubresourceTypeAdapter();
			}
			@Override
			public Adapter caseAggregationResourceType(AggregationResourceType object) {
				return createAggregationResourceTypeAdapter();
			}
			@Override
			public Adapter casePrimaryResourceType(PrimaryResourceType object) {
				return createPrimaryResourceTypeAdapter();
			}
			@Override
			public Adapter caseActivityResourceType(ActivityResourceType object) {
				return createActivityResourceTypeAdapter();
			}
			@Override
			public Adapter casePagingResourceType(PagingResourceType object) {
				return createPagingResourceTypeAdapter();
			}
			@Override
			public Adapter caseProjectionResourceType(ProjectionResourceType object) {
				return createProjectionResourceTypeAdapter();
			}
			@Override
			public Adapter caseListResourceType(ListResourceType object) {
				return createListResourceTypeAdapter();
			}
			@Override
			public Adapter caseFilterResourceType(FilterResourceType object) {
				return createFilterResourceTypeAdapter();
			}
			@Override
			public Adapter caseMediaTypeLink(MediaTypeLink object) {
				return createMediaTypeLinkAdapter();
			}
			@Override
			public Adapter caseMediaTypeLinkCollection(MediaTypeLinkCollection object) {
				return createMediaTypeLinkCollectionAdapter();
			}
			@Override
			public Adapter caseRepresentationLink(RepresentationLink object) {
				return createRepresentationLinkAdapter();
			}
			@Override
			public Adapter caseRepresentationLinkCollection(RepresentationLinkCollection object) {
				return createRepresentationLinkCollectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ResourceElement <em>Resource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceElement
	 * @generated
	 */
	public Adapter createResourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern <em>Resource Identifier Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern
	 * @generated
	 */
	public Adapter createResourceIdentifierPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.LinkCollection <em>Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.LinkCollection
	 * @generated
	 */
	public Adapter createLinkCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType
	 * @generated
	 */
	public Adapter createMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement <em>Representation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement
	 * @generated
	 */
	public Adapter createRepresentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.MethodType
	 * @generated
	 */
	public Adapter createMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.RelationType
	 * @generated
	 */
	public Adapter createRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ExternalLink
	 * @generated
	 */
	public Adapter createExternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection <em>External Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection
	 * @generated
	 */
	public Adapter createExternalLinkCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.InternalLinkCollection <em>Internal Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLinkCollection
	 * @generated
	 */
	public Adapter createInternalLinkCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.PrimitiveDataType
	 * @generated
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.SimpleIdentifier <em>Simple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.SimpleIdentifier
	 * @generated
	 */
	public Adapter createSimpleIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern <em>Complex Identifier Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern
	 * @generated
	 */
	public Adapter createComplexIdentifierPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement <em>Media Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeElement
	 * @generated
	 */
	public Adapter createMediaTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.SubresourceType <em>Subresource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.SubresourceType
	 * @generated
	 */
	public Adapter createSubresourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.AggregationResourceType <em>Aggregation Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.AggregationResourceType
	 * @generated
	 */
	public Adapter createAggregationResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.PrimaryResourceType <em>Primary Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.PrimaryResourceType
	 * @generated
	 */
	public Adapter createPrimaryResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ActivityResourceType <em>Activity Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ActivityResourceType
	 * @generated
	 */
	public Adapter createActivityResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.PagingResourceType <em>Paging Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.PagingResourceType
	 * @generated
	 */
	public Adapter createPagingResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ProjectionResourceType <em>Projection Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ProjectionResourceType
	 * @generated
	 */
	public Adapter createProjectionResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.ListResourceType <em>List Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.ListResourceType
	 * @generated
	 */
	public Adapter createListResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.FilterResourceType <em>Filter Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.FilterResourceType
	 * @generated
	 */
	public Adapter createFilterResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLink <em>Media Type Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLink
	 * @generated
	 */
	public Adapter createMediaTypeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection <em>Media Type Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection
	 * @generated
	 */
	public Adapter createMediaTypeLinkCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink <em>Representation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLink
	 * @generated
	 */
	public Adapter createRepresentationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection <em>Representation Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection
	 * @generated
	 */
	public Adapter createRepresentationLinkCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestStructureAdapterFactory
