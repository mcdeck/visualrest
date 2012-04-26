package de.van_porten.vrest.tests.ui.util;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;


public class ActivePerspectiveEqualsCondition extends DefaultCondition {
	private final String perspecitveName;
	private final SWTWorkbenchBot bot;

	// initialize
	public ActivePerspectiveEqualsCondition(SWTWorkbenchBot bot, String perspecitveName) {
		this.perspecitveName = perspecitveName;
		this.bot = bot;
	}

	// return true if the condition matches, false otherwise
	public boolean test() {
		return this.perspecitveName.equals(
				bot.activePerspective().getLabel() );
	}

	// provide a human readable error message
	public String getFailureMessage() {
		return "Timed out waiting for perpective " + perspecitveName + " to become active";
	}
}