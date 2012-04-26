package de.van_porten.vrest.ui.navigator.nodes;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.ISharedImages;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.ui.util.ResourceLocationFactory;

public class RestModelTreeParentNode extends RestFolderTreeNode {

	private RestApplicationModelTreeNode modelContainer = null;

	private EList<RestApplicationModelTreeNode> children;
	private IProject project;

	public RestModelTreeParentNode(IProject project) {
		super("Model", null, project, null);

		this.project = project;

		String folderPicture = ISharedImages.IMG_OBJ_FOLDER;
		setImagePath(folderPicture);

		refreshChildren();
	}

	public void refreshChildren() {
		IFile restModelFile = project.getFile(ResourceLocationFactory
				.getRestApplicationModelFilename());

		if( restModelFile == null || !restModelFile.exists() ) {
			setChildren(null);
			return;
		}

		ResourceSet rset = new ResourceSetImpl();
		Resource resource = rset.createResource(URI
				.createPlatformResourceURI(restModelFile.getFullPath()
						.toPortableString(), true));

		try {
			resource.load(null);
			EList<EObject> contents = resource.getContents();
			if (contents.size() == 1
					&& contents.get(0) instanceof RestApplicationModel) {
				RestApplicationModel model = (RestApplicationModel) contents
						.get(0);
				if (modelContainer == null) {
					modelContainer = new RestApplicationModelTreeNode(model);
				} else {
					modelContainer.setModel(model);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		children = new BasicEList<RestApplicationModelTreeNode>();
		children.add(modelContainer);
		setChildren(children);
	}
}
