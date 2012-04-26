package de.van_porten.vrest.ui.diagram.method.action;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.reststructure.Method;

public class MoveActionFeature extends DefaultMoveShapeFeature {
	public MoveActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		return context.getTargetContainer() instanceof ContainerShape
				&& (ActionUtil.targetIsMethod(context) || ActionUtil
						.targetIsConditionalAction(context));
	}

	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		super.postMoveShape(context);

		if (!context.getSourceContainer().equals(context.getTargetContainer())) {
			Object instance = getBusinessObjectForPictogramElement(context
					.getShape());

			ContainerShape sourceContainer = context.getSourceContainer();
			ContainerShape targetContainer = context.getTargetContainer();
			Object source = getBusinessObjectForPictogramElement(sourceContainer);
			Object target = getBusinessObjectForPictogramElement(targetContainer);

			if (!targetContainer.eContents().contains(context.getShape())) {
				targetContainer.eContents().add(context.getShape());
			}

			if (sourceContainer.eContents().contains(context.getShape())) {
				sourceContainer.eContents().remove(context.getShape());
			}

			if (instance instanceof Action) {
				if (source instanceof Method) {
					Action internalAction = ((Method) source)
							.getMethodbehavior().getAction();
					if (internalAction instanceof ActionSequence) {
						if (((ActionSequence) internalAction)
								.getActionelements().contains(instance)) {
							((ActionSequence) internalAction)
									.getActionelements().remove(instance);
						}
					} else {
						((Method) source).getMethodbehavior().setAction(null);
					}
				} else if (source instanceof ConditionalAction) {
					Action actionIfTrue = ((ConditionalAction) source)
							.getActionIfTrue();
					Action actionIfFalse = ((ConditionalAction) source)
							.getActionIfTrue();

					if (actionIfTrue instanceof ActionSequence) {
						if (((ActionSequence) actionIfTrue).getActionelements()
								.contains(instance)) {
							((ActionSequence) actionIfTrue).getActionelements()
									.remove(instance);
						}
					} else if (actionIfTrue.equals(instance)) {
						((ConditionalAction) source).setActionIfTrue(null);
					} else if (actionIfFalse instanceof ActionSequence) {
						if (((ActionSequence) actionIfFalse)
								.getActionelements().contains(instance)) {
							((ActionSequence) actionIfFalse)
									.getActionelements().remove(instance);
						} else if (actionIfFalse.equals(instance)) {
							((ConditionalAction) source).setActionIfFalse(null);
						}
					}
				}

				if (target instanceof Method) {
					Action internalAction = ((Method) target)
							.getMethodbehavior().getAction();
					if (internalAction == null) {
						((Method) target).getMethodbehavior().setAction(
								(Action) instance);
					} else if (internalAction instanceof ActionSequence) {
						((ActionSequence) internalAction).getActionelements()
								.add((Action) instance);
					} else if (internalAction instanceof Action) {
						ActionSequence sequence = RestBehaviorFactory.eINSTANCE
								.createActionSequence();
						sequence.getActionelements().add(internalAction);
						sequence.getActionelements().add((Action) instance);
						((Method) target).getMethodbehavior().setAction(
								sequence);
					}
				} else if (target instanceof ConditionalAction) {
					Shape ifTrueSection = ActionUtil
							.findConditionalActionIfTrueSection(context
									.getTargetContainer());
					Shape ifFalseSection = ActionUtil
							.findConditionalActionIfFalseSection(context
									.getTargetContainer());
					if (ActionUtil.targetIsInsideShape(context, ifTrueSection)) {
						Action internalAction = ((ConditionalAction) target)
								.getActionIfTrue();
						if (internalAction == null) {
							((ConditionalAction) target)
									.setActionIfTrue((Action) instance);
						} else if (internalAction instanceof ActionSequence) {
							((ActionSequence) internalAction)
									.getActionelements().add((Action) instance);
						} else if (internalAction instanceof Action) {
							ActionSequence sequence = RestBehaviorFactory.eINSTANCE
									.createActionSequence();
							sequence.getActionelements().add(internalAction);
							sequence.getActionelements().add((Action) instance);

							((ConditionalAction) target)
									.setActionIfTrue(sequence);

						}
					} else if (ActionUtil.targetIsInsideShape(context,
							ifFalseSection)) {
						Action internalAction = ((ConditionalAction) target)
								.getActionIfFalse();
						if (internalAction == null) {
							((ConditionalAction) target)
									.setActionIfFalse((Action) instance);
						} else if (internalAction instanceof ActionSequence) {
							((ActionSequence) internalAction)
									.getActionelements().add((Action) instance);
						} else if (internalAction instanceof Action) {
							ActionSequence sequence = RestBehaviorFactory.eINSTANCE
									.createActionSequence();
							sequence.getActionelements().add(internalAction);
							sequence.getActionelements().add((Action) instance);

							((ConditionalAction) target)
									.setActionIfFalse(sequence);
						}
					}

				}
			}
		}
	}
}
