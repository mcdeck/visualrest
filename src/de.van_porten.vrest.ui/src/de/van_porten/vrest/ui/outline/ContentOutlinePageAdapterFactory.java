package de.van_porten.vrest.ui.outline;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class ContentOutlinePageAdapterFactory implements IAdapterFactory {

	private static final Class<?>[] ADAPTERS = new Class[] { IContentOutlinePage.class };

	@Override
	public Object getAdapter(Object adaptableObject,
			@SuppressWarnings("rawtypes") Class adapterType) {

		if (IContentOutlinePage.class.equals(adapterType)) {
			if (adaptableObject instanceof DiagramEditor) {
				DiagramEditor diagramEditor = (DiagramEditor) adaptableObject;
				DiagramOutlinePage outlinePage = new DiagramOutlinePage(diagramEditor);
				return outlinePage;
			}
		}
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return ADAPTERS;
	}
}
