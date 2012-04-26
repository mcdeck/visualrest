package de.van_porten.vrest.ui.diagram.structure.internallink;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.reststructure.InternalLink;

public class DirectEditInternalLinkFeature extends
		AbstractDirectEditingFeature {

	public DirectEditInternalLinkFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public int getEditingType() {
		return TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();

		if (bo instanceof InternalLink && ga instanceof Text) {
			return true;
		}

		return false;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		InternalLink lnk = (InternalLink) getBusinessObjectForPictogramElement(pe);
		return lnk.getName();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1) {
			return "Please enter any text as class name.";
		}
		// null means, that the value is valid
		return null;
	}

	public void setValue(String value, IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		InternalLink lnk = (InternalLink) getBusinessObjectForPictogramElement(pe);
		lnk.setName(value);
		updatePictogramElement(((Shape) pe).getContainer());
	}
}
