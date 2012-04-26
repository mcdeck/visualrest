package de.van_porten.vrest.ui.properties;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.properties.sections.PropertiesEditionSection;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

public class GraphitiBridgePropertiesEditionSection extends PropertiesEditionSection {

	@Override
	protected EObject resolveSemanticObject(Object object) {

		if (object instanceof PictogramElement) {
			return Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(
							(PictogramElement) object);
		}

		EditPart editPart = null;
		if (object instanceof EditPart) {
			editPart = (EditPart) object;
		} else if (object instanceof IAdaptable) {
			editPart = (EditPart) ((IAdaptable) object)
					.getAdapter(EditPart.class);
		}
		if (editPart != null && editPart.getModel() instanceof PictogramElement) {
			return Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(
							(PictogramElement) editPart.getModel());
		}
		return super.resolveSemanticObject(object);
	}
}