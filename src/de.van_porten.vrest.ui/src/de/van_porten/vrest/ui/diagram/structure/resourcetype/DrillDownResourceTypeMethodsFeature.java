package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.AddResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.util.ResourceLocationFactory;
import de.van_porten.vrest.ui.util.RestEditorConstants;

public class DrillDownResourceTypeMethodsFeature extends
		AbstractDrillDownResourceTypeFeature {

	public DrillDownResourceTypeMethodsFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Edit Resource Methods";
	}

	@Override
	public String getDescription() {
		return "Opens the method modeling editor for this resource";
	}

	@Override
	public String getImageId() {
		return RestImageProvider.IMG_EDITOR_ICON_METHODS;
	}

	@Override
	protected String getDiagramEditorId(Diagram diagram) {
		return RestEditorConstants.METHODS_DIAGRAM_EDITOR_ID;
	}

	@Override
	protected String getDrillDownFilename(ResourceType resourceType) {
		return ResourceLocationFactory
				.getRestResourceMethodsDiagramLocation(resourceType.getName()
						+ getDiagramFileExtension());
	}

	@Override
	protected String createDiagramName(ResourceType rt) {
		return rt.getName() + " Resource Methods Diagram";
	}

	@Override
	protected String getDiagramTypeId() {
		return "RestMethodBehaviourDiagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return ".methods";
	}

	@Override
	protected void addDiagramContent(Diagram diagram, ResourceType resourceType) {
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
				"Methods of: ",
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

		Map<Method, PictogramElement> methodToPictogramMap = new HashMap<Method, PictogramElement>();
		for (Method method : resourceType.getMethods()) {
			AddContext addContext = new AddContext();
			addContext.setNewObject(method);
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
				methodToPictogramMap.put(method, pe);
			}
		}

		// once we added all methods we can retrieve their
		// pictogram elements and populate them with
		// contents ...
		for (Method method : resourceType.getMethods()) {
			BehaviorSpecification spec = method
					.getMethodbehavior();
			Action action = spec.getAction();

			if (action instanceof ActionSequence) {
				// iterate over all actions and add them
				// should reuse code from add single action
			} else {
				// add a single action
			}

			if (methodToPictogramMap.containsKey(method)) {
				// && methodToPictogramMap
				// .containsKey(trans
				// .getTargetState())) {
				// AddConnectionContext addTransitionContext
				// = new AddConnectionContext(
				// Graphiti.getPeService()
				// .getChopboxAnchor(
				// (AnchorContainer) stateToPictogramMap
				// .get(state)
				// .getGraphicsAlgorithm()
				// .getPictogramElement()),
				// Graphiti.getPeService()
				// .getChopboxAnchor(
				// (AnchorContainer) stateToPictogramMap
				// .get(trans
				// .getTargetState())
				// .getGraphicsAlgorithm()
				// .getPictogramElement()));
				// addTransitionContext.setNewObject(trans);
				// addTransitionContext
				// .setTargetContainer(diagram);

				// IAddFeature addTransitionFeature =
				// featureProvider
				// .getAddFeature(addTransitionContext);
				// if (addTransitionFeature
				// .canAdd(addTransitionContext)) {
				// addTransitionFeature
				// .add(addTransitionContext);
				// }
			}
		}
	}
}
