package de.van_porten.vrest.ui.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.ui.platform.IImageProvider;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.CreateAction;
import de.van_porten.vrest.core.model.restbehavior.ListAddAction;
import de.van_porten.vrest.core.model.restbehavior.ListRemoveAction;
import de.van_porten.vrest.core.model.restbehavior.MessageAction;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.FilterResourceType;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.PrimaryResourceType;
import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;
import de.van_porten.vrest.ui.Activator;
import de.van_porten.vrest.ui.util.LayoutUtil;

public final class RestModelLabelFactory {

	private IImageProvider imageProvider;

	public Image getImage(Object element) {
		String key = null;

		if (element instanceof RestApplicationModel) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_MISC_REST_APPLICATON_MODEL);
		} else if (element instanceof PrimaryResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE);
		} else if (element instanceof PagingResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_PAGING_RESOURCE_TYPE);
		} else if (element instanceof ProjectionResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_PROJECTION_RESOURCE_TYPE);
		} else if (element instanceof ActivityResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE);
		} else if (element instanceof FilterResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_FILTER_RESOURCE_TYPE);
		} else if (element instanceof ListResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_LIST_RESOURCE_TYPE);
		} else if (element instanceof AggregationResourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_AGGREGATION_RESOURCE_TYPE);
		} else if (element instanceof SubresourceType) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_SUBRESOURCE_RESOURCE_TYPE);
		} else if (element instanceof InternalLink) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STRUCTURE_INTERNAL_LINK);
		} else if (element instanceof State) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STATES_STATE);
		} else if (element instanceof Transition) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_STATES_TRANSITION);
		} else if (element instanceof Method) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_METHOD);
		} else if (element instanceof ReturnAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_RETURNACTION);
		} else if (element instanceof CreateAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_CREATEACTION);
		} else if (element instanceof ListAddAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_LISTADDACTION);
		} else if (element instanceof ListRemoveAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_LISTREMOVEACTION);
		} else if (element instanceof UpdateAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_UPDATEACTION);
		} else if (element instanceof MessageAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_MESSAGEACTION);
		} else if (element instanceof ConditionalAction) {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_METHODS_CONDITIONALACTION);
		} else {
			key = getImageProvider().getImageFilePath(
					RestImageProvider.IMG_MISC_UNKNOWN);
		}

		return createImageForKey(key);
	}

	public Image createImageForKey(String key) {
		Image image = null;

		if (key != null) {
			ImageRegistry registry = Activator.getDefault().getImageRegistry();
			image = registry.get(key);
			if (image == null) {
				image = Activator.getImageDescriptor(key).createImage();
				registry.put(key, image);
			}
		}
		return image;
	}

	public IImageProvider getImageProvider() {
		if (imageProvider == null) {
			imageProvider = new RestImageProvider();
		}
		return imageProvider;
	}

	public String getText(Object element) {
		if (element instanceof RestApplicationModel) {
			return ((RestApplicationModel) element).getName();
		} else if (element instanceof ResourceType) {
			return ((ResourceType) element).getName();
		} else if (element instanceof InternalLink) {
			return ((InternalLink) element).getName();
		} else if (element instanceof ResourceElement) {
			return ((ResourceElement) element).getName();
		} else if (element instanceof State) {
			return ((State) element).getName();
		} else if (element instanceof Transition) {
			return ((Transition) element).getTargetState().getName();
		} else if (element instanceof Method) {
			return ((Method) element).getName();
		} else if (element instanceof CreateAction) {
			return "Create Action";
		} else if (element instanceof ListAddAction) {
			return "List Add Action";
		} else if (element instanceof ListRemoveAction) {
			return "List Remove Action";
		} else if (element instanceof UpdateAction) {
			return "Update Action";
		} else if (element instanceof MessageAction) {
			return "Message Action";
		} else if (element instanceof ReturnAction) {
			return "Return Action";
		} else if (element instanceof ConditionalAction) {
			return "Conditional Action";
		} else if (element instanceof BehaviorSpecification) {
			return "Behavior Specification";
		} else if (element instanceof ResourceIdentifierPattern) {
			return LayoutUtil.createStringFromResourceIdentifierPattern((ResourceIdentifierPattern) element);
		} else if (element instanceof DataType) {
			return LayoutUtil.createStringFromDataType((DataType) element);
		} else if (element instanceof MethodType) {
			return ((MethodType) element).getName();
		} else if (element instanceof MediaType) {
			return ((MediaType) element).getName();
		} else if (element instanceof MediaTypeElement) {
			return ((MediaTypeElement) element).getName();
		} else if (element instanceof EObject) {
			return element.toString();
		}
		return null;
	}

	public void setImageProvider(IImageProvider imageProvider) {
		this.imageProvider = imageProvider;
	}

}
