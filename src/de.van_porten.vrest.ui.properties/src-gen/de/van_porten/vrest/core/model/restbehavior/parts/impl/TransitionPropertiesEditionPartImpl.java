/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.parts.TransitionPropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.providers.RestbehaviorMessages;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class TransitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TransitionPropertiesEditionPart {

protected ReferencesTable trigger;
protected List<ViewerFilter> triggerBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> triggerFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer targetState;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TransitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence transitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = transitionStep.addStep(RestbehaviorViewsRepository.Transition.Properties.class);
		propertiesStep.addStep(RestbehaviorViewsRepository.Transition.Properties.trigger);
		propertiesStep.addStep(RestbehaviorViewsRepository.Transition.Properties.targetState);
		
		
		composer = new PartComposer(transitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RestbehaviorViewsRepository.Transition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RestbehaviorViewsRepository.Transition.Properties.trigger) {
					return createTriggerAdvancedTableComposition(parent);
				}
				if (key == RestbehaviorViewsRepository.Transition.Properties.targetState) {
					return createTargetStateFlatComboViewer(parent);
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
		propertiesGroup.setText(RestbehaviorMessages.TransitionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTriggerAdvancedTableComposition(Composite parent) {
		this.trigger = new ReferencesTable(RestbehaviorMessages.TransitionPropertiesEditionPart_TriggerLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				trigger.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				trigger.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				trigger.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				trigger.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.triggerFilters) {
			this.trigger.addFilter(filter);
		}
		this.trigger.setHelpText(propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.Transition.Properties.trigger, RestbehaviorViewsRepository.SWT_KIND));
		this.trigger.createControls(parent);
		this.trigger.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.trigger, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData triggerData = new GridData(GridData.FILL_HORIZONTAL);
		triggerData.horizontalSpan = 3;
		this.trigger.setLayoutData(triggerData);
		this.trigger.setLowerBound(1);
		this.trigger.setUpperBound(-1);
		trigger.setID(RestbehaviorViewsRepository.Transition.Properties.trigger);
		trigger.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetStateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RestbehaviorMessages.TransitionPropertiesEditionPart_TargetStateLabel, propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.Transition.Properties.targetState, RestbehaviorViewsRepository.SWT_KIND));
		targetState = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RestbehaviorViewsRepository.Transition.Properties.targetState, RestbehaviorViewsRepository.SWT_KIND));
		targetState.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetState.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RestbehaviorViewsRepository.Transition.Properties.targetState, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetState()));
			}

		});
		GridData targetStateData = new GridData(GridData.FILL_HORIZONTAL);
		targetState.setLayoutData(targetStateData);
		targetState.setID(RestbehaviorViewsRepository.Transition.Properties.targetState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RestbehaviorViewsRepository.Transition.Properties.targetState, RestbehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#initTrigger(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTrigger(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		trigger.setContentProvider(contentProvider);
		trigger.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#updateTrigger()
	 * 
	 */
	public void updateTrigger() {
	trigger.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#addFilterTrigger(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTrigger(ViewerFilter filter) {
		triggerFilters.add(filter);
		if (this.trigger != null) {
			this.trigger.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#addBusinessFilterTrigger(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTrigger(ViewerFilter filter) {
		triggerBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#isContainedInTriggerTable(EObject element)
	 * 
	 */
	public boolean isContainedInTriggerTable(EObject element) {
		return ((ReferencesTableSettings)trigger.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#getTargetState()
	 * 
	 */
	public EObject getTargetState() {
		if (targetState.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetState.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#initTargetState(EObjectFlatComboSettings)
	 */
	public void initTargetState(EObjectFlatComboSettings settings) {
		targetState.setInput(settings);
		if (current != null) {
			targetState.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#setTargetState(EObject newValue)
	 * 
	 */
	public void setTargetState(EObject newValue) {
		if (newValue != null) {
			targetState.setSelection(new StructuredSelection(newValue));
		} else {
			targetState.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#setTargetStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetStateButtonMode(ButtonsModeEnum newValue) {
		targetState.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#addFilterTargetState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetState(ViewerFilter filter) {
		targetState.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.van_porten.vrest.ui.properties.restbehavior.parts.TransitionPropertiesEditionPart#addBusinessFilterTargetState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetState(ViewerFilter filter) {
		targetState.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RestbehaviorMessages.Transition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
