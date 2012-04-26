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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.reststructure.parts.RepresentationPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, RepresentationPropertiesEditionPart {

	protected ReferencesTable containedRepElements;
	protected List<ViewerFilter> containedRepElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containedRepElementsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mediatype;
	protected Text name;
	protected ReferencesTable containedRepLinks;
	protected List<ViewerFilter> containedRepLinksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containedRepLinksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable containedRepLinkCollections;
	protected List<ViewerFilter> containedRepLinkCollectionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containedRepLinkCollectionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RepresentationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence representationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = representationStep.addStep(ReststructureViewsRepository.Representation.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.Representation.Properties.containedRepElements);
		propertiesStep.addStep(ReststructureViewsRepository.Representation.Properties.mediatype);
		propertiesStep.addStep(ReststructureViewsRepository.Representation.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.Representation.Properties.containedRepLinks);
		propertiesStep.addStep(ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections);
		
		
		composer = new PartComposer(representationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.Representation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.Representation.Properties.containedRepElements) {
					return createContainedRepElementsTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.Representation.Properties.mediatype) {
					return createMediatypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == ReststructureViewsRepository.Representation.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.Representation.Properties.containedRepLinks) {
					return createContainedRepLinksTableComposition(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections) {
					return createContainedRepLinkCollectionsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ReststructureMessages.RepresentationPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createContainedRepElementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.containedRepElements = new ReferencesTable(ReststructureMessages.RepresentationPropertiesEditionPart_ContainedRepElementsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedRepElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedRepElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedRepElements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedRepElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedRepElementsFilters) {
			this.containedRepElements.addFilter(filter);
		}
		this.containedRepElements.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Representation.Properties.containedRepElements, ReststructureViewsRepository.FORM_KIND));
		this.containedRepElements.createControls(parent, widgetFactory);
		this.containedRepElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedRepElementsData = new GridData(GridData.FILL_HORIZONTAL);
		containedRepElementsData.horizontalSpan = 3;
		this.containedRepElements.setLayoutData(containedRepElementsData);
		this.containedRepElements.setLowerBound(0);
		this.containedRepElements.setUpperBound(-1);
		containedRepElements.setID(ReststructureViewsRepository.Representation.Properties.containedRepElements);
		containedRepElements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMediatypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.RepresentationPropertiesEditionPart_MediatypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Representation.Properties.mediatype, ReststructureViewsRepository.FORM_KIND));
		mediatype = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.Representation.Properties.mediatype, ReststructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(mediatype);
		mediatype.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData mediatypeData = new GridData(GridData.FILL_HORIZONTAL);
		mediatype.setLayoutData(mediatypeData);
		mediatype.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.mediatype, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMediatype()));
			}

		});
		mediatype.setID(ReststructureViewsRepository.Representation.Properties.mediatype);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Representation.Properties.mediatype, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.RepresentationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Representation.Properties.name, ReststructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ReststructureViewsRepository.Representation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Representation.Properties.name, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainedRepLinksTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.containedRepLinks = new ReferencesTable(ReststructureMessages.RepresentationPropertiesEditionPart_ContainedRepLinksLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedRepLinks.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedRepLinks.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedRepLinks.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedRepLinks.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedRepLinksFilters) {
			this.containedRepLinks.addFilter(filter);
		}
		this.containedRepLinks.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Representation.Properties.containedRepLinks, ReststructureViewsRepository.FORM_KIND));
		this.containedRepLinks.createControls(parent, widgetFactory);
		this.containedRepLinks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedRepLinksData = new GridData(GridData.FILL_HORIZONTAL);
		containedRepLinksData.horizontalSpan = 3;
		this.containedRepLinks.setLayoutData(containedRepLinksData);
		this.containedRepLinks.setLowerBound(0);
		this.containedRepLinks.setUpperBound(-1);
		containedRepLinks.setID(ReststructureViewsRepository.Representation.Properties.containedRepLinks);
		containedRepLinks.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainedRepLinkCollectionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.containedRepLinkCollections = new ReferencesTable(ReststructureMessages.RepresentationPropertiesEditionPart_ContainedRepLinkCollectionsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedRepLinkCollections.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedRepLinkCollections.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedRepLinkCollections.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedRepLinkCollections.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedRepLinkCollectionsFilters) {
			this.containedRepLinkCollections.addFilter(filter);
		}
		this.containedRepLinkCollections.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, ReststructureViewsRepository.FORM_KIND));
		this.containedRepLinkCollections.createControls(parent, widgetFactory);
		this.containedRepLinkCollections.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationPropertiesEditionPartForm.this, ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedRepLinkCollectionsData = new GridData(GridData.FILL_HORIZONTAL);
		containedRepLinkCollectionsData.horizontalSpan = 3;
		this.containedRepLinkCollections.setLayoutData(containedRepLinkCollectionsData);
		this.containedRepLinkCollections.setLowerBound(0);
		this.containedRepLinkCollections.setUpperBound(-1);
		containedRepLinkCollections.setID(ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections);
		containedRepLinkCollections.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#initContainedRepElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedRepElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedRepElements.setContentProvider(contentProvider);
		containedRepElements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#updateContainedRepElements()
	 * 
	 */
	public void updateContainedRepElements() {
	containedRepElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addFilterContainedRepElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedRepElements(ViewerFilter filter) {
		containedRepElementsFilters.add(filter);
		if (this.containedRepElements != null) {
			this.containedRepElements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addBusinessFilterContainedRepElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedRepElements(ViewerFilter filter) {
		containedRepElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#isContainedInContainedRepElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedRepElementsTable(EObject element) {
		return ((ReferencesTableSettings)containedRepElements.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#getMediatype()
	 * 
	 */
	public EObject getMediatype() {
		if (mediatype.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mediatype.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#initMediatype(EObjectFlatComboSettings)
	 */
	public void initMediatype(EObjectFlatComboSettings settings) {
		mediatype.setInput(settings);
		if (current != null) {
			mediatype.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#setMediatype(EObject newValue)
	 * 
	 */
	public void setMediatype(EObject newValue) {
		if (newValue != null) {
			mediatype.setSelection(new StructuredSelection(newValue));
		} else {
			mediatype.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#setMediatypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMediatypeButtonMode(ButtonsModeEnum newValue) {
		mediatype.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addFilterMediatype(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMediatype(ViewerFilter filter) {
		mediatype.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addBusinessFilterMediatype(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMediatype(ViewerFilter filter) {
		mediatype.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#initContainedRepLinks(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedRepLinks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedRepLinks.setContentProvider(contentProvider);
		containedRepLinks.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#updateContainedRepLinks()
	 * 
	 */
	public void updateContainedRepLinks() {
	containedRepLinks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addFilterContainedRepLinks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedRepLinks(ViewerFilter filter) {
		containedRepLinksFilters.add(filter);
		if (this.containedRepLinks != null) {
			this.containedRepLinks.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addBusinessFilterContainedRepLinks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedRepLinks(ViewerFilter filter) {
		containedRepLinksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#isContainedInContainedRepLinksTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedRepLinksTable(EObject element) {
		return ((ReferencesTableSettings)containedRepLinks.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#initContainedRepLinkCollections(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedRepLinkCollections(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedRepLinkCollections.setContentProvider(contentProvider);
		containedRepLinkCollections.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#updateContainedRepLinkCollections()
	 * 
	 */
	public void updateContainedRepLinkCollections() {
	containedRepLinkCollections.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addFilterContainedRepLinkCollections(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedRepLinkCollections(ViewerFilter filter) {
		containedRepLinkCollectionsFilters.add(filter);
		if (this.containedRepLinkCollections != null) {
			this.containedRepLinkCollections.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#addBusinessFilterContainedRepLinkCollections(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedRepLinkCollections(ViewerFilter filter) {
		containedRepLinkCollectionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationPropertiesEditionPart#isContainedInContainedRepLinkCollectionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedRepLinkCollectionsTable(EObject element) {
		return ((ReferencesTableSettings)containedRepLinkCollections.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.Representation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
