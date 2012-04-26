package de.van_porten.vrest.ui.diagram.method.action.returnaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.core.model.restbehavior.StatusCode;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateReturnActionFeature extends AbstractCreateActionFeature {

	public CreateReturnActionFeature(IFeatureProvider fp) {
		super(fp, "Return Action", "Create a return action");
	}

	@Override
	protected Action createNewAction() {
		ReturnAction returnAction = RestBehaviorFactory.eINSTANCE.createReturnAction();
		StatusCode statusCode = RestBehaviorFactory.eINSTANCE.createStatusCode();
		statusCode.setNumber(404);
		returnAction.setStatus(statusCode);
		returnAction.setRepresentation(null);

		return returnAction;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_RETURNACTION;
	}

}
