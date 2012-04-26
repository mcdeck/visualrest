package de.van_porten.vrest.tests.ui;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.van_porten.vrest.tests.ui.util.EditorIsNotDityCondition;
import de.van_porten.vrest.tests.ui.util.UITasks;

@RunWith(SWTBotJunit4ClassRunner.class)
public class StructureEditorTests extends SWTBotGefTestCase {

	private static final String testProjectName = "StructureEdtiorTests_Project";
	private static SWTGefBot bot;

	@BeforeClass
	public static void beforeClass() {
		bot = new SWTGefBot();
		UITasks.closeWelcomeScreenIfOpen(bot);
		UITasks.createNewProject(bot, testProjectName, true);
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}

	@Before
	public void setUp() {
	}

	/**
	 *
	 * @return
	 */
	private SWTBotGefEditor getSWTBotGefEditorForActiveEditor() {
		SWTBotEditor editor = bot.activeEditor();
		editor.save();
		SWTBotGefEditor gefEditor = bot.gefEditor(editor.getTitle());
		gefEditor.activateDefaultTool();
		return gefEditor;
	}

	/**
	 *
	 * @param gefEditor
	 * @param toolName
	 * @param resourceName
	 * @param x
	 * @param y
	 * @return the created resource edit part
	 */
	private SWTBotGefEditPart createNewResourceType(SWTBotGefEditor gefEditor,
			String toolName, String resourceName, int x, int y) {
		gefEditor.activateTool(toolName);
		// just make it a minimal width/height
		gefEditor.drag(x, y, x + 50, y + 50);
		gefEditor.directEditType(resourceName);
		return gefEditor.getEditPart(resourceName);
	}

	/**
	 * Utility method to test single resource types
	 *
	 * @param diagramFilename
	 * @param toolName
	 */
	private void canAddAndRemoveResourceType(String toolName) {
		String diagramFilename = "canAddAndRemoveResourceTypes_"
				+ toolName.replace(' ', '_') + ".structure";

		UITasks.createNewRestStructureDiagramAndOpenEditor(bot,
				testProjectName, diagramFilename);

		final SWTBotGefEditor gefEditor = getSWTBotGefEditorForActiveEditor();

		// Create a primary resource
		SWTBotGefEditPart resource = createNewResourceType(gefEditor, toolName,
				"MyTestResource", 10, 10);
		gefEditor.save();
		bot.waitUntil(new EditorIsNotDityCondition(gefEditor));

		// SWTBotGefEditPart resource = gefEditor.getEditPart("MyTestResource");
		gefEditor.select(resource).clickContextMenu("Delete");
		bot.button("Yes").click();

		resource = createNewResourceType(gefEditor, toolName,
				"MyTestResource2", 100, 100);
		gefEditor.select(resource).clickContextMenu("Delete");
		bot.button("Yes").click();

		gefEditor.save();
		bot.waitUntil(new EditorIsNotDityCondition(gefEditor));

		/*
		 * -- This is currently not working because direct editing opens an
		 * error shell that needs to be clicked away. That however is not
		 * possible because the error shell blocks directEditType() until is
		 * gets closed. There has to be a way to execute that close
		 * asynchronously...
		 *
		 * UIThreadRunnable.asyncExec(new VoidResult() { public void run() {
		 * bot.waitUntil(Conditions.shellIsActive("Can not edit value"));
		 * bot.button("OK").click(); } });
		 *
		 * gefEditor.directEditType("MyTestResource");
		 *
		 * gefEditor.getEditPart("MyResource0").activateDirectEdit();
		 * gefEditor.directEditType("MyTestResource2"); gefEditor.save();
		 * bot.waitUntil(new EditorIsNotDityCondition(gefEditor));
		 */

		gefEditor.close();
	}

	@Test
	public void canAddRemovePrimaryResourceType() {
		String toolName = "Primary Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemovePagingResourceType() {
		String toolName = "Paging Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveProjectionResourceType() {
		String toolName = "Projection Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveActivityResourceType() {
		String toolName = "Activity Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveListResourceType() {
		String toolName = "List Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveAggregationResourceType() {
		String toolName = "Aggregation Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveFilterResourceType() {
		String toolName = "Filter Resource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddRemoveSubresourceType() {
		String toolName = "Subresource";
		canAddAndRemoveResourceType(toolName);
	}

	@Test
	public void canAddAndConnectResources() {
		String diagramFilename = "canAddAndConnectResources.structure";

		UITasks.createNewRestStructureDiagramAndOpenEditor(bot,
				testProjectName, diagramFilename);

		final SWTBotGefEditor gefEditor = getSWTBotGefEditorForActiveEditor();

		SWTBotGefEditPart resource1 = createNewResourceType(gefEditor,
				"Primary Resource", "MyFirstResource1", 10, 10);
		SWTBotGefEditPart resource2 = createNewResourceType(gefEditor,
				"Primary Resource", "MyFirstResource2", 200, 200);

		gefEditor.activateTool("Internal Link");
		gefEditor.click(resource1);
		gefEditor.click(resource2);
		SWTBotGefEditPart linkLabel = gefEditor.getEditPart("<<InternalLink>>\nlink");
		linkLabel.activateDirectEdit();
		gefEditor.directEditType("MyNewLink");
		linkLabel = gefEditor.getEditPart("<<InternalLink>>\nMyNewLink");

		gefEditor.close();
	}

	@After
	public void tearDown() {
		try {
			SWTBotEditor editor = bot.activeEditor();
			if (editor.isDirty()) {
				editor.save();
				bot.waitUntil(new EditorIsNotDityCondition(editor));
			}
			editor.close();
		} catch (Exception e) {
			// do nothing - there is no editor that needs closing...
		}
	}

	@AfterClass
	public static void afterClass() {
		UITasks.deleteProject(bot, testProjectName);
		bot.sleep(2000);
	}

}
