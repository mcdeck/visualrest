package de.van_porten.vrest.ui.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class RestImageProvider extends AbstractImageProvider {

    protected static final String PREFIX =
             " de.van_porten.graphiti.ui.diagram.icons.";

    private static final String ROOT_IMG_FOLDER = "icons/";
    private static final String FAMFAM_IMG_FOLDER = ROOT_IMG_FOLDER + "famfam/";
    private static final String CUSTOM_IMG_FOLDER = ROOT_IMG_FOLDER + "custom/";

    /* Resources */
    public static final String IMG_STRUCTURE_COMPARTMENT_RESOURCES = PREFIX + "structure.compartment_resources";
    public static final String IMG_STRUCTURE_COMPARTMENT_CONNECTIONS = PREFIX + "structure.compartment_connections";
    public static final String IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE = PREFIX + "structure.primary_resource_type";
    public static final String IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE_SYMBOL = PREFIX + "structure.primary_resource_type_symbol";
    public static final String IMG_STRUCTURE_PAGING_RESOURCE_TYPE = PREFIX + "structure.paging_reousrce_type";
	public static final String IMG_STRUCTURE_PROJECTION_RESOURCE_TYPE = PREFIX + "structure.projection_resource_type";
    public static final String IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE = PREFIX + "structure.activity_resource_type";
    public static final String IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE_SYMBOL = PREFIX + ".structure.activity_resource_type_symbol";
    public static final String IMG_STRUCTURE_LIST_RESOURCE_TYPE = PREFIX + "structure.list_resource_type";
	public static final String IMG_STRUCTURE_AGGREGATION_RESOURCE_TYPE = PREFIX + "structure.aggregation_resource_type";
	public static final String IMG_STRUCTURE_AGGREGATION_RESOURCE_TYPE_SYMBOL = PREFIX + "structure.aggregation_resource_type_symbol";
	public static final String IMG_STRUCTURE_FILTER_RESOURCE_TYPE = PREFIX + "structure.filter_resource_type";
	public static final String IMG_STRUCTURE_SUBRESOURCE_RESOURCE_TYPE = PREFIX + "structure.subresource_resource_type";
	public static final String IMG_STRUCTURE_SUBRESOURCE_RESOURCE_TYPE_SYMBOL = PREFIX + "structure.subresource_resource_type_symbol";
	public static final String IMG_STRUCTURE_CONTAINMENT = PREFIX + "structure.containment";
    public static final String IMG_STRUCTURE_INTERNAL_LINK = PREFIX + "structure.internal_link";
    public static final String IMG_STRUCTURE_ATTRIBUTE = PREFIX + "structure.attribute";
    public static final String IMG_STRUCTURE_DRILLDOWN_STATES = PREFIX + "structure.drilldown_states";
    public static final String IMG_STRUCTURE_DRILLDOWN_METHODS = PREFIX + "structure.drilldown_methods";

	public static final String IMG_STRUCTURE_EDITOR_FEATURE_CREATE_CONNECTION = PREFIX + "structure.editor.drilldown_states";

    /* States */
    public static final String IMG_STATES_COMPARTMENT_STATES = PREFIX + "states.compartment_states";
    public static final String IMG_STATES_COMPARTMENT_CONNECTIONS = PREFIX + "states.compartment_connections";
    public static final String IMG_STATES_STATE = PREFIX + "states.state";
    public static final String IMG_STATES_TRANSITION = PREFIX + "states.transition";

    /* Methods */
	public static final String IMG_METHODS_COMPARTMENT_CONTAINER = PREFIX + "methods.compartment_container";
    public static final String IMG_METHODS_COMPARTMENT_ACTIONS = PREFIX + "methods.compartment_actions";
    public static final String IMG_METHODS_COMPARTMENT_CONNECTIONS = PREFIX + "methods.compartment_connections";
    public static final String IMG_METHODS_METHOD = PREFIX + "methods.method";
    public static final String IMG_METHODS_RETURNACTION = PREFIX + "methods.returnaction";
	public static final String IMG_METHODS_LISTADDACTION = PREFIX + "methods.listaddaction";
	public static final String IMG_METHODS_LISTADDACTION_SYMBOL = PREFIX + "methods.listaddaction_symbol";
	public static final String IMG_METHODS_LISTREMOVEACTION = PREFIX + "methods.listremoveaction";
	public static final String IMG_METHODS_LISTREMOVEACTION_SYMBOL = PREFIX + "methods.listremoveaction_symbol";
	public static final String IMG_METHODS_CREATEACTION = PREFIX + "methods.createaction";
	public static final String IMG_METHODS_CREATEACTION_SYMBOL = PREFIX + "methods.createaction_symbol";
	public static final String IMG_METHODS_MESSAGEACTION = PREFIX + "methods.messageaction";
	public static final String IMG_METHODS_UPDATEACTION = PREFIX + "methods.updateaction";
	public static final String IMG_METHODS_UPDATEACTION_SYMBOL = PREFIX + "methods.updateaction_symbol";
	public static final String IMG_METHODS_CONDITIONALACTION = PREFIX + "methods.conditionalaction";
	public static final String IMG_METHODS_ACTIONSEQUENCE = PREFIX + "methods.actionsequence";

    /* Others */
    public static final String IMG_MISC_REST_APPLICATON_MODEL = PREFIX + ".misc.application_model";
    public static final String IMG_MISC_UNKNOWN = PREFIX + ".misc.unknown";
    public static final String IMG_MISC_FOLDER = PREFIX + ".misc.folder";
	public static final String IMG_MISC_OUTLINE_TREE = PREFIX + ".misc.outline_tree";
	public static final String IMG_MISC_OUTLINE_THUMBNAIL = PREFIX + ".misc.outline_thumbnail";

	public static final String IMG_EDITOR_ICON_STRUCTURE = PREFIX + ".misc.editor_icons.structure";
	public static final String IMG_EDITOR_ICON_METHODS = PREFIX + ".misc.editor_icons.methods";
	public static final String IMG_EDITOR_ICON_STATES = PREFIX + ".misc.editor_icons.states";

    @Override
    protected void addAvailableImages() {
    	/* Resources */
        addImageFilePath(IMG_STRUCTURE_COMPARTMENT_RESOURCES, FAMFAM_IMG_FOLDER + "package.png");
        addImageFilePath(IMG_STRUCTURE_COMPARTMENT_CONNECTIONS, FAMFAM_IMG_FOLDER + "arrow_branch.png");
    	addImageFilePath(IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "star.png");
    	addImageFilePath(IMG_STRUCTURE_PAGING_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "page.png");
    	addImageFilePath(IMG_STRUCTURE_PROJECTION_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "find.png");
    	addImageFilePath(IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "cog.png");
        addImageFilePath(IMG_STRUCTURE_LIST_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "text_align_justify.png");
        addImageFilePath(IMG_STRUCTURE_AGGREGATION_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "pictures.png");
        addImageFilePath(IMG_STRUCTURE_FILTER_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "drink_empty.png");
        addImageFilePath(IMG_STRUCTURE_SUBRESOURCE_RESOURCE_TYPE, FAMFAM_IMG_FOLDER + "plugin.png");
        addImageFilePath(IMG_STRUCTURE_CONTAINMENT, FAMFAM_IMG_FOLDER + "tag.png");
        addImageFilePath(IMG_STRUCTURE_INTERNAL_LINK, FAMFAM_IMG_FOLDER + "link.png");
        addImageFilePath(IMG_STRUCTURE_ATTRIBUTE, FAMFAM_IMG_FOLDER + "font.png");
        addImageFilePath(IMG_STRUCTURE_DRILLDOWN_STATES, FAMFAM_IMG_FOLDER + "wrench.png");
        addImageFilePath(IMG_STRUCTURE_DRILLDOWN_METHODS, FAMFAM_IMG_FOLDER + "wand.png");

        addImageFilePath(IMG_STRUCTURE_EDITOR_FEATURE_CREATE_CONNECTION, FAMFAM_IMG_FOLDER + "wand.png");

        /* States */
        addImageFilePath(IMG_STATES_COMPARTMENT_STATES, FAMFAM_IMG_FOLDER + "folder.png");
        addImageFilePath(IMG_STATES_COMPARTMENT_CONNECTIONS, FAMFAM_IMG_FOLDER + "lightning.png");
        addImageFilePath(IMG_STATES_STATE, FAMFAM_IMG_FOLDER + "box.png");
        addImageFilePath(IMG_STATES_TRANSITION, FAMFAM_IMG_FOLDER + "arrow_right.png");

        /* Methods */
        addImageFilePath(IMG_METHODS_COMPARTMENT_CONTAINER, FAMFAM_IMG_FOLDER + "folder.png");
        addImageFilePath(IMG_METHODS_COMPARTMENT_ACTIONS, FAMFAM_IMG_FOLDER + "folder.png");
        addImageFilePath(IMG_METHODS_COMPARTMENT_CONNECTIONS, FAMFAM_IMG_FOLDER + "lightning.png");
        addImageFilePath(IMG_METHODS_METHOD, FAMFAM_IMG_FOLDER + "box.png");
        addImageFilePath(IMG_METHODS_RETURNACTION, FAMFAM_IMG_FOLDER + "arrow_undo.png");
        addImageFilePath(IMG_METHODS_LISTADDACTION, FAMFAM_IMG_FOLDER + "table_add.png");
        addImageFilePath(IMG_METHODS_LISTREMOVEACTION, FAMFAM_IMG_FOLDER + "table_delete.png");
        addImageFilePath(IMG_METHODS_CREATEACTION, FAMFAM_IMG_FOLDER + "asterisk_orange.png");
        addImageFilePath(IMG_METHODS_MESSAGEACTION, FAMFAM_IMG_FOLDER + "email.png");
        addImageFilePath(IMG_METHODS_UPDATEACTION, FAMFAM_IMG_FOLDER + "arrow_refresh.png");
        addImageFilePath(IMG_METHODS_CONDITIONALACTION, FAMFAM_IMG_FOLDER + "arrow_divide.png");
        addImageFilePath(IMG_METHODS_ACTIONSEQUENCE, FAMFAM_IMG_FOLDER + "arrow_right.png");

        /* Others */
        addImageFilePath(IMG_MISC_REST_APPLICATON_MODEL, FAMFAM_IMG_FOLDER + "world.png");
        addImageFilePath(IMG_MISC_UNKNOWN, FAMFAM_IMG_FOLDER + "bullet_black.png");
        addImageFilePath(IMG_MISC_FOLDER, FAMFAM_IMG_FOLDER + "folder.png");

        addImageFilePath(IMG_MISC_OUTLINE_TREE, FAMFAM_IMG_FOLDER + "report.png");
        addImageFilePath(IMG_MISC_OUTLINE_THUMBNAIL, FAMFAM_IMG_FOLDER + "bullet_black.png");

        addImageFilePath(IMG_EDITOR_ICON_STRUCTURE, FAMFAM_IMG_FOLDER + "shape_group.png");
        addImageFilePath(IMG_EDITOR_ICON_METHODS, FAMFAM_IMG_FOLDER + "bricks.png");
        addImageFilePath(IMG_EDITOR_ICON_STATES, FAMFAM_IMG_FOLDER + "wrench.png");

        /* IMAGES for Structure Editor */
        addImageFilePath(IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE_SYMBOL, CUSTOM_IMG_FOLDER + "activity_resource.png");
        addImageFilePath(IMG_STRUCTURE_SUBRESOURCE_RESOURCE_TYPE_SYMBOL, CUSTOM_IMG_FOLDER + "subresource.png");
        addImageFilePath(IMG_STRUCTURE_AGGREGATION_RESOURCE_TYPE_SYMBOL, CUSTOM_IMG_FOLDER + "aggregation.png");
        addImageFilePath(IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE_SYMBOL, CUSTOM_IMG_FOLDER + "primary_resource_type.png");

        /* IMAGES for Method Editor */
        addImageFilePath(IMG_METHODS_LISTADDACTION_SYMBOL, CUSTOM_IMG_FOLDER + "listaddaction.png");
        addImageFilePath(IMG_METHODS_LISTREMOVEACTION_SYMBOL, CUSTOM_IMG_FOLDER + "listremoveaction.png");
        addImageFilePath(IMG_METHODS_UPDATEACTION_SYMBOL, CUSTOM_IMG_FOLDER + "updateaction.png");
        addImageFilePath(IMG_METHODS_CREATEACTION_SYMBOL, CUSTOM_IMG_FOLDER + "createaction.png");
    }
}
