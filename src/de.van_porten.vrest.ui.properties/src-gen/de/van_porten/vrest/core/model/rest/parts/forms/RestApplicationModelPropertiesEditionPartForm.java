/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.rest.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.rest.parts.RestApplicationModelPropertiesEditionPart;
import de.van_porten.vrest.core.model.rest.parts.RestViewsRepository;
import de.van_porten.vrest.core.model.rest.providers.RestMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RestApplicationModelPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, RestApplicationModelPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable methodTypes;
	protected List<ViewerFilter> methodTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> methodTypesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataTypes;
	protected List<ViewerFilter> dataTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataTypesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mediaTypes;
	protected List<ViewerFilter> mediaTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mediaTypesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resourceTypes;
	protected List<ViewerFilter> resourceTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourceTypesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable relTypes;
	protected List<ViewerFilter> relTypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> relTypesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable optypes;
	protected List<ViewerFilter> optypesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> optypesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RestApplicationModelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence restApplicationModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = restApplicationModelStep.addStep(RestViewsRepository.RestApplicationModel.Properties.class);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.name);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.methodTypes);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.dataTypes);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.mediaTypes);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.resourceTypes);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.relTypes);
		propertiesStep.addStep(RestViewsRepository.RestApplicationModel.Properties.optypes);
		
		
		composer = new PartComposer(restApplicationModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestViewsRepository.RestApplicationModel.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.methodTypes) {
					return createMethodTypesTableComposition(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.dataTypes) {
					return createDataTypesTableComposition(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.mediaTypes) {
					return createMediaTypesTableComposition(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.resourceTypes) {
					return createResourceTypesTableComposition(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.relTypes) {
					return createRelTypesTableComposition(widgetFactory, parent);
				}
				if (key == RestViewsRepository.RestApplicationModel.Properties.optypes) {
					return createOptypesTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(RestMessages.RestApplicationModelPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RestMessages.RestApplicationModelPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RestViewsRepository.RestApplicationModel.Properties.name, RestViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, RestViewsRepository.RestApplicationModel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.name, RestViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMethodTypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.methodTypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_MethodTypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.methodTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				methodTypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.methodTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				methodTypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.methodTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				methodTypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.methodTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				methodTypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.methodTypesFilters) {
			this.methodTypes.addFilter(filter);
		}
		this.methodTypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.methodTypes, RestViewsRepository.FORM_KIND));
		this.methodTypes.createControls(parent, widgetFactory);
		this.methodTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.methodTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData methodTypesData = new GridData(GridData.FILL_HORIZONTAL);
		methodTypesData.horizontalSpan = 3;
		this.methodTypes.setLayoutData(methodTypesData);
		this.methodTypes.setLowerBound(0);
		this.methodTypes.setUpperBound(-1);
		methodTypes.setID(RestViewsRepository.RestApplicationModel.Properties.methodTypes);
		methodTypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataTypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataTypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_DataTypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.dataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataTypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.dataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataTypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.dataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataTypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.dataTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataTypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataTypesFilters) {
			this.dataTypes.addFilter(filter);
		}
		this.dataTypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.dataTypes, RestViewsRepository.FORM_KIND));
		this.dataTypes.createControls(parent, widgetFactory);
		this.dataTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.dataTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataTypesData = new GridData(GridData.FILL_HORIZONTAL);
		dataTypesData.horizontalSpan = 3;
		this.dataTypes.setLayoutData(dataTypesData);
		this.dataTypes.setLowerBound(0);
		this.dataTypes.setUpperBound(-1);
		dataTypes.setID(RestViewsRepository.RestApplicationModel.Properties.dataTypes);
		dataTypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMediaTypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.mediaTypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_MediaTypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.mediaTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				mediaTypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.mediaTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				mediaTypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.mediaTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				mediaTypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.mediaTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				mediaTypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.mediaTypesFilters) {
			this.mediaTypes.addFilter(filter);
		}
		this.mediaTypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.mediaTypes, RestViewsRepository.FORM_KIND));
		this.mediaTypes.createControls(parent, widgetFactory);
		this.mediaTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.mediaTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mediaTypesData = new GridData(GridData.FILL_HORIZONTAL);
		mediaTypesData.horizontalSpan = 3;
		this.mediaTypes.setLayoutData(mediaTypesData);
		this.mediaTypes.setLowerBound(0);
		this.mediaTypes.setUpperBound(-1);
		mediaTypes.setID(RestViewsRepository.RestApplicationModel.Properties.mediaTypes);
		mediaTypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourceTypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resourceTypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_ResourceTypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.resourceTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resourceTypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.resourceTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resourceTypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.resourceTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resourceTypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.resourceTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resourceTypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourceTypesFilters) {
			this.resourceTypes.addFilter(filter);
		}
		this.resourceTypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.resourceTypes, RestViewsRepository.FORM_KIND));
		this.resourceTypes.createControls(parent, widgetFactory);
		this.resourceTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.resourceTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourceTypesData = new GridData(GridData.FILL_HORIZONTAL);
		resourceTypesData.horizontalSpan = 3;
		this.resourceTypes.setLayoutData(resourceTypesData);
		this.resourceTypes.setLowerBound(0);
		this.resourceTypes.setUpperBound(-1);
		resourceTypes.setID(RestViewsRepository.RestApplicationModel.Properties.resourceTypes);
		resourceTypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRelTypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.relTypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_RelTypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.relTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				relTypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.relTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				relTypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.relTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				relTypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.relTypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				relTypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.relTypesFilters) {
			this.relTypes.addFilter(filter);
		}
		this.relTypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.relTypes, RestViewsRepository.FORM_KIND));
		this.relTypes.createControls(parent, widgetFactory);
		this.relTypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.relTypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData relTypesData = new GridData(GridData.FILL_HORIZONTAL);
		relTypesData.horizontalSpan = 3;
		this.relTypes.setLayoutData(relTypesData);
		this.relTypes.setLowerBound(0);
		this.relTypes.setUpperBound(-1);
		relTypes.setID(RestViewsRepository.RestApplicationModel.Properties.relTypes);
		relTypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOptypesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.optypes = new ReferencesTable(RestMessages.RestApplicationModelPropertiesEditionPart_OptypesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.optypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				optypes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.optypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				optypes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.optypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				optypes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.optypes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				optypes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.optypesFilters) {
			this.optypes.addFilter(filter);
		}
		this.optypes.setHelpText(propertiesEditionComponent.getHelpContent(RestViewsRepository.RestApplicationModel.Properties.optypes, RestViewsRepository.FORM_KIND));
		this.optypes.createControls(parent, widgetFactory);
		this.optypes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RestApplicationModelPropertiesEditionPartForm.this, RestViewsRepository.RestApplicationModel.Properties.optypes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData optypesData = new GridData(GridData.FILL_HORIZONTAL);
		optypesData.horizontalSpan = 3;
		this.optypes.setLayoutData(optypesData);
		this.optypes.setLowerBound(0);
		this.optypes.setUpperBound(-1);
		optypes.setID(RestViewsRepository.RestApplicationModel.Properties.optypes);
		optypes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initMethodTypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMethodTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		methodTypes.setContentProvider(contentProvider);
		methodTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateMethodTypes()
	 * 
	 */
	public void updateMethodTypes() {
	methodTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterMethodTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodTypes(ViewerFilter filter) {
		methodTypesFilters.add(filter);
		if (this.methodTypes != null) {
			this.methodTypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterMethodTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodTypes(ViewerFilter filter) {
		methodTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInMethodTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInMethodTypesTable(EObject element) {
		return ((ReferencesTableSettings)methodTypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initDataTypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataTypes.setContentProvider(contentProvider);
		dataTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateDataTypes()
	 * 
	 */
	public void updateDataTypes() {
	dataTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterDataTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataTypes(ViewerFilter filter) {
		dataTypesFilters.add(filter);
		if (this.dataTypes != null) {
			this.dataTypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterDataTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataTypes(ViewerFilter filter) {
		dataTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInDataTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataTypesTable(EObject element) {
		return ((ReferencesTableSettings)dataTypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initMediaTypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMediaTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mediaTypes.setContentProvider(contentProvider);
		mediaTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateMediaTypes()
	 * 
	 */
	public void updateMediaTypes() {
	mediaTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterMediaTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMediaTypes(ViewerFilter filter) {
		mediaTypesFilters.add(filter);
		if (this.mediaTypes != null) {
			this.mediaTypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterMediaTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMediaTypes(ViewerFilter filter) {
		mediaTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInMediaTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInMediaTypesTable(EObject element) {
		return ((ReferencesTableSettings)mediaTypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initResourceTypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResourceTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resourceTypes.setContentProvider(contentProvider);
		resourceTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateResourceTypes()
	 * 
	 */
	public void updateResourceTypes() {
	resourceTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterResourceTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResourceTypes(ViewerFilter filter) {
		resourceTypesFilters.add(filter);
		if (this.resourceTypes != null) {
			this.resourceTypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterResourceTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResourceTypes(ViewerFilter filter) {
		resourceTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInResourceTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourceTypesTable(EObject element) {
		return ((ReferencesTableSettings)resourceTypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initRelTypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRelTypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		relTypes.setContentProvider(contentProvider);
		relTypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateRelTypes()
	 * 
	 */
	public void updateRelTypes() {
	relTypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterRelTypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelTypes(ViewerFilter filter) {
		relTypesFilters.add(filter);
		if (this.relTypes != null) {
			this.relTypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterRelTypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelTypes(ViewerFilter filter) {
		relTypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInRelTypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInRelTypesTable(EObject element) {
		return ((ReferencesTableSettings)relTypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#initOptypes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOptypes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		optypes.setContentProvider(contentProvider);
		optypes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#updateOptypes()
	 * 
	 */
	public void updateOptypes() {
	optypes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addFilterOptypes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOptypes(ViewerFilter filter) {
		optypesFilters.add(filter);
		if (this.optypes != null) {
			this.optypes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#addBusinessFilterOptypes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOptypes(ViewerFilter filter) {
		optypesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.rest.parts.RestApplicationModelPropertiesEditionPart#isContainedInOptypesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOptypesTable(EObject element) {
		return ((ReferencesTableSettings)optypes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestMessages.RestApplicationModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
