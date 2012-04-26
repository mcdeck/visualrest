package de.van_porten.vrest.ui.util;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

public class PropertyUtil {

	public static final String SHAPE_KEY = "shape-id";

	public final class StructureShapeIds {
		public static final String RESOURCETYPE = "resourcetype";
		public static final String RESOURCETYPE_NAME = "resourcetype-name";
		public static final String RESOURCETYPE_IDENTIFIER = "resourcetype-identifier";
		public static final String RESOURCETYPE_STEREOTYPE = "resourcetype-stereotype";
		public static final String RESOURCETYPE_RESOURCEELEMENT = "resourcetype-resourceelement";
		public static final String RESOURCETYPE_ICON_SHAPE = "resourcetype-icon-shape";

		public static final String CONTAINMENT_REFERENCE = "contaiment-reference-shape";
		public static final String ATTRIBUTE_CONTAINER = "attribute-container-shape";
		public static final String ATTRIBUTE = "attribute-shape";
	}

	public final class StateShapeIds {
		public static final String STATE = "state";
		public static final String STATE_NAME = "state-name";
		public static final String STATE_METHOD = "state-method";
	}

	public final class MethodShapeIds {
		public static final String CONDITONALACTION_IFTRUE = "conditonal-action-if-true-shape";
		public static final String CONDITONALACTION_IFFALSE = "conditonal-action-if-false-shape";

		public static final String RETURNACTION = "return-action-shape";
		public static final String RETURNACTION_STATUSCODE = "return-action-status-code-shape";

		public static final String GENERICACTIONCONTAINER = "action-container-shape";

		public static final String METHOD = "method-container-shape";
	}

	public final class GenericShapeIds {
		public static final String IS_COLLAPSED = "IsCollapsed";
		public static final String RESOURCETYPE_INDICATOR = "resource-type-indicator-shape";
		public static final String CHANGE_SELECTION_BORDER = "change-selection-border-of-shape";
		public static final String NEW_SELECTION_BORDER = "new-selection-border-of-shape";
	}

	public static final void setIsCollapsed(PictogramElement pe, boolean isCollapsed) {
		Graphiti.getPeService().setPropertyValue(pe, GenericShapeIds.IS_COLLAPSED, isCollapsed?"TRUE":"FALSE");
	}

	public static final boolean isCollapsed(PictogramElement pe) {
		return "TRUE".equals(Graphiti.getPeService().getPropertyValue(pe,
				GenericShapeIds.IS_COLLAPSED));
	}

	public static final void setMethodShape(PictogramElement pe) {
		setShapeId(pe, MethodShapeIds.METHOD);
	}

	public static final boolean isMethodShape(PictogramElement pe) {
		return hasShapeId(pe, MethodShapeIds.METHOD);
	}

