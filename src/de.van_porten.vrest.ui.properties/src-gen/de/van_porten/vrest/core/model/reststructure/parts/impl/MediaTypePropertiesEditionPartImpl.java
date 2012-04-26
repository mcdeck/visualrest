/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.van_porten.vrest.core.model.reststructure.parts.MediaTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MediaTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MediaTypePropertiesEditionPart {

protected ReferencesTable containedMTElements;
protected List<ViewerFilter> containedMTElementsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containedMTElementsFilters = new ArrayList<ViewerFilter>();
	protected Text name;
protected ReferencesTable containedMTLinks;
protected List<ViewerFilter> containedMTLinksBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containedMTLinksFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable containedMTLinkCollections;
protected List<ViewerFilter> containedMTLinkCollectionsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containedMTLinkCollectionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MediaTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mediaTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = mediaTypeStep.addStep(ReststructureViewsRepository.MediaType.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.MediaType.Properties.containedMTElements);
		propertiesStep.addStep(ReststructureViewsRepository.MediaType.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.MediaType.Properties.containedMTLinks);
		propertiesStep.addStep(ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections);
		
		
		composer = new PartComposer(mediaTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.MediaType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.MediaType.Properties.containedMTElements) {
					return createContainedMTElementsAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.MediaType.Properties.name) {
					return createNameText(parent);
				}
				if (key == ReststructureViewsRepository.MediaType.Properties.containedMTLinks) {
					return createContainedMTLinksAdvancedTableComposition(parent);
				}
				if (key == ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections) {
					return createContainedMTLinkCollectionsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(ReststructureMessages.MediaTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createContainedMTElementsAdvancedTableComposition(Composite parent) {
		this.containedMTElements = new ReferencesTable(ReststructureMessages.MediaTypePropertiesEditionPart_ContainedMTElementsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedMTElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedMTElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedMTElements.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedMTElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedMTElementsFilters) {
			this.containedMTElements.addFilter(filter);
		}
		this.containedMTElements.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.MediaType.Properties.containedMTElements, ReststructureViewsRepository.SWT_KIND));
		this.containedMTElements.createControls(parent);
		this.containedMTElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedMTElementsData = new GridData(GridData.FILL_HORIZONTAL);
		containedMTElementsData.horizontalSpan = 3;
		this.containedMTElements.setLayoutData(containedMTElementsData);
		this.containedMTElements.setLowerBound(0);
		this.containedMTElements.setUpperBound(-1);
		containedMTElements.setID(ReststructureViewsRepository.MediaType.Properties.containedMTElements);
		containedMTElements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.MediaTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.MediaType.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.MediaType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.MediaType.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainedMTLinksAdvancedTableComposition(Composite parent) {
		this.containedMTLinks = new ReferencesTable(ReststructureMessages.MediaTypePropertiesEditionPart_ContainedMTLinksLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedMTLinks.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedMTLinks.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedMTLinks.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedMTLinks.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedMTLinksFilters) {
			this.containedMTLinks.addFilter(filter);
		}
		this.containedMTLinks.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.MediaType.Properties.containedMTLinks, ReststructureViewsRepository.SWT_KIND));
		this.containedMTLinks.createControls(parent);
		this.containedMTLinks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedMTLinksData = new GridData(GridData.FILL_HORIZONTAL);
		containedMTLinksData.horizontalSpan = 3;
		this.containedMTLinks.setLayoutData(containedMTLinksData);
		this.containedMTLinks.setLowerBound(0);
		this.containedMTLinks.setUpperBound(-1);
		containedMTLinks.setID(ReststructureViewsRepository.MediaType.Properties.containedMTLinks);
		containedMTLinks.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainedMTLinkCollectionsAdvancedTableComposition(Composite parent) {
		this.containedMTLinkCollections = new ReferencesTable(ReststructureMessages.MediaTypePropertiesEditionPart_ContainedMTLinkCollectionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containedMTLinkCollections.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containedMTLinkCollections.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containedMTLinkCollections.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containedMTLinkCollections.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containedMTLinkCollectionsFilters) {
			this.containedMTLinkCollections.addFilter(filter);
		}
		this.containedMTLinkCollections.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, ReststructureViewsRepository.SWT_KIND));
		this.containedMTLinkCollections.createControls(parent);
		this.containedMTLinkCollections.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MediaTypePropertiesEditionPartImpl.this, ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedMTLinkCollectionsData = new GridData(GridData.FILL_HORIZONTAL);
		containedMTLinkCollectionsData.horizontalSpan = 3;
		this.containedMTLinkCollections.setLayoutData(containedMTLinkCollectionsData);
		this.containedMTLinkCollections.setLowerBound(0);
		this.containedMTLinkCollections.setUpperBound(-1);
		containedMTLinkCollections.setID(ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections);
		containedMTLinkCollections.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#initContainedMTElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedMTElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedMTElements.setContentProvider(contentProvider);
		containedMTElements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#updateContainedMTElements()
	 * 
	 */
	public void updateContainedMTElements() {
	containedMTElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addFilterContainedMTElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedMTElements(ViewerFilter filter) {
		containedMTElementsFilters.add(filter);
		if (this.containedMTElements != null) {
			this.containedMTElements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addBusinessFilterContainedMTElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedMTElements(ViewerFilter filter) {
		containedMTElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#isContainedInContainedMTElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedMTElementsTable(EObject element) {
		return ((ReferencesTableSettings)containedMTElements.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#initContainedMTLinks(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedMTLinks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedMTLinks.setContentProvider(contentProvider);
		containedMTLinks.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#updateContainedMTLinks()
	 * 
	 */
	public void updateContainedMTLinks() {
	containedMTLinks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addFilterContainedMTLinks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedMTLinks(ViewerFilter filter) {
		containedMTLinksFilters.add(filter);
		if (this.containedMTLinks != null) {
			this.containedMTLinks.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addBusinessFilterContainedMTLinks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedMTLinks(ViewerFilter filter) {
		containedMTLinksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#isContainedInContainedMTLinksTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedMTLinksTable(EObject element) {
		return ((ReferencesTableSettings)containedMTLinks.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#initContainedMTLinkCollections(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainedMTLinkCollections(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedMTLinkCollections.setContentProvider(contentProvider);
		containedMTLinkCollections.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#updateContainedMTLinkCollections()
	 * 
	 */
	public void updateContainedMTLinkCollections() {
	containedMTLinkCollections.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addFilterContainedMTLinkCollections(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedMTLinkCollections(ViewerFilter filter) {
		containedMTLinkCollectionsFilters.add(filter);
		if (this.containedMTLinkCollections != null) {
			this.containedMTLinkCollections.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#addBusinessFilterContainedMTLinkCollections(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedMTLinkCollections(ViewerFilter filter) {
		containedMTLinkCollectionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.MediaTypePropertiesEditionPart#isContainedInContainedMTLinkCollectionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedMTLinkCollectionsTable(EObject element) {
		return ((ReferencesTableSettings)containedMTLinkCollections.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.MediaType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
