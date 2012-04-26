package de.van_porten.vrest.ui.diagram.common.styles;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

public class VisualRestColoredAreas extends PredefinedColoredAreas implements
		IVisualRestRenderingStyle {

	private static GradientColoredAreas getInitialStateDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(gcas, "00CEFF", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "00CEFF", 60,
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(gcas, "FFFFFF", 61,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	//
	// private static GradientColoredAreas getLimeWhitePrimarySelectedAreas() {
	// final GradientColoredAreas gradientColoredAreas =
	// StylesFactory.eINSTANCE.createGradientColoredAreas();
	// gradientColoredAreas.setStyleAdaption
	// (IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
	// final EList<GradientColoredArea> gcas =
	// gradientColoredAreas.getGradientColor();
	//
	// addGradientColoredArea(gcas, "66CCCC", 0,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "66CCCC", 1,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "66CC99", 1,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "66CC99", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "66CC66", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "66CC66", 3,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "00CC00", 3,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "00CC66", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END);
	// addGradientColoredArea(gcas, "00CC99", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END, "00CC99", 0,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END);
	// return gradientColoredAreas;
	// }
	//
	// private static GradientColoredAreas getLimeWhiteSecondarySelectedAreas()
	// {
	// final GradientColoredAreas gradientColoredAreas =
	// StylesFactory.eINSTANCE.createGradientColoredAreas();
	// gradientColoredAreas.setStyleAdaption
	// (IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
	// final EList<GradientColoredArea> gcas =
	// gradientColoredAreas.getGradientColor();
	//
	// addGradientColoredArea(gcas, "33CCCC", 0,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "33CCCC", 1,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "33CC99", 1,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "33CC99", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "33CC66", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "33CC66", 3,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START);
	// addGradientColoredArea(gcas, "33CC00", 3,
	// LocationType.LOCATION_TYPE_ABSOLUTE_START, "33CC99", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END);
	// addGradientColoredArea(gcas, "66CC99", 2,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END, "66CC99", 0,
	// LocationType.LOCATION_TYPE_ABSOLUTE_END);
	// return gradientColoredAreas;
	// }

	public static AdaptedGradientColoredAreas geInitialStateAdaptions() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(INITIAL_STATE_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getInitialStateDefaultAreas());
		// agca.getAdaptedGradientColoredAreas()
		// .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
		// getLimeWhitePrimarySelectedAreas());
		// agca.getAdaptedGradientColoredAreas()
		// .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
		// getLimeWhiteSecondarySelectedAreas());
		return agca;
	}

	private static GradientColoredAreas getStateDefaultAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(gcas, "FFE680", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFE680", 60,
				LocationType.LOCATION_TYPE_ABSOLUTE_START);
		addGradientColoredArea(gcas, "FFFFFF", 61,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	public static AdaptedGradientColoredAreas getStateAdaptions() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(STATE_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getStateDefaultAreas());
		return agca;
	}

	private static GradientColoredAreas getVisualRestDefaultActionAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	private static GradientColoredAreas getVisualResPrimarySelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
		return gradientColoredAreas;
	}

	private static GradientColoredAreas getVisualRestSecondarySelectedAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
		return gradientColoredAreas;
	}

	private static GradientColoredAreas getVisualRestAllowedActionAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED);

		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(gcas, "E5F2FF", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "E5F2FF", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_END);

		return gradientColoredAreas;
	}

	private static GradientColoredAreas getVisualRestForbidddenActionAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN);

		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(gcas, "FF8F8F", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_START, "FF8F8F", 0,
				LocationType.LOCATION_TYPE_ABSOLUTE_END);

		return gradientColoredAreas;
	}

	public static AdaptedGradientColoredAreas getVisualRestAdaptions() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(VISUAL_REST_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getVisualRestDefaultActionAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getVisualResPrimarySelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getVisualRestSecondarySelectedAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED,
				getVisualRestAllowedActionAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN,
				getVisualRestForbidddenActionAreas());
		return agca;
	}
}
