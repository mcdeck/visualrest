package de.van_porten.vrest.tests.ui.util;

import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;


public class TreeNodeIsExpandedCondition extends DefaultCondition {
	private final SWTBotTreeItem node;

	// initialize
	public TreeNodeIsExpandedCondition(SWTBotTreeItem node) {
		this.node = node;
	}

	// return true if the condition matches, false otherwise
	public boolean test() {
		return node.isExpanded();
	}

	// provide a human readable error message
	public String getFailureMessage() {
		return "Timed out waiting for " + node + " to expand";
	}
}