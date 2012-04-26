package de.van_porten.vrest.ui.diagram.method.action.listremoveaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateListRemoveActionFeature extends AbstractCreateActionFeature {

	public CreateListRemoveActionFeature(IFeatureProvider fp) {
		super(fp, "List Remove Action", "Create a list remove action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createListRemoveAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_LISTREMOVEACTION;
	}

}
