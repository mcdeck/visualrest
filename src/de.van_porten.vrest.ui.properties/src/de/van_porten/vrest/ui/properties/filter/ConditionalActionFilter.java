package de.van_porten.vrest.ui.properties.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;

public class ConditionalActionFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pe) {
		EObject eObject = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(pe);
		if (eObject instanceof ConditionalAction) {
			return true;
		}
		return false;
	}

}
