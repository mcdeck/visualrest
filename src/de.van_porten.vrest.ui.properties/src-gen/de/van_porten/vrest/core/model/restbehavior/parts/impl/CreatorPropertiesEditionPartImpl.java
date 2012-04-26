/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.van_porten.vrest.core.model.restbehavior.parts.CreatorPropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class CreatorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CreatorPropertiesEditionPart {

	protected ReferencesTable consumedMT;
	protected List<ViewerFilter> consumedMTBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumedMTFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable creatorParams;
protected List<ViewerFilter> creatorParamsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> creatorParamsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CreatorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence creatorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = creatorStep.addStep(RestbehaviorViewsRepository.Creator.Properties.class);
		propertiesStep.addStep(RestbehaviorViewsRepository.Creator.Properties.consumedMT);
		propertiesStep.addStep(RestbehaviorViewsRepository.Creator.Properties.creatorParams);
		
		
		composer = new PartComposer(creatorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.Creator.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.Creator.Properties.consumedMT) {
					return createConsumedMTAdvancedReferencesTable(parent);
				}
				if (key == RestbehaviorViewsRepository.Creator.Properties.creatorParams) {
					return createCreatorParamsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(RestbehaviorMessages.CreatorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createConsumedMTAdvancedReferencesTable(Composite parent) {
		this.consumedMT = new ReferencesTable(RestbehaviorMessages.CreatorPropertiesEditionPart_ConsumedMTLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumedMT(); }
			public void handleEdit(EObject element) { editConsumedMT(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumedMT(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumedMT(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumedMT.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.Creator.Properties.consumedMT, RestbehaviorViewsRepository.SWT_KIND));
		this.consumedMT.createControls(parent);
		this.consumedMT.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.consumedMT, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumedMTData = new GridData(GridData.FILL_HORIZONTAL);
		consumedMTData.horizontalSpan = 3;
		this.consumedMT.setLayoutData(consumedMTData);
		this.consumedMT.disableMove();
		consumedMT.setID(RestbehaviorViewsRepository.Creator.Properties.consumedMT);
		consumedMT.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addConsumedMT() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(consumedMT.getInput(), consumedMTFilters, consumedMTBusinessFilters,
		"consumedMT", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.consumedMT,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				consumedMT.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveConsumedMT(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.consumedMT, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumedMT.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumedMT(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.consumedMT, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		consumedMT.refresh();
	}

	/**
	 * 
	 */
	protected void editConsumedMT(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				consumedMT.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCreatorParamsAdvancedTableComposition(Composite parent) {
		this.creatorParams = new ReferencesTable(RestbehaviorMessages.CreatorPropertiesEditionPart_CreatorParamsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.creatorParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				creatorParams.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.creatorParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				creatorParams.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.creatorParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				creatorParams.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.creatorParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				creatorParams.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.creatorParamsFilters) {
			this.creatorParams.addFilter(filter);
		}
		this.creatorParams.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.Creator.Properties.creatorParams, RestbehaviorViewsRepository.SWT_KIND));
		this.creatorParams.createControls(parent);
		this.creatorParams.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Creator.Properties.creatorParams, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData creatorParamsData = new GridData(GridData.FILL_HORIZONTAL);
		creatorParamsData.horizontalSpan = 3;
		this.creatorParams.setLayoutData(creatorParamsData);
		this.creatorParams.setLowerBound(0);
		this.creatorParams.setUpperBound(-1);
		creatorParams.setID(RestbehaviorViewsRepository.Creator.Properties.creatorParams);
		creatorParams.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#initConsumedMT(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initConsumedMT(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		consumedMT.setContentProvider(contentProvider);
		consumedMT.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#updateConsumedMT()
	 * 
	 */
	public void updateConsumedMT() {
	consumedMT.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#addFilterConsumedMT(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumedMT(ViewerFilter filter) {
		consumedMTFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#addBusinessFilterConsumedMT(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumedMT(ViewerFilter filter) {
		consumedMTBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#isContainedInConsumedMTTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumedMTTable(EObject element) {
		return ((ReferencesTableSettings)consumedMT.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#initCreatorParams(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCreatorParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		creatorParams.setContentProvider(contentProvider);
		creatorParams.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#updateCreatorParams()
	 * 
	 */
	public void updateCreatorParams() {
	creatorParams.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#addFilterCreatorParams(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCreatorParams(ViewerFilter filter) {
		creatorParamsFilters.add(filter);
		if (this.creatorParams != null) {
			this.creatorParams.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#addBusinessFilterCreatorParams(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreatorParams(ViewerFilter filter) {
		creatorParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.CreatorPropertiesEditionPart#isContainedInCreatorParamsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCreatorParamsTable(EObject element) {
		return ((ReferencesTableSettings)creatorParams.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.Creator_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
