package de.van_porten.vrest.ui.diagram.method.action.conditionalaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateConditionalActionFeature extends AbstractCreateActionFeature {

	public CreateConditionalActionFeature(IFeatureProvider fp) {
		super(fp, "Conditional Action", "Create a conditional action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createConditionalAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_CONDITIONALACTION;
	}

}
