/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ActionSequencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.AttributeReferencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.BehaviorSpecificationPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.BinOpTypePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.BinaryOperationPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ConditionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ConditionalActionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ConstantPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.CreateActionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.CreatorPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.DeletedStatePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ExternalLinkReferencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.InternalLinkReferencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.InternalMessagePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.MTLinkReferencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.MessageActionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.MtElementReferencePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.ReturnActionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.StatePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.StatusCodePropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.TransitionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.forms.UpdateActionPropertiesEditionPartForm;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ActionSequencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.AttributeReferencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.BehaviorSpecificationPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.BinOpTypePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.BinaryOperationPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ConditionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ConditionalActionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ConstantPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.CreateActionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.CreatorPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.DeletedStatePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ExternalLinkReferencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.InternalLinkReferencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.InternalMessagePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.MTLinkReferencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.MessageActionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.MtElementReferencePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.ReturnActionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.StatePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.StatusCodePropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.TransitionPropertiesEditionPartImpl;
import de.van_porten.vrest.core.model.restbehavior.parts.impl.UpdateActionPropertiesEditionPartImpl;




/**
 * @author Oliver van Porten
 * 
 */
public class RestbehaviorPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RestbehaviorViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RestbehaviorViewsRepository.Creator.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new CreatorPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new CreatorPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.BehaviorSpecification.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new BehaviorSpecificationPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new BehaviorSpecificationPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.State.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new StatePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new StatePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.Transition.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new TransitionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new TransitionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.Condition.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ConditionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ConditionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.InternalMessage.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new InternalMessagePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new InternalMessagePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.MessageAction.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new MessageActionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new MessageActionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.ConditionalAction.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ConditionalActionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ConditionalActionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.CreateAction.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new CreateActionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new CreateActionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.ActionSequence.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ActionSequencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ActionSequencePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.UpdateAction.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new UpdateActionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new UpdateActionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.ReturnAction.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ReturnActionPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ReturnActionPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.StatusCode.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new StatusCodePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new StatusCodePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.Constant.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ConstantPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ConstantPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.BinaryOperation.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new BinaryOperationPropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new BinaryOperationPropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.BinOpType.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new BinOpTypePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new BinOpTypePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.AttributeReference.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new AttributeReferencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new AttributeReferencePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.InternalLinkReference.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new InternalLinkReferencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new InternalLinkReferencePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.MTLinkReference.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new MTLinkReferencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new MTLinkReferencePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.MtElementReference.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new MtElementReferencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new MtElementReferencePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.DeletedState.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new DeletedStatePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new DeletedStatePropertiesEditionPartForm(component);
		}
		if (key == RestbehaviorViewsRepository.ExternalLinkReference.class) {
			if (kind == RestbehaviorViewsRepository.SWT_KIND)
				return new ExternalLinkReferencePropertiesEditionPartImpl(component);
			if (kind == RestbehaviorViewsRepository.FORM_KIND)
				return new ExternalLinkReferencePropertiesEditionPartForm(component);
		}
		return null;
	}

}
