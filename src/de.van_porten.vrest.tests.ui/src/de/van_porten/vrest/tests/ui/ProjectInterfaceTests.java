package de.van_porten.vrest.tests.ui;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertEnabled;
import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertVisible;
import static org.junit.Assert.*;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.van_porten.vrest.tests.ui.util.TreeNodeIsExpandedCondition;
import de.van_porten.vrest.tests.ui.util.UITasks;

@RunWith(SWTBotJunit4ClassRunner.class)
public class ProjectInterfaceTests {

	private static final String testProjectName = "ProjectInterfaceTests_Project";
	private static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() {
		bot = new SWTWorkbenchBot();
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

	@Test
	public void isProjectSetupOK() {
		SWTBotTree projectTree = UITasks.getProjectExplorerTree(bot);
		assertVisible(projectTree);
		assertEnabled(projectTree);
		SWTBotTreeItem rootNode = projectTree.expandNode(testProjectName);
		assertVisible(rootNode);
		assertEnabled(rootNode);

		SWTBotTreeItem modelRootNode = rootNode.expandNode("Model").getNode(0)
				.expand();
		assertEquals(6, modelRootNode.getNodes().size());
		assertNotNull(modelRootNode.getNode("Data Types"));
		assertNotNull(modelRootNode.getNode("Media Types"));
		assertNotNull(modelRootNode.getNode("Method Types"));
		assertNotNull(modelRootNode.getNode("Op Types"));
		assertNotNull(modelRootNode.getNode("Rel Types"));
		assertNotNull(modelRootNode.getNode("Resource Types"));

		assertEquals(4, modelRootNode.expandNode("Method Types").getNodes()
				.size());
	}

	@Test
	public void canCreateANewStructureDiagram() {
		String diagramFilename = "new_diagram.structure";

		UITasks.createNewRestStructureDiagramAndOpenEditor(bot, testProjectName,
				diagramFilename);

		UITasks.checkStructureDiagramFileExists(bot, testProjectName,
				diagramFilename);
	}

	@Test
	public void canCreateANewResourceStateDiagram() {

	}

	@After
	public void tearDown() {

	}

	@AfterClass
	public static void afterClass() {
		UITasks.deleteProject(bot, testProjectName);
		bot.sleep(2000);
	}

}
