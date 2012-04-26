package de.van_porten.vrest.ui.diagram.structure.internallink;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ResourceType;

public class ReconnectionInternalLinkFeature extends DefaultReconnectionFeature {

	public ReconnectionInternalLinkFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canReconnect(IReconnectionContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getConnection());
		if (bo instanceof InternalLink) {
			if( getBusinessObjectForPictogramElement(context.getTargetPictogramElement()) instanceof ResourceType ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void execute(IContext context) {
		if (context instanceof IReconnectionContext) {
			String type = ((IReconnectionContext) context).getReconnectType();
			InternalLink internalLink = (InternalLink) getBusinessObjectForPictogramElement(((IReconnectionContext) context)
					.getConnection());
			ResourceType targetResource = (ResourceType) getBusinessObjectForPictogramElement(((IReconnectionContext) context).getTargetPictogramElement());

			if (type.equals(ReconnectionContext.RECONNECT_SOURCE)) {
				EObject container = internalLink.eContainer();
				if( container instanceof ResourceType ) {
					((ResourceType) container).getResourceelements().remove(internalLink);
					targetResource.getResourceelements().add(internalLink);
				}
			} else if (type.equals(ReconnectionContext.RECONNECT_TARGET)) {
				internalLink.setTarget(targetResource);
			}
		}
		super.execute(context);
	}

}
