package de.van_porten.vrest.ui.util;

public class AutoLayoutHint {
	public static int NONE = 0;
	public static int STRETCH_VERTICAL = 1;
	public static int STRETCH_HORIZONTAL = 2;
	public static int CENTER_VERTICAL = 4;
	public static int CENTER_HORIZONTAL = 8;

	private boolean stretchVertical;
	private boolean stretchHorziontal;
	private boolean centerVertical;
	private boolean centerHorizontal;

	public AutoLayoutHint(int hints) {
		if ((hints & STRETCH_VERTICAL) == STRETCH_VERTICAL) {
			this.setStretchVertical(true);
		}
		if ((hints & STRETCH_HORIZONTAL) == STRETCH_HORIZONTAL) {
			this.setStretchHorziontal(true);
		}
		if ((hints & CENTER_VERTICAL) == CENTER_VERTICAL) {
			this.setCenterVertical(true);
		}
		if ((hints & CENTER_HORIZONTAL) == CENTER_HORIZONTAL) {
			this.setCenterHorizontal(true);
		}
	}

	public AutoLayoutHint() {
		this(NONE);
	}

	public boolean isStretchVertical() {
		return stretchVertical;
	}

	public void setStretchVertical(boolean stretchVertical) {
		this.stretchVertical = stretchVertical;
	}

	public boolean isStretchHorziontal() {
		return stretchHorziontal;
	}

	public void setStretchHorziontal(boolean stretchHorziontal) {
		this.stretchHorziontal = stretchHorziontal;
	}

	public boolean isCenterVertical() {
		return centerVertical;
	}

	public void setCenterVertical(boolean centerVertical) {
		this.centerVertical = centerVertical;
	}

	public boolean isCenterHorizontal() {
		return centerHorizontal;
	}

	public void setCenterHorizontal(boolean centerHorizontal) {
		this.centerHorizontal = centerHorizontal;
	}

}