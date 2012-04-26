/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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

import de.van_porten.vrest.core.model.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ComplexIdentifierPatternPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ComplexIdentifierPatternPropertiesEditionPart {

	protected ReferencesTable idParams;
	protected List<ViewerFilter> idParamsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> idParamsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable idAttrs;
	protected List<ViewerFilter> idAttrsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> idAttrsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ComplexIdentifierPatternPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence complexIdentifierPatternStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = complexIdentifierPatternStep.addStep(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams);
		propertiesStep.addStep(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs);
		
		
		composer = new PartComposer(complexIdentifierPatternStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.ComplexIdentifierPattern.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams) {
					return createIdParamsAdvancedReferencesTable(parent);
				}
				if (key == ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs) {
					return createIdAttrsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ReststructureMessages.ComplexIdentifierPatternPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createIdParamsAdvancedReferencesTable(Composite parent) {
		this.idParams = new ReferencesTable(ReststructureMessages.ComplexIdentifierPatternPropertiesEditionPart_IdParamsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIdParams(); }
			public void handleEdit(EObject element) { editIdParams(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIdParams(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIdParams(element); }
			public void navigateTo(EObject element) { }
		});
		this.idParams.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams, ReststructureViewsRepository.SWT_KIND));
		this.idParams.createControls(parent);
		this.idParams.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData idParamsData = new GridData(GridData.FILL_HORIZONTAL);
		idParamsData.horizontalSpan = 3;
		this.idParams.setLayoutData(idParamsData);
		this.idParams.disableMove();
		idParams.setID(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams);
		idParams.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIdParams() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(idParams.getInput(), idParamsFilters, idParamsBusinessFilters,
		"idParams", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				idParams.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIdParams(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		idParams.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIdParams(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		idParams.refresh();
	}

	/**
	 * 
	 */
	protected void editIdParams(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				idParams.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIdAttrsAdvancedReferencesTable(Composite parent) {
		this.idAttrs = new ReferencesTable(ReststructureMessages.ComplexIdentifierPatternPropertiesEditionPart_IdAttrsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIdAttrs(); }
			public void handleEdit(EObject element) { editIdAttrs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIdAttrs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIdAttrs(element); }
			public void navigateTo(EObject element) { }
		});
		this.idAttrs.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs, ReststructureViewsRepository.SWT_KIND));
		this.idAttrs.createControls(parent);
		this.idAttrs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData idAttrsData = new GridData(GridData.FILL_HORIZONTAL);
		idAttrsData.horizontalSpan = 3;
		this.idAttrs.setLayoutData(idAttrsData);
		this.idAttrs.disableMove();
		idAttrs.setID(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs);
		idAttrs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIdAttrs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(idAttrs.getInput(), idAttrsFilters, idAttrsBusinessFilters,
		"idAttrs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				idAttrs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIdAttrs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		idAttrs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIdAttrs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComplexIdentifierPatternPropertiesEditionPartImpl.this, ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		idAttrs.refresh();
	}

	/**
	 * 
	 */
	protected void editIdAttrs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				idAttrs.refresh();
			}
		}
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#initIdParams(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIdParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		idParams.setContentProvider(contentProvider);
		idParams.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#updateIdParams()
	 * 
	 */
	public void updateIdParams() {
	idParams.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#addFilterIdParams(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIdParams(ViewerFilter filter) {
		idParamsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#addBusinessFilterIdParams(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIdParams(ViewerFilter filter) {
		idParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#isContainedInIdParamsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIdParamsTable(EObject element) {
		return ((ReferencesTableSettings)idParams.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#initIdAttrs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIdAttrs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		idAttrs.setContentProvider(contentProvider);
		idAttrs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#updateIdAttrs()
	 * 
	 */
	public void updateIdAttrs() {
	idAttrs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#addFilterIdAttrs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIdAttrs(ViewerFilter filter) {
		idAttrsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#addBusinessFilterIdAttrs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIdAttrs(ViewerFilter filter) {
		idAttrsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart#isContainedInIdAttrsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIdAttrsTable(EObject element) {
		return ((ReferencesTableSettings)idAttrs.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.ComplexIdentifierPattern_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
