package de.van_porten.vrest.tests.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertEnabled;
import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;
import static org.junit.Assert.*;

@RunWith(SWTBotJunit4ClassRunner.class)
public class BasicRcpUiTests {

	private static final String testProjectName = "BasicRcpUiTests_Project";
	private static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() {
		bot = new SWTWorkbenchBot();
		SWTBotView v = bot.activeView();
		if( v.getTitle().equals( "Welcome" ) ) {
			v.close();
		}
	}

	@Test
	public void canCreateANewVRestProject() throws Exception {
		assertEquals( "vREST modeling", bot.activePerspective().getLabel() );

		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();

		// select the dialog
		bot.table().select("Resource");
		bot.button("OK").click();

		assertEquals( "Resource", bot.activePerspective().getLabel() );

		bot.menu("File").menu("New").menu("Project...").click();

		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("vREST").select("vREST Project");
		assertEnabled(bot.button("Next >"));
		bot.button("Next >").click();
		bot.textWithLabel("Project name:").setText(testProjectName);
		bot.button("Finish").click();

		shell = bot.shell("Open Associated Perspective?");
		shell.activate();
		bot.button("Yes").click();

		assertEquals( "vREST modeling", bot.activePerspective().getLabel() );

		SWTBotView projectExplorer = bot.viewByTitle("Project Explorer");
		Composite projectExplorerComposite = (Composite)projectExplorer.getWidget();
		Tree setTree = (Tree)bot.widget(WidgetMatcherFactory.widgetOfType(Tree.class), projectExplorerComposite);
		SWTBotTree tree = new SWTBotTree(setTree);

		tree.select(testProjectName);
		bot.menu("Edit").menu("Delete").click();

		shell = bot.shell("Delete Resources");
		shell.activate();
		bot.checkBox("Delete project contents on disk (cannot be undone)")
				.select();
		bot.button("OK").click();
		bot.waitUntil(shellCloses(shell));
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}
}
