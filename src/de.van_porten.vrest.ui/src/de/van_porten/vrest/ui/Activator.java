package de.van_porten.vrest.ui;

/*import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.ui.editor.DiagramEditor;*/
import java.net.URL;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.van_porten.vrest.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);

		/* IAdapterManager manager = Platform.getAdapterManager();
		manager.registerAdapters(new ContentOutlinePageAdapterFactory(), DiagramEditor.class); */

		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		//	.put("rest", new XMIResourceFactoryImpl());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Returns the URL, which points to where this Plugin is installed.
	 *
	 * @return The URL, which points to where this Plugin is installed.
	 */
	public static URL getInstallURL() {
		return getDefault().getBundle().getEntry("/"); //$NON-NLS-1$
	}

	/**
	 * Returns the Plugin-ID.
	 *
	 * @return The Plugin-ID.
	 */
	public static String getID() {
		return getDefault().getBundle().getSymbolicName();
	}

	/**
	 * Returns the currently active WorkbenchPage.
	 *
	 * @return The currently active WorkbenchPage.
	 */
	public static IWorkbenchPage getActivePage() {
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (workbenchWindow != null)
			return workbenchWindow.getActivePage();
		return null;
	}

	/**
	 * Returns the currently active Shell.
	 *
	 * @return The currently active Shell.
	 */
	public static Shell getShell() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
	}
}
