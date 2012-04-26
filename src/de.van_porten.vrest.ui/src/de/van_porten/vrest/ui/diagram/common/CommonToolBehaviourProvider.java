package de.van_porten.vrest.ui.diagram.common;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;

import de.van_porten.vrest.ui.util.PropertyUtil;

public class CommonToolBehaviourProvider extends DefaultToolBehaviorProvider {

	public CommonToolBehaviourProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		PictogramElement pe = context.getPictogramElement();

		if (PropertyUtil.hasShapeId(pe,
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR)) {
			return null;
		}
		return super.getContextButtonPad(context);
	}
}
