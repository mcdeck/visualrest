package de.van_porten.vrest.ui.navigator.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class RestGenericEObjectTreeNode implements IRestTreeNode,
		IRestModelContainer {

	private EObject model = null;
	private List<RestGenericEObjectTreeNode> children = null;
	private Object parent;

	public RestGenericEObjectTreeNode(EObject model, Object parent) {
		this.model = model;
		this.parent = parent;
	}

	@Override
	public Object getModel() {
		return model;
	}

	public void setModel(EObject model) {
		this.model = model;
	}

	@Override
	public Object[] getChildren() {
		if (children == null) {
			children = new ArrayList<RestGenericEObjectTreeNode>();
		}

		int diff = model.eContents().size() - children.size();
		if (diff > 0) {
			for (int i = 0; i < diff; i++) {
				children.add(new RestGenericEObjectTreeNode(null, this));
			}
		} else if (diff < 0) {
			for (int i = diff; i < 0; i++) {
				children.remove(0);
			}
		}

		for (int i = 0; i < model.eContents().size(); i++) {
			children.get(i).setModel(model.eContents().get(i));
		}

		return children.toArray();
	}

	@Override
	public boolean hasChildren() {
		return getChildren().length > 0;
	}

	public static EList<RestGenericEObjectTreeNode> createNodeListFromEObjectList(
			EList<? extends EObject> items, Object parent) {
		EList<RestGenericEObjectTreeNode> returnItems = new BasicEList<RestGenericEObjectTreeNode>();
		for (EObject eObject : items) {
			returnItems.add(new RestGenericEObjectTreeNode(eObject, parent));
		}
		return returnItems;
	}

	@Override
	public Object getParent() {
		return parent;
	}
}
