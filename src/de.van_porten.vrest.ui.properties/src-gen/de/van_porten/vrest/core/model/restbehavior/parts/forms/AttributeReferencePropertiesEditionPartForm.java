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

import de.van_porten.vrest.core.model.restbehavior.parts.AttributeReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class AttributeReferencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AttributeReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedAttribute;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeReferencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		attributeReferenceStep
			.addStep(RestbehaviorViewsRepository.AttributeReference.Properties.class)
			.addStep(RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute);
		
		
		composer = new PartComposer(attributeReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.AttributeReference.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute) {
					return createReferencedAttributeFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RestbehaviorMessages.AttributeReferencePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createReferencedAttributeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.AttributeReferencePropertiesEditionPart_ReferencedAttributeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute, RestbehaviorViewsRepository.FORM_KIND));
		referencedAttribute = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedAttribute);
		referencedAttribute.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedAttributeData = new GridData(GridData.FILL_HORIZONTAL);
		referencedAttribute.setLayoutData(referencedAttributeData);
		referencedAttribute.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeReferencePropertiesEditionPartForm.this, RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedAttribute()));
			}

		});
		referencedAttribute.setID(RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.AttributeReference.Properties.referencedAttribute, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#getReferencedAttribute()
	 * 
	 */
	public EObject getReferencedAttribute() {
		if (referencedAttribute.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedAttribute.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#initReferencedAttribute(EObjectFlatComboSettings)
	 */
	public void initReferencedAttribute(EObjectFlatComboSettings settings) {
		referencedAttribute.setInput(settings);
		if (current != null) {
			referencedAttribute.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#setReferencedAttribute(EObject newValue)
	 * 
	 */
	public void setReferencedAttribute(EObject newValue) {
		if (newValue != null) {
			referencedAttribute.setSelection(new StructuredSelection(newValue));
		} else {
			referencedAttribute.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#setReferencedAttributeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedAttributeButtonMode(ButtonsModeEnum newValue) {
		referencedAttribute.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#addFilterReferencedAttribute(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedAttribute(ViewerFilter filter) {
		referencedAttribute.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.AttributeReferencePropertiesEditionPart#addBusinessFilterReferencedAttribute(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedAttribute(ViewerFilter filter) {
		referencedAttribute.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.AttributeReference_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
