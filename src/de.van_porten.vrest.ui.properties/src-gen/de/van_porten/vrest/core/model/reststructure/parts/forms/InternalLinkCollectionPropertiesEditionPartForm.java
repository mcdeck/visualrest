/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.reststructure.parts.InternalLinkCollectionPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class InternalLinkCollectionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, InternalLinkCollectionPropertiesEditionPart {

	protected Text name;
		protected ReferencesTable intElements;
		protected List<ViewerFilter> intElementsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> intElementsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InternalLinkCollectionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence internalLinkCollectionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = internalLinkCollectionStep.addStep(ReststructureViewsRepository.InternalLinkCollection.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.InternalLinkCollection.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.InternalLinkCollection.Properties.intElements);
		
		
		composer = new PartComposer(internalLinkCollectionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.InternalLinkCollection.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.InternalLinkCollection.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.InternalLinkCollection.Properties.intElements) {
					return createIntElementsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ReststructureMessages.InternalLinkCollectionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.InternalLinkCollectionPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLinkCollection.Properties.name, ReststructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ReststructureViewsRepository.InternalLinkCollection.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.InternalLinkCollection.Properties.name, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIntElementsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.intElements = new ReferencesTable(ReststructureMessages.InternalLinkCollectionPropertiesEditionPart_IntElementsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIntElements(); }
			public void handleEdit(EObject element) { editIntElements(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIntElements(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIntElements(element); }
			public void navigateTo(EObject element) { }
		});
		this.intElements.setHelpText(propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.InternalLinkCollection.Properties.intElements, ReststructureViewsRepository.FORM_KIND));
		this.intElements.createControls(parent, widgetFactory);
		this.intElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.intElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData intElementsData = new GridData(GridData.FILL_HORIZONTAL);
		intElementsData.horizontalSpan = 3;
		this.intElements.setLayoutData(intElementsData);
		this.intElements.disableMove();
		intElements.setID(ReststructureViewsRepository.InternalLinkCollection.Properties.intElements);
		intElements.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIntElements() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(intElements.getInput(), intElementsFilters, intElementsBusinessFilters,
		"intElements", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.intElements,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				intElements.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIntElements(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.intElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		intElements.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIntElements(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkCollectionPropertiesEditionPartForm.this, ReststructureViewsRepository.InternalLinkCollection.Properties.intElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		intElements.refresh();
	}

	/**
	 * 
	 */
	protected void editIntElements(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				intElements.refresh();
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#initIntElements(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIntElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		intElements.setContentProvider(contentProvider);
		intElements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#updateIntElements()
	 * 
	 */
	public void updateIntElements() {
	intElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#addFilterIntElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIntElements(ViewerFilter filter) {
		intElementsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#addBusinessFilterIntElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIntElements(ViewerFilter filter) {
		intElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkCollectionPropertiesEditionPart#isContainedInIntElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIntElementsTable(EObject element) {
		return ((ReferencesTableSettings)intElements.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.InternalLinkCollection_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
