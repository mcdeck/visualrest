package de.van_porten.vrest.ui.diagram.method.action.conditionalaction;

public final class ConditionalActionUtil {

	static final String shapeIdContainerShape = "vrest.ui.diagram.method.action.conditionalaction.internal-container-shape";
	static final String shapeIdParentRectangle = "vrest.ui.diagram.method.action.conditionalaction.internal-parent-rectangle-shape";
	static final String shapeIdDivider = "vrest.ui.diagram.method.action.conditionalaction.internal-divider-shape";
	static final String shapeIdDiamond = "vrest.ui.diagram.method.action.conditionalaction.internal-diamond-shape";
	static final String shapeIdIfTrueText = "vrest.ui.diagram.method.action.conditionalaction.internal-if-true-shape";
	static final String shapeIdIfFalseText = "vrest.ui.diagram.method.action.conditionalaction.internal-if-false-shape";
	static final int diamond_size = 40;
	static final int diamond_size_half = diamond_size / 2;
	static final int textHeight = 20;
	static final int calculateDividerXPosition(int width) {
		return diamond_size_half + (width - diamond_size_half) / 2;
	}
	static final int calculateDividerYPosition(int height) {
		return diamond_size_half;
	}
	static final int calculateDividerHeight(int height) {
		return height - diamond_size_half;
	}
	static final int calculateParentRectWidth(int width) {
		return width - diamond_size_half;
	}
	static final int calculateParentRectXPosition(int width) {
		return diamond_size_half;
	}
	static final int calculateParentRectHeight(int height) {
		return height - diamond_size_half;
	}
	static final int calculateParentRectYPosition(int height) {
		return diamond_size_half;
	}
	static final int calculateIfTrueTextXPosition(int width) {
		return diamond_size_half;
	}
	static final int calculateIfTrueTextYPosition(int height) {
		return diamond_size_half;
	}
	static final int calculateIfFalseTextXPosition(int width) {
		return diamond_size_half + ConditionalActionUtil.calculateTextWidth(width);
	}
	static final int calculateIfFalseTextYPosition(int height) {
		return diamond_size_half;
	}
	static final int calculateTextWidth(int width) {
		return (width - diamond_size_half) / 2;
	}
	static final int calculateIfTrueContainerXPosition(int width) {
		return diamond_size_half;
	}
	static final int calculateIfTrueContainerYPosition(int height) {
		return diamond_size_half + textHeight;
	}
	static final int calculateIfFalseContainerXPosition(int width) {
		return diamond_size_half + ConditionalActionUtil.calculateConditionContainerWidth(width);
	}
	static final int calculateIfFalseContainerYPosition(int height) {
		return diamond_size_half + textHeight;
	}
	static final int calculateConditionContainerWidth(int width) {
		return (width - diamond_size_half) / 2;
	}
	static final int calculateConditionContainerHeight(int height) {
		// - 1; so we do not have overlap with the border
		return height - diamond_size_half - textHeight - 1;
	}

}
