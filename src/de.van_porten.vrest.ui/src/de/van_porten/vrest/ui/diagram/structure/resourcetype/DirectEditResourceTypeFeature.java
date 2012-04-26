package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class DirectEditResourceTypeFeature extends
		AbstractDirectEditingFeature {

	public DirectEditResourceTypeFeature(IFeatureProvider fp) {
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

		if (bo instanceof ResourceType && ga instanceof Text
				&& PropertyUtil.isResourceTypeNameShape(pe)) {
			return true;
		}

		return false;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the EClass
		PictogramElement pe = context.getPictogramElement();
		if( PropertyUtil.isResourceTypeNameShape(pe) ) {
			ResourceType rt = (ResourceType) getBusinessObjectForPictogramElement(pe);
  			return rt.getName();
		}
		return null;
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1) {
			return "Please enter any text as name.";
		}
		if (value.contains("\n")) {
			return "Line breakes are not allowed in class names.";
		}

		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if( bo instanceof ResourceType ) {
			EList<EObject> otherResourceTypes = ((ResourceType) bo).eContainer().eContents();
			for (EObject eObject : otherResourceTypes) {
				if( eObject instanceof ResourceType && !bo.equals(eObject) ) {
					if( value.equals(((ResourceType) eObject).getName()) ) {
						return "A resource with the name \""+value+"\" already exists in the application model";
					}
				}
			}
		}
		// null means, that the value is valid
		return null;
	}

	public void setValue(String value, IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		if( PropertyUtil.isResourceTypeNameShape(pe) ) {
			ResourceType rt = (ResourceType) getBusinessObjectForPictogramElement(pe);
			rt.setName(value);
		}
		updatePictogramElement(((Shape) pe).getContainer());
	}
}
