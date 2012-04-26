package de.van_porten.vrest.ui.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestFactory;
import de.van_porten.vrest.core.model.restbehavior.OpType;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.PrimitiveDataType;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;

public class ResourceUtil {
	public static Collection<Diagram> getDiagrams(IProject p,
			String diagramExtension) {
		final List<IFile> files = getDiagramFiles(p, diagramExtension);
		final List<Diagram> diagramList = new ArrayList<Diagram>();
		final ResourceSet rSet = new ResourceSetImpl();
		for (final IFile file : files) {
			final Diagram diagram = getDiagramFromFile(file, rSet);
			if (diagram != null) {
				diagramList.add(diagram);
			}
		}
		return diagramList;
	}

	public static List<IFile> getDiagramFiles(IContainer folder,
			String diagramExtension) {
		final List<IFile> ret = new ArrayList<IFile>();
		try {
			final IResource[] members = folder.members();
			for (final IResource resource : members) {
				if (resource instanceof IContainer) {
					ret.addAll(getDiagramFiles((IContainer) resource,
							diagramExtension));
				} else if (resource instanceof IFile) {
					final IFile file = (IFile) resource;
					if (file.getName().endsWith(diagramExtension)) { //$NON-NLS-1$
						ret.add(file);
					}
				}
			}
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static Diagram getDiagramFromFile(IFile file, ResourceSet resourceSet) {
		// Get the URI of the model file.
		final URI resourceURI = getFileURI(file, resourceSet);
		// Demand load the resource for this file.
		Resource resource;
		try {
			resource = resourceSet.getResource(resourceURI, true);
			if (resource != null) {
				// does resource contain a diagram as root object?
				final EList<EObject> contents = resource.getContents();
				for (final EObject object : contents) {
					if (object instanceof Diagram) {
						return (Diagram) object;
					}
				}
			}
		} catch (final WrappedException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static URI getFileURI(IFile file, ResourceSet resourceSet) {
		final String pathName = file.getFullPath().toString();
		URI resourceURI = URI.createPlatformResourceURI(pathName, true);
		resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
		return resourceURI;
	}

	public static Resource initializeRestApplicationModelFile(
			ResourceSet resourceSet, URI uri, RestApplicationModel appModel)
			throws CoreException, IOException {
		registerRestApplicationModelExtension(resourceSet);

		Resource createResource = resourceSet.createResource(uri);
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResource.OPTION_ENCODING, "UTF8");

		createResource.getContents().add(appModel);
		createResource.setTrackingModification(true);
		createResource.save(options);

		return createResource;
	}

	private static void registerRestApplicationModelExtension(
			ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("rest", new XMIResourceFactoryImpl());
	}

	public static IResource getResourceForDiagram(
			final IWorkspaceRoot workspaceRoot, Diagram d) {
		URI diagURI = d.eResource().getURI();
		return workspaceRoot.findMember(diagURI.toPlatformString(true));
	}

	public static final RestApplicationModel createInitialApplicationModel() {
		RestApplicationModel appModel = RestFactory.eINSTANCE
				.createRestApplicationModel();
		appModel.setName("RESTful Application");

		MethodType methodType = RestStructureFactory.eINSTANCE
				.createMethodType();
		methodType.setName("POST");
		appModel.getMethodTypes().add(methodType);
		methodType = RestStructureFactory.eINSTANCE.createMethodType();
		methodType.setName("GET");
		appModel.getMethodTypes().add(methodType);
		methodType = RestStructureFactory.eINSTANCE.createMethodType();
		methodType.setName("PUT");
		appModel.getMethodTypes().add(methodType);
		methodType = RestStructureFactory.eINSTANCE.createMethodType();
		methodType.setName("DELETE");
		appModel.getMethodTypes().add(methodType);


		PrimitiveDataType stringDataType = RestStructureFactory.eINSTANCE.createPrimitiveDataType();
		stringDataType.setName("string");
		appModel.getDataTypes().add(stringDataType);

		PrimitiveDataType booleanDataType = RestStructureFactory.eINSTANCE.createPrimitiveDataType();
		booleanDataType.setName("boolean");
		appModel.getDataTypes().add(booleanDataType);
		PrimitiveDataType fileDataType = RestStructureFactory.eINSTANCE.createPrimitiveDataType();
		fileDataType.setName("file");
		appModel.getDataTypes().add(fileDataType);
		PrimitiveDataType intDataType = RestStructureFactory.eINSTANCE.createPrimitiveDataType();
		intDataType.setName("int");
		appModel.getDataTypes().add(intDataType);

		MediaType atomMediaType = RestStructureFactory.eINSTANCE.createMediaType();
		atomMediaType.setName("atom+entry");
		appModel.getMediaTypes().add(atomMediaType);

		MediaType suggestionMediaType = RestStructureFactory.eINSTANCE.createMediaType();
		suggestionMediaType.setName("suggestion");
		MediaTypeElement mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("positiveReviews");
		mediaTypeElement.setMtelemType(intDataType);
		suggestionMediaType.getContainedMTElements().add(mediaTypeElement);
		mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("negativeReviews");
		mediaTypeElement.setMtelemType(intDataType);
		suggestionMediaType.getContainedMTElements().add(mediaTypeElement);
		mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("statement");
		mediaTypeElement.setMtelemType(stringDataType);
		suggestionMediaType.getContainedMTElements().add(mediaTypeElement);
		mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("status");
		mediaTypeElement.setMtelemType(stringDataType);
		suggestionMediaType.getContainedMTElements().add(mediaTypeElement);
		appModel.getMediaTypes().add(suggestionMediaType);

		MediaType reviewMediaType = RestStructureFactory.eINSTANCE.createMediaType();
		reviewMediaType.setName("review");
		mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("accepted");
		mediaTypeElement.setMtelemType(booleanDataType);
		reviewMediaType.getContainedMTElements().add(mediaTypeElement);
		appModel.getMediaTypes().add(reviewMediaType);

		MediaType pngMediaType = RestStructureFactory.eINSTANCE.createMediaType();
		pngMediaType.setName("img/png");
		mediaTypeElement = RestStructureFactory.eINSTANCE.createMediaTypeElement();
		mediaTypeElement.setName("binaryData");
		mediaTypeElement.setMtelemType(fileDataType);
		pngMediaType.getContainedMTElements().add(mediaTypeElement);
		appModel.getMediaTypes().add(pngMediaType);

		return appModel;
	}

	public static void saveToModelFile(final EObject obj, final Diagram d)
			throws CoreException, IOException {
		ResourceSet resourceSet = d.eResource().getResourceSet();
		final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IResource diagramFile = getResourceForDiagram(workspaceRoot, d);

		String path = diagramFile
				.getProject()
				.getFile(
						ResourceLocationFactory
								.getRestApplicationModelFilename())
				.getFullPath().toPortableString();
		URI uri = URI.createPlatformResourceURI(path, true);

		registerRestApplicationModelExtension(resourceSet);

		IResource file = workspaceRoot.findMember(uri.toPlatformString(true));

		RestApplicationModel m = null;
		if (file == null || !file.exists()) {
			if (obj instanceof RestApplicationModel) {
				m = (RestApplicationModel) obj;
			} else {
				m = createInitialApplicationModel();
			}
			initializeRestApplicationModelFile(resourceSet, uri, m);
		} else {
			final Resource resource = resourceSet.getResource(uri, true);
			m = (RestApplicationModel) resource.getContents().get(0);
		}

		if (obj instanceof ResourceType) {
			m.getResourceTypes().add((ResourceType) obj);
		} else if (obj instanceof MethodType) {
			m.getMethodTypes().add((MethodType) obj);
		} else if (obj instanceof DataType) {
			m.getDataTypes().add((DataType) obj);
		} else if (obj instanceof MediaType) {
			m.getMediaTypes().add((MediaType) obj);
		} else if (obj instanceof RelationType) {
			m.getRelTypes().add((RelationType) obj);
		} else if (obj instanceof OpType) {
			m.getOptypes().add((OpType) obj);
		}
	}
}
