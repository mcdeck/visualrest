package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractPasteFeature;

import de.van_porten.vrest.core.model.reststructure.ResourceType;

public class PasteResourceTypeFeature extends AbstractPasteFeature {

	public PasteResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public void paste(IPasteContext context) {
		// we already verified, that we paste directly in the diagram
		PictogramElement[] pes = context.getPictogramElements();
		Diagram diagram = (Diagram) pes[0];
		// get the EClasses from the clipboard without copying them
		// (only copy the pictogram element, not the business object)
		// then create new pictogram elements using the add feature
		Object[] objects = getFromClipboard();
		for (Object object : objects) {
			AddContext ac = new AddContext();
			ac.setLocation(0, 0); // for simplicity paste at (0, 0)
			ac.setTargetContainer(diagram);
			addGraphicalRepresentation(ac, object);
		}
	}

	@Override
	public boolean canPaste(IPasteContext context) {
		// only support pasting directly in the diagram (nothing else selected)
		PictogramElement[] pes = context.getPictogramElements();
		if (pes.length != 1 || !(pes[0] instanceof Diagram)) {
			return false;
		}

		// can paste, if all objects on the clipboard are EClasses
		Object[] fromClipboard = getFromClipboard();
		if (fromClipboard == null || fromClipboard.length == 0) {
			return false;
		}
		for (Object object : fromClipboard) {
			if (!(object instanceof ResourceType)) {
				return false;
			}
		}
		return true;
	}
}
