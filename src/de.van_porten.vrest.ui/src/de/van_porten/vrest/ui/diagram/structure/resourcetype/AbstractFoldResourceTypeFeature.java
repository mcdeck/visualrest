package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public abstract class AbstractFoldResourceTypeFeature extends
		AbstractCustomFeature {

	public AbstractFoldResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public final boolean canExecute(ICustomContext context) {
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			if (pes[0] instanceof ContainerShape) {
				Object bo = getBusinessObjectForPictogramElement(pes[0]);
				if (bo instanceof ResourceType) {
					ret = isFoldingFeatureExecuteable(pes[0]);
				}
			}
		}
		return ret;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return true;
	}

	protected abstract boolean isFoldingFeatureExecuteable(PictogramElement pe);

	@Override
	public abstract String getName();

	@Override
	public abstract String getDescription();

	@Override
	public abstract String getImageId();

	private class TupleContainer {
		private Object sourceBo;
		private Object targetBo;

		public TupleContainer(Object sourceBo, Object targetBo) {
			this.sourceBo = sourceBo;
			this.targetBo = targetBo;
		}

		public Object getSourceBo() {
			return sourceBo;
		}

		public Object getTargetBo() {
			return targetBo;
		}

		private boolean equalsWithNull(Object one, Object other) {
			if (one != null) {
				return one.equals(other);
			} else {
				return other == null;
			}
		}

		@Override
		public int hashCode() {
			return 0xcafebabe;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof TupleContainer) {
				TupleContainer tc = (TupleContainer) obj;
				if (equalsWithNull(this.sourceBo, tc.getSourceBo())
						&& equalsWithNull(this.targetBo, tc.getTargetBo())) {
					return true;
				}
			}
			return false;
		}
	}

	private TupleContainer createDummyConnectionBo(Connection connection) {
		/*
		 * use the source and target to try and reload the bendpoints
		 */
		Object soureBo = getBusinessObjectForPictogramElement(connection
				.getStart().getParent());
		Object targetBo = getBusinessObjectForPictogramElement(connection
				.getEnd().getParent());
		return new TupleContainer(soureBo, targetBo);
	}

	private void saveBendpointsAndDecoratorsToMaps(Connection connection,
			Map<Object, List<Point>> bendpointMap,
			Map<Object, int[]> textDecoratorMap) {
		Object connectionBo = getBusinessObjectForPictogramElement(connection);
		if (connectionBo == null) {
			connectionBo = createDummyConnectionBo(connection);
		}

		if (connection instanceof FreeFormConnection) {
			List<Point> bendpoints = new ArrayList<Point>();
			for (Point point : ((FreeFormConnection) connection)
					.getBendpoints()) {
				bendpoints.add(point);
			}
			bendpointMap.put(connectionBo, bendpoints);
		}

		for (ConnectionDecorator decorator : connection
				.getConnectionDecorators()) {
			if (decorator.getGraphicsAlgorithm() instanceof Text) {
				textDecoratorMap.put(connectionBo, new int[] {
						decorator.getGraphicsAlgorithm().getX(),
						decorator.getGraphicsAlgorithm().getY() });
			}
		}
	}

	public void addBendpointsAndDecoratorsToConnection(
			Map<Object, List<Point>> bendpointMap,
			Map<Object, int[]> textDecoratorMap, Connection connection) {
		Object connectionBo = getBusinessObjectForPictogramElement(connection);
		if (connectionBo == null) {
			connectionBo = createDummyConnectionBo(connection);
		}

		if (bendpointMap.containsKey(connectionBo)) {
			if (connection instanceof FreeFormConnection) {
				for (Point bendpoint : bendpointMap.get(connectionBo)) {
					((FreeFormConnection) connection).getBendpoints().add(
							bendpoint);
				}
			}
		}
		if (textDecoratorMap.containsKey(connectionBo)) {
			for (ConnectionDecorator decorator : connection
					.getConnectionDecorators()) {
				if (decorator.getGraphicsAlgorithm() instanceof Text) {
					int[] coord = textDecoratorMap.get(connectionBo);
					decorator.getGraphicsAlgorithm().setX(coord[0]);
					decorator.getGraphicsAlgorithm().setY(coord[1]);
				}
			}
		}
	}

	@Override
	public final void execute(ICustomContext context) {
		// We checked that there is exactly one in canExecute
		PictogramElement pe = context.getPictogramElements()[0];
		Object bo = getBusinessObjectForPictogramElement(pe);

		if (pe instanceof ContainerShape) {
			if ((bo instanceof ResourceType)) {
				/* save old properties for later */
				Map<Object, List<Point>> bendpointMapIncoming = new HashMap<Object, List<Point>>();
				Map<Object, int[]> textDecoratorPositionsIncoming = new HashMap<Object, int[]>();

				Map<Object, List<Point>> bendpointMapOutgoing = new HashMap<Object, List<Point>>();
				Map<Object, int[]> textDecoratorPositionsOutgoing = new HashMap<Object, int[]>();

				EList<Anchor> anchors = ((ContainerShape) pe).getAnchors();
				for (Anchor anchor : anchors) {
					for (Connection connection : anchor
							.getIncomingConnections()) {
						saveBendpointsAndDecoratorsToMaps(connection,
								bendpointMapIncoming,
								textDecoratorPositionsIncoming);
					}
					for (Connection connection : anchor
							.getOutgoingConnections()) {
						saveBendpointsAndDecoratorsToMaps(connection,
								bendpointMapOutgoing,
								textDecoratorPositionsOutgoing);
					}
				}

				AreaContext areaContext = new AreaContext();
				areaContext.setLocation(pe.getGraphicsAlgorithm().getX(), pe
						.getGraphicsAlgorithm().getY());
				areaContext.setHeight(-1);
				areaContext.setWidth(-1);
				AddContext addContext = new AddContext(areaContext, bo);
				addContext.setTargetContainer(getDiagram());
				IAddFeature addFeature = getFeatureProvider().getAddFeature(
						addContext);
				if (addFeature instanceof AbstractAddResourceTypeFeature) {
					AbstractAddResourceTypeFeature addResourceTypeFeature = (AbstractAddResourceTypeFeature) addFeature;

					boolean collapsed = PropertyUtil.isCollapsed(pe);

					// Remove old element and add the new one
					IRemoveContext removeContext = new RemoveContext(pe);
					getFeatureProvider().getRemoveFeature(removeContext)
							.remove(removeContext);

					if (addResourceTypeFeature.canAdd(addContext)) {
						addResourceTypeFeature.setCollapsed(!collapsed);
						pe = addResourceTypeFeature.add(addContext);

						UpdateContext updateContext = new UpdateContext(pe);
						IUpdateFeature updateFeauture = getFeatureProvider()
								.getUpdateFeature(updateContext);
						if (updateFeauture.canUpdate(updateContext)) {
							if (updateFeauture.updateNeeded(updateContext)
									.toBoolean()) {
								updateFeauture.update(updateContext);
							}
						}

						for (Anchor anchor : ((ContainerShape) pe).getAnchors()) {
							for (Connection connection : anchor
									.getIncomingConnections()) {
								addBendpointsAndDecoratorsToConnection(
										bendpointMapIncoming,
										textDecoratorPositionsIncoming,
										connection);
							}
							for (Connection connection : anchor
									.getOutgoingConnections()) {
								addBendpointsAndDecoratorsToConnection(
										bendpointMapOutgoing,
										textDecoratorPositionsOutgoing,
										connection);
							}
						}
					}
				}
			}
		}
	}
}
