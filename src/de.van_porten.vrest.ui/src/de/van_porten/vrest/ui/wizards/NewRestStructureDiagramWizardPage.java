package de.van_porten.vrest.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (structure).
 */

public class NewRestStructureDiagramWizardPage extends WizardNewFileCreationPage {

	public NewRestStructureDiagramWizardPage(ISelection selection) {
		super("wizardPage", (IStructuredSelection) selection);
		setTitle("Structure Diagram");
		setDescription("Create a new structure diagram");
		setFileExtension("structure");
		setFileName(getDefaultDiagramFilename());
	}

	private String getDefaultDiagramTitle() {
		return "New REST Structure Diagram";
	}

	private String getDefaultDiagramFilename() {
		return "new_diagram.structure";
	}

	private String getDiagramFilename() {
		return getDefaultDiagramFilename();
		//return diagramFilenameText.getText();
	}

	public String getDiagramTitle() {
		return getDefaultDiagramTitle();
		//return diagramTitleText.getText();
	}


//	protected void updatePageComplete() {
//		String diagramTitle = getDiagramTitle();
//		if( diagramTitle != null && diagramTitle.length() > 0 ) {
//			setPageComplete(true);
//			setErrorMessage(null);
//		} else {
//			setPageComplete(false);
//			setErrorMessage("The diagram title must not be empty");
//			return;
//		}
//
//		String diagramFilename = getDiagramTitle();
//		if( diagramFilename != null && diagramFilename.length() > 0 ) {
//
//
//			setPageComplete(true);
//			setErrorMessage(null);
//		} else {
//			setPageComplete(false);
//			setErrorMessage("The diagram filename must not be empty");
//			return;
//		}
//	}
}
