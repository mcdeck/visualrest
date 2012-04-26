/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.provider;

import de.van_porten.vrest.core.model.restbehavior.util.RestBehaviorAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestBehaviorItemProviderAdapterFactory extends RestBehaviorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.Creator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatorItemProvider creatorItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.Creator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreatorAdapter() {
		if (creatorItemProvider == null) {
			creatorItemProvider = new CreatorItemProvider(this);
		}

		return creatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorSpecificationItemProvider behaviorSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorSpecificationAdapter() {
		if (behaviorSpecificationItemProvider == null) {
			behaviorSpecificationItemProvider = new BehaviorSpecificationItemProvider(this);
		}

		return behaviorSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.InternalMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalMessageItemProvider internalMessageItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.InternalMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalMessageAdapter() {
		if (internalMessageItemProvider == null) {
			internalMessageItemProvider = new InternalMessageItemProvider(this);
		}

		return internalMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.MessageAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageActionItemProvider messageActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.MessageAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageActionAdapter() {
		if (messageActionItemProvider == null) {
			messageActionItemProvider = new MessageActionItemProvider(this);
		}

		return messageActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalActionItemProvider conditionalActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalActionAdapter() {
		if (conditionalActionItemProvider == null) {
			conditionalActionItemProvider = new ConditionalActionItemProvider(this);
		}

		return conditionalActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.CreateAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateActionItemProvider createActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.CreateAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateActionAdapter() {
		if (createActionItemProvider == null) {
			createActionItemProvider = new CreateActionItemProvider(this);
		}

		return createActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ListAddAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListAddActionItemProvider listAddActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ListAddAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListAddActionAdapter() {
		if (listAddActionItemProvider == null) {
			listAddActionItemProvider = new ListAddActionItemProvider(this);
		}

		return listAddActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ListRemoveAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListRemoveActionItemProvider listRemoveActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ListRemoveAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListRemoveActionAdapter() {
		if (listRemoveActionItemProvider == null) {
			listRemoveActionItemProvider = new ListRemoveActionItemProvider(this);
		}

		return listRemoveActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ActionSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSequenceItemProvider actionSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ActionSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionSequenceAdapter() {
		if (actionSequenceItemProvider == null) {
			actionSequenceItemProvider = new ActionSequenceItemProvider(this);
		}

		return actionSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.UpdateAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateActionItemProvider updateActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.UpdateAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateActionAdapter() {
		if (updateActionItemProvider == null) {
			updateActionItemProvider = new UpdateActionItemProvider(this);
		}

		return updateActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ReturnAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnActionItemProvider returnActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ReturnAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnActionAdapter() {
		if (returnActionItemProvider == null) {
			returnActionItemProvider = new ReturnActionItemProvider(this);
		}

		return returnActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.StatusCode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusCodeItemProvider statusCodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatusCodeAdapter() {
		if (statusCodeItemProvider == null) {
			statusCodeItemProvider = new StatusCodeItemProvider(this);
		}

		return statusCodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.Metadata} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataItemProvider metadataItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetadataAdapter() {
		if (metadataItemProvider == null) {
			metadataItemProvider = new MetadataItemProvider(this);
		}

		return metadataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperationItemProvider binaryOperationItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryOperationAdapter() {
		if (binaryOperationItemProvider == null) {
			binaryOperationItemProvider = new BinaryOperationItemProvider(this);
		}

		return binaryOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.BinOpType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinOpTypeItemProvider binOpTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.BinOpType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinOpTypeAdapter() {
		if (binOpTypeItemProvider == null) {
			binOpTypeItemProvider = new BinOpTypeItemProvider(this);
		}

		return binOpTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.AttributeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeReferenceItemProvider attributeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.AttributeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeReferenceAdapter() {
		if (attributeReferenceItemProvider == null) {
			attributeReferenceItemProvider = new AttributeReferenceItemProvider(this);
		}

		return attributeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkReferenceItemProvider internalLinkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalLinkReferenceAdapter() {
		if (internalLinkReferenceItemProvider == null) {
			internalLinkReferenceItemProvider = new InternalLinkReferenceItemProvider(this);
		}

		return internalLinkReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTLinkReferenceItemProvider mtLinkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMTLinkReferenceAdapter() {
		if (mtLinkReferenceItemProvider == null) {
			mtLinkReferenceItemProvider = new MTLinkReferenceItemProvider(this);
		}

		return mtLinkReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.MtElementReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MtElementReferenceItemProvider mtElementReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.MtElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMtElementReferenceAdapter() {
		if (mtElementReferenceItemProvider == null) {
			mtElementReferenceItemProvider = new MtElementReferenceItemProvider(this);
		}

		return mtElementReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.DeletedState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletedStateItemProvider deletedStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.DeletedState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeletedStateAdapter() {
		if (deletedStateItemProvider == null) {
			deletedStateItemProvider = new DeletedStateItemProvider(this);
		}

		return deletedStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkReferenceItemProvider externalLinkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalLinkReferenceAdapter() {
		if (externalLinkReferenceItemProvider == null) {
			externalLinkReferenceItemProvider = new ExternalLinkReferenceItemProvider(this);
		}

		return externalLinkReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (creatorItemProvider != null) creatorItemProvider.dispose();
		if (behaviorSpecificationItemProvider != null) behaviorSpecificationItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (internalMessageItemProvider != null) internalMessageItemProvider.dispose();
		if (messageActionItemProvider != null) messageActionItemProvider.dispose();
		if (conditionalActionItemProvider != null) conditionalActionItemProvider.dispose();
		if (createActionItemProvider != null) createActionItemProvider.dispose();
		if (listAddActionItemProvider != null) listAddActionItemProvider.dispose();
		if (listRemoveActionItemProvider != null) listRemoveActionItemProvider.dispose();
		if (actionSequenceItemProvider != null) actionSequenceItemProvider.dispose();
		if (updateActionItemProvider != null) updateActionItemProvider.dispose();
		if (returnActionItemProvider != null) returnActionItemProvider.dispose();
		if (statusCodeItemProvider != null) statusCodeItemProvider.dispose();
		if (metadataItemProvider != null) metadataItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (binaryOperationItemProvider != null) binaryOperationItemProvider.dispose();
		if (binOpTypeItemProvider != null) binOpTypeItemProvider.dispose();
		if (attributeReferenceItemProvider != null) attributeReferenceItemProvider.dispose();
		if (internalLinkReferenceItemProvider != null) internalLinkReferenceItemProvider.dispose();
		if (mtLinkReferenceItemProvider != null) mtLinkReferenceItemProvider.dispose();
		if (mtElementReferenceItemProvider != null) mtElementReferenceItemProvider.dispose();
		if (deletedStateItemProvider != null) deletedStateItemProvider.dispose();
		if (externalLinkReferenceItemProvider != null) externalLinkReferenceItemProvider.dispose();
	}

}
