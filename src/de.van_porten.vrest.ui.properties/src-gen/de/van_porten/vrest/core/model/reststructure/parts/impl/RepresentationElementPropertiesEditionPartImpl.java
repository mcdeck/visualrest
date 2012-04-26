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

import de.van_porten.vrest.core.model.reststructure.parts.RepresentationElementPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RepresentationElementPropertiesEditionPart {

	protected EObjectFlatComboViewer correspondingElement;
	protected EObjectFlatComboViewer repElemType;
	protected Text name;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RepresentationElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence representationElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = representationElementStep.addStep(ReststructureViewsRepository.RepresentationElement.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationElement.Properties.repElemType);
		propertiesStep.addStep(ReststructureViewsRepository.RepresentationElement.Properties.name);
		
		
		composer = new PartComposer(representationElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.RepresentationElement.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement) {
					return createCorrespondingElementFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationElement.Properties.repElemType) {
					return createRepElemTypeFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.RepresentationElement.Properties.name) {
					return createNameText(parent);
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
		propertiesGroup.setText(ReststructureMessages.RepresentationElementPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createCorrespondingElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationElementPropertiesEditionPart_CorrespondingElementLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement, ReststructureViewsRepository.SWT_KIND));
		correspondingElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement, ReststructureViewsRepository.SWT_KIND));
		correspondingElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		correspondingElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationElementPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCorrespondingElement()));
			}

		});
		GridData correspondingElementData = new GridData(GridData.FILL_HORIZONTAL);
		correspondingElement.setLayoutData(correspondingElementData);
		correspondingElement.setID(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRepElemTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationElementPropertiesEditionPart_RepElemTypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationElement.Properties.repElemType, ReststructureViewsRepository.SWT_KIND));
		repElemType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationElement.Properties.repElemType, ReststructureViewsRepository.SWT_KIND));
		repElemType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		repElemType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationElementPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationElement.Properties.repElemType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepElemType()));
			}

		});
		GridData repElemTypeData = new GridData(GridData.FILL_HORIZONTAL);
		repElemType.setLayoutData(repElemTypeData);
		repElemType.setID(ReststructureViewsRepository.RepresentationElement.Properties.repElemType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationElement.Properties.repElemType, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.RepresentationElementPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.RepresentationElement.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationElementPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationElement.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RepresentationElementPropertiesEditionPartImpl.this, ReststructureViewsRepository.RepresentationElement.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.RepresentationElement.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.RepresentationElement.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#getCorrespondingElement()
	 * 
	 */
	public EObject getCorrespondingElement() {
		if (correspondingElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) correspondingElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#initCorrespondingElement(EObjectFlatComboSettings)
	 */
	public void initCorrespondingElement(EObjectFlatComboSettings settings) {
		correspondingElement.setInput(settings);
		if (current != null) {
			correspondingElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#setCorrespondingElement(EObject newValue)
	 * 
	 */
	public void setCorrespondingElement(EObject newValue) {
		if (newValue != null) {
			correspondingElement.setSelection(new StructuredSelection(newValue));
		} else {
			correspondingElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#setCorrespondingElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCorrespondingElementButtonMode(ButtonsModeEnum newValue) {
		correspondingElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#addFilterCorrespondingElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCorrespondingElement(ViewerFilter filter) {
		correspondingElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#addBusinessFilterCorrespondingElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCorrespondingElement(ViewerFilter filter) {
		correspondingElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#getRepElemType()
	 * 
	 */
	public EObject getRepElemType() {
		if (repElemType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) repElemType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#initRepElemType(EObjectFlatComboSettings)
	 */
	public void initRepElemType(EObjectFlatComboSettings settings) {
		repElemType.setInput(settings);
		if (current != null) {
			repElemType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#setRepElemType(EObject newValue)
	 * 
	 */
	public void setRepElemType(EObject newValue) {
		if (newValue != null) {
			repElemType.setSelection(new StructuredSelection(newValue));
		} else {
			repElemType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#setRepElemTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepElemTypeButtonMode(ButtonsModeEnum newValue) {
		repElemType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#addFilterRepElemType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepElemType(ViewerFilter filter) {
		repElemType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#addBusinessFilterRepElemType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepElemType(ViewerFilter filter) {
		repElemType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.RepresentationElementPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.RepresentationElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
