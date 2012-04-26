/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.van_porten.vrest.core.model.restbehavior.parts.MtElementReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MtElementReferencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MtElementReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedMTElement;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MtElementReferencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mtElementReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		mtElementReferenceStep
			.addStep(RestbehaviorViewsRepository.MtElementReference.Properties.class)
			.addStep(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement);
		
		
		composer = new PartComposer(mtElementReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.MtElementReference.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement) {
					return createReferencedMTElementFlatComboViewer(parent);
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
		propertiesGroup.setText(RestbehaviorMessages.MtElementReferencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferencedMTElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.MtElementReferencePropertiesEditionPart_ReferencedMTElementLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement, RestbehaviorViewsRepository.SWT_KIND));
		referencedMTElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement, RestbehaviorViewsRepository.SWT_KIND));
		referencedMTElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencedMTElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MtElementReferencePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferencedMTElement()));
			}

		});
		GridData referencedMTElementData = new GridData(GridData.FILL_HORIZONTAL);
		referencedMTElement.setLayoutData(referencedMTElementData);
		referencedMTElement.setID(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#getReferencedMTElement()
	 * 
	 */
	public EObject getReferencedMTElement() {
		if (referencedMTElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedMTElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#initReferencedMTElement(EObjectFlatComboSettings)
	 */
	public void initReferencedMTElement(EObjectFlatComboSettings settings) {
		referencedMTElement.setInput(settings);
		if (current != null) {
			referencedMTElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#setReferencedMTElement(EObject newValue)
	 * 
	 */
	public void setReferencedMTElement(EObject newValue) {
		if (newValue != null) {
			referencedMTElement.setSelection(new StructuredSelection(newValue));
		} else {
			referencedMTElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#setReferencedMTElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedMTElementButtonMode(ButtonsModeEnum newValue) {
		referencedMTElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#addFilterReferencedMTElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedMTElement(ViewerFilter filter) {
		referencedMTElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.MtElementReferencePropertiesEditionPart#addBusinessFilterReferencedMTElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedMTElement(ViewerFilter filter) {
		referencedMTElement.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.MtElementReference_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
