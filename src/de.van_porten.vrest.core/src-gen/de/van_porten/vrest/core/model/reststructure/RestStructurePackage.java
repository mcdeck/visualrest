/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

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
 * @see de.van_porten.vrest.core.model.reststructure.RestStructureFactory
 * @model kind="package"
 * @generated
 */
public interface RestStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reststructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://reststructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reststructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestStructurePackage eINSTANCE = de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IDENTIFER = 0;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RESOURCEELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__METHODS = 2;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CREATORS = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__STATES = 4;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__INITIAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_SINGLETON = 7;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CREATE_ON_START = 8;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceElementImpl <em>Resource Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceElementImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceElement()
	 * @generated
	 */
	int RESOURCE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceIdentifierPatternImpl <em>Resource Identifier Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceIdentifierPatternImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceIdentifierPattern()
	 * @generated
	 */
	int RESOURCE_IDENTIFIER_PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Resource Identifier Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.AttributeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attr Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTR_TYPE = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.LinkImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL_TYPE = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.LinkCollectionImpl <em>Link Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.LinkCollectionImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getLinkCollection()
	 * @generated
	 */
	int LINK_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_COLLECTION__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Link Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_COLLECTION_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.DataTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ParameterImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MethodImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Consumed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONSUMED = 0;

	/**
	 * The feature id for the '<em><b>Produced</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PRODUCED = 1;

	/**
	 * The feature id for the '<em><b>Methodtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHODTYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Methodbehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHODBEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl <em>Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Contained MT Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__CONTAINED_MT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Contained MT Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__CONTAINED_MT_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Contained MT Link Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS = 3;

	/**
	 * The number of structural features of the '<em>Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 10;

	/**
	 * The feature id for the '<em><b>Contained Rep Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__CONTAINED_REP_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Mediatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__MEDIATYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Contained Rep Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__CONTAINED_REP_LINKS = 3;

	/**
	 * The feature id for the '<em><b>Contained Rep Link Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS = 4;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationElement()
	 * @generated
	 */
	int REPRESENTATION_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Corresponding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Rep Elem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT__REP_ELEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Representation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MethodTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RelationTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.InternalLinkImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Rel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REL_TYPE = LINK__REL_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__TARGET = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkImpl <em>External Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getExternalLink()
	 * @generated
	 */
	int EXTERNAL_LINK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Rel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__REL_TYPE = LINK__REL_TYPE;

	/**
	 * The number of structural features of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkCollectionImpl <em>External Link Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkCollectionImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getExternalLinkCollection()
	 * @generated
	 */
	int EXTERNAL_LINK_COLLECTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_COLLECTION__NAME = LINK_COLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Ext Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS = LINK_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Link Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_COLLECTION_FEATURE_COUNT = LINK_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.InternalLinkCollectionImpl <em>Internal Link Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.InternalLinkCollectionImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getInternalLinkCollection()
	 * @generated
	 */
	int INTERNAL_LINK_COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_COLLECTION__NAME = LINK_COLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Int Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_COLLECTION__INT_ELEMENTS = LINK_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Link Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_COLLECTION_FEATURE_COUNT = LINK_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.PrimitiveDataTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.CollectionTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.SimpleIdentifierImpl <em>Simple Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.SimpleIdentifierImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getSimpleIdentifier()
	 * @generated
	 */
	int SIMPLE_IDENTIFIER = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__IDENTIFIER = RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER_FEATURE_COUNT = RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl <em>Complex Identifier Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getComplexIdentifierPattern()
	 * @generated
	 */
	int COMPLEX_IDENTIFIER_PATTERN = 21;

	/**
	 * The feature id for the '<em><b>Id Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS = RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS = RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Identifier Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_IDENTIFIER_PATTERN_FEATURE_COUNT = RESOURCE_IDENTIFIER_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeElementImpl <em>Media Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeElementImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeElement()
	 * @generated
	 */
	int MEDIA_TYPE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Mtelem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ELEMENT__MTELEM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Media Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.SubresourceTypeImpl <em>Subresource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.SubresourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getSubresourceType()
	 * @generated
	 */
	int SUBRESOURCE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE__CONTAINING_TYPE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subresource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.AggregationResourceTypeImpl <em>Aggregation Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.AggregationResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getAggregationResourceType()
	 * @generated
	 */
	int AGGREGATION_RESOURCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>Element Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregation Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PrimaryResourceTypeImpl <em>Primary Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.PrimaryResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPrimaryResourceType()
	 * @generated
	 */
	int PRIMARY_RESOURCE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The number of structural features of the '<em>Primary Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ActivityResourceTypeImpl <em>Activity Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ActivityResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getActivityResourceType()
	 * @generated
	 */
	int ACTIVITY_RESOURCE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The number of structural features of the '<em>Activity Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PagingResourceTypeImpl <em>Paging Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.PagingResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPagingResourceType()
	 * @generated
	 */
	int PAGING_RESOURCE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>Paged Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE__PAGED_TYPE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paging Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGING_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ProjectionResourceTypeImpl <em>Projection Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ProjectionResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getProjectionResourceType()
	 * @generated
	 */
	int PROJECTION_RESOURCE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>Projected Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Projection Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ListResourceTypeImpl <em>List Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.ListResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getListResourceType()
	 * @generated
	 */
	int LIST_RESOURCE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__IDENTIFER = RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__RESOURCEELEMENTS = RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__METHODS = RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__CREATORS = RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__STATES = RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__INITIAL_STATE = RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__IS_SINGLETON = RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__CREATE_ON_START = RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>List Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.FilterResourceTypeImpl <em>Filter Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.FilterResourceTypeImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getFilterResourceType()
	 * @generated
	 */
	int FILTER_RESOURCE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__IDENTIFER = LIST_RESOURCE_TYPE__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Resourceelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__RESOURCEELEMENTS = LIST_RESOURCE_TYPE__RESOURCEELEMENTS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__METHODS = LIST_RESOURCE_TYPE__METHODS;

	/**
	 * The feature id for the '<em><b>Creators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__CREATORS = LIST_RESOURCE_TYPE__CREATORS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__STATES = LIST_RESOURCE_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__INITIAL_STATE = LIST_RESOURCE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__NAME = LIST_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__IS_SINGLETON = LIST_RESOURCE_TYPE__IS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__CREATE_ON_START = LIST_RESOURCE_TYPE__CREATE_ON_START;

	/**
	 * The feature id for the '<em><b>List Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE__LIST_ELEMENT_TYPE = LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Filter Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_RESOURCE_TYPE_FEATURE_COUNT = LIST_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkImpl <em>Media Type Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeLink()
	 * @generated
	 */
	int MEDIA_TYPE_LINK = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Media Type Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkCollectionImpl <em>Media Type Link Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkCollectionImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeLinkCollection()
	 * @generated
	 */
	int MEDIA_TYPE_LINK_COLLECTION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LINK_COLLECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Media Type Link Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_LINK_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl <em>Representation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationLink()
	 * @generated
	 */
	int REPRESENTATION_LINK = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Corresponding Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK__CORRESPONDING_LINK = 1;

	/**
	 * The feature id for the '<em><b>Link Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK__LINK_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Representation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkCollectionImpl <em>Representation Link Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkCollectionImpl
	 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationLinkCollection()
	 * @generated
	 */
	int REPRESENTATION_LINK_COLLECTION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Corresponding Link Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK_COLLECTION__CORRESPONDING_LINK_COLLECTION = 1;

	/**
	 * The number of structural features of the '<em>Representation Link Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_LINK_COLLECTION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getIdentifer <em>Identifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifer</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getIdentifer()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Identifer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getResourceelements <em>Resourceelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceelements</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getResourceelements()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Resourceelements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getMethods()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getCreators <em>Creators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creators</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getCreators()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Creators();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getStates()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_States();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getInitialState()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isIsSingleton <em>Is Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Singleton</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#isIsSingleton()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsSingleton();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isCreateOnStart <em>Create On Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create On Start</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceType#isCreateOnStart()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CreateOnStart();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ResourceElement <em>Resource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Element</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceElement
	 * @generated
	 */
	EClass getResourceElement();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.ResourceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceElement#getName()
	 * @see #getResourceElement()
	 * @generated
	 */
	EAttribute getResourceElement_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern <em>Resource Identifier Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Identifier Pattern</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern
	 * @generated
	 */
	EClass getResourceIdentifierPattern();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.Attribute#getAttrType <em>Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attr Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Attribute#getAttrType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttrType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.Link#getRelType <em>Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rel Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Link#getRelType()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RelType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.LinkCollection <em>Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.LinkCollection
	 * @generated
	 */
	EClass getLinkCollection();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.Parameter#getParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Parameter#getParamType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParamType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.Method#getConsumed <em>Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getConsumed()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Consumed();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.Method#getProduced <em>Produced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getProduced()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Produced();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodtype <em>Methodtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Methodtype</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getMethodtype()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Methodtype();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodbehavior <em>Methodbehavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methodbehavior</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getMethodbehavior()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Methodbehavior();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType
	 * @generated
	 */
	EClass getMediaType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTElements <em>Contained MT Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained MT Elements</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTElements()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_ContainedMTElements();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.MediaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType#getName()
	 * @see #getMediaType()
	 * @generated
	 */
	EAttribute getMediaType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinks <em>Contained MT Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained MT Links</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinks()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_ContainedMTLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinkCollections <em>Contained MT Link Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained MT Link Collections</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaType#getContainedMTLinkCollections()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_ContainedMTLinkCollections();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepElements <em>Contained Rep Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Rep Elements</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepElements()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_ContainedRepElements();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.Representation#getMediatype <em>Mediatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mediatype</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation#getMediatype()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Mediatype();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinks <em>Contained Rep Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Rep Links</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinks()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_ContainedRepLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinkCollections <em>Contained Rep Link Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Rep Link Collections</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.Representation#getContainedRepLinkCollections()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_ContainedRepLinkCollections();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement <em>Representation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Element</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement
	 * @generated
	 */
	EClass getRepresentationElement();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getCorrespondingElement <em>Corresponding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Element</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement#getCorrespondingElement()
	 * @see #getRepresentationElement()
	 * @generated
	 */
	EReference getRepresentationElement_CorrespondingElement();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getRepElemType <em>Rep Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rep Elem Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement#getRepElemType()
	 * @see #getRepresentationElement()
	 * @generated
	 */
	EReference getRepresentationElement_RepElemType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement#getName()
	 * @see #getRepresentationElement()
	 * @generated
	 */
	EAttribute getRepresentationElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationElement#getValue()
	 * @see #getRepresentationElement()
	 * @generated
	 */
	EReference getRepresentationElement_Value();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.MethodType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MethodType#getName()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.RelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RelationType#getName()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.InternalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLink#getTarget()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_Target();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ExternalLink
	 * @generated
	 */
	EClass getExternalLink();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection <em>External Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection
	 * @generated
	 */
	EClass getExternalLinkCollection();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection#getExtElements <em>Ext Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Elements</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ExternalLinkCollection#getExtElements()
	 * @see #getExternalLinkCollection()
	 * @generated
	 */
	EReference getExternalLinkCollection_ExtElements();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.InternalLinkCollection <em>Internal Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLinkCollection
	 * @generated
	 */
	EClass getInternalLinkCollection();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.InternalLinkCollection#getIntElements <em>Int Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Int Elements</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.InternalLinkCollection#getIntElements()
	 * @see #getInternalLinkCollection()
	 * @generated
	 */
	EReference getInternalLinkCollection_IntElements();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.PrimitiveDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.PrimitiveDataType#getName()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.CollectionType#getElementType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.SimpleIdentifier <em>Simple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Identifier</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.SimpleIdentifier
	 * @generated
	 */
	EClass getSimpleIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.SimpleIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.SimpleIdentifier#getIdentifier()
	 * @see #getSimpleIdentifier()
	 * @generated
	 */
	EAttribute getSimpleIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern <em>Complex Identifier Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Identifier Pattern</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern
	 * @generated
	 */
	EClass getComplexIdentifierPattern();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdParams <em>Id Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id Params</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdParams()
	 * @see #getComplexIdentifierPattern()
	 * @generated
	 */
	EReference getComplexIdentifierPattern_IdParams();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdAttrs <em>Id Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id Attrs</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern#getIdAttrs()
	 * @see #getComplexIdentifierPattern()
	 * @generated
	 */
	EReference getComplexIdentifierPattern_IdAttrs();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement <em>Media Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type Element</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeElement
	 * @generated
	 */
	EClass getMediaTypeElement();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getMtelemType <em>Mtelem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mtelem Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getMtelemType()
	 * @see #getMediaTypeElement()
	 * @generated
	 */
	EReference getMediaTypeElement_MtelemType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeElement#getName()
	 * @see #getMediaTypeElement()
	 * @generated
	 */
	EAttribute getMediaTypeElement_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.SubresourceType <em>Subresource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subresource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.SubresourceType
	 * @generated
	 */
	EClass getSubresourceType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.SubresourceType#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.SubresourceType#getContainingType()
	 * @see #getSubresourceType()
	 * @generated
	 */
	EReference getSubresourceType_ContainingType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.AggregationResourceType <em>Aggregation Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.AggregationResourceType
	 * @generated
	 */
	EClass getAggregationResourceType();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.reststructure.AggregationResourceType#getElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Types</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.AggregationResourceType#getElementTypes()
	 * @see #getAggregationResourceType()
	 * @generated
	 */
	EReference getAggregationResourceType_ElementTypes();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.PrimaryResourceType <em>Primary Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.PrimaryResourceType
	 * @generated
	 */
	EClass getPrimaryResourceType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ActivityResourceType <em>Activity Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ActivityResourceType
	 * @generated
	 */
	EClass getActivityResourceType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.PagingResourceType <em>Paging Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paging Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.PagingResourceType
	 * @generated
	 */
	EClass getPagingResourceType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.PagingResourceType#getPagedType <em>Paged Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paged Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.PagingResourceType#getPagedType()
	 * @see #getPagingResourceType()
	 * @generated
	 */
	EReference getPagingResourceType_PagedType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ProjectionResourceType <em>Projection Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ProjectionResourceType
	 * @generated
	 */
	EClass getProjectionResourceType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.ProjectionResourceType#getProjectedType <em>Projected Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projected Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ProjectionResourceType#getProjectedType()
	 * @see #getProjectionResourceType()
	 * @generated
	 */
	EReference getProjectionResourceType_ProjectedType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.ListResourceType <em>List Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ListResourceType
	 * @generated
	 */
	EClass getListResourceType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.ListResourceType#getListElementType <em>List Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Element Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.ListResourceType#getListElementType()
	 * @see #getListResourceType()
	 * @generated
	 */
	EReference getListResourceType_ListElementType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.FilterResourceType <em>Filter Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Resource Type</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.FilterResourceType
	 * @generated
	 */
	EClass getFilterResourceType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLink <em>Media Type Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLink
	 * @generated
	 */
	EClass getMediaTypeLink();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLink#getName()
	 * @see #getMediaTypeLink()
	 * @generated
	 */
	EAttribute getMediaTypeLink_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection <em>Media Type Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection
	 * @generated
	 */
	EClass getMediaTypeLinkCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection#getName()
	 * @see #getMediaTypeLinkCollection()
	 * @generated
	 */
	EAttribute getMediaTypeLinkCollection_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink <em>Representation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLink
	 * @generated
	 */
	EClass getRepresentationLink();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLink#getName()
	 * @see #getRepresentationLink()
	 * @generated
	 */
	EAttribute getRepresentationLink_Name();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getCorrespondingLink <em>Corresponding Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Link</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLink#getCorrespondingLink()
	 * @see #getRepresentationLink()
	 * @generated
	 */
	EReference getRepresentationLink_CorrespondingLink();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLink#getLinkValue <em>Link Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Value</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLink#getLinkValue()
	 * @see #getRepresentationLink()
	 * @generated
	 */
	EReference getRepresentationLink_LinkValue();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection <em>Representation Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection
	 * @generated
	 */
	EClass getRepresentationLinkCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getName()
	 * @see #getRepresentationLinkCollection()
	 * @generated
	 */
	EAttribute getRepresentationLinkCollection_Name();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getCorrespondingLinkCollection <em>Corresponding Link Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Link Collection</em>'.
	 * @see de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection#getCorrespondingLinkCollection()
	 * @see #getRepresentationLinkCollection()
	 * @generated
	 */
	EReference getRepresentationLinkCollection_CorrespondingLinkCollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestStructureFactory getRestStructureFactory();

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
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Identifer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__IDENTIFER = eINSTANCE.getResourceType_Identifer();

		/**
		 * The meta object literal for the '<em><b>Resourceelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RESOURCEELEMENTS = eINSTANCE.getResourceType_Resourceelements();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__METHODS = eINSTANCE.getResourceType_Methods();

		/**
		 * The meta object literal for the '<em><b>Creators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__CREATORS = eINSTANCE.getResourceType_Creators();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__STATES = eINSTANCE.getResourceType_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__INITIAL_STATE = eINSTANCE.getResourceType_InitialState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Is Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_SINGLETON = eINSTANCE.getResourceType_IsSingleton();

		/**
		 * The meta object literal for the '<em><b>Create On Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CREATE_ON_START = eINSTANCE.getResourceType_CreateOnStart();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceElementImpl <em>Resource Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceElementImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceElement()
		 * @generated
		 */
		EClass RESOURCE_ELEMENT = eINSTANCE.getResourceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ELEMENT__NAME = eINSTANCE.getResourceElement_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceIdentifierPatternImpl <em>Resource Identifier Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ResourceIdentifierPatternImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getResourceIdentifierPattern()
		 * @generated
		 */
		EClass RESOURCE_IDENTIFIER_PATTERN = eINSTANCE.getResourceIdentifierPattern();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.AttributeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attr Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTR_TYPE = eINSTANCE.getAttribute_AttrType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.LinkImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Rel Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REL_TYPE = eINSTANCE.getLink_RelType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.LinkCollectionImpl <em>Link Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.LinkCollectionImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getLinkCollection()
		 * @generated
		 */
		EClass LINK_COLLECTION = eINSTANCE.getLinkCollection();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.DataTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ParameterImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Param Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAM_TYPE = eINSTANCE.getParameter_ParamType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MethodImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Consumed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CONSUMED = eINSTANCE.getMethod_Consumed();

		/**
		 * The meta object literal for the '<em><b>Produced</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PRODUCED = eINSTANCE.getMethod_Produced();

		/**
		 * The meta object literal for the '<em><b>Methodtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__METHODTYPE = eINSTANCE.getMethod_Methodtype();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Methodbehavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__METHODBEHAVIOR = eINSTANCE.getMethod_Methodbehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl <em>Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaType()
		 * @generated
		 */
		EClass MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '<em><b>Contained MT Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__CONTAINED_MT_ELEMENTS = eINSTANCE.getMediaType_ContainedMTElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE__NAME = eINSTANCE.getMediaType_Name();

		/**
		 * The meta object literal for the '<em><b>Contained MT Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__CONTAINED_MT_LINKS = eINSTANCE.getMediaType_ContainedMTLinks();

		/**
		 * The meta object literal for the '<em><b>Contained MT Link Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__CONTAINED_MT_LINK_COLLECTIONS = eINSTANCE.getMediaType_ContainedMTLinkCollections();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Contained Rep Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__CONTAINED_REP_ELEMENTS = eINSTANCE.getRepresentation_ContainedRepElements();

		/**
		 * The meta object literal for the '<em><b>Mediatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__MEDIATYPE = eINSTANCE.getRepresentation_Mediatype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__NAME = eINSTANCE.getRepresentation_Name();

		/**
		 * The meta object literal for the '<em><b>Contained Rep Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__CONTAINED_REP_LINKS = eINSTANCE.getRepresentation_ContainedRepLinks();

		/**
		 * The meta object literal for the '<em><b>Contained Rep Link Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__CONTAINED_REP_LINK_COLLECTIONS = eINSTANCE.getRepresentation_ContainedRepLinkCollections();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationElement()
		 * @generated
		 */
		EClass REPRESENTATION_ELEMENT = eINSTANCE.getRepresentationElement();

		/**
		 * The meta object literal for the '<em><b>Corresponding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT = eINSTANCE.getRepresentationElement_CorrespondingElement();

		/**
		 * The meta object literal for the '<em><b>Rep Elem Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_ELEMENT__REP_ELEM_TYPE = eINSTANCE.getRepresentationElement_RepElemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_ELEMENT__NAME = eINSTANCE.getRepresentationElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_ELEMENT__VALUE = eINSTANCE.getRepresentationElement_Value();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MethodTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMethodType()
		 * @generated
		 */
		EClass METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__NAME = eINSTANCE.getMethodType_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RelationTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__NAME = eINSTANCE.getRelationType_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.InternalLinkImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__TARGET = eINSTANCE.getInternalLink_Target();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkImpl <em>External Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getExternalLink()
		 * @generated
		 */
		EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkCollectionImpl <em>External Link Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ExternalLinkCollectionImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getExternalLinkCollection()
		 * @generated
		 */
		EClass EXTERNAL_LINK_COLLECTION = eINSTANCE.getExternalLinkCollection();

		/**
		 * The meta object literal for the '<em><b>Ext Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_LINK_COLLECTION__EXT_ELEMENTS = eINSTANCE.getExternalLinkCollection_ExtElements();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.InternalLinkCollectionImpl <em>Internal Link Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.InternalLinkCollectionImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getInternalLinkCollection()
		 * @generated
		 */
		EClass INTERNAL_LINK_COLLECTION = eINSTANCE.getInternalLinkCollection();

		/**
		 * The meta object literal for the '<em><b>Int Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK_COLLECTION__INT_ELEMENTS = eINSTANCE.getInternalLinkCollection_IntElements();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.PrimitiveDataTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__NAME = eINSTANCE.getPrimitiveDataType_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.CollectionTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.SimpleIdentifierImpl <em>Simple Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.SimpleIdentifierImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getSimpleIdentifier()
		 * @generated
		 */
		EClass SIMPLE_IDENTIFIER = eINSTANCE.getSimpleIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_IDENTIFIER__IDENTIFIER = eINSTANCE.getSimpleIdentifier_Identifier();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl <em>Complex Identifier Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getComplexIdentifierPattern()
		 * @generated
		 */
		EClass COMPLEX_IDENTIFIER_PATTERN = eINSTANCE.getComplexIdentifierPattern();

		/**
		 * The meta object literal for the '<em><b>Id Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS = eINSTANCE.getComplexIdentifierPattern_IdParams();

		/**
		 * The meta object literal for the '<em><b>Id Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS = eINSTANCE.getComplexIdentifierPattern_IdAttrs();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeElementImpl <em>Media Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeElementImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeElement()
		 * @generated
		 */
		EClass MEDIA_TYPE_ELEMENT = eINSTANCE.getMediaTypeElement();

		/**
		 * The meta object literal for the '<em><b>Mtelem Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE_ELEMENT__MTELEM_TYPE = eINSTANCE.getMediaTypeElement_MtelemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE_ELEMENT__NAME = eINSTANCE.getMediaTypeElement_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.SubresourceTypeImpl <em>Subresource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.SubresourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getSubresourceType()
		 * @generated
		 */
		EClass SUBRESOURCE_TYPE = eINSTANCE.getSubresourceType();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRESOURCE_TYPE__CONTAINING_TYPE = eINSTANCE.getSubresourceType_ContainingType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.AggregationResourceTypeImpl <em>Aggregation Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.AggregationResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getAggregationResourceType()
		 * @generated
		 */
		EClass AGGREGATION_RESOURCE_TYPE = eINSTANCE.getAggregationResourceType();

		/**
		 * The meta object literal for the '<em><b>Element Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_RESOURCE_TYPE__ELEMENT_TYPES = eINSTANCE.getAggregationResourceType_ElementTypes();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PrimaryResourceTypeImpl <em>Primary Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.PrimaryResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPrimaryResourceType()
		 * @generated
		 */
		EClass PRIMARY_RESOURCE_TYPE = eINSTANCE.getPrimaryResourceType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ActivityResourceTypeImpl <em>Activity Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ActivityResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getActivityResourceType()
		 * @generated
		 */
		EClass ACTIVITY_RESOURCE_TYPE = eINSTANCE.getActivityResourceType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.PagingResourceTypeImpl <em>Paging Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.PagingResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getPagingResourceType()
		 * @generated
		 */
		EClass PAGING_RESOURCE_TYPE = eINSTANCE.getPagingResourceType();

		/**
		 * The meta object literal for the '<em><b>Paged Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGING_RESOURCE_TYPE__PAGED_TYPE = eINSTANCE.getPagingResourceType_PagedType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ProjectionResourceTypeImpl <em>Projection Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ProjectionResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getProjectionResourceType()
		 * @generated
		 */
		EClass PROJECTION_RESOURCE_TYPE = eINSTANCE.getProjectionResourceType();

		/**
		 * The meta object literal for the '<em><b>Projected Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_RESOURCE_TYPE__PROJECTED_TYPE = eINSTANCE.getProjectionResourceType_ProjectedType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.ListResourceTypeImpl <em>List Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.ListResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getListResourceType()
		 * @generated
		 */
		EClass LIST_RESOURCE_TYPE = eINSTANCE.getListResourceType();

		/**
		 * The meta object literal for the '<em><b>List Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_RESOURCE_TYPE__LIST_ELEMENT_TYPE = eINSTANCE.getListResourceType_ListElementType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.FilterResourceTypeImpl <em>Filter Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.FilterResourceTypeImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getFilterResourceType()
		 * @generated
		 */
		EClass FILTER_RESOURCE_TYPE = eINSTANCE.getFilterResourceType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkImpl <em>Media Type Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeLink()
		 * @generated
		 */
		EClass MEDIA_TYPE_LINK = eINSTANCE.getMediaTypeLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE_LINK__NAME = eINSTANCE.getMediaTypeLink_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkCollectionImpl <em>Media Type Link Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.MediaTypeLinkCollectionImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getMediaTypeLinkCollection()
		 * @generated
		 */
		EClass MEDIA_TYPE_LINK_COLLECTION = eINSTANCE.getMediaTypeLinkCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE_LINK_COLLECTION__NAME = eINSTANCE.getMediaTypeLinkCollection_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl <em>Representation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationLink()
		 * @generated
		 */
		EClass REPRESENTATION_LINK = eINSTANCE.getRepresentationLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_LINK__NAME = eINSTANCE.getRepresentationLink_Name();

		/**
		 * The meta object literal for the '<em><b>Corresponding Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_LINK__CORRESPONDING_LINK = eINSTANCE.getRepresentationLink_CorrespondingLink();

		/**
		 * The meta object literal for the '<em><b>Link Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_LINK__LINK_VALUE = eINSTANCE.getRepresentationLink_LinkValue();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkCollectionImpl <em>Representation Link Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RepresentationLinkCollectionImpl
		 * @see de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl#getRepresentationLinkCollection()
		 * @generated
		 */
		EClass REPRESENTATION_LINK_COLLECTION = eINSTANCE.getRepresentationLinkCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_LINK_COLLECTION__NAME = eINSTANCE.getRepresentationLinkCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Corresponding Link Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_LINK_COLLECTION__CORRESPONDING_LINK_COLLECTION = eINSTANCE.getRepresentationLinkCollection_CorrespondingLinkCollection();

	}

} //RestStructurePackage
