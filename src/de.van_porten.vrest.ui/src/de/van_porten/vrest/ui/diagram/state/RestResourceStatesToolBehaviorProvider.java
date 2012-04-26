package de.van_porten.vrest.ui.diagram.state;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;

import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.CommonToolBehaviourProvider;
import de.van_porten.vrest.ui.diagram.state.transition.CreateTransitionFeature;

public class RestResourceStatesToolBehaviorProvider extends
	CommonToolBehaviourProvider {

	public RestResourceStatesToolBehaviorProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();

		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry ceResources = new PaletteCompartmentEntry(
				"States", RestImageProvider.IMG_STATES_COMPARTMENT_STATES);
		ret.add(ceResources);

		PaletteCompartmentEntry ceConnections = new PaletteCompartmentEntry(
				"Connections", RestImageProvider.IMG_STATES_COMPARTMENT_CONNECTIONS);
		ret.add(ceConnections);

		// add all create-features to the new stack-entry
		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			ceResources.addToolEntry(objectCreationToolEntry);
		}

		// add all create-connection-features to the new stack-entry
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider
				.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			ceConnections.addToolEntry(connectionCreationToolEntry);
		}

		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);

		if( data != null ) {
			// we have some initial context button pad we can add to ...

			PictogramElement pe = context.getPictogramElement();

			// 1. set the generic context buttons
			// note, that we do not add 'remove' (just as an example)
			setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE
					| CONTEXT_BUTTON_REMOVE | CONTEXT_BUTTON_UPDATE);

			// 2. set the collapse button
			// simply use a dummy custom feature (senseless example)
			/*CustomContext cc = new CustomContext(new PictogramElement[] { pe });
			ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
			for (int i = 0; i < cf.length; i++) {
				ICustomFeature iCustomFeature = cf[i];
				if (iCustomFeature instanceof CollapseResourceTypeFeature) {
					IContextButtonEntry collapseButton = ContextEntryHelper
							.createCollapseContextButton(true, iCustomFeature, cc);
					data.setCollapseContextButton(collapseButton);
					break;
				}
			}*/

			// 3. add one domain specific context-button, which offers all
			// available connection-features as drag&drop features...

			// 3.a. create new CreateConnectionContext
			CreateConnectionContext ccc = new CreateConnectionContext();
			ccc.setSourcePictogramElement(pe);
			Anchor anchor = null;
			if (pe instanceof Anchor) {
				anchor = (Anchor) pe;
			} else if (pe instanceof AnchorContainer) {
				// assume, that our shapes always have chopbox anchors
				anchor = Graphiti.getPeService().getChopboxAnchor(
						(AnchorContainer) pe);
			}
			ccc.setSourceAnchor(anchor);

			// 3.b. create context button and add all applicable features
			ContextButtonEntry button = new ContextButtonEntry(null, context);
			button.setText("Create Transition");
			button.setIconId(RestImageProvider.IMG_STATES_TRANSITION);

			ICreateConnectionFeature feature = new CreateTransitionFeature(getFeatureProvider());
			if (feature.isAvailable(ccc) && feature.canStartConnection(ccc)) {
				button.addDragAndDropFeature(feature);
			}

			// 3.c. add context button, if it contains at least one feature
			if (button.getDragAndDropFeatures().size() > 0) {
				data.getDomainSpecificContextButtons().add(button);
			}
		}
		return data;
	}

	@Override
	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
		ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
		subMenu.setSubmenu(false);

		ICustomFeature[] customFeatures = getFeatureProvider()
				.getCustomFeatures(context);
		for (int i = 0; i < customFeatures.length; i++) {
			ICustomFeature customFeature = customFeatures[i];
			if (customFeature.isAvailable(context)) {
				ContextMenuEntry menuEntry = new ContextMenuEntry(
						customFeature, context);
				subMenu.add(menuEntry);
			}
		}

		IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
		return ret;
	}
}
