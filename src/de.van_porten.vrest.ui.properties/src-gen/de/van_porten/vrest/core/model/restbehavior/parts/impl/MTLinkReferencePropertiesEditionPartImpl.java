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

import de.van_porten.vrest.core.model.restbehavior.parts.MTLinkReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MTLinkReferencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MTLinkReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedMTLink;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MTLinkReferencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence mTLinkReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		mTLinkReferenceStep
			.addStep(RestbehaviorViewsRepository.MTLinkReference.Properties.class)
			.addStep(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink);
		
		
		composer = new PartComposer(mTLinkReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.MTLinkReference.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink) {
					return createReferencedMTLinkFlatComboViewer(parent);
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
		propertiesGroup.setText(RestbehaviorMessages.MTLinkReferencePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createReferencedMTLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.MTLinkReferencePropertiesEditionPart_ReferencedMTLinkLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.SWT_KIND));
		referencedMTLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.SWT_KIND));
		referencedMTLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencedMTLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MTLinkReferencePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferencedMTLink()));
			}

		});
		GridData referencedMTLinkData = new GridData(GridData.FILL_HORIZONTAL);
		referencedMTLink.setLayoutData(referencedMTLinkData);
		referencedMTLink.setID(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.MTLinkReference.Properties.referencedMTLink, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
