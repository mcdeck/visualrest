/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts;

/**
 * @author Oliver van Porten
 * 
 */
public class RestbehaviorViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Creator view descriptor
	 * 
	 */
	public static class Creator {
		public static class Properties {
	
			
			public static String consumedMT = "restbehavior::Creator::properties::consumedMT";
			
			
			public static String creatorParams = "restbehavior::Creator::properties::creatorParams";
			
	
		}
	
	}

	/**
	 * BehaviorSpecification view descriptor
	 * 
	 */
	public static class BehaviorSpecification {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * State view descriptor
	 * 
	 */
	public static class State {
		public static class Properties {
	
			
			public static String transitions = "restbehavior::State::properties::transitions";
			
			
			public static String name = "restbehavior::State::properties::name";
			
			
			public static String supportedMethods = "restbehavior::State::properties::supportedMethods";
			
	
		}
	
	}

	/**
	 * Transition view descriptor
	 * 
	 */
	public static class Transition {
		public static class Properties {
	
			
			public static String trigger = "restbehavior::Transition::properties::trigger";
			
			
			public static String targetState = "restbehavior::Transition::properties::targetState";
			
	
		}
	
	}

	/**
	 * Condition view descriptor
	 * 
	 */
	public static class Condition {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * InternalMessage view descriptor
	 * 
	 */
	public static class InternalMessage {
		public static class Properties {
	
			
			public static String name = "restbehavior::InternalMessage::properties::name";
			
	
		}
	
	}

	/**
	 * MessageAction view descriptor
	 * 
	 */
	public static class MessageAction {
		public static class Properties {
	
			
			public static String message = "restbehavior::MessageAction::properties::message";
			
	
		}
	
	}

	/**
	 * ConditionalAction view descriptor
	 * 
	 */
	public static class ConditionalAction {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * CreateAction view descriptor
	 * 
	 */
	public static class CreateAction {
		public static class Properties {
	
			
			public static String creator = "restbehavior::CreateAction::properties::creator";
			
	
		}
	
	}

	/**
	 * ListAddAction view descriptor
	 * 
	 */
	public static class ListAddAction {
	}

	/**
	 * ListRemoveAction view descriptor
	 * 
	 */
	public static class ListRemoveAction {
	}

	/**
	 * ActionSequence view descriptor
	 * 
	 */
	public static class ActionSequence {
		public static class Properties {
	
			
			public static String actionelements = "restbehavior::ActionSequence::properties::actionelements";
			
	
		}
	
	}

	/**
	 * UpdateAction view descriptor
	 * 
	 */
	public static class UpdateAction {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * ReturnAction view descriptor
	 * 
	 */
	public static class ReturnAction {
	
	public static String metadata = "restbehavior::ReturnAction::metadata";
	
	}

	/**
	 * StatusCode view descriptor
	 * 
	 */
	public static class StatusCode {
	
	public static String number = "restbehavior::StatusCode::number";
	
	}

	/**
	 * Metadata view descriptor
	 * 
	 */
	public static class Metadata {
	}

	/**
	 * Constant view descriptor
	 * 
	 */
	public static class Constant {
		public static class Properties {
	
			
			public static String type = "restbehavior::Constant::properties::type";
			
			
			public static String stringRepresentation = "restbehavior::Constant::properties::stringRepresentation";
			
	
		}
	
	}

	/**
	 * BinaryOperation view descriptor
	 * 
	 */
	public static class BinaryOperation {
		public static class Properties {
	
			
			public static String optype = "restbehavior::BinaryOperation::properties::optype";
			
	
		}
	
	}

	/**
	 * BinOpType view descriptor
	 * 
	 */
	public static class BinOpType {
		public static class Properties {
	
			
			public static String resultType = "restbehavior::BinOpType::properties::resultType";
			
			
			public static String name = "restbehavior::BinOpType::properties::name";
			
			
			public static String firstOpType = "restbehavior::BinOpType::properties::firstOpType";
			
			
			public static String secondOpType = "restbehavior::BinOpType::properties::secondOpType";
			
	
		}
	
	}

	/**
	 * AttributeReference view descriptor
	 * 
	 */
	public static class AttributeReference {
		public static class Properties {
	
			
			public static String referencedAttribute = "restbehavior::AttributeReference::properties::referencedAttribute";
			
	
		}
	
	}

	/**
	 * InternalLinkReference view descriptor
	 * 
	 */
	public static class InternalLinkReference {
		public static class Properties {
	
			
			public static String referencedLink = "restbehavior::InternalLinkReference::properties::referencedLink";
			
	
		}
	
	}

	/**
	 * MTLinkReference view descriptor
	 * 
	 */
	public static class MTLinkReference {
		public static class Properties {
	
			
			public static String referencedMTLink = "restbehavior::MTLinkReference::properties::referencedMTLink";
			
	
		}
	
	}

	/**
	 * MtElementReference view descriptor
	 * 
	 */
	public static class MtElementReference {
		public static class Properties {
	
			
			public static String referencedMTElement = "restbehavior::MtElementReference::properties::referencedMTElement";
			
	
		}
	
	}

	/**
	 * DeletedState view descriptor
	 * 
	 */
	public static class DeletedState {
		public static class Properties {
	
			
			public static String transitions = "restbehavior::DeletedState::properties::transitions";
			
			
			public static String name = "restbehavior::DeletedState::properties::name";
			
			
			public static String supportedMethods = "restbehavior::DeletedState::properties::supportedMethods";
			
	
		}
	
	}

	/**
	 * ExternalLinkReference view descriptor
	 * 
	 */
	public static class ExternalLinkReference {
		public static class Properties {
	
			
			public static String referencedExternalLink = "restbehavior::ExternalLinkReference::properties::referencedExternalLink";
			
	
		}
	
	}

}
