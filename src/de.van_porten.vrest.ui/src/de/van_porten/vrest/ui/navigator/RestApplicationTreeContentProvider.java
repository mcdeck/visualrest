/**
 *
 */
package de.van_porten.vrest.ui.navigator;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import de.van_porten.vrest.ui.Activator;
import de.van_porten.vrest.ui.navigator.nodes.IRestTreeNode;
import de.van_porten.vrest.ui.navigator.nodes.RestDiagramsTreeParentNode;
import de.van_porten.vrest.ui.navigator.nodes.RestModelTreeParentNode;

/**
 * @author porten
 *
 */
public class RestApplicationTreeContentProvider implements
		ITreeContentProvider, IResourceChangeListener {

	private Viewer viewer;

	public RestApplicationTreeContentProvider() {
		Activator.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.POST_CHANGE);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		Activator.getWorkspace().removeResourceChangeListener(this);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}

	private Viewer getViewer() {
		return this.viewer;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.
	 * Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	private Map<IProject, RestDiagramsTreeParentNode> diagramsParentNodes = null;
	private Map<IProject, RestModelTreeParentNode> modelParentNodes = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			Vector<Object> rv = new Vector<Object>();

			// TODO: Add check for project nature
			// Maybe done in plugin.xml?!
			IProject project = (IProject) parentElement;

			/* RestDiagramsTreeParentNode diagramsParentNode = null;
			if( diagramsParentNodes == null ) {
				diagramsParentNodes = new HashMap<IProject, RestDiagramsTreeParentNode>();
			}
			if( !diagramsParentNodes.containsKey(project) ) {
				diagramsParentNode = new RestDiagramsTreeParentNode(project);
				diagramsParentNodes.put(project, diagramsParentNode);
			} else {
				diagramsParentNode = diagramsParentNodes.get(project);
				diagramsParentNode.refreshChildren();
			}
			rv.add(diagramsParentNode); */

			RestModelTreeParentNode modelParentNode = null;
			if( modelParentNodes == null ) {
				modelParentNodes = new HashMap<IProject, RestModelTreeParentNode>();
			}
			if( !modelParentNodes.containsKey(project) ) {
				modelParentNode = new RestModelTreeParentNode(project);
				modelParentNodes.put(project, modelParentNode);
			} else {
				modelParentNode = modelParentNodes.get(project);
				modelParentNode.refreshChildren();
			}
			rv.add(modelParentNode);

			return rv.toArray();
		} else if (parentElement instanceof IRestTreeNode) {
			return ((IRestTreeNode) parentElement).getChildren();
		} else if (parentElement instanceof EObject) {
			return ((EObject) parentElement).eContents().toArray();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object
	 * )
	 */
	@Override
	public Object getParent(Object element) {
		if( element instanceof IRestTreeNode ) {
			return ((IRestTreeNode) element).getParent();
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IRestTreeNode) {
			return ((IRestTreeNode) element).hasChildren();
		} else if (element instanceof EObject) {
			// This has to be the last query!
			return ((EObject) element).eContents().size() > 0;
		}
		return false;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
				IResourceDelta rootDelta = event.getDelta();
				rootDelta.accept(new IResourceDeltaVisitor() {
					@Override
					public boolean visit(IResourceDelta delta)
							throws CoreException {
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								if (getViewer() instanceof TreeViewer) {
									TreeViewer viewer = ((TreeViewer) getViewer());
									Object[] expandedElements = viewer
											.getExpandedElements();
									TreePath[] treePaths = viewer
											.getExpandedTreePaths();
									viewer.refresh();
									viewer.setExpandedElements(expandedElements);
									viewer.setExpandedTreePaths(treePaths);
								}
							}
						});
						return false;
					}
				});
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

}
