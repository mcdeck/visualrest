/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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

import de.van_porten.vrest.core.model.reststructure.parts.MethodPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MethodPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MethodPropertiesEditionPart {

	protected ReferencesTable consumed;
	protected List<ViewerFilter> consumedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumedFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable produced;
	protected List<ViewerFilter> producedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> producedFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer methodtype;
protected ReferencesTable parameters;
protected List<ViewerFilter> parametersBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> parametersFilters = new ArrayList<ViewerFilter>();
	protected Text name;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MethodPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence methodStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = methodStep.addStep(ReststructureViewsRepository.Method.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.Method.Properties.consumed);
		propertiesStep.addStep(ReststructureViewsRepository.Method.Properties.produced);
		propertiesStep.addStep(ReststructureViewsRepository.Method.Properties.methodtype);
		propertiesStep.addStep(ReststructureViewsRepository.Method.Properties.parameters);
		propertiesStep.addStep(ReststructureViewsRepository.Method.Properties.name);
		
		
		composer = new PartComposer(methodStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.Method.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.Method.Properties.consumed) {
					return createConsumedAdvancedReferencesTable(parent);
				}
				if (key == ReststructureViewsRepository.Method.Properties.produced) {
					return createProducedAdvancedReferencesTable(parent);
				}
				if (key == ReststructureViewsRepository.Method.Properties.methodtype) {
					return createMethodtypeFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.Method.Properties.parameters) {
					return createParametersAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.Method.Properties.name) {
					return createNameText(parent);
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
		propertiesGroup.setText(ReststructureMessages.MethodPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createConsumedAdvancedReferencesTable(Composite parent) {
		this.consumed = new ReferencesTable(ReststructureMessages.MethodPropertiesEditionPart_ConsumedLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumed(); }
			public void handleEdit(EObject element) { editConsumed(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumed(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumed(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumed.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Method.Properties.consumed, ReststructureViewsRepository.SWT_KIND));
		this.consumed.createControls(parent);
		this.consumed.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.consumed, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumedData = new GridData(GridData.FILL_HORIZONTAL);
		consumedData.horizontalSpan = 3;
		this.consumed.setLayoutData(consumedData);
		this.consumed.disableMove();
		consumed.setID(ReststructureViewsRepository.Method.Properties.consumed);
		consumed.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addConsumed() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(consumed.getInput(), consumedFilters, consumedBusinessFilters,
		"consumed", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.consumed,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				consumed.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveConsumed(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.consumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumed.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumed(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.consumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		consumed.refresh();
	}

	/**
	 * 
	 */
	protected void editConsumed(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				consumed.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProducedAdvancedReferencesTable(Composite parent) {
		this.produced = new ReferencesTable(ReststructureMessages.MethodPropertiesEditionPart_ProducedLabel, new ReferencesTableListener() {
			public void handleAdd() { addProduced(); }
			public void handleEdit(EObject element) { editProduced(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProduced(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProduced(element); }
			public void navigateTo(EObject element) { }
		});
		this.produced.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Method.Properties.produced, ReststructureViewsRepository.SWT_KIND));
		this.produced.createControls(parent);
		this.produced.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.produced, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData producedData = new GridData(GridData.FILL_HORIZONTAL);
		producedData.horizontalSpan = 3;
		this.produced.setLayoutData(producedData);
		this.produced.disableMove();
		produced.setID(ReststructureViewsRepository.Method.Properties.produced);
		produced.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProduced() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(produced.getInput(), producedFilters, producedBusinessFilters,
		"produced", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.produced,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				produced.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProduced(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.produced, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		produced.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProduced(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.produced, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		produced.refresh();
	}

	/**
	 * 
	 */
	protected void editProduced(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				produced.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMethodtypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.MethodPropertiesEditionPart_MethodtypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Method.Properties.methodtype, ReststructureViewsRepository.SWT_KIND));
		methodtype = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.Method.Properties.methodtype, ReststructureViewsRepository.SWT_KIND));
		methodtype.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		methodtype.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.methodtype, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMethodtype()));
			}

		});
		GridData methodtypeData = new GridData(GridData.FILL_HORIZONTAL);
		methodtype.setLayoutData(methodtypeData);
		methodtype.setID(ReststructureViewsRepository.Method.Properties.methodtype);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Method.Properties.methodtype, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParametersAdvancedTableComposition(Composite parent) {
		this.parameters = new ReferencesTable(ReststructureMessages.MethodPropertiesEditionPart_ParametersLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				parameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				parameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				parameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				parameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.parametersFilters) {
			this.parameters.addFilter(filter);
		}
		this.parameters.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Method.Properties.parameters, ReststructureViewsRepository.SWT_KIND));
		this.parameters.createControls(parent);
		this.parameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.parameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData parametersData = new GridData(GridData.FILL_HORIZONTAL);
		parametersData.horizontalSpan = 3;
		this.parameters.setLayoutData(parametersData);
		this.parameters.setLowerBound(0);
		this.parameters.setUpperBound(-1);
		parameters.setID(ReststructureViewsRepository.Method.Properties.parameters);
		parameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.MethodPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Method.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodPropertiesEditionPartImpl.this, ReststructureViewsRepository.Method.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.Method.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Method.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#initConsumed(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initConsumed(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		consumed.setContentProvider(contentProvider);
		consumed.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#updateConsumed()
	 * 
	 */
	public void updateConsumed() {
	consumed.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addFilterConsumed(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumed(ViewerFilter filter) {
		consumedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addBusinessFilterConsumed(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumed(ViewerFilter filter) {
		consumedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#isContainedInConsumedTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumedTable(EObject element) {
		return ((ReferencesTableSettings)consumed.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#initProduced(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProduced(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		produced.setContentProvider(contentProvider);
		produced.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#updateProduced()
	 * 
	 */
	public void updateProduced() {
	produced.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addFilterProduced(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProduced(ViewerFilter filter) {
		producedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addBusinessFilterProduced(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProduced(ViewerFilter filter) {
		producedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#isContainedInProducedTable(EObject element)
	 * 
	 */
	public boolean isContainedInProducedTable(EObject element) {
		return ((ReferencesTableSettings)produced.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#getMethodtype()
	 * 
	 */
	public EObject getMethodtype() {
		if (methodtype.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) methodtype.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#initMethodtype(EObjectFlatComboSettings)
	 */
	public void initMethodtype(EObjectFlatComboSettings settings) {
		methodtype.setInput(settings);
		if (current != null) {
			methodtype.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#setMethodtype(EObject newValue)
	 * 
	 */
	public void setMethodtype(EObject newValue) {
		if (newValue != null) {
			methodtype.setSelection(new StructuredSelection(newValue));
		} else {
			methodtype.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#setMethodtypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodtypeButtonMode(ButtonsModeEnum newValue) {
		methodtype.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addFilterMethodtype(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodtype(ViewerFilter filter) {
		methodtype.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addBusinessFilterMethodtype(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodtype(ViewerFilter filter) {
		methodtype.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#initParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		parameters.setContentProvider(contentProvider);
		parameters.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#updateParameters()
	 * 
	 */
	public void updateParameters() {
	parameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addFilterParameters(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameters(ViewerFilter filter) {
		parametersFilters.add(filter);
		if (this.parameters != null) {
			this.parameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#addBusinessFilterParameters(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameters(ViewerFilter filter) {
		parametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#isContainedInParametersTable(EObject element)
	 * 
	 */
	public boolean isContainedInParametersTable(EObject element) {
		return ((ReferencesTableSettings)parameters.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MethodPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.Method_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
