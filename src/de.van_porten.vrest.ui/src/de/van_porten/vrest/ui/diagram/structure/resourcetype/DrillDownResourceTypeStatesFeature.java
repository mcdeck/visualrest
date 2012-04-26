package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.AddResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.util.ResourceLocationFactory;
import de.van_porten.vrest.ui.util.RestEditorConstants;

public class DrillDownResourceTypeStatesFeature extends
	AbstractDrillDownResourceTypeFeature {

	public DrillDownResourceTypeStatesFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Edit Resource States";
	}

	@Override
	public String getDescription() {
		return "Opens the state modeling editor for this resource";
	}

	@Override
	public String getImageId() {
		return RestImageProvider.IMG_EDITOR_ICON_STATES;
	}

	@Override
	protected final String getDiagramEditorId(Diagram diagram) {
		return RestEditorConstants.STATES_DIAGRAM_EDITOR_ID;
	}


	@Override
	protected final String createDiagramName(ResourceType rt) {
		return rt.getName() + " Resource States Diagram";
	}

	@Override
	protected final  String getDiagramTypeId() {
		return "RestResourceStatesDiagram";
	}

	@Override
	protected final String getDiagramFileExtension() {
		return ".states";
	}

	@Override
	protected final String getDrillDownFilename(final ResourceType resourceType) {
		return ResourceLocationFactory
				.getRestResourceStateDiagramLocation(resourceType.getName()
						+ getDiagramFileExtension());
	}

	@Override
	protected final void addDiagramContent(Diagram diagram, ResourceType resourceType) {
		IFeatureProvider featureProvider = GraphitiUi
				.getExtensionManager().createFeatureProvider(
						diagram);

		link(diagram, resourceType);

		AddContext addIndicatorContext = new AddContext();
		addIndicatorContext.setNewObject(resourceType);
		addIndicatorContext.setTargetContainer(diagram);
		addIndicatorContext.setX(5);
		addIndicatorContext.setY(5);

		IAddFeature addIndicatorFeature = new AddResourceTypeIndicatorFeature(
				"States of: ",
				getFeatureProvider());
		PictogramElement indicatorPE = null;
		if (addIndicatorFeature.canAdd(addIndicatorContext)) {
			indicatorPE = addIndicatorFeature
					.add(addIndicatorContext);
		}

		int x = 20;
		int y = 20;
		if (indicatorPE != null) {
			GraphicsAlgorithm ga = indicatorPE
					.getGraphicsAlgorithm();
			y += ga.getY() + ga.getHeight();
		}

		Map<State, PictogramElement> stateToPictogramMap = new HashMap<State, PictogramElement>();

		for (State state : resourceType.getStates()) {
			AddContext addContext = new AddContext();
			addContext.setNewObject(state);
			addContext.setTargetContainer(diagram);
			addContext.setX(x);
			addContext.setY(y);
			x = x + 20;
			y = y + 20;

			IAddFeature addFeature = featureProvider
					.getAddFeature(addContext);
			if (addFeature.canAdd(addContext)) {
				PictogramElement pe = addFeature
						.add(addContext);
				stateToPictogramMap.put(state, pe);
			}
		}

		// once we added all states we can retrieve their
		// pictogram elements and connect them
		for (State state : resourceType.getStates()) {
			for (Transition trans : state.getTransitions()) {
				if (stateToPictogramMap.containsKey(state)
						&& stateToPictogramMap
								.containsKey(trans
										.getTargetState())) {
					AddConnectionContext addTransitionContext = new AddConnectionContext(
							Graphiti.getPeService()
									.getChopboxAnchor(
											(AnchorContainer) stateToPictogramMap
													.get(state)
													.getGraphicsAlgorithm()
													.getPictogramElement()),
							Graphiti.getPeService()
									.getChopboxAnchor(
											(AnchorContainer) stateToPictogramMap
													.get(trans
															.getTargetState())
													.getGraphicsAlgorithm()
													.getPictogramElement()));
					addTransitionContext.setNewObject(trans);
					addTransitionContext
							.setTargetContainer(diagram);

					IAddFeature addTransitionFeature = featureProvider
							.getAddFeature(addTransitionContext);
					if (addTransitionFeature
							.canAdd(addTransitionContext)) {
						addTransitionFeature
								.add(addTransitionContext);
					}
				}
			}
		}
	}
}
