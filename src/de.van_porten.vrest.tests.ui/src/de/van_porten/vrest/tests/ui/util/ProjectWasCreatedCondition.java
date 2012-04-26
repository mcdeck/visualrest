package de.van_porten.vrest.tests.ui.util;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.Result;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

public class ProjectWasCreatedCondition extends DefaultCondition {
	private final String projectName;
	private final SWTBotTree explorerTree;

	// initialize
	public ProjectWasCreatedCondition(SWTBotTree explorerTree,
			String projectName) {
		this.projectName = projectName;
		this.explorerTree = explorerTree;
	}

	// return true if the condition matches, false otherwise
	public boolean test() {
		// TODO: this should check if all files got created ok ..
		try {
			explorerTree.expandNode(projectName, "diagrams", "structure");
			explorerTree.expandNode(projectName).getNode("myApplication.rest");
			explorerTree.collapseNode(projectName);
		} catch( Exception e ) {
			return false;
		}
		return true;
	}

	// provide a human readable error message
	public String getFailureMessage() {
		return "Timed out waiting for project " + projectName
				+ " to be created";
	}
}