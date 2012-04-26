package de.van_porten.vrest.ui.navigator.nodes;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.ui.platform.IImageProvider;

import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.util.ResourceLocationFactory;
import de.van_porten.vrest.ui.util.ResourceNameFactory;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class RestDiagramsTreeParentNode extends RestFolderTreeNode {

	private static final IImageProvider imageProvider = new RestImageProvider();
	private EList<RestFolderTreeNode> children;
	private IProject project;

	private RestFolderTreeNode structureFolder = null;
	private RestFolderTreeNode statesFolder = null;
	private RestFolderTreeNode methodsFolder = null;

	public RestDiagramsTreeParentNode(IProject project) {
		super("Diagrams", null, project, null);

		this.project = project;

		createChildren();
		refreshChildren();
	}

	private void createChildren() {
		children = new BasicEList<RestFolderTreeNode>();

		String folderPicture = imageProvider
				.getImageFilePath(RestImageProvider.IMG_MISC_FOLDER);
		setImagePath(folderPicture);

		IFolder baseFolder = project.getFolder(ResourceLocationFactory
				.getRestStructureBaseLocation());
		structureFolder = new RestFolderTreeNode("Structure", folderPicture, baseFolder, null);
		children.add(structureFolder);

		baseFolder = project.getFolder(ResourceLocationFactory
				.getRestResourceStateBaseLocation());
		statesFolder = new RestFolderTreeNode("States", folderPicture, baseFolder, null);
		children.add(statesFolder);

		baseFolder = project.getFolder(ResourceLocationFactory
				.getRestResourceMethodsBaseLocation());
		methodsFolder = new RestFolderTreeNode("Methods", folderPicture, baseFolder, null);
		children.add(methodsFolder);
	}

	public void refreshChildren() {
		IFolder baseFolder = project.getFolder(ResourceLocationFactory
				.getRestStructureBaseLocation());
		List<IFile> files = ResourceUtil.getDiagramFiles(baseFolder,
				ResourceNameFactory.getStructureDiagramExtension());
		EList<IFile> eFiles = new BasicEList<IFile>(files);
		structureFolder.setChildren(eFiles);

		baseFolder = project.getFolder(ResourceLocationFactory
				.getRestResourceStateBaseLocation());
		files = ResourceUtil.getDiagramFiles(baseFolder,
				ResourceNameFactory.getStateDiagramExtension());
		eFiles = new BasicEList<IFile>(files);
		statesFolder.setChildren(eFiles);

		baseFolder = project.getFolder(ResourceLocationFactory
				.getRestResourceMethodsBaseLocation());
		files = ResourceUtil.getDiagramFiles(baseFolder,
				ResourceNameFactory.getMethodDiagramExtension());
		eFiles = new BasicEList<IFile>(files);
		methodsFolder.setChildren(eFiles);
	}
}
