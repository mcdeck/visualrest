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

import de.van_porten.vrest.core.model.restbehavior.parts.BinOpTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class BinOpTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BinOpTypePropertiesEditionPart {

	protected EObjectFlatComboViewer resultType;
	protected Text name;
	protected EObjectFlatComboViewer firstOpType;
	protected EObjectFlatComboViewer secondOpType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BinOpTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence binOpTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = binOpTypeStep.addStep(RestbehaviorViewsRepository.BinOpType.Properties.class);
		propertiesStep.addStep(RestbehaviorViewsRepository.BinOpType.Properties.resultType);
		propertiesStep.addStep(RestbehaviorViewsRepository.BinOpType.Properties.name);
		propertiesStep.addStep(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType);
		propertiesStep.addStep(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType);
		
		
		composer = new PartComposer(binOpTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.resultType) {
					return createResultTypeFlatComboViewer(parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.name) {
					return createNameText(parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.firstOpType) {
					return createFirstOpTypeFlatComboViewer(parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.secondOpType) {
					return createSecondOpTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(RestbehaviorMessages.BinOpTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createResultTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_ResultTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.SWT_KIND));
		resultType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.SWT_KIND));
		resultType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		resultType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.BinOpType.Properties.resultType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResultType()));
			}

		});
		GridData resultTypeData = new GridData(GridData.FILL_HORIZONTAL);
		resultType.setLayoutData(resultTypeData);
		resultType.setID(RestbehaviorViewsRepository.BinOpType.Properties.resultType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.name, RestbehaviorViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.BinOpType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.BinOpType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, RestbehaviorViewsRepository.BinOpType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.name, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFirstOpTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_FirstOpTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.SWT_KIND));
		firstOpType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.SWT_KIND));
		firstOpType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		firstOpType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFirstOpType()));
			}

		});
		GridData firstOpTypeData = new GridData(GridData.FILL_HORIZONTAL);
		firstOpType.setLayoutData(firstOpTypeData);
		firstOpType.setID(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSecondOpTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_SecondOpTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.SWT_KIND));
		secondOpType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.SWT_KIND));
		secondOpType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		secondOpType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartImpl.this, RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSecondOpType()));
			}

		});
		GridData secondOpTypeData = new GridData(GridData.FILL_HORIZONTAL);
		secondOpType.setLayoutData(secondOpTypeData);
		secondOpType.setID(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#getResultType()
	 * 
	 */
	public EObject getResultType() {
		if (resultType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resultType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#initResultType(EObjectFlatComboSettings)
	 */
	public void initResultType(EObjectFlatComboSettings settings) {
		resultType.setInput(settings);
		if (current != null) {
			resultType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setResultType(EObject newValue)
	 * 
	 */
	public void setResultType(EObject newValue) {
		if (newValue != null) {
			resultType.setSelection(new StructuredSelection(newValue));
		} else {
			resultType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setResultTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResultTypeButtonMode(ButtonsModeEnum newValue) {
		resultType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addFilterResultType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResultType(ViewerFilter filter) {
		resultType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addBusinessFilterResultType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResultType(ViewerFilter filter) {
		resultType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#getFirstOpType()
	 * 
	 */
	public EObject getFirstOpType() {
		if (firstOpType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) firstOpType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#initFirstOpType(EObjectFlatComboSettings)
	 */
	public void initFirstOpType(EObjectFlatComboSettings settings) {
		firstOpType.setInput(settings);
		if (current != null) {
			firstOpType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setFirstOpType(EObject newValue)
	 * 
	 */
	public void setFirstOpType(EObject newValue) {
		if (newValue != null) {
			firstOpType.setSelection(new StructuredSelection(newValue));
		} else {
			firstOpType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setFirstOpTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFirstOpTypeButtonMode(ButtonsModeEnum newValue) {
		firstOpType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addFilterFirstOpType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFirstOpType(ViewerFilter filter) {
		firstOpType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addBusinessFilterFirstOpType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFirstOpType(ViewerFilter filter) {
		firstOpType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#getSecondOpType()
	 * 
	 */
	public EObject getSecondOpType() {
		if (secondOpType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) secondOpType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#initSecondOpType(EObjectFlatComboSettings)
	 */
	public void initSecondOpType(EObjectFlatComboSettings settings) {
		secondOpType.setInput(settings);
		if (current != null) {
			secondOpType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setSecondOpType(EObject newValue)
	 * 
	 */
	public void setSecondOpType(EObject newValue) {
		if (newValue != null) {
			secondOpType.setSelection(new StructuredSelection(newValue));
		} else {
			secondOpType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#setSecondOpTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSecondOpTypeButtonMode(ButtonsModeEnum newValue) {
		secondOpType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addFilterSecondOpType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSecondOpType(ViewerFilter filter) {
		secondOpType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.BinOpTypePropertiesEditionPart#addBusinessFilterSecondOpType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSecondOpType(ViewerFilter filter) {
		secondOpType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.BinOpType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
