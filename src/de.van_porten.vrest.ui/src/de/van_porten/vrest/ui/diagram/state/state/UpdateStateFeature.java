package de.van_porten.vrest.ui.diagram.state.state;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class UpdateStateFeature extends AbstractUpdateFeature {

	public UpdateStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof State);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();

		boolean updateNameNeeded = false;
		boolean updateMethodsNeeded = false;

		EList<Shape> methodShapes = new BasicEList<Shape>();
		EList<Method> methods = null;
		State state = null;

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					if (PropertyUtil.isStateNameShape(shape)) {
						Text text = (Text) shape.getGraphicsAlgorithm();
						pictogramName = text.getValue();

						String businessName = null;
						Object bo = getBusinessObjectForPictogramElement(pictogramElement);
						if (bo instanceof State) {
							State rt = (State) bo;
							businessName = rt.getName();

							state = rt;
							methods = ((State) bo).getSupportedMethods();
						}
						updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
								.equals(businessName)));
					} else if (PropertyUtil.isStateMethodShape(shape)) {
						methodShapes.add(shape);
					}
				}
			}
		}

		if (state != null && methods != null) {
			RestApplicationModel application = (RestApplicationModel) state
					.eContainer().eContainer();
			List<String> stateLabels = StateUtil
					.createMethodLabelValuesForState(state, application);

			if (stateLabels.size() != methodShapes.size()) {
				updateMethodsNeeded = true;
			} else {
				for (int index = 0; index < stateLabels.size(); index++) {
					String methodShapeString = ((Text) methodShapes.get(index)
							.getGraphicsAlgorithm()).getValue();
					if (!stateLabels.get(index).equals(methodShapeString)) {
						updateMethodsNeeded = true;
						break;
					}
				}
			}
		}

		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else if (updateMethodsNeeded) {
			return Reason.createTrueReason("The methods are out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean retVal = false;
		PictogramElement pictogramElement = context.getPictogramElement();
		EList<Shape> methodShapes = new BasicEList<Shape>();
		EList<Method> methods = null;
		State state = null;

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text
						&& PropertyUtil.isStateNameShape(shape)) {
					String businessName = null;
					Object bo = getBusinessObjectForPictogramElement(pictogramElement);
					if (bo instanceof State) {
						State rt = (State) bo;
						businessName = rt.getName();

						state = rt;
						methods = ((State) bo).getSupportedMethods();
					}

					Text text = (Text) shape.getGraphicsAlgorithm();
					text.setValue(businessName);
					retVal = true;
				} else if (PropertyUtil.isStateMethodShape(shape)) {
					methodShapes.add(shape);
				}
			}
		}

		if (state != null && methods != null) {
			RestApplicationModel application = (RestApplicationModel) state
					.eContainer().eContainer();
			List<String> stateLabels = StateUtil
					.createMethodLabelValuesForState(state, application);

			if (stateLabels.size() != methodShapes.size()) {
				// Add new / remove unused methods
			} else {
				for (int index = 0; index < stateLabels.size(); index++) {
					String methodShapeString = ((Text) methodShapes.get(index)
							.getGraphicsAlgorithm()).getValue();
					if (!stateLabels.get(index).equals(methodShapeString)) {
						((Text)methodShapes.get(index).getGraphicsAlgorithm()).setValue(stateLabels.get(index));
					}
				}
			}
		}

		return retVal;
	}
}
