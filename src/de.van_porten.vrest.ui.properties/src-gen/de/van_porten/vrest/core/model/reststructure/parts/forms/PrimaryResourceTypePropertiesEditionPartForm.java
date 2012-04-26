/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.reststructure.parts.PrimaryResourceTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class PrimaryResourceTypePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PrimaryResourceTypePropertiesEditionPart {

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



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PrimaryResourceTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence primaryResourceTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = primaryResourceTypeStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.identifer);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.methods);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.creators);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.states);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.initialState);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.isSingleton);
		propertiesStep.addStep(ReststructureViewsRepository.PrimaryResourceType.Properties.createOnStart);
		
		
		composer = new PartComposer(primaryResourceTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.identifer) {
					return createIdentiferTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements) {
					return createResourceelementsTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.methods) {
					return createMethodsTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.creators) {
					return createCreatorsTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.states) {
					return createStatesTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.initialState) {
					return createInitialStateFlatComboViewer(parent, widgetFactory);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.isSingleton) {
					return createIsSingletonCheckbox(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.PrimaryResourceType.Properties.createOnStart) {
					return createCreateOnStartCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIdentiferTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.identifer = new ReferencesTable(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_IdentiferLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				identifer.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				identifer.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				identifer.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				identifer.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.identiferFilters) {
			this.identifer.addFilter(filter);
		}
		this.identifer.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, ReststructureViewsRepository.FORM_KIND));
		this.identifer.createControls(parent, widgetFactory);
		this.identifer.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.identifer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData identiferData = new GridData(GridData.FILL_HORIZONTAL);
		identiferData.horizontalSpan = 3;
		this.identifer.setLayoutData(identiferData);
		this.identifer.setLowerBound(1);
		this.identifer.setUpperBound(-1);
		identifer.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.identifer);
		identifer.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourceelementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resourceelements = new ReferencesTable(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_ResourceelementsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resourceelements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resourceelements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resourceelements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resourceelements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourceelementsFilters) {
			this.resourceelements.addFilter(filter);
		}
		this.resourceelements.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, ReststructureViewsRepository.FORM_KIND));
		this.resourceelements.createControls(parent, widgetFactory);
		this.resourceelements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourceelementsData = new GridData(GridData.FILL_HORIZONTAL);
		resourceelementsData.horizontalSpan = 3;
		this.resourceelements.setLayoutData(resourceelementsData);
		this.resourceelements.setLowerBound(0);
		this.resourceelements.setUpperBound(-1);
		resourceelements.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.resourceelements);
		resourceelements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMethodsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.methods = new ReferencesTable(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_MethodsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				methods.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				methods.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				methods.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				methods.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.methodsFilters) {
			this.methods.addFilter(filter);
		}
		this.methods.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.methods, ReststructureViewsRepository.FORM_KIND));
		this.methods.createControls(parent, widgetFactory);
		this.methods.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.methods, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData methodsData = new GridData(GridData.FILL_HORIZONTAL);
		methodsData.horizontalSpan = 3;
		this.methods.setLayoutData(methodsData);
		this.methods.setLowerBound(0);
		this.methods.setUpperBound(-1);
		methods.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.methods);
		methods.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCreatorsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.creators = new ReferencesTable(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_CreatorsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				creators.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				creators.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				creators.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.creators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				creators.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.creatorsFilters) {
			this.creators.addFilter(filter);
		}
		this.creators.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.creators, ReststructureViewsRepository.FORM_KIND));
		this.creators.createControls(parent, widgetFactory);
		this.creators.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.creators, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData creatorsData = new GridData(GridData.FILL_HORIZONTAL);
		creatorsData.horizontalSpan = 3;
		this.creators.setLayoutData(creatorsData);
		this.creators.setLowerBound(0);
		this.creators.setUpperBound(-1);
		creators.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.creators);
		creators.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStatesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.states = new ReferencesTable(ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_StatesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				states.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				states.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				states.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				states.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.statesFilters) {
			this.states.addFilter(filter);
		}
		this.states.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.states, ReststructureViewsRepository.FORM_KIND));
		this.states.createControls(parent, widgetFactory);
		this.states.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.states, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData statesData = new GridData(GridData.FILL_HORIZONTAL);
		statesData.horizontalSpan = 3;
		this.states.setLayoutData(statesData);
		this.states.setLowerBound(1);
		this.states.setUpperBound(-1);
		states.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.states);
		states.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInitialStateFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_InitialStateLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.PrimaryResourceType.Properties.initialState, ReststructureViewsRepository.FORM_KIND));
		initialState = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.PrimaryResourceType.Properties.initialState, ReststructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(initialState);
		initialState.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData initialStateData = new GridData(GridData.FILL_HORIZONTAL);
		initialState.setLayoutData(initialStateData);
		initialState.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.initialState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInitialState()));
			}

		});
		initialState.setID(ReststructureViewsRepository.PrimaryResourceType.Properties.initialState);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.initialState, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.PrimaryResourceType.Properties.name, ReststructureViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ReststructureViewsRepository.PrimaryResourceType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.name, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsSingletonCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSingleton = widgetFactory.createButton(parent, ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_IsSingletonLabel, SWT.CHECK);
		isSingleton.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.isSingleton, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSingleton.getSelection())));
			}

		});
		GridData isSingletonData = new GridData(GridData.FILL_HORIZONTAL);
		isSingletonData.horizontalSpan = 2;
		isSingleton.setLayoutData(isSingletonData);
		EditingUtils.setID(isSingleton, ReststructureViewsRepository.PrimaryResourceType.Properties.isSingleton);
		EditingUtils.setEEFtype(isSingleton, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.isSingleton, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCreateOnStartCheckbox(FormToolkit widgetFactory, Composite parent) {
		createOnStart = widgetFactory.createButton(parent, ReststructureMessages.PrimaryResourceTypePropertiesEditionPart_CreateOnStartLabel, SWT.CHECK);
		createOnStart.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimaryResourceTypePropertiesEditionPartForm.this, ReststructureViewsRepository.PrimaryResourceType.Properties.createOnStart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(createOnStart.getSelection())));
			}

		});
		GridData createOnStartData = new GridData(GridData.FILL_HORIZONTAL);
		createOnStartData.horizontalSpan = 2;
		createOnStart.setLayoutData(createOnStartData);
		EditingUtils.setID(createOnStart, ReststructureViewsRepository.PrimaryResourceType.Properties.createOnStart);
		EditingUtils.setEEFtype(createOnStart, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.PrimaryResourceType.Properties.createOnStart, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initIdentifer(EObject current, EReference containingFeature, EReference feature)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#updateIdentifer()
	 * 
	 */
	public void updateIdentifer() {
	identifer.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterIdentifer(ViewerFilter filter)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterIdentifer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIdentifer(ViewerFilter filter) {
		identiferBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#isContainedInIdentiferTable(EObject element)
	 * 
	 */
	public boolean isContainedInIdentiferTable(EObject element) {
		return ((ReferencesTableSettings)identifer.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initResourceelements(EObject current, EReference containingFeature, EReference feature)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#updateResourceelements()
	 * 
	 */
	public void updateResourceelements() {
	resourceelements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterResourceelements(ViewerFilter filter)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterResourceelements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResourceelements(ViewerFilter filter) {
		resourceelementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#isContainedInResourceelementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourceelementsTable(EObject element) {
		return ((ReferencesTableSettings)resourceelements.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initMethods(EObject current, EReference containingFeature, EReference feature)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#updateMethods()
	 * 
	 */
	public void updateMethods() {
	methods.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterMethods(ViewerFilter filter)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter) {
		methodsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#isContainedInMethodsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element) {
		return ((ReferencesTableSettings)methods.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initCreators(EObject current, EReference containingFeature, EReference feature)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#updateCreators()
	 * 
	 */
	public void updateCreators() {
	creators.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterCreators(ViewerFilter filter)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterCreators(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreators(ViewerFilter filter) {
		creatorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#isContainedInCreatorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCreatorsTable(EObject element) {
		return ((ReferencesTableSettings)creators.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initStates(EObject current, EReference containingFeature, EReference feature)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#updateStates()
	 * 
	 */
	public void updateStates() {
	states.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterStates(ViewerFilter filter)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterStates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStates(ViewerFilter filter) {
		statesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#isContainedInStatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStatesTable(EObject element) {
		return ((ReferencesTableSettings)states.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#getInitialState()
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#initInitialState(EObjectFlatComboSettings)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#setInitialState(EObject newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#setInitialStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInitialStateButtonMode(ButtonsModeEnum newValue) {
		initialState.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addFilterInitialState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInitialState(ViewerFilter filter) {
		initialState.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#addBusinessFilterInitialState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInitialState(ViewerFilter filter) {
		initialState.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#getIsSingleton()
	 * 
	 */
	public Boolean getIsSingleton() {
		return Boolean.valueOf(isSingleton.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#setIsSingleton(Boolean newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#getCreateOnStart()
	 * 
	 */
	public Boolean getCreateOnStart() {
		return Boolean.valueOf(createOnStart.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.PrimaryResourceTypePropertiesEditionPart#setCreateOnStart(Boolean newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.PrimaryResourceType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
