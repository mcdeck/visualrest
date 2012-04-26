package de.van_porten.vrest.ui.outline.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

public class RootTreeEditPart extends AbstractTreeEditPart {

	public RootTreeEditPart(Object model) {
		super(model);
	}

	@Override
	public List<Object> getModelChildren() {
		List<Object> retList = new ArrayList<Object>();
		Diagram diagram = (Diagram)getModel();

		// Find all ContainerShapes - they are linked with the Resource Types etc.
		EList<Shape> children = diagram.getChildren();
		for (Shape shape : children) {
			if( shape instanceof ContainerShape ) {
				EObject businessObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(shape);
				if( businessObject != null ) {
					retList.add(shape);
				}
			}
		}
		return retList;
	}



}
