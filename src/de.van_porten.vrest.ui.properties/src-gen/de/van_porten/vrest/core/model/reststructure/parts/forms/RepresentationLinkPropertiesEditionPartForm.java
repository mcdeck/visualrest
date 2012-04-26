/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.van_porten.vrest.core.model.reststructure.parts.RepresentationLinkPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationLinkPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, RepresentationLinkPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer correspondingLink;
	protected EObjectFlatComboViewer linkValue;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RepresentationLinkPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence representationLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = representationLinkStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.linkValue);
		
		
		composer = new PartComposer(representationLinkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink) {
					return createCorrespondingLinkFlatComboViewer(parent, widgetFactory);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.linkValue) {
					return createLinkValueFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ReststructureMessages.RepresentationLinkPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.name, ReststructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartForm.this, ReststructureViewsRepository.RepresentationLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartForm.this, ReststructureViewsRepository.RepresentationLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ReststructureViewsRepository.RepresentationLink.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.name, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCorrespondingLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_CorrespondingLinkLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.FORM_KIND));
		correspondingLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(correspondingLink);
		correspondingLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData correspondingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		correspondingLink.setLayoutData(correspondingLinkData);
		correspondingLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartForm.this, ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCorrespondingLink()));
			}

		});
		correspondingLink.setID(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLinkValueFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_LinkValueLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.FORM_KIND));
		linkValue = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(linkValue);
		linkValue.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData linkValueData = new GridData(GridData.FILL_HORIZONTAL);
		linkValue.setLayoutData(linkValueData);
		linkValue.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartForm.this, ReststructureViewsRepository.RepresentationLink.Properties.linkValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLinkValue()));
			}

		});
		linkValue.setID(ReststructureViewsRepository.RepresentationLink.Properties.linkValue);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#getCorrespondingLink()
	 * 
	 */
	public EObject getCorrespondingLink() {
		if (correspondingLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) correspondingLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#initCorrespondingLink(EObjectFlatComboSettings)
	 */
	public void initCorrespondingLink(EObjectFlatComboSettings settings) {
		correspondingLink.setInput(settings);
		if (current != null) {
			correspondingLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#setCorrespondingLink(EObject newValue)
	 * 
	 */
	public void setCorrespondingLink(EObject newValue) {
		if (newValue != null) {
			correspondingLink.setSelection(new StructuredSelection(newValue));
		} else {
			correspondingLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#setCorrespondingLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCorrespondingLinkButtonMode(ButtonsModeEnum newValue) {
		correspondingLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#addFilterCorrespondingLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCorrespondingLink(ViewerFilter filter) {
		correspondingLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#addBusinessFilterCorrespondingLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCorrespondingLink(ViewerFilter filter) {
		correspondingLink.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#getLinkValue()
	 * 
	 */
	public EObject getLinkValue() {
		if (linkValue.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) linkValue.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#initLinkValue(EObjectFlatComboSettings)
	 */
	public void initLinkValue(EObjectFlatComboSettings settings) {
		linkValue.setInput(settings);
		if (current != null) {
			linkValue.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#setLinkValue(EObject newValue)
	 * 
	 */
	public void setLinkValue(EObject newValue) {
		if (newValue != null) {
			linkValue.setSelection(new StructuredSelection(newValue));
		} else {
			linkValue.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#setLinkValueButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLinkValueButtonMode(ButtonsModeEnum newValue) {
		linkValue.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#addFilterLinkValue(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkValue(ViewerFilter filter) {
		linkValue.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationLinkPropertiesEditionPart#addBusinessFilterLinkValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkValue(ViewerFilter filter) {
		linkValue.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.RepresentationLink_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
