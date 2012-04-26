package de.van_porten.vrest.ui.diagram.common.styles;

import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;


public final class StyleUtil {

	protected static final IColorConstant COLOR_INITIAL_STATE_BACKGROUND = new ColorConstant(
	191, 255, 149);
	protected static final IColorConstant COLOR_INITIAL_STATE_FOREGROUND = new ColorConstant(
	0, 0, 0);
	protected static final IColorConstant COLOR_INITIAL_STATE_TEXT_FOREGROUND = new ColorConstant(
	0, 0, 0);

	public static Style getStyleForInitialState(Diagram diagram) {
	    final String styleId = "INITIAL-STATE";
	    IGaService gaService = Graphiti.getGaService();

	    Style style = gaService.createPlainStyle(diagram, styleId);
	    style.setFilled(true);
	    style.setForeground(gaService.manageColor(diagram,
	    		StyleUtil.COLOR_INITIAL_STATE_FOREGROUND));
	    // no background color here, we have a gradient instead
	     gaService.setRenderingStyle(style,
	        VisualRestColoredAreas.geInitialStateAdaptions());
	     return style;
	}

	public static Style getStyleForState(Diagram diagram) {
	    final String styleId = "STATE";
	    IGaService gaService = Graphiti.getGaService();

	    Style style = gaService.createPlainStyle(diagram, styleId);
	    style.setFilled(true);
	    style.setForeground(gaService.manageColor(diagram,
	    		COLOR_INITIAL_STATE_FOREGROUND));
	    // no background color here, we have a gradient instead
	     gaService.setRenderingStyle(style,
	        VisualRestColoredAreas.getStateAdaptions());
	     return style;
	}

	protected static final IColorConstant COLOR_CONDITIONAL_ACTION_BACKGROUND = IColorConstant.WHITE;
	protected static final IColorConstant COLOR_CONDITIONAL_ACTION_DIAMOND_BACKGROUND = new ColorConstant(
			255, 170, 204);
	protected static final IColorConstant COLOR_CONDITIONAL_ACTION_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_CONDITIONAL_ACTION_TEXT_FOREGROUND = IColorConstant.BLACK;


	public static Style getStyleForConditionalAction(Diagram diagram) {
	    final String styleId = "CONDITIONAL_ACTION";
	    IGaService gaService = Graphiti.getGaService();

	    Style style = gaService.createPlainStyle(diagram, styleId);
	    style.setFilled(true);
	    style.setForeground(gaService.manageColor(diagram,
	    		COLOR_CONDITIONAL_ACTION_FOREGROUND));
	    // no background color here, we have a gradient instead
	     gaService.setRenderingStyle(style,
	        VisualRestColoredAreas.getVisualRestAdaptions());
	     return style;
	}

}
