package de.van_porten.vrest.ui.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;

import de.van_porten.vrest.core.model.restbehavior.AttributeReference;
import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.BinaryOperation;
import de.van_porten.vrest.core.model.restbehavior.Constant;
import de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.InternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.InternalMessage;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.core.model.restbehavior.Trigger;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.core.model.restbehavior.Value;
import de.van_porten.vrest.core.model.restbehavior.WritableReference;
import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.CollectionType;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.ExternalLink;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.PrimitiveDataType;
import de.van_porten.vrest.core.model.reststructure.Representation;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.SimpleIdentifier;

public class LayoutUtil {
	public final static class Constants {
		public final static String FONT = "Arial";

		private Constants() {
		}
	}

	public final static String createStringFromResourceIdentifierPattern(
			ResourceIdentifierPattern pattern) {
		if (pattern instanceof SimpleIdentifier) {
			return ((SimpleIdentifier) pattern).getIdentifier();
		} else {
			return "???";
		}
	}

	public final static String createStringFromDataType(DataType dataType) {
		if (dataType instanceof PrimitiveDataType) {
			return ((PrimitiveDataType) dataType).getName();
		} else if (dataType instanceof CollectionType) {
			/*
			 * Check for infinte recursion first - this is quite an inefficient
			 * algorithm, but we do not expect this to happen too often ...
			 */
			Vector<CollectionType> collectionTypes = new Vector<CollectionType>();
			DataType dt = dataType;
			while (dt instanceof CollectionType) {
				if (collectionTypes.contains(dt)) {
					return "!!Recursion!!";
				}
				collectionTypes.add((CollectionType) dt);
				dt = ((CollectionType) dt).getElementType();
			}
			collectionTypes.clear();
			return createStringFromDataType(((CollectionType) dataType)
					.getElementType()) + "*";
		}
		return "???";
	}

	public final static String createStringFromAttribute(Attribute attr) {
		return "+ " + attr.getName() + " : "
				+ createStringFromDataType(attr.getAttrType());
	}

	public final static String createStringFromMethod(Method method) {
		String methodTypestring = "???";
		if (method.getMethodtype() != null) {
			methodTypestring = method.getMethodtype().getName();
		}

		List<String> params = new ArrayList<String>();
		for (Parameter parameter : method.getParameters()) {
			params.add(LayoutUtil.createStringFromDataType(parameter
					.getParamType()));
		}

		String parameterString = " ";
		for (int i = 0; i < params.size(); i++) {
			parameterString += params.get(i);
			if (i < params.size() - 1) {
				parameterString += ", ";
			} else {
				parameterString += " ";
			}
		}

		return methodTypestring + " : " + method.getName() + "("
				+ parameterString + ")";
	}

	public final static String createStringFromInternalLink(InternalLink link) {
		return "<<InternalLink>>\n" + link.getName();
	}

	public static String createStringForTransitionTriggers(Transition transition) {
		EList<Trigger> trigger = transition.getTrigger();
		if (trigger.size() == 0) {
			return "???";
		} else {
			StringBuilder sb = new StringBuilder("");
			int triggerSize = trigger.size();
			for (int i = 0; i < triggerSize; i++) {
				sb.append(getStringForTrigger(trigger.get(i)));
				if (i + 1 < triggerSize) {
					sb.append(", ");
				}
			}
			return sb.toString();
		}
	}

	private static String getStringForTrigger(Trigger trigger) {
		if (trigger instanceof InternalMessage) {
			return ((InternalMessage) trigger).getName();
		}
		return "???";
	}

	public static String createStringFromRepresentation(
			Representation representation) {
		//String returnValue = "???";
		String returnValue = "";
		if (representation != null && representation.getName() != null) {
			returnValue = representation.getName();
		}
		return returnValue;
	}

	public static String createStringFromWriteableReference(
			WritableReference wRef) {
		//String refString = "???";
		String refString = "";
		if (wRef != null) {
			if (wRef instanceof AttributeReference) {
				Attribute attr = ((AttributeReference) wRef)
						.getReferencedAttribute();
				if (attr != null) {
					refString = attr.getName();
				}
			} else if (wRef instanceof InternalLinkReference) {
				InternalLink iLink = ((InternalLinkReference) wRef)
						.getReferencedLink();
				if (iLink != null) {
					refString = iLink.getName();
				}
			} else if (wRef instanceof ExternalLinkReference) {
				ExternalLink eLink = ((ExternalLinkReference) wRef)
						.getReferencedExternalLink();
				if (eLink != null) {
					refString = eLink.getName();
				}
			}
		}
		return refString;
	}

