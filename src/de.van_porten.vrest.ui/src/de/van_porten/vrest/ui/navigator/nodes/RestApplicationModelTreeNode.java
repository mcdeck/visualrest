package de.van_porten.vrest.ui.navigator.nodes;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.ui.platform.IImageProvider;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;

public class RestApplicationModelTreeNode implements IRestTreeNode,
		IRestModelContainer {

	private RestApplicationModel model;
	private IImageProvider imageProvider = new RestImageProvider();
	private Object[] children = null;

	public RestApplicationModelTreeNode(RestApplicationModel model) {
		setModel(model);
	}

	@Override
	public Object getModel() {
		return model;
	}

	public void setModel(RestApplicationModel model) {
		this.model = (RestApplicationModel) model;
		updateChildren(this.model);
	}

	private RestFolderTreeNode dataTypesContainer = null;
	private RestFolderTreeNode mediaTypesContainer = null;
	private RestFolderTreeNode methodTypesContainer = null;
	private RestFolderTreeNode opTypesContainer = null;
	private RestFolderTreeNode relTypesContainer = null;
	private RestFolderTreeNode resourceTypesContainer = null;

	private void updateChildren(RestApplicationModel model) {
		if (model != null) {
			if (children == null) {
				dataTypesContainer = new RestFolderTreeNode(
						"Data Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, model.getDataTypes());

				mediaTypesContainer = new RestFolderTreeNode(
						"Media Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, model.getMediaTypes());

				methodTypesContainer = new RestFolderTreeNode(
						"Method Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, model.getMethodTypes());

				opTypesContainer = new RestFolderTreeNode(
						"Op Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, model.getOptypes());

				relTypesContainer = new RestFolderTreeNode(
						"Rel Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, model.getRelTypes());

				resourceTypesContainer = new RestFolderTreeNode(
						"Resource Types",
						imageProvider
								.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER),
						this, null);

				EList<RestResourceTypeTreeNode> resourceTypeNodes = new BasicEList<RestResourceTypeTreeNode>();
				for (ResourceType resourceType : model.getResourceTypes()) {
					resourceTypeNodes.add(new RestResourceTypeTreeNode(
							resourceType, resourceTypesContainer));
				}
				resourceTypesContainer.setChildren(resourceTypeNodes);

				children = new Object[] { dataTypesContainer,
						mediaTypesContainer, methodTypesContainer,
						opTypesContainer, relTypesContainer,
						resourceTypesContainer };
			} else {
				dataTypesContainer.setChildren(model.getDataTypes());
				mediaTypesContainer.setChildren(model.getMediaTypes());
				methodTypesContainer.setChildren(model.getMethodTypes());
				opTypesContainer.setChildren(model.getOptypes());
				relTypesContainer.setChildren(model.getRelTypes());

				EList<RestResourceTypeTreeNode> resourceTypeNodes = new BasicEList<RestResourceTypeTreeNode>();
				Object[] resourceTypesContainerChildren = resourceTypesContainer
						.getChildren();
				for (Object object : resourceTypesContainerChildren) {
					resourceTypeNodes.add((RestResourceTypeTreeNode) object);
				}

				int diff = model.getResourceTypes().size()
						- resourceTypeNodes.size();
				if (diff > 0) {
					for (int i = 0; i < diff; i++) {
						resourceTypeNodes
								.add(new RestResourceTypeTreeNode(null, resourceTypesContainer));
					}
				} else if (diff < 0) {
					for (int i = diff; i < 0; i++) {
						resourceTypeNodes.remove(0);
					}
				}

				for (int i = 0; i < model.getResourceTypes().size(); i++) {
					resourceTypeNodes.get(i).setResourceType(
							model.getResourceTypes().get(i));
				}

				resourceTypesContainer.setChildren(resourceTypeNodes);
			}
		}
	}

	@Override
	public Object[] getChildren() {
		return this.children;
	}

	@Override
	public boolean hasChildren() {
		return true;
	}

	@Override
	public Object getParent() {
		// TODO Auto-generated method stub
		return null;
	}
}
