package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;
import org.eclipse.ui.operations.IWorkbenchOperationSupport;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.Activator;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class DeleteResourceTypeFeature extends DefaultDeleteFeature {

	public DeleteResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canDelete(IDeleteContext context) {
		if (getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof ResourceType) {
			return true;
		}
		return super.canDelete(context);
	}

	protected Map<IFile, Diagram> getDiagrams() {
		Map<IFile, Diagram> result = new HashMap<IFile, Diagram>();
		Resource resource = getDiagram().eResource();

		URI uri = resource.getURI();
		URI uriTrimmed = uri.trimFragment();
		if (uriTrimmed.isPlatformResource()) {
			String platformString = uriTrimmed.toPlatformString(true);
			IResource fileResource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(platformString);
			if (fileResource != null) {
				IProject project = fileResource.getProject();

				List<IFile> files = new ArrayList<IFile>();
				files = ResourceUtil.getDiagramFiles(project, ".states");
				files.addAll(ResourceUtil.getDiagramFiles(project, ".methods"));

				final ResourceSet rSet = new ResourceSetImpl();
				for (IFile file : files) {
					Diagram d = ResourceUtil.getDiagramFromFile(file, rSet);
					if (d != null) {
						result.put(file, d);
					}
				}
			}
		}
		return result;
	}

	@Override
	public void preDelete(IDeleteContext context) {
		PictogramElement pe = ((IDeleteContext) context).getPictogramElement();
		ResourceType rt = (ResourceType) getBusinessObjectForPictogramElement(pe);

		Map<IFile, Diagram> diagrams = getDiagrams();
		List<IFile> filesToDelete = new ArrayList<IFile>();

		for (Map.Entry<IFile, Diagram> entry : diagrams.entrySet()) {
			Object diagramBo = getBusinessObjectForPictogramElement(entry
					.getValue());
			if (diagramBo instanceof ResourceType) {
				if (getFeatureProvider().getDiagramTypeProvider()
						.getCurrentToolBehaviorProvider()
						.equalsBusinessObjects(rt, diagramBo)) {
					// System.out.println( "Delete " + entry.getKey().toString()
					// );
					filesToDelete.add(entry.getKey());
				}
			}
		}

		if( filesToDelete.size() > 0 ) {
			IResource[] resourcesToDelete = filesToDelete.toArray(new IResource[0]);
			DeleteResourcesOperation op = new DeleteResourcesOperation(
					resourcesToDelete, "Delete Diagrams", true);
			IWorkbenchOperationSupport opSupport = Activator.getActivePage()
					.getWorkbenchWindow().getWorkbench().getOperationSupport();
			IUndoContext undoContext = opSupport.getUndoContext();
			op.addContext(undoContext);
			IOperationHistory operationHistory = OperationHistoryFactory
					.getOperationHistory();
			try {
				operationHistory.execute(op, null, null);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
