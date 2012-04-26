/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.van_porten.vrest.core.model.reststructure.parts.RepresentationLinkPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationLinkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RepresentationLinkPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer correspondingLink;
	protected EObjectFlatComboViewer linkValue;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RepresentationLinkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence representationLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = representationLinkStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationLink.Properties.linkValue);
		
		
		composer = new PartComposer(representationLinkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.name) {
					return createNameText(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink) {
					return createCorrespondingLinkFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationLink.Properties.linkValue) {
					return createLinkValueFlatComboViewer(parent);
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
		propertiesGroup.setText(ReststructureMessages.RepresentationLinkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.RepresentationLink.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCorrespondingLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_CorrespondingLinkLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.SWT_KIND));
		correspondingLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.SWT_KIND));
		correspondingLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		correspondingLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCorrespondingLink()));
			}

		});
		GridData correspondingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		correspondingLink.setLayoutData(correspondingLinkData);
		correspondingLink.setID(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLinkValueFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationLinkPropertiesEditionPart_LinkValueLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.SWT_KIND));
		linkValue = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.SWT_KIND));
		linkValue.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		linkValue.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationLink.Properties.linkValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLinkValue()));
			}

		});
		GridData linkValueData = new GridData(GridData.FILL_HORIZONTAL);
		linkValue.setLayoutData(linkValueData);
		linkValue.setID(ReststructureViewsRepository.RepresentationLink.Properties.linkValue);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationLink.Properties.linkValue, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
