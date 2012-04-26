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

import de.van_porten.vrest.core.model.reststructure.parts.AttributePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;
import de.van_porten.vrest.core.model.reststructure.providers.ReststructureMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class AttributePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AttributePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer attrType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeStep.addStep(ReststructureViewsRepository.Attribute.Properties.class);
		propertiesStep.addStep(ReststructureViewsRepository.Attribute.Properties.name);
		propertiesStep.addStep(ReststructureViewsRepository.Attribute.Properties.attrType);
		
		
		composer = new PartComposer(attributeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReststructureViewsRepository.Attribute.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ReststructureViewsRepository.Attribute.Properties.name) {
					return createNameText(parent);
				}
				if (key == ReststructureViewsRepository.Attribute.Properties.attrType) {
					return createAttrTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(ReststructureMessages.AttributePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.AttributePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Attribute.Properties.name, ReststructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, ReststructureViewsRepository.Attribute.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, ReststructureViewsRepository.Attribute.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ReststructureViewsRepository.Attribute.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Attribute.Properties.name, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAttrTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ReststructureMessages.AttributePropertiesEditionPart_AttrTypeLabel, propertiesEditionComponent.isRequired(ReststructureViewsRepository.Attribute.Properties.attrType, ReststructureViewsRepository.SWT_KIND));
		attrType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ReststructureViewsRepository.Attribute.Properties.attrType, ReststructureViewsRepository.SWT_KIND));
		attrType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		attrType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, ReststructureViewsRepository.Attribute.Properties.attrType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAttrType()));
			}

		});
		GridData attrTypeData = new GridData(GridData.FILL_HORIZONTAL);
		attrType.setLayoutData(attrTypeData);
		attrType.setID(ReststructureViewsRepository.Attribute.Properties.attrType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReststructureViewsRepository.Attribute.Properties.attrType, ReststructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#getAttrType()
	 * 
	 */
	public EObject getAttrType() {
		if (attrType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) attrType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#initAttrType(EObjectFlatComboSettings)
	 */
	public void initAttrType(EObjectFlatComboSettings settings) {
		attrType.setInput(settings);
		if (current != null) {
			attrType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#setAttrType(EObject newValue)
	 * 
	 */
	public void setAttrType(EObject newValue) {
		if (newValue != null) {
			attrType.setSelection(new StructuredSelection(newValue));
		} else {
			attrType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#setAttrTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAttrTypeButtonMode(ButtonsModeEnum newValue) {
		attrType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#addFilterAttrType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAttrType(ViewerFilter filter) {
		attrType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.reststructure.parts.AttributePropertiesEditionPart#addBusinessFilterAttrType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttrType(ViewerFilter filter) {
		attrType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReststructureMessages.Attribute_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
