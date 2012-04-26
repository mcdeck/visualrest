package de.van_porten.vrest.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.van_porten.vrest.ui.Activator;
import de.van_porten.vrest.ui.util.FileService;
import de.van_porten.vrest.ui.util.RestEditorConstants;

public class NewRestStructureDiagramWizard extends Wizard implements INewWizard {

	private NewRestStructureDiagramWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for NewRestStructureDiagramWizard.
	 */
	public NewRestStructureDiagramWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewRestStructureDiagramWizardPage(selection);
		addPage(page);
	}

	@Override
	public String getWindowTitle() {
		return "New Rest Structure Diagram";
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		String diagramTitle = page.getDiagramTitle();
		IFile diagramFile = page.createNewFile();
    	if (diagramFile == null) {
    		return false;
    	}

		final String diagramTypeId = RestEditorConstants.STRUCTURE_DIAGRAM_TYPE_ID;
		final String editorID = RestEditorConstants.STRUCTURE_DIAGRAM_EDITOR_ID;

		final Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				diagramTypeId, diagramTitle, true);
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath()
				.toString(), true);

		FileService.createEmfFileForDiagram(uri, diagram);
		final String providerId = GraphitiUi.getExtensionManager()
				.getDiagramTypeProviderId(diagram.getDiagramTypeId());
		final DiagramEditorInput editorInput = new DiagramEditorInput(
				EcoreUtil.getURI(diagram), providerId);

		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().openEditor(editorInput, editorID);
				} catch (PartInitException e) {
					String error = "Error while opening diagram editor";
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							error, e);
					ErrorDialog.openError(getShell(), "An error occured", null, status);
				}
			}
		});
		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 *
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}