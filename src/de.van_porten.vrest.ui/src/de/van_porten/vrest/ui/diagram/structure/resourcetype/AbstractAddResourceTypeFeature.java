package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.common.DummyConnection;
import de.van_porten.vrest.ui.navigator.nodes.IRestModelContainer;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public abstract class AbstractAddResourceTypeFeature extends
		AbstractAddShapeFeature {

	protected static final IColorConstant CLASS_TEXT_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant CLASS_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant CLASS_BACKGROUND = IColorConstant.WHITE;
	private boolean collapsed;

	private int iconWidth = 50;
	private int iconHeight = 50;

	public AbstractAddResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
		this.collapsed = false;
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getTargetContainer() instanceof Diagram) {
			if (context.getNewObject() instanceof ResourceType) {
				return true;
			}
			if (context.getNewObject() instanceof IRestModelContainer) {
				if (((IRestModelContainer) context.getNewObject()).getModel() instanceof ResourceType) {
					return true;
				}
			}
		}
		return false;
	}

	public void setCollapsed(boolean collapsed) {
		this.collapsed = collapsed;
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	protected void createConnection(Diagram targetDiagram, EObject newObject,
			ContainerShape start, ContainerShape end) {
		AddConnectionContext addConnectionContext = new AddConnectionContext(
				start.getAnchors().get(0), end.getAnchors().get(0));
		addConnectionContext.setNewObject(newObject);
		addConnectionContext.setTargetContainer(targetDiagram);
		IAddFeature addConnectionFeature = getFeatureProvider().getAddFeature(
				addConnectionContext);
		if (addConnectionFeature.canAdd(addConnectionContext)) {
			addConnectionFeature.add(addConnectionContext);
		}
	}

	/**
	 * @param containerShape
	 * @param addedClass
	 * @param targetDiagram
	 */
	protected void addAllConnections(ContainerShape containerShape,
			ResourceType addedClass, Diagram targetDiagram) {
		/* add all outgoing connections */
		for (ResourceElement resourceElement : addedClass.getResourceelements()) {
			if (resourceElement instanceof InternalLink) {
				for (EObject object : targetDiagram.eContents()) {
					if (object instanceof ContainerShape) {
						Object bo = getBusinessObjectForPictogramElement((PictogramElement) object);
						if (bo instanceof ResourceType) {
							if (((InternalLink) resourceElement).getTarget() != null
									&& ((InternalLink) resourceElement)
											.getTarget().equals(bo)) {
								createConnection(targetDiagram,
										resourceElement, containerShape,
										(ContainerShape) object);
							}
						}
					}
				}
			}
		}

		/* add all incoming connection */
		for (EObject object : targetDiagram.eContents()) {
			if (object instanceof ContainerShape) {
				Object bo = getBusinessObjectForPictogramElement((PictogramElement) object);
				if (bo instanceof ResourceType) {
					/* Add containment features */
					createConnection(targetDiagram, new DummyConnection(),
							containerShape, (ContainerShape) object);

					createConnection(targetDiagram, new DummyConnection(),
							(ContainerShape) object, containerShape);

					/* add all incoming internal links */
					for (ResourceElement resourceElement : ((ResourceType) bo)
							.getResourceelements()) {
						if (resourceElement instanceof InternalLink) {
							if (((InternalLink) resourceElement).getTarget() != null
									&& ((InternalLink) resourceElement)
											.getTarget().equals(addedClass)) {
								createConnection(targetDiagram,
										resourceElement,
										(ContainerShape) object, containerShape);
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @param peCreateService
	 * @param gaService
	 * @param containerShape
	 * @param addedClass
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	protected void addAllAttributes(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape,
			ResourceType addedClass, int x, int y, int width, int height) {
		ContainerShape attributeContainer = peCreateService
				.createContainerShape(containerShape, false);
		Rectangle attrRect = gaService
				.createInvisibleRectangle(attributeContainer);
		gaService.setLocationAndSize(attrRect, x, y, width, height);

		PropertyUtil.setAttributeContainerShape(attributeContainer);
		link(attributeContainer, addedClass);

		EList<ResourceElement> attributes = addedClass.getResourceelements();

		for (ResourceElement attr : attributes) {
			if (attr instanceof Attribute) {
				AddContext addAttributeContext = new AddContext();
				addAttributeContext.setLocation(x, y);
				addAttributeContext.setTargetContainer(attributeContainer);
				addAttributeContext.setNewObject(attr);
				addGraphicalRepresentation(addAttributeContext, attr);
			}
		}
	}

	/**
	 * @param peCreateService
	 * @param gaService
	 * @param containerShape
	 * @param addedClass
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	protected void addAllIdentifiers(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape,
			ResourceType addedClass, int x, int y, int width, int height) {
		// TODO: This only works for the simple case of exactly one identifier
		// if there are more identifiers, they all need to be added - see
		// Attribute implementation (i.e. AddAttribute/CreateAttribute features
		// also needed for Identifier.
		if (addedClass.getIdentifer().size() > 0) {
			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService
					.createDefaultText(
							getDiagram(),
							shape,
							LayoutUtil
									.createStringFromResourceIdentifierPattern(addedClass
											.getIdentifer().get(0)));
			text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			gaService.setLocationAndSize(text, x, y, width, height);

			/* set prop to identify part */
			PropertyUtil.setResourceTypeIdentifierShape(shape);

			link(shape, addedClass.getIdentifer().get(0));
		}
	}

	/**
	 * @param peCreateService
	 * @param gaService
	 * @param containerShape
	 * @param width
	 * @param iconHeight
	 */
	protected void createStereotypeLabel(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape, int x,
			int y, int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);

		/* Fetch type name via open recursion - getTypeName() */
		Text text = gaService.createDefaultText(getDiagram(), shape,
				getTypeName());
		text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocationAndSize(text, x, y, width, height);

		PropertyUtil.setResourceTypeStereotypeShape(shape);
	}

	protected void createHorizontalSeparator(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape, int x,
			int y, int width) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0,
				width, 0 });
		polyline.setForeground(manageColor(CLASS_FOREGROUND));
		polyline.setLineWidth(1);
		gaService.setLocation(polyline, x, y);
	}

	/**
	 * @param addedClass
	 * @param peCreateService
	 * @param gaService
	 * @param containerShape
	 * @param width
	 */
	protected void createNameLabel(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape,
			ResourceType addedClass, int x, int y, int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape,
				addedClass.getName());
		text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		gaService.setLocationAndSize(text, x, y, width, height);

		/* set prop to identify part */
		PropertyUtil.setResourceTypeNameShape(shape);

		/* create link and wire it */
		link(shape, addedClass);

		// provide information to support direct-editing directly
		// after object creation (must be activated additionally)
		IDirectEditingInfo directEditingInfo = getFeatureProvider()
				.getDirectEditingInfo();
		// set container shape for direct editing after object creation
		directEditingInfo.setMainPictogramElement(containerShape);
		// set shape and graphics algorithm where the editor for
		// direct editing shall be opened after object creation
		directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setGraphicsAlgorithm(text);
	}

	/**
	 * @param peCreateService
	 * @param gaService
	 * @param containerShape
	 */
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, final ContainerShape containerShape, int x,
			int y, int width, int height) {
		ContainerShape iconContainer = peCreateService.createContainerShape(
				containerShape, false);
		Rectangle invRect = gaService.createInvisibleRectangle(iconContainer);
		gaService.setLocationAndSize(invRect, x, y, width, height);
		createIconShape(peCreateService, gaService, iconContainer, width,
				height);
		PropertyUtil.setResourceTypeIconShape(iconContainer);
	}

	protected ContainerShape createResourceTypeContainerShape(
			IPeCreateService peCreateService, IGaService gaService,
			Diagram targetDiagram, ResourceType addedClass, boolean isVisible,
			int x, int y, int width, int height) {
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		/*
		 * if (addedClass.eResource() == null) {
		 * getDiagram().eResource().getContents().add(addedClass); }
		 */
		if (addedClass.eResource() == null) {
			System.out.println("No resource for addedClass "
					+ addedClass.getClass().getSimpleName() + "!");
		}

		link(containerShape, addedClass);

		PropertyUtil.setResourceTypeShape(containerShape);
		PropertyUtil.setIsCollapsed(containerShape, collapsed);

		Rectangle rect = null;
		if (isVisible) {
			rect = gaService.createRectangle(containerShape);
			rect.setFilled(true);
			rect.setForeground(manageColor(CLASS_FOREGROUND));
			rect.setBackground(manageColor(CLASS_BACKGROUND));
			rect.setLineWidth(1);
		} else {
			rect = gaService.createInvisibleRectangle(containerShape);
		}

		gaService.setLocationAndSize(rect, x, y, width, height);

		return containerShape;
	}

	protected ResourceType getResourceTypeFromContext(IAddContext context) {
		if (context.getNewObject() instanceof ResourceType) {
			return (ResourceType) context.getNewObject();
		} else if (context.getNewObject() instanceof IRestModelContainer) {
			return (ResourceType) ((IRestModelContainer) context.getNewObject())
					.getModel();
		}
		return null;
	}

	private PictogramElement addCollapsed(IAddContext context) {
		ResourceType addedClass = getResourceTypeFromContext(context);
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		int width = context.getWidth() <= 0 ? 100 : context.getWidth();
		int height = context.getHeight() <= 0 ? 100 : context.getHeight();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		final ContainerShape containerShape = createResourceTypeContainerShape(
				peCreateService, gaService, targetDiagram, addedClass, false,
				context.getX(), context.getY(), width, height);

		createStereotypeLabel(peCreateService, gaService, containerShape, 0,
				iconHeight + 5, width, 20);

		createNameLabel(peCreateService, gaService, containerShape, addedClass,
				0, iconHeight + 25, width, 20);

		createIcon(peCreateService, gaService, containerShape, width / 2
				- iconWidth / 2, 0, iconWidth, iconHeight);

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* call the layout feature */
		layoutPictogramElement(containerShape);

		/* add connections after the rest is done */
		addAllConnections(containerShape, addedClass, targetDiagram);

		return containerShape;
	}

	private PictogramElement addExpanded(IAddContext context) {
		ResourceType addedClass = getResourceTypeFromContext(context);

		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		int width = context.getWidth() <= 0 ? 150 : context.getWidth();
		int height = context.getHeight() <= 0 ? 150 : context.getHeight();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		final ContainerShape containerShape = createResourceTypeContainerShape(
				peCreateService, gaService, targetDiagram, addedClass, true,
				context.getX(), context.getY(), width, height);

		createHorizontalSeparator(peCreateService, gaService, containerShape,
				0, 60, width);

		createStereotypeLabel(peCreateService, gaService, containerShape, 20,
				0, width - 40, 20);

		createNameLabel(peCreateService, gaService, containerShape, addedClass,
				20, 25, width - 40, 25);

		createIcon(peCreateService, gaService, containerShape, 0, 0, iconWidth,
				iconHeight);

		createHorizontalSeparator(peCreateService, gaService, containerShape,
				0, 90, width);

		addAllIdentifiers(peCreateService, gaService, containerShape,
				addedClass, 0, 65, width, 25);
		addAllAttributes(peCreateService, gaService, containerShape,
				addedClass, 0, 95, width, height - 100);

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* call the layout feature */
		layoutPictogramElement(containerShape);

		/* add connections after the rest is done */
		addAllConnections(containerShape, addedClass, targetDiagram);

		return containerShape;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		if (isCollapsed()) {
			return addCollapsed(context);
		} else {
			return addExpanded(context);
		}
	}

	protected abstract void createIconShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, int width,
			int height);

	protected abstract String getTypeName();
}
