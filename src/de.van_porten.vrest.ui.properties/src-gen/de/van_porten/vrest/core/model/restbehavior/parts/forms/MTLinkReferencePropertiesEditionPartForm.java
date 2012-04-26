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

import de.van_porten.vrest.core.model.restbehavior.parts.MTLinkReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MTLinkReferencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MTLinkReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedMTLink;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MTLinkReferencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mTLinkReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		mTLinkReferenceStep
			.addStep(RestbehaviorViewsRepository.MTLinkReference.Properties.class)
			.addStep(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink);
		
		
		composer = new PartComposer(mTLinkReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.MTLinkReference.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink) {
					return createReferencedMTLinkFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RestbehaviorMessages.MTLinkReferencePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createReferencedMTLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.MTLinkReferencePropertiesEditionPart_ReferencedMTLinkLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.FORM_KIND));
		referencedMTLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedMTLink);
		referencedMTLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedMTLinkData = new GridData(GridData.FILL_HORIZONTAL);
		referencedMTLink.setLayoutData(referencedMTLinkData);
		referencedMTLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTLinkReferencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedMTLink()));
			}

		});
		referencedMTLink.setID(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#getReferencedMTLink()
	 * 
	 */
	public EObject getReferencedMTLink() {
		if (referencedMTLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedMTLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#initReferencedMTLink(EObjectFlatComboSettings)
	 */
	public void initReferencedMTLink(EObjectFlatComboSettings settings) {
		referencedMTLink.setInput(settings);
		if (current != null) {
			referencedMTLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#setReferencedMTLink(EObject newValue)
	 * 
	 */
	public void setReferencedMTLink(EObject newValue) {
		if (newValue != null) {
			referencedMTLink.setSelection(new StructuredSelection(newValue));
		} else {
			referencedMTLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#setReferencedMTLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedMTLinkButtonMode(ButtonsModeEnum newValue) {
		referencedMTLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#addFilterReferencedMTLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedMTLink(ViewerFilter filter) {
		referencedMTLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MTLinkReferencePropertiesEditionPart#addBusinessFilterReferencedMTLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedMTLink(ViewerFilter filter) {
		referencedMTLink.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.MTLinkReference_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
