package de.van_porten.vrest.ui.diagram.method;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class RestMethodBehaviourDiagramTypeProvider extends
		AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;

	public RestMethodBehaviourDiagramTypeProvider() {
		super();
		setFeatureProvider(new RestMethodBehaviourFeatureProvider(this));
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { new RestMethodBehaviourToolBehaviorProvider(
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
