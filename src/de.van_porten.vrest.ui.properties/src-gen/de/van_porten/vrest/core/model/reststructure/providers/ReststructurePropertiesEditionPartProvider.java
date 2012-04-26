/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ActivityResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.AggregationResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.AttributePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.CollectionTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ComplexIdentifierPatternPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ExternalLinkCollectionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ExternalLinkPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.FilterResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.InternalLinkCollectionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.InternalLinkPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.LinkCollectionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ListResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MediaTypeElementPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MediaTypeLinkCollectionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MediaTypeLinkPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MediaTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MethodPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.MethodTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.PagingResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ParameterPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.PrimaryResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.PrimitiveDataTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.ProjectionResourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.RelationTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.RepresentationElementPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.RepresentationLinkCollectionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.RepresentationLinkPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.RepresentationPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.SimpleIdentifierPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.forms.SubresourceTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ActivityResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.AggregationResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.AttributePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.CollectionTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ComplexIdentifierPatternPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ExternalLinkCollectionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ExternalLinkPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.FilterResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.InternalLinkCollectionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.InternalLinkPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.LinkCollectionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ListResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MediaTypeElementPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MediaTypeLinkCollectionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MediaTypeLinkPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MediaTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MethodPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.MethodTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.PagingResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ParameterPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.PrimaryResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.PrimitiveDataTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.ProjectionResourceTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.RelationTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.RepresentationElementPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.RepresentationLinkCollectionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.RepresentationLinkPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.RepresentationPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.SimpleIdentifierPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.reststructure.parts.impl.SubresourceTypePropertiesEditionPartImpl;




/**
 * @author Oliver van Porten
 * 
 */
public class ReststructurePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ReststructureViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ReststructureViewsRepository.Attribute.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new AttributePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new AttributePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.LinkCollection.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new LinkCollectionPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new LinkCollectionPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.Parameter.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ParameterPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ParameterPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.Method.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MethodPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MethodPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.MediaType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MediaTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MediaTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.Representation.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new RepresentationPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new RepresentationPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.RepresentationElement.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new RepresentationElementPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new RepresentationElementPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.MethodType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MethodTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MethodTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.RelationType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new RelationTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new RelationTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.InternalLink.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new InternalLinkPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new InternalLinkPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ExternalLink.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ExternalLinkPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ExternalLinkPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ExternalLinkCollection.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ExternalLinkCollectionPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ExternalLinkCollectionPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.InternalLinkCollection.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new InternalLinkCollectionPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new InternalLinkCollectionPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.PrimitiveDataType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new PrimitiveDataTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new PrimitiveDataTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.CollectionType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new CollectionTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new CollectionTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.SimpleIdentifier.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new SimpleIdentifierPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new SimpleIdentifierPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ComplexIdentifierPattern.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ComplexIdentifierPatternPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ComplexIdentifierPatternPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.MediaTypeElement.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MediaTypeElementPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MediaTypeElementPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.SubresourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new SubresourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new SubresourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.AggregationResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new AggregationResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new AggregationResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.PrimaryResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new PrimaryResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new PrimaryResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ActivityResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ActivityResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ActivityResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.PagingResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new PagingResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new PagingResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ProjectionResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ProjectionResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ProjectionResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.ListResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new ListResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new ListResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.FilterResourceType.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new FilterResourceTypePropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new FilterResourceTypePropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.MediaTypeLink.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MediaTypeLinkPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MediaTypeLinkPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.MediaTypeLinkCollection.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new MediaTypeLinkCollectionPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new MediaTypeLinkCollectionPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.RepresentationLink.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new RepresentationLinkPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new RepresentationLinkPropertiesEditionPartForm(component);
		}
		if (key == ReststructureViewsRepository.RepresentationLinkCollection.class) {
			if (kind == ReststructureViewsRepository.SWT_KIND)
				return new RepresentationLinkCollectionPropertiesEditionPartImpl(component);
			if (kind == ReststructureViewsRepository.FORM_KIND)
				return new RepresentationLinkCollectionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
