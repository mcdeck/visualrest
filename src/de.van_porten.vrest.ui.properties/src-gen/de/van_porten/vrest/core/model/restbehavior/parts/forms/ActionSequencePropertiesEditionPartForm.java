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
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.restbehavior.parts.ActionSequencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ActionSequencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ActionSequencePropertiesEditionPart {

	protected ReferencesTable actionelements;
	protected List<ViewerFilter> actionelementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> actionelementsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ActionSequencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence actionSequenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		actionSequenceStep
			.addStep(RestbehaviorViewsRepository.ActionSequence.Properties.class)
			.addStep(RestbehaviorViewsRepository.ActionSequence.Properties.actionelements);
		
		
		composer = new PartComposer(actionSequenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.ActionSequence.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.ActionSequence.Properties.actionelements) {
					return createActionelementsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(RestbehaviorMessages.ActionSequencePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createActionelementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.actionelements = new ReferencesTable(RestbehaviorMessages.ActionSequencePropertiesEditionPart_ActionelementsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActionSequencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actionelements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActionSequencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actionelements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActionSequencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actionelements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActionSequencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actionelements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actionelementsFilters) {
			this.actionelements.addFilter(filter);
		}
		this.actionelements.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, RestbehaviorViewsRepository.FORM_KIND));
		this.actionelements.createControls(parent, widgetFactory);
		this.actionelements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActionSequencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ActionSequence.Properties.actionelements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData actionelementsData = new GridData(GridData.FILL_HORIZONTAL);
		actionelementsData.horizontalSpan = 3;
		this.actionelements.setLayoutData(actionelementsData);
		this.actionelements.setLowerBound(1);
		this.actionelements.setUpperBound(-1);
		actionelements.setID(RestbehaviorViewsRepository.ActionSequence.Properties.actionelements);
		actionelements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ActionSequencePropertiesEditionPart#initActionelements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initActionelements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		actionelements.setContentProvider(contentProvider);
		actionelements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ActionSequencePropertiesEditionPart#updateActionelements()
	 * 
	 */
	public void updateActionelements() {
	actionelements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ActionSequencePropertiesEditionPart#addFilterActionelements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActionelements(ViewerFilter filter) {
		actionelementsFilters.add(filter);
		if (this.actionelements != null) {
			this.actionelements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ActionSequencePropertiesEditionPart#addBusinessFilterActionelements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActionelements(ViewerFilter filter) {
		actionelementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ActionSequencePropertiesEditionPart#isContainedInActionelementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInActionelementsTable(EObject element) {
		return ((ReferencesTableSettings)actionelements.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.ActionSequence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
