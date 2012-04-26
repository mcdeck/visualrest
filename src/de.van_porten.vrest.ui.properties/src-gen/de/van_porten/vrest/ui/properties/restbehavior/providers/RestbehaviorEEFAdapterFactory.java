/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.restbehavior.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory;


/**
 * @author Oliver van Porten
 * 
 */
public class RestbehaviorEEFAdapterFactory extends RestBehaviorAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createCreatorAdapter()
	 * 
	 */
	public Adapter createCreatorAdapter() {
		return new CreatorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createStateAdapter()
	 * 
	 */
	public Adapter createStateAdapter() {
		return new StatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createTransitionAdapter()
	 * 
	 */
	public Adapter createTransitionAdapter() {
		return new TransitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createInternalMessageAdapter()
	 * 
	 */
	public Adapter createInternalMessageAdapter() {
		return new InternalMessagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createMessageActionAdapter()
	 * 
	 */
	public Adapter createMessageActionAdapter() {
		return new MessageActionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createCreateActionAdapter()
	 * 
	 */
	public Adapter createCreateActionAdapter() {
		return new CreateActionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createActionSequenceAdapter()
	 * 
	 */
	public Adapter createActionSequenceAdapter() {
		return new ActionSequencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createReturnActionAdapter()
	 * 
	 */
	public Adapter createReturnActionAdapter() {
		return new ReturnActionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createStatusCodeAdapter()
	 * 
	 */
	public Adapter createStatusCodeAdapter() {
		return new StatusCodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createConstantAdapter()
	 * 
	 */
	public Adapter createConstantAdapter() {
		return new ConstantPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createBinaryOperationAdapter()
	 * 
	 */
	public Adapter createBinaryOperationAdapter() {
		return new BinaryOperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createBinOpTypeAdapter()
	 * 
	 */
	public Adapter createBinOpTypeAdapter() {
		return new BinOpTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createAttributeReferenceAdapter()
	 * 
	 */
	public Adapter createAttributeReferenceAdapter() {
		return new AttributeReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createInternalLinkReferenceAdapter()
	 * 
	 */
	public Adapter createInternalLinkReferenceAdapter() {
		return new InternalLinkReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createMTLinkReferenceAdapter()
	 * 
	 */
	public Adapter createMTLinkReferenceAdapter() {
		return new MTLinkReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createMtElementReferenceAdapter()
	 * 
	 */
	public Adapter createMtElementReferenceAdapter() {
		return new MtElementReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createDeletedStateAdapter()
	 * 
	 */
	public Adapter createDeletedStateAdapter() {
		return new DeletedStatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory#createExternalLinkReferenceAdapter()
	 * 
	 */
	public Adapter createExternalLinkReferenceAdapter() {
		return new ExternalLinkReferencePropertiesEditionProvider();
	}

}
