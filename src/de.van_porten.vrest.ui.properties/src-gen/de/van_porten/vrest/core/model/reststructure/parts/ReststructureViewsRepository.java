/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts;

/**
 * @author Oliver van Porten
 * 
 */
public class ReststructureViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Attribute view descriptor
	 * 
	 */
	public static class Attribute {
		public static class Properties {
	
			
			public static String name = "reststructure::Attribute::properties::name";
			
			
			public static String attrType = "reststructure::Attribute::properties::attrType";
			
	
		}
	
	}

	/**
	 * LinkCollection view descriptor
	 * 
	 */
	public static class LinkCollection {
		public static class Properties {
	
			
			public static String name = "reststructure::LinkCollection::properties::name";
			
	
		}
	
	}

	/**
	 * Parameter view descriptor
	 * 
	 */
	public static class Parameter {
		public static class Properties {
	
			
			public static String paramType = "reststructure::Parameter::properties::paramType";
			
	
		}
	
	}

	/**
	 * Method view descriptor
	 * 
	 */
	public static class Method {
		public static class Properties {
	
			
			public static String consumed = "reststructure::Method::properties::consumed";
			
			
			public static String produced = "reststructure::Method::properties::produced";
			
			
			public static String methodtype = "reststructure::Method::properties::methodtype";
			
			
			public static String parameters = "reststructure::Method::properties::parameters";
			
			
			public static String name = "reststructure::Method::properties::name";
			
	
		}
	
	}

	/**
	 * MediaType view descriptor
	 * 
	 */
	public static class MediaType {
		public static class Properties {
	
			
			public static String containedMTElements = "reststructure::MediaType::properties::containedMTElements";
			
			
			public static String name = "reststructure::MediaType::properties::name";
			
			
			public static String containedMTLinks = "reststructure::MediaType::properties::containedMTLinks";
			
			
			public static String containedMTLinkCollections = "reststructure::MediaType::properties::containedMTLinkCollections";
			
	
		}
	
	}

	/**
	 * Representation view descriptor
	 * 
	 */
	public static class Representation {
		public static class Properties {
	
			
			public static String containedRepElements = "reststructure::Representation::properties::containedRepElements";
			
			
			public static String mediatype = "reststructure::Representation::properties::mediatype";
			
			
			public static String name = "reststructure::Representation::properties::name";
			
			
			public static String containedRepLinks = "reststructure::Representation::properties::containedRepLinks";
			
			
			public static String containedRepLinkCollections = "reststructure::Representation::properties::containedRepLinkCollections";
			
	
		}
	
	}

	/**
	 * RepresentationElement view descriptor
	 * 
	 */
	public static class RepresentationElement {
		public static class Properties {
	
			
			public static String correspondingElement = "reststructure::RepresentationElement::properties::correspondingElement";
			
			
			public static String repElemType = "reststructure::RepresentationElement::properties::repElemType";
			
			
			public static String name = "reststructure::RepresentationElement::properties::name";
			
	
		}
	
	}

	/**
	 * MethodType view descriptor
	 * 
	 */
	public static class MethodType {
		public static class Properties {
	
			
			public static String name = "reststructure::MethodType::properties::name";
			
	
		}
	
	}

	/**
	 * RelationType view descriptor
	 * 
	 */
	public static class RelationType {
		public static class Properties {
	
			
			public static String name = "reststructure::RelationType::properties::name";
			
	
		}
	
	}

	/**
	 * InternalLink view descriptor
	 * 
	 */
	public static class InternalLink {
		public static class Properties {
	
			
			public static String name = "reststructure::InternalLink::properties::name";
			
			
			public static String relType = "reststructure::InternalLink::properties::relType";
			
			
			public static String target = "reststructure::InternalLink::properties::target";
			
	
		}
	
	}

	/**
	 * ExternalLink view descriptor
	 * 
	 */
	public static class ExternalLink {
		public static class Properties {
	
			
			public static String name = "reststructure::ExternalLink::properties::name";
			
			
			public static String relType = "reststructure::ExternalLink::properties::relType";
			
	
		}
	
	}

	/**
	 * ExternalLinkCollection view descriptor
	 * 
	 */
	public static class ExternalLinkCollection {
		public static class Properties {
	
			
			public static String name = "reststructure::ExternalLinkCollection::properties::name";
			
			
			public static String extElements = "reststructure::ExternalLinkCollection::properties::extElements";
			
	
		}
	
	}

	/**
	 * InternalLinkCollection view descriptor
	 * 
	 */
	public static class InternalLinkCollection {
		public static class Properties {
	
			
			public static String name = "reststructure::InternalLinkCollection::properties::name";
			
			
			public static String intElements = "reststructure::InternalLinkCollection::properties::intElements";
			
	
		}
	
	}

	/**
	 * PrimitiveDataType view descriptor
	 * 
	 */
	public static class PrimitiveDataType {
		public static class Properties {
	
			
			public static String name = "reststructure::PrimitiveDataType::properties::name";
			
	
		}
	
	}

	/**
	 * CollectionType view descriptor
	 * 
	 */
	public static class CollectionType {
		public static class Properties {
	
			
			public static String elementType = "reststructure::CollectionType::properties::elementType";
			
	
		}
	
	}

	/**
	 * SimpleIdentifier view descriptor
	 * 
	 */
	public static class SimpleIdentifier {
		public static class Properties {
	
			
			public static String identifier = "reststructure::SimpleIdentifier::properties::identifier";
			
	
		}
	
	}

	/**
	 * ComplexIdentifierPattern view descriptor
	 * 
	 */
	public static class ComplexIdentifierPattern {
		public static class Properties {
	
			
			public static String idParams = "reststructure::ComplexIdentifierPattern::properties::idParams";
			
			
			public static String idAttrs = "reststructure::ComplexIdentifierPattern::properties::idAttrs";
			
	
		}
	
	}

	/**
	 * MediaTypeElement view descriptor
	 * 
	 */
	public static class MediaTypeElement {
		public static class Properties {
	
			
			public static String mtelemType = "reststructure::MediaTypeElement::properties::mtelemType";
			
			
			public static String name = "reststructure::MediaTypeElement::properties::name";
			
	
		}
	
	}

	/**
	 * SubresourceType view descriptor
	 * 
	 */
	public static class SubresourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::SubresourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::SubresourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::SubresourceType::properties::methods";
			
			
			public static String creators = "reststructure::SubresourceType::properties::creators";
			
			
			public static String states = "reststructure::SubresourceType::properties::states";
			
			
			public static String initialState = "reststructure::SubresourceType::properties::initialState";
			
			
			public static String name = "reststructure::SubresourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::SubresourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::SubresourceType::properties::createOnStart";
			
			
			public static String containingType = "reststructure::SubresourceType::properties::containingType";
			
	
		}
	
	}

	/**
	 * AggregationResourceType view descriptor
	 * 
	 */
	public static class AggregationResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::AggregationResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::AggregationResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::AggregationResourceType::properties::methods";
			
			
			public static String creators = "reststructure::AggregationResourceType::properties::creators";
			
			
			public static String states = "reststructure::AggregationResourceType::properties::states";
			
			
			public static String initialState = "reststructure::AggregationResourceType::properties::initialState";
			
			
			public static String name = "reststructure::AggregationResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::AggregationResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::AggregationResourceType::properties::createOnStart";
			
			
			public static String elementTypes = "reststructure::AggregationResourceType::properties::elementTypes";
			
	
		}
	
	}

	/**
	 * PrimaryResourceType view descriptor
	 * 
	 */
	public static class PrimaryResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::PrimaryResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::PrimaryResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::PrimaryResourceType::properties::methods";
			
			
			public static String creators = "reststructure::PrimaryResourceType::properties::creators";
			
			
			public static String states = "reststructure::PrimaryResourceType::properties::states";
			
			
			public static String initialState = "reststructure::PrimaryResourceType::properties::initialState";
			
			
			public static String name = "reststructure::PrimaryResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::PrimaryResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::PrimaryResourceType::properties::createOnStart";
			
	
		}
	
	}

	/**
	 * ActivityResourceType view descriptor
	 * 
	 */
	public static class ActivityResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::ActivityResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::ActivityResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::ActivityResourceType::properties::methods";
			
			
			public static String creators = "reststructure::ActivityResourceType::properties::creators";
			
			
			public static String states = "reststructure::ActivityResourceType::properties::states";
			
			
			public static String initialState = "reststructure::ActivityResourceType::properties::initialState";
			
			
			public static String name = "reststructure::ActivityResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::ActivityResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::ActivityResourceType::properties::createOnStart";
			
	
		}
	
	}

	/**
	 * PagingResourceType view descriptor
	 * 
	 */
	public static class PagingResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::PagingResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::PagingResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::PagingResourceType::properties::methods";
			
			
			public static String creators = "reststructure::PagingResourceType::properties::creators";
			
			
			public static String states = "reststructure::PagingResourceType::properties::states";
			
			
			public static String initialState = "reststructure::PagingResourceType::properties::initialState";
			
			
			public static String name = "reststructure::PagingResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::PagingResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::PagingResourceType::properties::createOnStart";
			
			
			public static String pagedType = "reststructure::PagingResourceType::properties::pagedType";
			
	
		}
	
	}

	/**
	 * ProjectionResourceType view descriptor
	 * 
	 */
	public static class ProjectionResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::ProjectionResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::ProjectionResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::ProjectionResourceType::properties::methods";
			
			
			public static String creators = "reststructure::ProjectionResourceType::properties::creators";
			
			
			public static String states = "reststructure::ProjectionResourceType::properties::states";
			
			
			public static String initialState = "reststructure::ProjectionResourceType::properties::initialState";
			
			
			public static String name = "reststructure::ProjectionResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::ProjectionResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::ProjectionResourceType::properties::createOnStart";
			
			
			public static String projectedType = "reststructure::ProjectionResourceType::properties::projectedType";
			
	
		}
	
	}

	/**
	 * ListResourceType view descriptor
	 * 
	 */
	public static class ListResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::ListResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::ListResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::ListResourceType::properties::methods";
			
			
			public static String creators = "reststructure::ListResourceType::properties::creators";
			
			
			public static String states = "reststructure::ListResourceType::properties::states";
			
			
			public static String initialState = "reststructure::ListResourceType::properties::initialState";
			
			
			public static String name = "reststructure::ListResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::ListResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::ListResourceType::properties::createOnStart";
			
			
			public static String listElementType = "reststructure::ListResourceType::properties::listElementType";
			
	
		}
	
	}

	/**
	 * FilterResourceType view descriptor
	 * 
	 */
	public static class FilterResourceType {
		public static class Properties {
	
			
			public static String identifer = "reststructure::FilterResourceType::properties::identifer";
			
			
			public static String resourceelements = "reststructure::FilterResourceType::properties::resourceelements";
			
			
			public static String methods = "reststructure::FilterResourceType::properties::methods";
			
			
			public static String creators = "reststructure::FilterResourceType::properties::creators";
			
			
			public static String states = "reststructure::FilterResourceType::properties::states";
			
			
			public static String initialState = "reststructure::FilterResourceType::properties::initialState";
			
			
			public static String name = "reststructure::FilterResourceType::properties::name";
			
			
			public static String isSingleton = "reststructure::FilterResourceType::properties::isSingleton";
			
			
			public static String createOnStart = "reststructure::FilterResourceType::properties::createOnStart";
			
			
			public static String listElementType = "reststructure::FilterResourceType::properties::listElementType";
			
	
		}
	
	}

	/**
	 * MediaTypeLink view descriptor
	 * 
	 */
	public static class MediaTypeLink {
		public static class Properties {
	
			
			public static String name = "reststructure::MediaTypeLink::properties::name";
			
	
		}
	
	}

	/**
	 * MediaTypeLinkCollection view descriptor
	 * 
	 */
	public static class MediaTypeLinkCollection {
		public static class Properties {
	
			
			public static String name = "reststructure::MediaTypeLinkCollection::properties::name";
			
	
		}
	
	}

	/**
	 * RepresentationLink view descriptor
	 * 
	 */
	public static class RepresentationLink {
		public static class Properties {
	
			
			public static String name = "reststructure::RepresentationLink::properties::name";
			
			
			public static String correspondingLink = "reststructure::RepresentationLink::properties::correspondingLink";
			
			
			public static String linkValue = "reststructure::RepresentationLink::properties::linkValue";
			
	
		}
	
	}

	/**
	 * RepresentationLinkCollection view descriptor
	 * 
	 */
	public static class RepresentationLinkCollection {
		public static class Properties {
	
			
			public static String name = "reststructure::RepresentationLinkCollection::properties::name";
			
			
			public static String correspondingLinkCollection = "reststructure::RepresentationLinkCollection::properties::correspondingLinkCollection";
			
	
		}
	
	}

}
