package de.van_porten.vrest.ui.diagram.method.action.createaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateCreateActionFeature extends AbstractCreateActionFeature {

	public CreateCreateActionFeature(IFeatureProvider fp) {
		super(fp, "Create Action", "Create a create action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createCreateAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_CREATEACTION;
	}

}
