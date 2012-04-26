package de.van_porten.vrest.ui.diagram.structure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.graphiti.util.ILocationInfo;
import org.eclipse.graphiti.util.LocationInfo;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.CommonToolBehaviourProvider;
import de.van_porten.vrest.ui.diagram.structure.attribute.CreateAttributeFeature;
import de.van_porten.vrest.ui.diagram.structure.containment.CreateContainmentFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.CreateInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractFoldResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.CollapseResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DrillDownResourceTypeMethodsFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DrillDownResourceTypeStatesFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.ExpandResourceTypeFeature;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class RestStructureToolBehaviorProvider extends
	CommonToolBehaviourProvider {

	public RestStructureToolBehaviorProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public String getContributorId() {
		// TODO: change from default "RestStructureDiagram.PropertyContributor"
		return super.getContributorId();
	}

	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		/* PictogramElement pes[] = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			ICustomFeature feature = new DrillDownResourceTypeStatesFeature(
					getFeatureProvider());
			if (feature.canExecute(context)) {
				return feature;
			}

		} */
		return super.getDoubleClickFeature(context);
	}

	@Override
	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
		// create a sub-menu for all custom features
		ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
		// subMenu.setText("Custom");
		// subMenu.setDescription("Custom features submenu");
		// display sub-menu hierarchical or flat
		subMenu.setSubmenu(false);

		ContextMenuEntry viewSubMenu = new ContextMenuEntry(null, context);
		viewSubMenu.setText("View");
		viewSubMenu.setDescription("View submenu");
		viewSubMenu.setSubmenu(true);
		subMenu.add(viewSubMenu);

		// create a menu-entry in the sub-menu for each custom feature
		ICustomFeature[] customFeatures = getFeatureProvider()
				.getCustomFeatures(context);
		for (int i = 0; i < customFeatures.length; i++) {
			ICustomFeature customFeature = customFeatures[i];
			if (customFeature.isAvailable(context)) {
				ContextMenuEntry menuEntry = new ContextMenuEntry(
						customFeature, context);

				if (customFeature instanceof AbstractFoldResourceTypeFeature) {
					viewSubMenu.add(menuEntry);
				} else {
					// Add everything else to the flat hierarchy for now
					subMenu.add(menuEntry);
				}
			}
		}

		IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
		return ret;
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();

		PaletteCompartmentEntry ceResources = new PaletteCompartmentEntry(
				"Resources",
				RestImageProvider.IMG_STRUCTURE_COMPARTMENT_RESOURCES);
		ret.add(ceResources);

		PaletteCompartmentEntry ceProperties = new PaletteCompartmentEntry(
				"Properties",
				RestImageProvider.IMG_STRUCTURE_COMPARTMENT_CONNECTIONS);
		ret.add(ceProperties);

		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			if (cf instanceof AbstractCreateResourceTypeFeature) {
				ceResources.addToolEntry(objectCreationToolEntry);
			} else {
				ceProperties.addToolEntry(objectCreationToolEntry);
			}
		}

		ICreateConnectionFeature[] createConnectionFeatures = featureProvider
				.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			ceProperties.addToolEntry(connectionCreationToolEntry);
		}

		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}

	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
		IFeatureProvider featureProvider = getFeatureProvider();
		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		if (bo instanceof ResourceType) {
			ResourceType rt = (ResourceType) bo;

			String name = rt.getName();
			if (name != null && name.length() > 0
					&& !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
				ImageDecorator imageRenderingDecorator = new ImageDecorator(
						IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
				imageRenderingDecorator.setX(pe.getGraphicsAlgorithm()
						.getWidth() - 15);
				imageRenderingDecorator.setY(2);
				imageRenderingDecorator
						.setMessage("Name should start with upper case letter");
				return new IDecorator[] { imageRenderingDecorator };
			}
		}
		return super.getDecorators(pe);
	}

	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
		PictogramElement pe = ga.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(
				pe);
		if (bo instanceof ResourceType) {
			String name = ((ResourceType) bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		}
		return super.getToolTip(ga);
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);
		if( data != null ) {
			PictogramElement pe = context.getPictogramElement();

			// 1. set the generic context buttons
			setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE
					| CONTEXT_BUTTON_REMOVE | CONTEXT_BUTTON_UPDATE);

			// 2. set the collapse button
			createCollapseContextButton(data, pe);

			// 3. add additional action buttons
			createAdditionalActionButtons(data, pe);

			// 4. connection feature buttons
			createConnectionFeatureButtons(context, data, pe);

			// 5. add drilldown buttons
			addBehaviourEditorButtons(context, data, pe);
		}
		return data;
	}

	/**
	 * @param data
	 * @param pe
	 */
	protected void createAdditionalActionButtons(IContextButtonPadData data,
			PictogramElement pe) {
		CreateContext createContext = new CreateContext();
		if( pe instanceof ContainerShape ) {
			createContext.setTargetContainer((ContainerShape) pe);
		} else {
			createContext.setTargetContainer(null);
		}
		createContext.setX(pe.getGraphicsAlgorithm().getX());
		createContext.setY(pe.getGraphicsAlgorithm().getX());
		createContext.setSize(pe.getGraphicsAlgorithm().getWidth(), pe.getGraphicsAlgorithm().getHeight());

		CreateAttributeFeature createAttributeFeature = new CreateAttributeFeature(getFeatureProvider());
		ContextButtonEntry addAttributeButton = new ContextButtonEntry(
				createAttributeFeature, createContext);
		addAttributeButton.setText("Create Attribute");
		addAttributeButton.setDescription("Click to create a new attribute");
		addAttributeButton.setIconId(createAttributeFeature.getCreateImageId());
		data.getDomainSpecificContextButtons().add(addAttributeButton);
	}

	/**
	 * @param context
	 * @param data
	 * @param pe
	 */
	protected void createConnectionFeatureButtons(
			IPictogramElementContext context, IContextButtonPadData data,
			PictogramElement pe) {
		// 3. add one domain specific context-button, which offers all
		// available connection-features as drag&drop features...

		// 3.a. create new CreateConnectionContext
		CreateConnectionContext ccc = new CreateConnectionContext();
		ccc.setSourcePictogramElement(pe);
		Anchor anchor = null;
		if (pe instanceof Anchor) {
			anchor = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			// assume, that our shapes always have chopbox anchors
			anchor = Graphiti.getPeService().getChopboxAnchor(
					(AnchorContainer) pe);
		}
		ccc.setSourceAnchor(anchor);

		// 3.b. create context button and add all applicable features
		CreateInternalLinkFeature createInternalLinkFeature = new CreateInternalLinkFeature(getFeatureProvider());
		ContextButtonEntry createInternalLinkButton = new ContextButtonEntry(null, context);
		createInternalLinkButton.setIconId(RestImageProvider.IMG_STRUCTURE_INTERNAL_LINK);
		if (createInternalLinkFeature.isAvailable(ccc) && createInternalLinkFeature.canStartConnection(ccc)) {
			createInternalLinkButton.setText("Create internal link");
			createInternalLinkButton.setDescription("Drag and Drop to create an internal link");
			createInternalLinkButton.addDragAndDropFeature(createInternalLinkFeature);
		} else {
			createInternalLinkButton.setText("Not supported here");
		}
		data.getDomainSpecificContextButtons().add(createInternalLinkButton);

		CreateContainmentFeature createContainmentFeature = new CreateContainmentFeature(getFeatureProvider());
		ContextButtonEntry createContainmentButton = new ContextButtonEntry(null, context);
		createContainmentButton.setIconId(RestImageProvider.IMG_STRUCTURE_CONTAINMENT);
		if (createContainmentFeature.isAvailable(ccc) && createContainmentFeature.canStartConnection(ccc)) {
			createContainmentButton.setText("Create containment connection");
			createContainmentButton.setDescription("Drag and Drop to create a containment connection");
			createContainmentButton.addDragAndDropFeature(createContainmentFeature);
		} else {
			createContainmentButton.setText("Not supported here");
		}
		data.getDomainSpecificContextButtons().add(createContainmentButton);

		/*
		ContextButtonEntry button = new ContextButtonEntry(null, context);
		button.setText("Create connection");
		button.setDescription("Drag and Drop to create a link or containment connection between resources");
		button.setIconId(RestImageProvider.IMG_STRUCTURE_EDITOR_FEATURE_CREATE_CONNECTION);
		ICreateConnectionFeature[] features = getFeatureProvider()
				.getCreateConnectionFeatures();
		for (ICreateConnectionFeature feature : features) {
			if (feature.isAvailable(ccc) && feature.canStartConnection(ccc)) {
				button.addDragAndDropFeature(feature);
			}
		}
		if (button.getDragAndDropFeatures().size() > 0) {
			data.getDomainSpecificContextButtons().add(button);
		}
		*/
	}

	/**
	 * @param data
	 * @param pe
	 */
	protected void createCollapseContextButton(IContextButtonPadData data,
			PictogramElement pe) {
		CustomContext cc = new CustomContext(new PictogramElement[] { pe });
		ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
		for (int i = 0; i < cf.length; i++) {
			ICustomFeature iCustomFeature = cf[i];
			if (iCustomFeature instanceof ExpandResourceTypeFeature
					&& PropertyUtil.isCollapsed(pe)) {
				IContextButtonEntry collapseButton = ContextEntryHelper
						.createCollapseContextButton(false, iCustomFeature, cc);
				data.setCollapseContextButton(collapseButton);
				break;
			} else if (iCustomFeature instanceof CollapseResourceTypeFeature
					&& !PropertyUtil.isCollapsed(pe)) {
				IContextButtonEntry collapseButton = ContextEntryHelper
						.createCollapseContextButton(true, iCustomFeature, cc);
				data.setCollapseContextButton(collapseButton);
				break;
			}
		}
	}

	/**
	 * @param context
	 * @param data
	 * @param pe
	 */
	protected void addBehaviourEditorButtons(IPictogramElementContext context,
			IContextButtonPadData data, PictogramElement pe) {
		ContextButtonEntry behaviourEditorsButton = new ContextButtonEntry(null, context);
		behaviourEditorsButton.setText("Edit Behaviour");
		behaviourEditorsButton.setDescription("Click to modify behaviour of resource");
		behaviourEditorsButton.setIconId(RestImageProvider.IMG_STRUCTURE_EDITOR_FEATURE_CREATE_CONNECTION);

		ICustomContext customContext = new CustomContext(
				new PictogramElement[] { pe });
		DrillDownResourceTypeMethodsFeature drillDownMethods = new DrillDownResourceTypeMethodsFeature(
				getFeatureProvider());
		ContextButtonEntry editMethodsButton = new ContextButtonEntry(
				drillDownMethods, customContext);
		editMethodsButton.setText(drillDownMethods.getName());
		editMethodsButton.setDescription(drillDownMethods.getDescription());
		editMethodsButton.setIconId(drillDownMethods.getImageId());
		//data.getDomainSpecificContextButtons().add(editMethodsButton);
		behaviourEditorsButton.addContextButtonMenuEntry(editMethodsButton);

		DrillDownResourceTypeStatesFeature drillDownStates = new DrillDownResourceTypeStatesFeature(
				getFeatureProvider());
		ContextButtonEntry editStatesButton = new ContextButtonEntry(
				drillDownStates, customContext);
		editStatesButton.setText(drillDownStates.getName());
		editStatesButton.setDescription(drillDownStates.getDescription());
		editStatesButton.setIconId(drillDownStates.getImageId());
		//data.getDomainSpecificContextButtons().add(editStatesButton);
		behaviourEditorsButton.addContextButtonMenuEntry(editStatesButton);

		data.getDomainSpecificContextButtons().add(behaviourEditorsButton);
	}

	@Override
	public ILocationInfo getLocationInfo(PictogramElement pe,
			ILocationInfo locationInfo) {
		PictogramElement[] selectedPictogramElements = getDiagramTypeProvider()
				.getDiagramEditor().getSelectedPictogramElements();
		if (selectedPictogramElements != null
				&& selectedPictogramElements.length > 0) {
			// Use the first selected pictogram element for direct editing
			PictogramElement pictogramElement = selectedPictogramElements[0];
			if (pictogramElement instanceof ContainerShape) {
				Object bo = getFeatureProvider()
						.getBusinessObjectForPictogramElement(pictogramElement);
				if (bo instanceof ResourceType) {
					ContainerShape shape = (ContainerShape) pictogramElement;
					for (Shape nameShape : shape.getChildren()) {
						if (PropertyUtil.isResourceTypeNameShape(nameShape)) {
							GraphicsAlgorithm classNameGA = nameShape
									.getGraphicsAlgorithm();
							if (classNameGA instanceof Text) {
								return new LocationInfo(nameShape, classNameGA);
							}
						}
					}
				}
			}
		}
		return super.getLocationInfo(pe, locationInfo);
	}

}
