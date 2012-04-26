package de.van_porten.vrest.ui.navigator.nodes;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;

public class RestResourceTypeTreeNode implements IRestTreeNode,
		IRestModelContainer {

	private ResourceType resourceType = null;
	private RestImageProvider imageProvider = new RestImageProvider();
	private Object[] children = null;
	private Object parent;

	public RestResourceTypeTreeNode(ResourceType resourceType, Object parent) {
		setResourceType(resourceType);
		this.parent = parent;
	}

	@Override
	public Object[] getChildren() {
		return this.children;

	}

	private void updateChildren(ResourceType resourceType) {
		if (resourceType != null) {
			if (this.children == null) {
				this.children = new Object[] {
						new RestFolderTreeNode("Identifiers",
								getImageProvider().getImageFilePath(
										RestImageProvider.IMG_MISC_FOLDER),
								this, getResourceType().getIdentifer()),
						new RestFolderTreeNode("Creators", getImageProvider()
								.getImageFilePath(
										RestImageProvider.IMG_MISC_FOLDER),
								this, getResourceType().getCreators()),
						new RestFolderTreeNode("Methods", getImageProvider()
								.getImageFilePath(
										RestImageProvider.IMG_MISC_FOLDER),
								this, getResourceType().getMethods()),
						new RestFolderTreeNode("Resource Elements",
								getImageProvider().getImageFilePath(
										RestImageProvider.IMG_MISC_FOLDER),
								this, getResourceType().getResourceelements()),
						new RestFolderTreeNode("States", getImageProvider()
								.getImageFilePath(
										RestImageProvider.IMG_MISC_FOLDER),
								this, getResourceType().getStates()) };
			} else {
				for (Object child : children) {
					if (((RestFolderTreeNode) child).getName().equals(
							"Identifiers")) {
						((RestFolderTreeNode) child).setChildren(resourceType
								.getIdentifer());
					} else if (((RestFolderTreeNode) child).getName().equals(
							"Creators")) {
						((RestFolderTreeNode) child).setChildren(resourceType
								.getCreators());
					} else if (((RestFolderTreeNode) child).getName().equals(
							"Methods")) {
						((RestFolderTreeNode) child).setChildren(resourceType
								.getMethods());
					} else if (((RestFolderTreeNode) child).getName().equals(
							"Resource Elements")) {
						((RestFolderTreeNode) child).setChildren(resourceType
								.getResourceelements());
					} else if (((RestFolderTreeNode) child).getName().equals(
							"States")) {
						((RestFolderTreeNode) child).setChildren(resourceType
								.getStates());
					}
				}
			}
		}
	}

	@Override
	public boolean hasChildren() {
		return getChildren().length > 0;
	}

	@Override
	public Object getModel() {
		return getResourceType();
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
		updateChildren(this.resourceType);
	}

	private RestImageProvider getImageProvider() {
		return imageProvider;
	}

	@Override
	public Object getParent() {
		return parent;
	}

}
