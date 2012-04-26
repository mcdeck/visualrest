package de.van_porten.vrest.ui.diagram.structure.internallink;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;

public class CreateInternalLinkFeature extends AbstractCreateConnectionFeature {

	public CreateInternalLinkFeature(IFeatureProvider fp) {
		super(fp, "Internal Link", "Create Internal Link");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		ResourceType source = getResourceType(context.getSourceAnchor());
		ResourceType target = getResourceType(context.getTargetAnchor());
		if (source != null && target != null) {
			return true;
		}
		return false;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_INTERNAL_LINK;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		if (getResourceType(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		ResourceType source = getResourceType(context.getSourceAnchor());
		ResourceType target = getResourceType(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			InternalLink lnk = createInternalLink(source, target);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(lnk);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private ResourceType getResourceType(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof ResourceType) {
				return (ResourceType) object;
			}
		}
		return null;
	}

	/**
	 * Creates a EReference between two EClasses.
	 */
	private InternalLink createInternalLink(ResourceType source,
			ResourceType target) {
		InternalLink lnk = RestStructureFactory.eINSTANCE.createInternalLink();
		lnk.setName("link");
		lnk.setTarget(target);
		source.getResourceelements().add(lnk);
		return lnk;
	}
}
