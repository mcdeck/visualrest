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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.parts.StatePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class StatePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StatePropertiesEditionPart {

protected ReferencesTable transitions;
protected List<ViewerFilter> transitionsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> transitionsFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected ReferencesTable supportedMethods;
	protected List<ViewerFilter> supportedMethodsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supportedMethodsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StatePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence stateStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = stateStep.addStep(RestbehaviorViewsRepository.State.Properties.class);
		propertiesStep.addStep(RestbehaviorViewsRepository.State.Properties.transitions);
		propertiesStep.addStep(RestbehaviorViewsRepository.State.Properties.name);
		propertiesStep.addStep(RestbehaviorViewsRepository.State.Properties.supportedMethods);
		
		
		composer = new PartComposer(stateStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.State.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.State.Properties.transitions) {
					return createTransitionsAdvancedTableComposition(parent);
				}
				if (key == RestbehaviorViewsRepository.State.Properties.name) {
					return createNameText(parent);
				}
				if (key == RestbehaviorViewsRepository.State.Properties.supportedMethods) {
					return createSupportedMethodsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(RestbehaviorMessages.StatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTransitionsAdvancedTableComposition(Composite parent) {
		this.transitions = new ReferencesTable(RestbehaviorMessages.StatePropertiesEditionPart_TransitionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.transitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				transitions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.transitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				transitions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.transitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				transitions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.transitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				transitions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.transitionsFilters) {
			this.transitions.addFilter(filter);
		}
		this.transitions.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.State.Properties.transitions, RestbehaviorViewsRepository.SWT_KIND));
		this.transitions.createControls(parent);
		this.transitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.transitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData transitionsData = new GridData(GridData.FILL_HORIZONTAL);
		transitionsData.horizontalSpan = 3;
		this.transitions.setLayoutData(transitionsData);
		this.transitions.setLowerBound(0);
		this.transitions.setUpperBound(-1);
		transitions.setID(RestbehaviorViewsRepository.State.Properties.transitions);
		transitions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.StatePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.State.Properties.name, RestbehaviorViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, RestbehaviorViewsRepository.State.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.State.Properties.name, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSupportedMethodsAdvancedReferencesTable(Composite parent) {
		this.supportedMethods = new ReferencesTable(RestbehaviorMessages.StatePropertiesEditionPart_SupportedMethodsLabel, new ReferencesTableListener() {
			public void handleAdd() { addSupportedMethods(); }
			public void handleEdit(EObject element) { editSupportedMethods(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportedMethods(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportedMethods(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportedMethods.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.State.Properties.supportedMethods, RestbehaviorViewsRepository.SWT_KIND));
		this.supportedMethods.createControls(parent);
		this.supportedMethods.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.supportedMethods, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportedMethodsData = new GridData(GridData.FILL_HORIZONTAL);
		supportedMethodsData.horizontalSpan = 3;
		this.supportedMethods.setLayoutData(supportedMethodsData);
		this.supportedMethods.disableMove();
		supportedMethods.setID(RestbehaviorViewsRepository.State.Properties.supportedMethods);
		supportedMethods.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupportedMethods() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supportedMethods.getInput(), supportedMethodsFilters, supportedMethodsBusinessFilters,
		"supportedMethods", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.supportedMethods,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supportedMethods.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupportedMethods(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.supportedMethods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportedMethods.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportedMethods(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.State.Properties.supportedMethods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supportedMethods.refresh();
	}

	/**
	 * 
	 */
	protected void editSupportedMethods(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supportedMethods.refresh();
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#initTransitions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTransitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		transitions.setContentProvider(contentProvider);
		transitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#updateTransitions()
	 * 
	 */
	public void updateTransitions() {
	transitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#addFilterTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransitions(ViewerFilter filter) {
		transitionsFilters.add(filter);
		if (this.transitions != null) {
			this.transitions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#addBusinessFilterTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTransitions(ViewerFilter filter) {
		transitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#isContainedInTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)transitions.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#initSupportedMethods(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupportedMethods(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supportedMethods.setContentProvider(contentProvider);
		supportedMethods.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#updateSupportedMethods()
	 * 
	 */
	public void updateSupportedMethods() {
	supportedMethods.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#addFilterSupportedMethods(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportedMethods(ViewerFilter filter) {
		supportedMethodsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#addBusinessFilterSupportedMethods(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportedMethods(ViewerFilter filter) {
		supportedMethodsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.StatePropertiesEditionPart#isContainedInSupportedMethodsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportedMethodsTable(EObject element) {
		return ((ReferencesTableSettings)supportedMethods.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.State_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
