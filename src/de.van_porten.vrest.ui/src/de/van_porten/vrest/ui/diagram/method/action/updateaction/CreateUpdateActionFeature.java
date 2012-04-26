package de.van_porten.vrest.ui.diagram.method.action.updateaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateUpdateActionFeature extends AbstractCreateActionFeature {

	public CreateUpdateActionFeature(IFeatureProvider fp) {
		super(fp, "Update Action", "Create a update action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createUpdateAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_UPDATEACTION;
	}

}
