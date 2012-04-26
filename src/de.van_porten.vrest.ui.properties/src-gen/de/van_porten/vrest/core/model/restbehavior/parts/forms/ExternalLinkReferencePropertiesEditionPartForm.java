/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ExternalLinkReferencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ExternalLinkReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedExternalLink;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExternalLinkReferencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence externalLinkReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		externalLinkReferenceStep
			.addStep(RestbehaviorViewsRepository.ExternalLinkReference.Properties.class)
			.addStep(RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink);
		
		
		composer = new PartComposer(externalLinkReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.ExternalLinkReference.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink) {
					return createReferencedExternalLinkFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RestbehaviorMessages.ExternalLinkReferencePropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferencedExternalLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.ExternalLinkReferencePropertiesEditionPart_ReferencedExternalLinkLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink, RestbehaviorViewsRepository.FORM_KIND));
		referencedExternalLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedExternalLink);
		referencedExternalLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedExternalLinkData = new GridData(GridData.FILL_HORIZONTAL);
		referencedExternalLink.setLayoutData(referencedExternalLinkData);
		referencedExternalLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExternalLinkReferencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedExternalLink()));
			}

		});
		referencedExternalLink.setID(RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.ExternalLinkReference.Properties.referencedExternalLink, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#getReferencedExternalLink()
	 * 
	 */
	public EObject getReferencedExternalLink() {
		if (referencedExternalLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedExternalLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#initReferencedExternalLink(EObjectFlatComboSettings)
	 */
	public void initReferencedExternalLink(EObjectFlatComboSettings settings) {
		referencedExternalLink.setInput(settings);
		if (current != null) {
			referencedExternalLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#setReferencedExternalLink(EObject newValue)
	 * 
	 */
	public void setReferencedExternalLink(EObject newValue) {
		if (newValue != null) {
			referencedExternalLink.setSelection(new StructuredSelection(newValue));
		} else {
			referencedExternalLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#setReferencedExternalLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedExternalLinkButtonMode(ButtonsModeEnum newValue) {
		referencedExternalLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#addFilterReferencedExternalLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedExternalLink(ViewerFilter filter) {
		referencedExternalLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.ExternalLinkReferencePropertiesEditionPart#addBusinessFilterReferencedExternalLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedExternalLink(ViewerFilter filter) {
		referencedExternalLink.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.ExternalLinkReference_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
