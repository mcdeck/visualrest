package de.van_porten.vrest.ui.diagram.state;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class RestResourceStatesDiagramTypeProvider extends
		AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;

	public RestResourceStatesDiagramTypeProvider() {
		super();
		setFeatureProvider(new RestResourceStatesFeatureProvider(this));
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { new RestResourceStatesToolBehaviorProvider(
					this) };
		}
		return toolBehaviorProviders;
	}

	@Override
	public boolean isAutoUpdateAtReset() {
		return super.isAutoUpdateAtReset();
	}

	@Override
	public boolean isAutoUpdateAtRuntime() {
		return super.isAutoUpdateAtRuntime();
	}

	@Override
	public boolean isAutoUpdateAtStartup() {
		return super.isAutoUpdateAtStartup();
	}

}
