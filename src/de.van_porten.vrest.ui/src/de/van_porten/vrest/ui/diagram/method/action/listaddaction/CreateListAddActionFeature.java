package de.van_porten.vrest.ui.diagram.method.action.listaddaction;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractCreateActionFeature;

public class CreateListAddActionFeature extends AbstractCreateActionFeature {

	public CreateListAddActionFeature(IFeatureProvider fp) {
		super(fp, "List Add Action", "Create a list add action");
	}

	@Override
	protected Action createNewAction() {
		return RestBehaviorFactory.eINSTANCE.createListAddAction();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_LISTADDACTION;
	}

}
