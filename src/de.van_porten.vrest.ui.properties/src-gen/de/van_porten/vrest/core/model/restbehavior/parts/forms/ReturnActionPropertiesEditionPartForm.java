/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.parts.ReturnActionPropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ReturnActionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ReturnActionPropertiesEditionPart {

	protected ReferencesTable metadata;
	protected List<ViewerFilter> metadataBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> metadataFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReturnActionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence returnActionStep = new BindingCompositionSequence(propertiesEditionComponent);
		returnActionStep.addStep(RestbehaviorViewsRepository.ReturnAction.metadata);
		
		composer = new PartComposer(returnActionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.ReturnAction.metadata) {
					return createMetadataTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * @param container
	 * 
	 */
	protected Composite createMetadataTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.metadata = new ReferencesTable(RestbehaviorMessages.ReturnActionPropertiesEditionPart_MetadataLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReturnActionPropertiesEditionPartForm.this, RestbehaviorViewsRepository.ReturnAction.metadata, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				metadata.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReturnActionPropertiesEditionPartForm.this, RestbehaviorViewsRepository.ReturnAction.metadata, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				metadata.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReturnActionPropertiesEditionPartForm.this, RestbehaviorViewsRepository.ReturnAction.metadata, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				metadata.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReturnActionPropertiesEditionPartForm.this, RestbehaviorViewsRepository.ReturnAction.metadata, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				metadata.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.metadataFilters) {
			this.metadata.addFilter(filter);
		}
		this.metadata.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.ReturnAction.metadata, RestbehaviorViewsRepository.FORM_KIND));
		this.metadata.createControls(parent, widgetFactory);
		this.metadata.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReturnActionPropertiesEditionPartForm.this, RestbehaviorViewsRepository.ReturnAction.metadata, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metadataData = new GridData(GridData.FILL_HORIZONTAL);
		metadataData.horizontalSpan = 3;
		this.metadata.setLayoutData(metadataData);
		this.metadata.setLowerBound(0);
		this.metadata.setUpperBound(-1);
		metadata.setID(RestbehaviorViewsRepository.ReturnAction.metadata);
		metadata.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ReturnActionPropertiesEditionPart#initMetadata(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMetadata(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metadata.setContentProvider(contentProvider);
		metadata.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ReturnActionPropertiesEditionPart#updateMetadata()
	 * 
	 */
	public void updateMetadata() {
	metadata.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ReturnActionPropertiesEditionPart#addFilterMetadata(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetadata(ViewerFilter filter) {
		metadataFilters.add(filter);
		if (this.metadata != null) {
			this.metadata.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ReturnActionPropertiesEditionPart#addBusinessFilterMetadata(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetadata(ViewerFilter filter) {
		metadataBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ReturnActionPropertiesEditionPart#isContainedInMetadataTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetadataTable(EObject element) {
		return ((ReferencesTableSettings)metadata.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.ReturnAction_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
