package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.AbstractDrillDownFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.Activator;
import de.van_porten.vrest.ui.util.FileService;
import de.van_porten.vrest.ui.util.ResourceUtil;

public abstract class AbstractDrillDownResourceTypeFeature extends
		AbstractDrillDownFeature {

	public AbstractDrillDownResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public final boolean canExecute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof ResourceType) {
				return true;
			}
		}
		return false;
	}

	@Override
	public final void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		Resource resource = getDiagram().eResource();
		URI uri = resource.getURI();

		final IDiagramEditor editor = getDiagramEditor();
		if (editor.isDirty()) {
			/* if (editor instanceof DiagramEditor) {
				MessageBox messageBox = new MessageBox(Activator.getShell(),
						SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
				messageBox
						.setMessage("The diagram needs to be saved before you can continue.");
				messageBox.setText("Save diagram now?");
				int rv = messageBox.open();
				if (rv == SWT.OK) {
					PlatformUI.getWorkbench().saveAllEditors(false);
				} else {
					return;
				}
			} else { */
				MessageBox messageBox = new MessageBox(Activator.getShell(),
						SWT.ICON_ERROR | SWT.OK);
				messageBox
						.setMessage("The diagram needs to be saved before you can continue.");
				messageBox.setText("Please save the diagram first");
				messageBox.open();
				return;
			//}
		}

		Collection<Diagram> diagrams = getLinkedDiagrams(pes[0]);
		final ResourceType rt = (ResourceType) getBusinessObjectForPictogramElement(pes[0]);
		if (diagrams.size() == 0) {
			final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
					.getRoot();
			IResource diagramFile = workspaceRoot.findMember(uri
					.toPlatformString(true));
			String drillDownFileName = getDrillDownFilename(rt);

			String path = diagramFile.getProject().getFile(drillDownFileName)
					.getFullPath().toPortableString();
			URI platUri = URI.createPlatformResourceURI(path, true);
			IResource fileResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(platUri.toPlatformString(true));

			if (fileResource == null) {
				createNewDiagram(rt, platUri);
			}
		} else {
			// for (Diagram diagram : diagrams) {
			// diagram.setName(createDiagramName(rt));
			// }
		}
		super.execute(context);
	}

	protected abstract String getDrillDownFilename(
			final ResourceType resourceType);

	protected abstract void addDiagramContent(final Diagram diagram,
			final ResourceType resourceType);

	protected final Diagram createNewDiagram(final ResourceType rt,
			final URI platUri) {
		String diagramTypeId = getDiagramTypeId();
		String diagramName = createDiagramName(rt);

		final Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				diagramTypeId, diagramName, true);

		final TransactionalEditingDomain editingDomain = FileService
				.createEmfFileForDiagram(platUri, diagram);

		editingDomain.getCommandStack().execute(
				new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						addDiagramContent(diagram, rt);
					}
				});

		FileService.save(editingDomain,
				Collections.<Resource, Map<?, ?>> emptyMap());

		return diagram;
	}

	protected abstract String createDiagramName(final ResourceType rt);

	protected abstract String getDiagramTypeId();

	@Override
	protected abstract String getDiagramEditorId(Diagram diagram);

	@Override
	public abstract String getName();

	@Override
	public abstract String getDescription();

	@Override
	public abstract String getImageId();

	@Override
	protected final Collection<Diagram> getDiagrams() {
		Collection<Diagram> result = Collections.emptyList();
		Resource resource = getDiagram().eResource();

		URI uri = resource.getURI();
		URI uriTrimmed = uri.trimFragment();
		if (uriTrimmed.isPlatformResource()) {
			String platformString = uriTrimmed.toPlatformString(true);
			IResource fileResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(platformString);
			if (fileResource != null) {
				IProject project = fileResource.getProject();
				result = ResourceUtil.getDiagrams(project,
						getDiagramFileExtension());
			}
		}
		return result;
	}

	protected abstract String getDiagramFileExtension();

}
