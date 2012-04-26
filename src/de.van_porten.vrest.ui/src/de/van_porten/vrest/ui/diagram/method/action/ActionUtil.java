package de.van_porten.vrest.ui.diagram.method.action;

import org.eclipse.graphiti.features.context.ILocationContext;
import org.eclipse.graphiti.features.context.ITargetContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.PropertyUtil;

public final class ActionUtil {

	public static Shape findConditionalActionIfTrueSection(Shape shape) {
		return PropertyUtil.findChildWithShapeId(shape,
				PropertyUtil.MethodShapeIds.CONDITONALACTION_IFTRUE);
	}

	public static Shape findConditionalActionIfFalseSection(Shape shape) {
		return PropertyUtil.findChildWithShapeId(shape,
				PropertyUtil.MethodShapeIds.CONDITONALACTION_IFFALSE);
	}

	public static boolean targetIsMethod(ITargetContext context) {
		Object businessObject = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(
						context.getTargetContainer());
		return (businessObject instanceof Method);
	}

	public static boolean targetIsConditionalAction(ITargetContext context) {
		ContainerShape co = context.getTargetContainer();
		Object businessObject = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(
						context.getTargetContainer());
		if (businessObject instanceof ConditionalAction) {
			Shape ifTrue = findConditionalActionIfTrueSection(co);
			Shape ifFalse = findConditionalActionIfFalseSection(co);
			return (targetIsInsideShape(context, ifTrue) || targetIsInsideShape(
					context, ifFalse));
		} else {
			return false;
		}
	}

	public static boolean targetIsInsideShape(ITargetContext context,
			Shape shape) {
		if( shape != null && context instanceof ILocationContext ) {
			ILocationContext locationContext = (ILocationContext) context;
			GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
			return locationContext.getX() > shapeGa.getX()
					&& locationContext.getX() < shapeGa.getX() + shapeGa.getWidth()
					&& locationContext.getY() > shapeGa.getY()
					&& locationContext.getY() < shapeGa.getY() + shapeGa.getHeight();
		} else {
			return false;
		}
	}

}
