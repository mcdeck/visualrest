package de.van_porten.vrest.ui.diagram.method;

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
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.CreateAction;
import de.van_porten.vrest.core.model.restbehavior.ListAddAction;
import de.van_porten.vrest.core.model.restbehavior.ListRemoveAction;
import de.van_porten.vrest.core.model.restbehavior.MessageAction;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.core.model.restbehavior.StatusCode;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.diagram.common.CommonFeatureProvider;
import de.van_porten.vrest.ui.diagram.common.DummyConnection;
import de.van_porten.vrest.ui.diagram.method.action.MoveActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.conditionalaction.AddConditionalActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.conditionalaction.CreateConditionalActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.conditionalaction.LayoutConditionalActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.createaction.AddCreateActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.createaction.CreateCreateActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.createaction.LayoutCreateActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listaddaction.AddListAddActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listaddaction.CreateListAddActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listaddaction.LayoutListAddActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listremoveaction.AddListRemoveActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listremoveaction.CreateListRemoveActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.listremoveaction.LayoutListRemoveActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.messageaction.AddMessageActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.messageaction.CreateMessageActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.messageaction.LayoutMessageActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.returnaction.AddReturnActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.returnaction.CreateReturnActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.returnaction.LayoutReturnActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.returnaction.UpdateReturnActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.updateaction.AddUpdateActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.updateaction.CreateUpdateActionFeature;
import de.van_porten.vrest.ui.diagram.method.action.updateaction.LayoutUpdateActionFeature;
import de.van_porten.vrest.ui.diagram.method.actionsequence.AddActionSequenceFeature;
import de.van_porten.vrest.ui.diagram.method.actionsequence.AddSequenceConnectionFeature;
import de.van_porten.vrest.ui.diagram.method.actionsequence.CreateSequenceConnectionFeature;
import de.van_porten.vrest.ui.diagram.method.method.AddMethodFeature;
import de.van_porten.vrest.ui.diagram.method.method.CreateMethodFeature;
import de.van_porten.vrest.ui.diagram.method.method.LayoutMethodFeature;
import de.van_porten.vrest.ui.diagram.method.method.UpdateMethodFeature;
import de.van_porten.vrest.ui.diagram.method.statuscode.UpdateStatusCodeFeature;

public class RestMethodBehaviourFeatureProvider extends CommonFeatureProvider {

	public RestMethodBehaviourFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object addedClass = context.getNewObject();
		if (addedClass instanceof Method) {
			return new AddMethodFeature(this);
		} else if (addedClass instanceof ReturnAction) {
			return new AddReturnActionFeature(this);
		} else if (addedClass instanceof ListAddAction) {
			return new AddListAddActionFeature(this);
		} else if (addedClass instanceof ListRemoveAction) {
			return new AddListRemoveActionFeature(this);
		} else if (addedClass instanceof CreateAction) {
			return new AddCreateActionFeature(this);
		} else if (addedClass instanceof MessageAction) {
			return new AddMessageActionFeature(this);
		} else if (addedClass instanceof UpdateAction) {
			return new AddUpdateActionFeature(this);
		} else if (addedClass instanceof ConditionalAction) {
			return new AddConditionalActionFeature(this);
		} else if (addedClass instanceof ActionSequence) {
			/* use helper feature to add its contents to the diagram */
			return new AddActionSequenceFeature(this);
		} else if(addedClass instanceof DummyConnection ) {
			return new AddSequenceConnectionFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CreateMethodFeature(this),
				new CreateReturnActionFeature(this),
				new CreateListAddActionFeature(this),
				new CreateListRemoveActionFeature(this),
				new CreateCreateActionFeature(this),
				new CreateMessageActionFeature(this),
				new CreateUpdateActionFeature(this),
				new CreateConditionalActionFeature(this) };
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Method) {
			return new UpdateMethodFeature(this);
		} else if (bo instanceof ReturnAction) {
			return new UpdateReturnActionFeature(this);
		} else if (bo instanceof StatusCode) {
			return new UpdateStatusCodeFeature(this);
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
		Shape shape = context.getShape();
        Object bo = getBusinessObjectForPictogramElement(shape);
        if (bo instanceof Action) {
            return new MoveActionFeature(this);
        }
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
		if (bo instanceof Method) {
			return new LayoutMethodFeature(this);
		} else if (bo instanceof MessageAction) {
			return new LayoutMessageActionFeature(this);
		} else if (bo instanceof CreateAction) {
			return new LayoutCreateActionFeature(this);
		} else if (bo instanceof UpdateAction) {
			return new LayoutUpdateActionFeature(this);
		} else if (bo instanceof ListAddAction) {
			return new LayoutListAddActionFeature(this);
		} else if (bo instanceof ListRemoveAction) {
			return new LayoutListRemoveActionFeature(this);
		} else if (bo instanceof ReturnAction) {
			return new LayoutReturnActionFeature(this);
		} else if (bo instanceof ConditionalAction) {
			return new LayoutConditionalActionFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] {};
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
				new CreateSequenceConnectionFeature(this)
		};
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
