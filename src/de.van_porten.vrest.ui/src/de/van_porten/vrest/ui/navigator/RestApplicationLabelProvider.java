/**
 *
 */
package de.van_porten.vrest.ui.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

import de.van_porten.vrest.ui.diagram.RestModelLabelFactory;
import de.van_porten.vrest.ui.navigator.nodes.IRestModelContainer;
import de.van_porten.vrest.ui.navigator.nodes.IRestNamedElement;

/**
 * @author porten
 *
 */
public final class RestApplicationLabelProvider implements ILabelProvider {

	private RestModelLabelFactory labelFactory = null;

	public RestApplicationLabelProvider() {
		labelFactory = new RestModelLabelFactory();
	}

	@Override
	public Image getImage(Object element) {
		if( element instanceof IRestModelContainer ) {
			return labelFactory.getImage(((IRestModelContainer) element).getModel());
		} else if( element instanceof IRestNamedElement ) {
			return labelFactory.createImageForKey( ((IRestNamedElement) element).getImagePath() );
		} else if( element instanceof IFile ) {
			String filename = ((IFile) element).getName();
			Image fileImage = PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(filename).createImage();
			return fileImage;
		}
		return labelFactory.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if( element instanceof IRestModelContainer ) {
			return labelFactory.getText(((IRestModelContainer) element).getModel());
		} else if( element instanceof IRestNamedElement ) {
			return ((IRestNamedElement) element).getName();
		}
		return labelFactory.getText(element);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
	 * jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang
	 * .Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * .jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}
}
