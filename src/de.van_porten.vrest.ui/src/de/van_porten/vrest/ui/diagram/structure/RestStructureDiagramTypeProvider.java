package de.van_porten.vrest.ui.diagram.structure;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;


public class RestStructureDiagramTypeProvider extends
		AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;

	public RestStructureDiagramTypeProvider() {
		super();
		setFeatureProvider(new RestStructureFeatureProvider(this));
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { new RestStructureToolBehaviorProvider(
					this) };
		}
		return toolBehaviorProviders;
	}

	@Override
	public boolean isAutoUpdateAtReset() {
		// TODO Auto-generated method stub
		return super.isAutoUpdateAtReset();
	}

	@Override
	public boolean isAutoUpdateAtRuntime() {
		// TODO Auto-generated method stub
		return super.isAutoUpdateAtRuntime();
	}

	@Override
	public boolean isAutoUpdateAtStartup() {
		// TODO Auto-generated method stub
		return super.isAutoUpdateAtStartup();
	}

}
