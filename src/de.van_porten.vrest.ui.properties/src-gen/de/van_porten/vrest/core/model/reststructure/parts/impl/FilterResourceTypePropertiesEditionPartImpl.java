/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.van_porten.vrest.core.model.reststructure.parts.FilterResourceTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class FilterResourceTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FilterResourceTypePropertiesEditionPart {

protected ReferencesTable identifer;
protected List<ViewerFilter> identiferBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> identiferFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable resourceelements;
protected List<ViewerFilter> resourceelementsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> resourceelementsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable methods;
protected List<ViewerFilter> methodsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> methodsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable creators;
protected List<ViewerFilter> creatorsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> creatorsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable states;
protected List<ViewerFilter> statesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> statesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer initialState;
	protected Text name;
	protected Button isSingleton;
	protected Button createOnStart;
	protected EObjectFlatComboViewer listElementType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FilterResourceTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence filterResourceTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = filterResourceTypeStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.identifer);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.resourceelements);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.methods);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.creators);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.states);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.initialState);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.isSingleton);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.createOnStart);
		propertiesStep.addStep(ReststructureViewsRepository.FilterResourceType.Properties.listElementType);
		
		
		composer = new PartComposer(filterResourceTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.identifer) {
					return createIdentiferAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.resourceelements) {
					return createResourceelementsAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.methods) {
					return createMethodsAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.creators) {
					return createCreatorsAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.states) {
					return createStatesAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.initialState) {
					return createInitialStateFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.name) {
					return createNameText(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.isSingleton) {
					return createIsSingletonCheckbox(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.createOnStart) {
					return createCreateOnStartCheckbox(parent);
				}
				if (key == ReststructureViewsRepository.FilterResourceType.Properties.listElementType) {
					return createListElementTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(ReststructureMessages.FilterResourceTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createIdentiferAdvancedTableComposition(Composite parent) {
		this.identifer = new ReferencesTable(ReststructureMessages.FilterResourceTypePropertiesEditionPart_IdentiferLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				identifer.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				identifer.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				identifer.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				identifer.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.identiferFilters) {
			this.identifer.addFilter(filter);
		}
		this.identifer.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.identifer, ReststructureViewsRepository.SWT_KIND));
		this.identifer.createControls(parent);
		this.identifer.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.identifer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData identiferData = new GridData(GridData.FILL_HORIZONTAL);
		identiferData.horizontalSpan = 3;
		this.identifer.setLayoutData(identiferData);
		this.identifer.setLowerBound(1);
		this.identifer.setUpperBound(-1);
		identifer.setID(ReststructureViewsRepository.FilterResourceType.Properties.identifer);
		identifer.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourceelementsAdvancedTableComposition(Composite parent) {
		this.resourceelements = new ReferencesTable(ReststructureMessages.FilterResourceTypePropertiesEditionPart_ResourceelementsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resourceelements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resourceelements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resourceelements.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resourceelements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourceelementsFilters) {
			this.resourceelements.addFilter(filter);
		}
		this.resourceelements.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, ReststructureViewsRepository.SWT_KIND));
		this.resourceelements.createControls(parent);
		this.resourceelements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.resourceelements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourceelementsData = new GridData(GridData.FILL_HORIZONTAL);
		resourceelementsData.horizontalSpan = 3;
		this.resourceelements.setLayoutData(resourceelementsData);
		this.resourceelements.setLowerBound(0);
		this.resourceelements.setUpperBound(-1);
		resourceelements.setID(ReststructureViewsRepository.FilterResourceType.Properties.resourceelements);
		resourceelements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMethodsAdvancedTableComposition(Composite parent) {
		this.methods = new ReferencesTable(ReststructureMessages.FilterResourceTypePropertiesEditionPart_MethodsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				methods.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				methods.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				methods.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				methods.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.methodsFilters) {
			this.methods.addFilter(filter);
		}
		this.methods.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.methods, ReststructureViewsRepository.SWT_KIND));
		this.methods.createControls(parent);
		this.methods.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.methods, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData methodsData = new GridData(GridData.FILL_HORIZONTAL);
		methodsData.horizontalSpan = 3;
		this.methods.setLayoutData(methodsData);
		this.methods.setLowerBound(0);
		this.methods.setUpperBound(-1);
		methods.setID(ReststructureViewsRepository.FilterResourceType.Properties.methods);
		methods.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCreatorsAdvancedTableComposition(Composite parent) {
		this.creators = new ReferencesTable(ReststructureMessages.FilterResourceTypePropertiesEditionPart_CreatorsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				creators.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				creators.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				creators.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				creators.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.creatorsFilters) {
			this.creators.addFilter(filter);
		}
		this.creators.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.creators, ReststructureViewsRepository.SWT_KIND));
		this.creators.createControls(parent);
		this.creators.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.creators, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData creatorsData = new GridData(GridData.FILL_HORIZONTAL);
		creatorsData.horizontalSpan = 3;
		this.creators.setLayoutData(creatorsData);
		this.creators.setLowerBound(0);
		this.creators.setUpperBound(-1);
		creators.setID(ReststructureViewsRepository.FilterResourceType.Properties.creators);
		creators.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStatesAdvancedTableComposition(Composite parent) {
		this.states = new ReferencesTable(ReststructureMessages.FilterResourceTypePropertiesEditionPart_StatesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				states.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				states.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				states.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				states.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.statesFilters) {
			this.states.addFilter(filter);
		}
		this.states.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.states, ReststructureViewsRepository.SWT_KIND));
		this.states.createControls(parent);
		this.states.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.states, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData statesData = new GridData(GridData.FILL_HORIZONTAL);
		statesData.horizontalSpan = 3;
		this.states.setLayoutData(statesData);
		this.states.setLowerBound(1);
		this.states.setUpperBound(-1);
		states.setID(ReststructureViewsRepository.FilterResourceType.Properties.states);
		states.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInitialStateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.FilterResourceTypePropertiesEditionPart_InitialStateLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.FilterResourceType.Properties.initialState, ReststructureViewsRepository.SWT_KIND));
		initialState = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.FilterResourceType.Properties.initialState, ReststructureViewsRepository.SWT_KIND));
		initialState.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		initialState.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.initialState, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInitialState()));
			}

		});
		GridData initialStateData = new GridData(GridData.FILL_HORIZONTAL);
		initialState.setLayoutData(initialStateData);
		initialState.setID(ReststructureViewsRepository.FilterResourceType.Properties.initialState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.initialState, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.FilterResourceTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.FilterResourceType.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.FilterResourceType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsSingletonCheckbox(Composite parent) {
		isSingleton = new Button(parent, SWT.CHECK);
		isSingleton.setText(ReststructureMessages.FilterResourceTypePropertiesEditionPart_IsSingletonLabel);
		isSingleton.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.isSingleton, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSingleton.getSelection())));
			}

		});
		GridData isSingletonData = new GridData(GridData.FILL_HORIZONTAL);
		isSingletonData.horizontalSpan = 2;
		isSingleton.setLayoutData(isSingletonData);
		EditingUtils.setID(isSingleton, ReststructureViewsRepository.FilterResourceType.Properties.isSingleton);
		EditingUtils.setEEFtype(isSingleton, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.isSingleton, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCreateOnStartCheckbox(Composite parent) {
		createOnStart = new Button(parent, SWT.CHECK);
		createOnStart.setText(ReststructureMessages.FilterResourceTypePropertiesEditionPart_CreateOnStartLabel);
		createOnStart.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.createOnStart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(createOnStart.getSelection())));
			}

		});
		GridData createOnStartData = new GridData(GridData.FILL_HORIZONTAL);
		createOnStartData.horizontalSpan = 2;
		createOnStart.setLayoutData(createOnStartData);
		EditingUtils.setID(createOnStart, ReststructureViewsRepository.FilterResourceType.Properties.createOnStart);
		EditingUtils.setEEFtype(createOnStart, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.createOnStart, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createListElementTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.FilterResourceTypePropertiesEditionPart_ListElementTypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.FilterResourceType.Properties.listElementType, ReststructureViewsRepository.SWT_KIND));
		listElementType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.FilterResourceType.Properties.listElementType, ReststructureViewsRepository.SWT_KIND));
		listElementType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		listElementType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FilterResourceTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.FilterResourceType.Properties.listElementType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getListElementType()));
			}

		});
		GridData listElementTypeData = new GridData(GridData.FILL_HORIZONTAL);
		listElementType.setLayoutData(listElementTypeData);
		listElementType.setID(ReststructureViewsRepository.FilterResourceType.Properties.listElementType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.FilterResourceType.Properties.listElementType, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initIdentifer(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIdentifer(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		identifer.setContentProvider(contentProvider);
		identifer.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#updateIdentifer()
	 * 
	 */
	public void updateIdentifer() {
	identifer.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterIdentifer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIdentifer(ViewerFilter filter) {
		identiferFilters.add(filter);
		if (this.identifer != null) {
			this.identifer.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterIdentifer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIdentifer(ViewerFilter filter) {
		identiferBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#isContainedInIdentiferTable(EObject element)
	 * 
	 */
	public boolean isContainedInIdentiferTable(EObject element) {
		return ((ReferencesTableSettings)identifer.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initResourceelements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResourceelements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resourceelements.setContentProvider(contentProvider);
		resourceelements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#updateResourceelements()
	 * 
	 */
	public void updateResourceelements() {
	resourceelements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterResourceelements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResourceelements(ViewerFilter filter) {
		resourceelementsFilters.add(filter);
		if (this.resourceelements != null) {
			this.resourceelements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterResourceelements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResourceelements(ViewerFilter filter) {
		resourceelementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#isContainedInResourceelementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourceelementsTable(EObject element) {
		return ((ReferencesTableSettings)resourceelements.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initMethods(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMethods(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		methods.setContentProvider(contentProvider);
		methods.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#updateMethods()
	 * 
	 */
	public void updateMethods() {
	methods.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethods(ViewerFilter filter) {
		methodsFilters.add(filter);
		if (this.methods != null) {
			this.methods.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter) {
		methodsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#isContainedInMethodsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element) {
		return ((ReferencesTableSettings)methods.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initCreators(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCreators(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		creators.setContentProvider(contentProvider);
		creators.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#updateCreators()
	 * 
	 */
	public void updateCreators() {
	creators.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterCreators(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCreators(ViewerFilter filter) {
		creatorsFilters.add(filter);
		if (this.creators != null) {
			this.creators.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterCreators(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreators(ViewerFilter filter) {
		creatorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#isContainedInCreatorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCreatorsTable(EObject element) {
		return ((ReferencesTableSettings)creators.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initStates(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStates(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		states.setContentProvider(contentProvider);
		states.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#updateStates()
	 * 
	 */
	public void updateStates() {
	states.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterStates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStates(ViewerFilter filter) {
		statesFilters.add(filter);
		if (this.states != null) {
			this.states.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterStates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStates(ViewerFilter filter) {
		statesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#isContainedInStatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStatesTable(EObject element) {
		return ((ReferencesTableSettings)states.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#getInitialState()
	 * 
	 */
	public EObject getInitialState() {
		if (initialState.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) initialState.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initInitialState(EObjectFlatComboSettings)
	 */
	public void initInitialState(EObjectFlatComboSettings settings) {
		initialState.setInput(settings);
		if (current != null) {
			initialState.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setInitialState(EObject newValue)
	 * 
	 */
	public void setInitialState(EObject newValue) {
		if (newValue != null) {
			initialState.setSelection(new StructuredSelection(newValue));
		} else {
			initialState.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setInitialStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInitialStateButtonMode(ButtonsModeEnum newValue) {
		initialState.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterInitialState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInitialState(ViewerFilter filter) {
		initialState.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterInitialState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInitialState(ViewerFilter filter) {
		initialState.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#getIsSingleton()
	 * 
	 */
	public Boolean getIsSingleton() {
		return Boolean.valueOf(isSingleton.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setIsSingleton(Boolean newValue)
	 * 
	 */
	public void setIsSingleton(Boolean newValue) {
		if (newValue != null) {
			isSingleton.setSelection(newValue.booleanValue());
		} else {
			isSingleton.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#getCreateOnStart()
	 * 
	 */
	public Boolean getCreateOnStart() {
		return Boolean.valueOf(createOnStart.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setCreateOnStart(Boolean newValue)
	 * 
	 */
	public void setCreateOnStart(Boolean newValue) {
		if (newValue != null) {
			createOnStart.setSelection(newValue.booleanValue());
		} else {
			createOnStart.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#getListElementType()
	 * 
	 */
	public EObject getListElementType() {
		if (listElementType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) listElementType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#initListElementType(EObjectFlatComboSettings)
	 */
	public void initListElementType(EObjectFlatComboSettings settings) {
		listElementType.setInput(settings);
		if (current != null) {
			listElementType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setListElementType(EObject newValue)
	 * 
	 */
	public void setListElementType(EObject newValue) {
		if (newValue != null) {
			listElementType.setSelection(new StructuredSelection(newValue));
		} else {
			listElementType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#setListElementTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setListElementTypeButtonMode(ButtonsModeEnum newValue) {
		listElementType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addFilterListElementType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToListElementType(ViewerFilter filter) {
		listElementType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.FilterResourceTypePropertiesEditionPart#addBusinessFilterListElementType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToListElementType(ViewerFilter filter) {
		listElementType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.FilterResourceType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
