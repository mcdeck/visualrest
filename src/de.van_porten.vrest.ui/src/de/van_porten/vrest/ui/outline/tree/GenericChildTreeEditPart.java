package de.van_porten.vrest.ui.outline.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.swt.graphics.Image;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestModelLabelFactory;

public class GenericChildTreeEditPart extends AbstractTreeEditPart {

	private EObject businessObject = null;
	private RestModelLabelFactory labelFactory = null;

	public GenericChildTreeEditPart(Object model) {
		super(model);
		labelFactory = new RestModelLabelFactory();
		initBusinessObjectFromModel(getModel());
	}

	private void initBusinessObjectFromModel(Object model) {
		businessObject = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(
						(PictogramElement) model);
	}

	private EObject getBusninessObject() {
		return businessObject;
	}

	@Override
	protected Image getImage() {
		return labelFactory.getImage(getBusninessObject());
	}

	@Override
	protected String getText() {
		String text = labelFactory.getText(getBusninessObject());

		if (text == null) {
			text = "";
		}
		return text;
	}

	@Override
	protected List<Object> getModelChildren() {
		List<Object> retList = new ArrayList<Object>();

		if (getModel() instanceof ContainerShape) {
			EList<Anchor> anchors = ((ContainerShape) getModel()).getAnchors();
			for (Anchor anchor : anchors) {
				EList<Connection> connections = anchor.getOutgoingConnections();
				for (Connection connection : connections) {
					PictogramLink link = connection.getLink();
					if (link != null) {
						EList<EObject> businessObjects = link
								.getBusinessObjects();
						for (EObject eObject : businessObjects) {
							if (!retList.contains(connection)) {
								if (getBusninessObject() instanceof ResourceType) {
									if (eObject instanceof InternalLink) {
										retList.add(connection);
									}
								} else if (getBusninessObject() instanceof State) {
									retList.add(connection);
								}
							}
						}
					}
				}
			}

			EList<EObject> contents = ((ContainerShape) getModel()).eContents();
			for (EObject eObject : contents) {
				if (eObject instanceof ContainerShape) {
					Object bo = Graphiti.getLinkService()
							.getBusinessObjectForLinkedPictogramElement(
									(PictogramElement) eObject);
					if( bo instanceof Action ) {
						if (!retList.contains(eObject)) {
							retList.add(eObject);
						}
					}
				}
			}
		}
		return retList;
	}
}
