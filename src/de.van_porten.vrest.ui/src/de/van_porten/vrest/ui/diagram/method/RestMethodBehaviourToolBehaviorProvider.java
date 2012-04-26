package de.van_porten.vrest.ui.diagram.method;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;

import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.CommonToolBehaviourProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;
import de.van_porten.vrest.ui.diagram.method.method.AddMethodFeature;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class RestMethodBehaviourToolBehaviorProvider extends
		CommonToolBehaviourProvider {

	public RestMethodBehaviourToolBehaviorProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();
		PaletteCompartmentEntry ceContainer = new PaletteCompartmentEntry(
				"Container",
				RestImageProvider.IMG_METHODS_COMPARTMENT_CONTAINER);
		ret.add(ceContainer);

		PaletteCompartmentEntry ceResources = new PaletteCompartmentEntry(
				"Actions", RestImageProvider.IMG_METHODS_COMPARTMENT_ACTIONS);
		ret.add(ceResources);

		PaletteCompartmentEntry ceConnections = new PaletteCompartmentEntry(
				"Connections",
				RestImageProvider.IMG_METHODS_COMPARTMENT_CONNECTIONS);
		ret.add(ceConnections);

		// add all create-features to the new stack-entry
		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			if (cf instanceof AbstractCreateActionFeature) {
				ceResources.addToolEntry(objectCreationToolEntry);
			} else {
				ceContainer.addToolEntry(objectCreationToolEntry);
			}
		}

		// add all create-connection-features to the new stack-entry
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider
				.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			ceConnections.addToolEntry(connectionCreationToolEntry);
		}

		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}

	@Override
	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
		/*
		 * if (getFeatureProvider().getBusinessObjectForPictogramElement(pe)
		 * instanceof ConditionalAction) { return new GraphicsAlgorithm[] {
		 * ((ContainerShape) pe).getGraphicsAlgorithm()
		 * .getGraphicsAlgorithmChildren().get(0), ((ContainerShape)
		 * pe).getGraphicsAlgorithm() .getGraphicsAlgorithmChildren().get(1) };
		 * }
		 */
		if (PropertyUtil.isMethodShape(pe)) {
			if (pe instanceof Shape) {
				return new GraphicsAlgorithm[] {
						PropertyUtil.findChildWithShapeId((Shape) pe,
								AddMethodFeature.shapeIdMethodHeader)
								.getGraphicsAlgorithm(),
						PropertyUtil.findChildWithShapeId((Shape) pe,
								AddMethodFeature.shapeIdMethodBody)
								.getGraphicsAlgorithm() };
			}
		} else if (PropertyUtil.shouldChangeSelectionBorder(pe)) {
			if (pe instanceof ContainerShape) {
				Shape newBorder = PropertyUtil
						.findChildWithNewSelectionBorder((Shape) pe);
				if (newBorder != null) {
					return new GraphicsAlgorithm[] { newBorder
							.getGraphicsAlgorithm() };
				}
			}
		}
		return super.getClickArea(pe);
	}

	@Override
	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
		if (PropertyUtil.shouldChangeSelectionBorder(pe)) {
			if (pe instanceof ContainerShape) {
				Shape newBorder = PropertyUtil
						.findChildWithNewSelectionBorder((Shape) pe);
				if (newBorder != null) {
					return newBorder.getGraphicsAlgorithm();
				}
			}
		}
		return super.getSelectionBorder(pe);
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);
		if (data != null) {
			// do nothing .. maybe we will need other elements eventually?
		} else if (PropertyUtil.hasShapeId(context.getPictogramElement(),
				PropertyUtil.MethodShapeIds.CONDITONALACTION_IFTRUE)
				|| PropertyUtil.hasShapeId(context.getPictogramElement(),
						PropertyUtil.MethodShapeIds.CONDITONALACTION_IFFALSE)) {
			return null;
		}
		return data;
	}
}
