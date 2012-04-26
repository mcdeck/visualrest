package de.van_porten.vrest.ui.diagram.state;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.ui.diagram.common.CommonFeatureProvider;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.DrillDownResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.state.state.AddStateFeature;
import de.van_porten.vrest.ui.diagram.state.state.CreateStateFeature;
import de.van_porten.vrest.ui.diagram.state.state.LayoutStateFeature;
import de.van_porten.vrest.ui.diagram.state.state.UpdateStateFeature;
import de.van_porten.vrest.ui.diagram.state.transition.AddTransitionFeature;
import de.van_porten.vrest.ui.diagram.state.transition.CreateTransitionFeature;
import de.van_porten.vrest.ui.diagram.state.transition.UpdateTransitionFeature;

public class RestResourceStatesFeatureProvider extends CommonFeatureProvider {

	public RestResourceStatesFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// is object for add request a EClass?
		if (context.getNewObject() instanceof State) {
			return new AddStateFeature(this);
		} else if (context.getNewObject() instanceof Transition) {
			return new AddTransitionFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CreateStateFeature(this) };
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof State) {
			return new UpdateStateFeature(this);
		} else if (bo instanceof Transition) {
			return new UpdateTransitionFeature(this);
		}

		return super.getUpdateFeature(context);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		return super.getRemoveFeature(context);
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		return super.getDeleteFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		return super.getMoveShapeFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		return super.getResizeShapeFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject bo = Graphiti.getLinkService()
				.getBusinessObjectForLinkedPictogramElement(pe);
		if (bo instanceof State) {
			return new LayoutStateFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] {
				new DrillDownResourceTypeFeature(this)
		};
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { new CreateTransitionFeature(
				this) };
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		return getCreateConnectionFeatures();
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(
			IDirectEditingContext context) {
		return super.getDirectEditingFeature(context);
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return super.getCopyFeature(context);
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return super.getPasteFeature(context);
	}

}
