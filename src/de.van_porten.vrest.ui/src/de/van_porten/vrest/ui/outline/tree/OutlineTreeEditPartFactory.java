package de.van_porten.vrest.ui.outline.tree;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class OutlineTreeEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		EditPart ret = null;
		if (model instanceof Diagram) {
			// Root node - should only return children with linked business
			// objects
			ret = new RootTreeEditPart(model);
		} else {
			ret = new GenericChildTreeEditPart(model);
		}
		return ret;
	}

}
