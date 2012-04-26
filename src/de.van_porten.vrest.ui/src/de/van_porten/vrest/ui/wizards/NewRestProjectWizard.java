package de.van_porten.vrest.ui.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.ui.RestProjectNature;
import de.van_porten.vrest.ui.util.ResourceLocationFactory;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class NewRestProjectWizard extends BasicNewProjectResourceWizard {

	private NewRestProjectWizardPage page;

	@Override
	public void addPages() {
		super.addPages();

		page = new NewRestProjectWizardPage("wizardPage");
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		if (!super.performFinish())
			return false;

		IProject project = getNewProject();
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = RestProjectNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

			createPredefinedContent(project);

			String pathToModelFile = project
					.getFile(ResourceLocationFactory.getRestApplicationModelFilename())
					.getFullPath().toPortableString();
			URI uri = URI.createPlatformResourceURI(pathToModelFile, true);
			ResourceSet resourceSet = new ResourceSetImpl();

			RestApplicationModel appModel = ResourceUtil
					.createInitialApplicationModel();
			ResourceUtil.initializeRestApplicationModelFile(resourceSet, uri,
					appModel);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

	private void createPredefinedContent(IProject project) throws CoreException {
		String[] paths = {
				ResourceLocationFactory.getRestStructureBaseLocation(),
				ResourceLocationFactory.getRestResourceStateBaseLocation(),
				ResourceLocationFactory.getRestResourceMethodsBaseLocation() };
		addToProjectStructure(project, paths);
	}

	private void addToProjectStructure(IProject newProject, String[] paths)
			throws CoreException {
		for (String path : paths) {
			IFolder etcFolders = newProject.getFolder(path);
			createFolder(etcFolders);
		}
	}

	private void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

}