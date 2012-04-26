package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractDrillDownFeature;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.util.PropertyUtil;
import de.van_porten.vrest.ui.util.ResourceUtil;
import de.van_porten.vrest.ui.util.RestEditorConstants;

public class DrillDownResourceTypeFeature extends
		AbstractDrillDownFeature {

	public DrillDownResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Open Resource";
	}

	@Override
	public String getDescription() {
		return "Opens the associated resource";
	}

	@Override
	public String getImageId() {
		return RestImageProvider.IMG_EDITOR_ICON_STRUCTURE;
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof ResourceType) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isAvailable(IContext context) {
		if( context instanceof ICustomContext ) {
			PictogramElement[] pes = ((ICustomContext) context).getPictogramElements();
			if (pes != null && pes.length == 1) {
				return PropertyUtil.hasShapeId(pes[0], PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR);
			}
		}
		return super.isAvailable(context);
	}

	@Override
	protected String getDiagramEditorId(Diagram diagram) {
		return RestEditorConstants.STRUCTURE_DIAGRAM_EDITOR_ID;
	}

	@Override
	protected Collection<Diagram> getDiagrams() {
		Collection<Diagram> result = Collections.emptyList();
		Resource resource = getDiagram().eResource();

		URI uri = resource.getURI();
		URI uriTrimmed = uri.trimFragment();
		if (uriTrimmed.isPlatformResource()) {
			String platformString = uriTrimmed.toPlatformString(true);
			IResource fileResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(platformString);
			if (fileResource != null) {
				IProject project = fileResource.getProject();
				result = ResourceUtil.getDiagrams(project, ".structure");
			}
		}
		return result;
	}
}
