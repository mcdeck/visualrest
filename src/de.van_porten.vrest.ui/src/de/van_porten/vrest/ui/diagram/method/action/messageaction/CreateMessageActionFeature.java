package de.van_porten.vrest.ui.diagram.method.action.messageaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateMessageActionFeature extends AbstractCreateActionFeature {

	public CreateMessageActionFeature(IFeatureProvider fp) {
		super(fp, "Message Action", "Create a message action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createMessageAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_MESSAGEACTION;
	}

}
