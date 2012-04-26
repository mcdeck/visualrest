/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.reststructure.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory;


/**
 * @author Oliver van Porten
 * 
 */
public class ReststructureEEFAdapterFactory extends RestStructureAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createAttributeAdapter()
	 * 
	 */
	public Adapter createAttributeAdapter() {
		return new AttributePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createLinkCollectionAdapter()
	 * 
	 */
	public Adapter createLinkCollectionAdapter() {
		return new LinkCollectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createParameterAdapter()
	 * 
	 */
	public Adapter createParameterAdapter() {
		return new ParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMethodAdapter()
	 * 
	 */
	public Adapter createMethodAdapter() {
		return new MethodPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMediaTypeAdapter()
	 * 
	 */
	public Adapter createMediaTypeAdapter() {
		return new MediaTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createRepresentationAdapter()
	 * 
	 */
	public Adapter createRepresentationAdapter() {
		return new RepresentationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createRepresentationElementAdapter()
	 * 
	 */
	public Adapter createRepresentationElementAdapter() {
		return new RepresentationElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMethodTypeAdapter()
	 * 
	 */
	public Adapter createMethodTypeAdapter() {
		return new MethodTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createRelationTypeAdapter()
	 * 
	 */
	public Adapter createRelationTypeAdapter() {
		return new RelationTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createInternalLinkAdapter()
	 * 
	 */
	public Adapter createInternalLinkAdapter() {
		return new InternalLinkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createExternalLinkAdapter()
	 * 
	 */
	public Adapter createExternalLinkAdapter() {
		return new ExternalLinkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createExternalLinkCollectionAdapter()
	 * 
	 */
	public Adapter createExternalLinkCollectionAdapter() {
		return new ExternalLinkCollectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createInternalLinkCollectionAdapter()
	 * 
	 */
	public Adapter createInternalLinkCollectionAdapter() {
		return new InternalLinkCollectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createPrimitiveDataTypeAdapter()
	 * 
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return new PrimitiveDataTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createCollectionTypeAdapter()
	 * 
	 */
	public Adapter createCollectionTypeAdapter() {
		return new CollectionTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createSimpleIdentifierAdapter()
	 * 
	 */
	public Adapter createSimpleIdentifierAdapter() {
		return new SimpleIdentifierPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createComplexIdentifierPatternAdapter()
	 * 
	 */
	public Adapter createComplexIdentifierPatternAdapter() {
		return new ComplexIdentifierPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMediaTypeElementAdapter()
	 * 
	 */
	public Adapter createMediaTypeElementAdapter() {
		return new MediaTypeElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createSubresourceTypeAdapter()
	 * 
	 */
	public Adapter createSubresourceTypeAdapter() {
		return new SubresourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createAggregationResourceTypeAdapter()
	 * 
	 */
	public Adapter createAggregationResourceTypeAdapter() {
		return new AggregationResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createPrimaryResourceTypeAdapter()
	 * 
	 */
	public Adapter createPrimaryResourceTypeAdapter() {
		return new PrimaryResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createActivityResourceTypeAdapter()
	 * 
	 */
	public Adapter createActivityResourceTypeAdapter() {
		return new ActivityResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createPagingResourceTypeAdapter()
	 * 
	 */
	public Adapter createPagingResourceTypeAdapter() {
		return new PagingResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createProjectionResourceTypeAdapter()
	 * 
	 */
	public Adapter createProjectionResourceTypeAdapter() {
		return new ProjectionResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createListResourceTypeAdapter()
	 * 
	 */
	public Adapter createListResourceTypeAdapter() {
		return new ListResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createFilterResourceTypeAdapter()
	 * 
	 */
	public Adapter createFilterResourceTypeAdapter() {
		return new FilterResourceTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMediaTypeLinkAdapter()
	 * 
	 */
	public Adapter createMediaTypeLinkAdapter() {
		return new MediaTypeLinkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createMediaTypeLinkCollectionAdapter()
	 * 
	 */
	public Adapter createMediaTypeLinkCollectionAdapter() {
		return new MediaTypeLinkCollectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createRepresentationLinkAdapter()
	 * 
	 */
	public Adapter createRepresentationLinkAdapter() {
		return new RepresentationLinkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.reststructure.util.RestStructureAdapterFactory#createRepresentationLinkCollectionAdapter()
	 * 
	 */
	public Adapter createRepresentationLinkCollectionAdapter() {
		return new RepresentationLinkCollectionPropertiesEditionProvider();
	}

}
