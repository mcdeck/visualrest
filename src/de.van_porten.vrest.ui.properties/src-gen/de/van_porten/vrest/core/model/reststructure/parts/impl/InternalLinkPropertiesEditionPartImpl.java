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

import de.van_porten.vrest.core.model.reststructure.parts.InternalLinkPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class InternalLinkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InternalLinkPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer relType;
	protected EObjectFlatComboViewer target;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InternalLinkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence internalLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = internalLinkStep.addStep(ReststructureViewsRepository.InternalLink.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.InternalLink.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.InternalLink.Properties.relType);
		propertiesStep.addStep(ReststructureViewsRepository.InternalLink.Properties.target);
		
		
		composer = new PartComposer(internalLinkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.InternalLink.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.InternalLink.Properties.name) {
					return createNameText(parent);
				}
				if (key == ReststructureViewsRepository.InternalLink.Properties.relType) {
					return createRelTypeFlatComboViewer(parent);
				}
				if (key == ReststructureViewsRepository.InternalLink.Properties.target) {
					return createTargetFlatComboViewer(parent);
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
		propertiesGroup.setText(ReststructureMessages.InternalLinkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.InternalLinkPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLink.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.InternalLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.InternalLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.InternalLink.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.InternalLink.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRelTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.InternalLinkPropertiesEditionPart_RelTypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLink.Properties.relType, ReststructureViewsRepository.SWT_KIND));
		relType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLink.Properties.relType, ReststructureViewsRepository.SWT_KIND));
		relType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		relType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.InternalLink.Properties.relType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRelType()));
			}

		});
		GridData relTypeData = new GridData(GridData.FILL_HORIZONTAL);
		relType.setLayoutData(relTypeData);
		relType.setID(ReststructureViewsRepository.InternalLink.Properties.relType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.InternalLink.Properties.relType, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.InternalLinkPropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLink.Properties.target, ReststructureViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.InternalLink.Properties.target, ReststructureViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InternalLinkPropertiesEditionPartImpl.this, ReststructureViewsRepository.InternalLink.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(ReststructureViewsRepository.InternalLink.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.InternalLink.Properties.target, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#getRelType()
	 * 
	 */
	public EObject getRelType() {
		if (relType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) relType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#initRelType(EObjectFlatComboSettings)
	 */
	public void initRelType(EObjectFlatComboSettings settings) {
		relType.setInput(settings);
		if (current != null) {
			relType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#setRelType(EObject newValue)
	 * 
	 */
	public void setRelType(EObject newValue) {
		if (newValue != null) {
			relType.setSelection(new StructuredSelection(newValue));
		} else {
			relType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#setRelTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRelTypeButtonMode(ButtonsModeEnum newValue) {
		relType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#addFilterRelType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelType(ViewerFilter filter) {
		relType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#addBusinessFilterRelType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelType(ViewerFilter filter) {
		relType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#getTarget()
	 * 
	 */
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.InternalLinkPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.InternalLink_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