	public static final void setAttributeContainerShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.ATTRIBUTE_CONTAINER);
	}

	public static final boolean isAttributeContainerShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.ATTRIBUTE_CONTAINER);
	}

	public static final void setResourceTypeIconShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE_ICON_SHAPE);
	}

	public static final boolean isResourceTypeIconShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE_ICON_SHAPE);
	}

	public static final void setStateShape(PictogramElement pe) {
		setShapeId(pe, StateShapeIds.STATE);
	}

	public static final boolean isStateShape(PictogramElement pe) {
		return hasShapeId(pe, StateShapeIds.STATE);
	}

	public static final void setStateMethodShape(PictogramElement pe) {
		setShapeId(pe, StateShapeIds.STATE_METHOD);
	}

	public static final boolean isStateMethodShape(PictogramElement pe) {
		return hasShapeId(pe, StateShapeIds.STATE_METHOD);
	}


	public static final void setStateNameShape(PictogramElement pe) {
		setShapeId(pe, StateShapeIds.STATE_NAME);
	}

	public static final boolean isStateNameShape(PictogramElement pe) {
		return hasShapeId(pe, StateShapeIds.STATE_NAME);
	}

	public static final void setResourceTypeStereotypeShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE_STEREOTYPE);
	}

	public static final boolean isResourceTypeStereotypeShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE_STEREOTYPE);
	}

	public static final void setResourceTypeNameShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE_NAME);
	}

	public static final boolean isResourceTypeNameShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE_NAME);
	}

	public static final void setResourceTypeShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE);
	}

	public static final boolean isResourceTypeShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE);
	}

	public static final void setResourceTypeIdentifierShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE_IDENTIFIER);
	}

	public static final boolean isResourceTypeIdentifierShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE_IDENTIFIER);
	}

	public static final void setResourceTypeResourceElementShape(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.RESOURCETYPE_RESOURCEELEMENT);
	}

	public static final boolean isResourceTypeResourceElementShape(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.RESOURCETYPE_RESOURCEELEMENT);
	}

	public static final void setContainmentReferenceConnection(PictogramElement pe) {
		setShapeId(pe, StructureShapeIds.CONTAINMENT_REFERENCE);
	}

	public static final boolean isContainmentReferenceConnection(PictogramElement pe) {
		return hasShapeId(pe, StructureShapeIds.CONTAINMENT_REFERENCE);
	}

	public static final void setReturnActionShape(PictogramElement pe) {
		setShapeId(pe, MethodShapeIds.RETURNACTION);
	}

	public static final boolean isReturnActionShape(PictogramElement pe) {
		return hasShapeId(pe, MethodShapeIds.RETURNACTION);
	}

	public static final void setReturnActionStatusCodeShape(PictogramElement pe) {
		setShapeId(pe, MethodShapeIds.RETURNACTION_STATUSCODE);
	}

	public static final boolean isReturnActionStatusCodeShape(PictogramElement pe) {
		return hasShapeId(pe, MethodShapeIds.RETURNACTION_STATUSCODE);
	}

	public static final void setActionContainerShape(PictogramElement pe) {
		setShapeId(pe, MethodShapeIds.GENERICACTIONCONTAINER);
	}

	public static final boolean isActionContainerShape(PictogramElement pe) {
		return hasShapeId(pe, MethodShapeIds.GENERICACTIONCONTAINER);
	}

	/*
	 * Generic Methods to access properties
	 */
	public static final void setShapeId(PictogramElement pe, String shapeId) {
		Graphiti.getPeService().setPropertyValue(pe, SHAPE_KEY, shapeId);
	}

	public static final boolean hasShapeId(PictogramElement pe, String shapeId) {
		return shapeId.equals(Graphiti.getPeService().getPropertyValue(pe,
				SHAPE_KEY));
	}

	public static final void setMarker(PictogramElement pe, String markerId) {
		Graphiti.getPeService().setPropertyValue(pe, markerId, "TRUE");
	}

	public static final boolean hasMarker(PictogramElement pe, String markerId) {
		return "TRUE".equals(Graphiti.getPeService().getPropertyValue(pe,
				markerId));
	}


	public static final void setChangeSelectionBorder(PictogramElement pe) {
		setMarker(pe, GenericShapeIds.CHANGE_SELECTION_BORDER);
	}

	public static final boolean shouldChangeSelectionBorder(PictogramElement pe) {
		return hasMarker(pe, GenericShapeIds.CHANGE_SELECTION_BORDER);
	}

	public static final void setNewSelectionBorder(PictogramElement pe) {
		setMarker(pe, GenericShapeIds.NEW_SELECTION_BORDER);
	}

	public static final boolean isNewSelectionBorder(PictogramElement pe) {
		return hasMarker(pe, GenericShapeIds.NEW_SELECTION_BORDER);
	}


	public static Shape findChildWithNewSelectionBorder(Shape shape) {
		return doFindChildWithMarker(shape, GenericShapeIds.NEW_SELECTION_BORDER);
	}

	public static Shape findChildWithMarker(Shape shape, String marker) {
		return doFindChildWithMarker(shape, marker);
	}

	private static Shape doFindChildWithMarker(Shape shape, String marker) {
		if (hasMarker(shape, marker)) {
			return shape;
		} else {
			if (shape instanceof ContainerShape) {
				for (Shape childShape : ((ContainerShape) shape).getChildren()) {
					Shape foundShape = doFindChildWithMarker(childShape, marker);
					if( foundShape != null ) {
						return foundShape;
					}
				}
			}
		}
		return null;
	}

	public static Shape findChildWithShapeId(Shape shape, String shapeId) {
		return doFindChildWithShapeId(shape, shapeId);
	}

	private static Shape doFindChildWithShapeId(Shape shape, String shapeId) {
		if (hasShapeId(shape, shapeId)) {
			return shape;
		} else {
			if (shape instanceof ContainerShape) {
				for (Shape childShape : ((ContainerShape) shape).getChildren()) {
					Shape foundShape = doFindChildWithShapeId(childShape, shapeId);
					if( foundShape != null ) {
						return foundShape;
					}
				}
			}
		}
		return null;
	}

}

