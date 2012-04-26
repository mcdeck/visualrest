package de.van_porten.vrest.ui.util;

public class ResourceLocationFactory {

	public static final String getRestStructureBaseLocation() {
		return "/diagrams/structure";
	}

	public static final String getRestStructureDiagramLocation( String diagramName ) {
		return getRestStructureBaseLocation() + "/" + diagramName;
	}

	public static final String getRestResourceStateBaseLocation() {
		return "/diagrams/states";
	}

	public static final String getRestResourceStateDiagramLocation( String diagramName ) {
		return getRestResourceStateBaseLocation() + "/" + diagramName;
	}

	public static final String getRestResourceMethodsBaseLocation() {
		return "/diagrams/methods";
	}

	public static final String getRestResourceMethodsDiagramLocation( String diagramName ) {
		return getRestResourceMethodsBaseLocation() + "/" + diagramName;
	}

	public static final String getRestApplicationModelFilename() {
		/* replace with "application_name" property once implemented */
		return "/myApplication.rest";
	}
}
