package de.van_porten.vrest.ui.diagram.method.statuscode;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.van_porten.vrest.core.model.restbehavior.StatusCode;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class UpdateStatusCodeFeature extends AbstractUpdateFeature {

	public UpdateStatusCodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof StatusCode);
	}

	public IReason updateNeeded(IUpdateContext context) {
		String pictogramName = null;
		PictogramElement shape = context.getPictogramElement();

		boolean updateStatusCodeNeeded = false;

		if (shape.getGraphicsAlgorithm() instanceof Text) {
			if (PropertyUtil.isReturnActionStatusCodeShape(shape)) {
				Text text = (Text) shape.getGraphicsAlgorithm();
				pictogramName = text.getValue();

				String businessName = null;
				Object bo = getBusinessObjectForPictogramElement(shape);
				if (bo instanceof StatusCode) {
					businessName = String
							.valueOf(((StatusCode) bo).getNumber());
				}
				updateStatusCodeNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
						.equals(businessName)));
			}
		}

		if (updateStatusCodeNeeded) {
			return Reason.createTrueReason("StatusCode is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean retVal = false;
		PictogramElement shape = context.getPictogramElement();

		if (shape.getGraphicsAlgorithm() instanceof Text) {
			if (PropertyUtil.isReturnActionStatusCodeShape(shape)) {
				Text text = (Text) shape.getGraphicsAlgorithm();
				String businessName = "0?";
				Object bo = getBusinessObjectForPictogramElement(shape);
				if (bo instanceof StatusCode) {
					businessName = String
							.valueOf(((StatusCode) bo).getNumber());
				}
				text.setValue(businessName);
			}
		}

		return retVal;
	}
}