	public static String createStringFromBinOpType(BinOpType opType) {
		String value = "?";
		if( opType != null ) {
			value = opType.getName();
		}
		return value;
	}

	public static String createStringFromValue(Value value) {
		//String valString = "?";
		String valString = "";
		if (value != null) {
			if (value instanceof BinaryOperation) {
				Value firstOp = ((BinaryOperation) value).getFirstOp();
				Value secondOp = ((BinaryOperation) value).getSecondOp();
				BinOpType opType = ((BinaryOperation) value).getOptype();

				valString = createStringFromValue(firstOp)
						+ createStringFromBinOpType(opType)
						+ createStringFromValue(secondOp);
			} else if (value instanceof Constant) {
				valString = ((Constant) value).getStringRepresentation();
			}
		}
		return valString;
	}

	public static String createStringFromUpdateAction(UpdateAction updateAction) {
		//String returnValue = "??? ::> ???";
		String returnValue = "";
		/*
		if (updateAction != null) {
			WritableReference wRef = updateAction.getElementForUpdate();
			Value value = updateAction.getNewValue();

			String refString = createStringFromWriteableReference(wRef);
			String valString = createStringFromValue(value);
			returnValue = refString + " ::> " + valString;
		}
		*/
		return returnValue;
	}

	private static final class AutoLayoutMarkers {
		public static final String AUTOLAYOUT = "marker-auto-layout";
		public static final String STRETCH_VERTICAL = "marker-auto-layout-stretch-vertical";
		public static final String STRETCH_HORIZONTAL = "marker-auto-layout-stretch-horizontal";
		public static final String CENTER_VERTICAL = "marker-auto-layout-center-vertical";
		public static final String CENTER_HORIZONTAL = "marker-auto-layout-center-horizontal";
	}

	public static void enableAutoLayout(Shape shape, AutoLayoutHint layout) {
		PropertyUtil.setMarker(shape, AutoLayoutMarkers.AUTOLAYOUT);

		if (layout.isStretchVertical()) {
			PropertyUtil.setMarker(shape, AutoLayoutMarkers.STRETCH_VERTICAL);
		}
		if (layout.isStretchHorziontal()) {
			PropertyUtil.setMarker(shape, AutoLayoutMarkers.STRETCH_HORIZONTAL);
		}
		if (layout.isCenterVertical()) {
			PropertyUtil.setMarker(shape, AutoLayoutMarkers.CENTER_VERTICAL);
		}
		if (layout.isCenterHorizontal()) {
			PropertyUtil.setMarker(shape, AutoLayoutMarkers.CENTER_HORIZONTAL);
		}
	}

	public static boolean isAutoLayoutEnabled(Shape shape) {
		return PropertyUtil.hasMarker(shape, AutoLayoutMarkers.AUTOLAYOUT);
	}

	public static boolean doAutoLayout(IGaService gaService,
			int containerWidth, int containerHeight, Shape shape) {
		boolean anythingChanged = false;

		GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
		IDimension size = gaService.calculateSize(ga);

		if (PropertyUtil.hasMarker(shape, AutoLayoutMarkers.CENTER_HORIZONTAL)) {
			gaService.setLocation(ga, containerWidth / 2 - size.getWidth() / 2,
					ga.getY());
			anythingChanged = true;
		}

		if (PropertyUtil.hasMarker(shape, AutoLayoutMarkers.CENTER_VERTICAL)) {
			gaService.setLocation(ga, ga.getX(),
					containerHeight / 2 - size.getHeight() / 2);
			anythingChanged = true;
		}

		if (PropertyUtil.hasMarker(shape, AutoLayoutMarkers.STRETCH_HORIZONTAL)) {
			gaService.setSize(ga, containerWidth, size.getHeight());
			anythingChanged = true;
		}

		if (PropertyUtil.hasMarker(shape, AutoLayoutMarkers.STRETCH_VERTICAL)) {
			gaService.setLocation(ga, size.getWidth(), containerHeight);
			anythingChanged = true;
		}
		return anythingChanged;
	}
}
