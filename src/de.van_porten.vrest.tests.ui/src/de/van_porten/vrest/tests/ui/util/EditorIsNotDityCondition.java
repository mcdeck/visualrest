package de.van_porten.vrest.tests.ui.util;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;


public class EditorIsNotDityCondition extends DefaultCondition {
	private final SWTBotEditor editor;

	// initialize
	public EditorIsNotDityCondition(SWTBotEditor editor) {
		this.editor = editor;
	}

	// return true if the condition matches, false otherwise
	public boolean test() {
		return !editor.isDirty();
	}

	// provide a human readable error message
	public String getFailureMessage() {
		return "Timed out waiting for \"" + editor.getTitle() + "\" to become clean";
	}
}