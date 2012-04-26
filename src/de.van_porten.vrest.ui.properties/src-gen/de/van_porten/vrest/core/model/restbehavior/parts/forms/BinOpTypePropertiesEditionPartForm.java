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

import de.van_porten.vrest.core.model.restbehavior.parts.BinOpTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class BinOpTypePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, BinOpTypePropertiesEditionPart {

	protected EObjectFlatComboViewer resultType;
	protected Text name;
	protected EObjectFlatComboViewer firstOpType;
	protected EObjectFlatComboViewer secondOpType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BinOpTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.resultType) {
					return createResultTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.firstOpType) {
					return createFirstOpTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == RestbehaviorViewsRepository.BinOpType.Properties.secondOpType) {
					return createSecondOpTypeFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RestbehaviorMessages.BinOpTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createResultTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_ResultTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.FORM_KIND));
		resultType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(resultType);
		resultType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resultTypeData = new GridData(GridData.FILL_HORIZONTAL);
		resultType.setLayoutData(resultTypeData);
		resultType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartForm.this, RestbehaviorViewsRepository.BinOpType.Properties.resultType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResultType()));
			}

		});
		resultType.setID(RestbehaviorViewsRepository.BinOpType.Properties.resultType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.resultType, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.name, RestbehaviorViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartForm.this, RestbehaviorViewsRepository.BinOpType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartForm.this, RestbehaviorViewsRepository.BinOpType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, RestbehaviorViewsRepository.BinOpType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.name, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFirstOpTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_FirstOpTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.FORM_KIND));
		firstOpType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(firstOpType);
		firstOpType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData firstOpTypeData = new GridData(GridData.FILL_HORIZONTAL);
		firstOpType.setLayoutData(firstOpTypeData);
		firstOpType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartForm.this, RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFirstOpType()));
			}

		});
		firstOpType.setID(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSecondOpTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RestbehaviorMessages.BinOpTypePropertiesEditionPart_SecondOpTypeLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.FORM_KIND));
		secondOpType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(secondOpType);
		secondOpType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData secondOpTypeData = new GridData(GridData.FILL_HORIZONTAL);
		secondOpType.setLayoutData(secondOpTypeData);
		secondOpType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BinOpTypePropertiesEditionPartForm.this, RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSecondOpType()));
			}

		});
		secondOpType.setID(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType, RestbehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
