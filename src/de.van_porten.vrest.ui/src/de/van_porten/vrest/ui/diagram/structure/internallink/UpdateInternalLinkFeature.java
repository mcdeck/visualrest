package de.van_porten.vrest.ui.diagram.structure.internallink;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.ui.util.LayoutUtil;

public class UpdateInternalLinkFeature extends AbstractUpdateFeature {

	public UpdateInternalLinkFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof InternalLink);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof Shape) {
			Shape shape = (Shape) pictogramElement;
			if (shape.getGraphicsAlgorithm() instanceof Text) {
				Text text = (Text) shape.getGraphicsAlgorithm();
				pictogramName = text.getValue();
			}
		} else if( pictogramElement instanceof Connection ) {
			return Reason.createFalseReason();
		}

		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof InternalLink) {
			InternalLink lnk = (InternalLink) bo;
			businessName = LayoutUtil.createStringFromInternalLink(lnk);
		}

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		if (updateNameNeeded) {
			return Reason.createTrueReason("InternalLink Name is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof InternalLink) {
			InternalLink lnk = (InternalLink) bo;
			businessName = LayoutUtil.createStringFromInternalLink(lnk);
		}

		// Set name in pictogram model
		if (pictogramElement instanceof Shape) {
			Shape shape = (Shape) pictogramElement;
			if (shape.getGraphicsAlgorithm() instanceof Text) {
				Text text = (Text) shape.getGraphicsAlgorithm();
				text.setValue(businessName);
				return true;
			}
		}

		return false;
	}
}
