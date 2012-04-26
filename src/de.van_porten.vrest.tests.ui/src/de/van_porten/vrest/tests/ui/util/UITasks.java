package de.van_porten.vrest.tests.ui.util;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertEnabled;
import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;
import static org.eclipse.swtbot.eclipse.finder.matchers.WidgetMatcherFactory.withPartName;
import static org.eclipse.swtbot.eclipse.finder.waits.Conditions.waitForEditor;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.fail;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.eclipse.finder.waits.WaitForEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsInstanceOf;

public final class UITasks {

	public static final void resetWorkbench() {
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				try {
					IWorkbench workbench = PlatformUI.getWorkbench();
					IWorkbenchWindow workbenchWindow = workbench
							.getActiveWorkbenchWindow();
					IWorkbenchPage page = workbenchWindow.getActivePage();
					Shell activeShell = Display.getCurrent().getActiveShell();
					if (activeShell != workbenchWindow.getShell()) {
						activeShell.close();
					}
					page.closeAllEditors(false);
					page.resetPerspective();
					String defaultPerspectiveId = workbench
							.getPerspectiveRegistry().getDefaultPerspective();
					workbench.showPerspective(defaultPerspectiveId,
							workbenchWindow);
					page.resetPerspective();
				} catch (WorkbenchException e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	public static final void closeWelcomeScreenIfOpen(SWTWorkbenchBot bot) {
		SWTBotView v = bot.activeView();
		if (v.getTitle().equals("Welcome")) {
			v.close();
		}
	}

	public static final void createNewProject(final SWTWorkbenchBot bot,
			final String testProjectName, boolean switchPerspective) {
		String activePerspective = bot.activePerspective().getLabel();

		bot.menu("File").menu("New").menu("Project...").click();

		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("vREST").select("vREST Project");
		bot.button("Next >").click();
		bot.textWithLabel("Project name:").setText(testProjectName);
		bot.button("Finish").click();

		if (!activePerspective.equals("vREST modeling")) {
			shell = bot.shell("Open Associated Perspective?");
			shell.activate();
			if (switchPerspective) {
				bot.button("Yes").click();
			} else {
				bot.button("No").click();
			}
			bot.waitUntil(shellCloses(shell));
		}

		bot.waitUntil(new ActivePerspectiveEqualsCondition(bot, "vREST modeling"), 10000);
		bot.waitUntil(new ProjectWasCreatedCondition(getProjectExplorerTree(bot), testProjectName), 10000);
	}

	public static final void deleteProject(SWTWorkbenchBot bot,
			String testProjectName) {
		bot.perspectiveByLabel("vREST modeling").activate();

		SWTBotTree tree = getProjectExplorerTree(bot);
		tree.select(testProjectName);
		bot.menu("Edit").menu("Delete").click();

		SWTBotShell shell = bot.shell("Delete Resources");
		shell.activate();
		bot.checkBox("Delete project contents on disk (cannot be undone)")
				.select();
		bot.button("OK").click();
		bot.waitUntil(shellCloses(shell));
	}

	public static final SWTBotTree getProjectExplorerTree(SWTWorkbenchBot bot) {
		SWTBotView projectExplorer = bot.viewByTitle("Project Explorer");
		Composite projectExplorerComposite = (Composite) projectExplorer
				.getWidget();
		Tree setTree = (Tree) bot.widget(
				WidgetMatcherFactory.widgetOfType(Tree.class),
				projectExplorerComposite);
		return new SWTBotTree(setTree);
	}

	public static final SWTBotTreeItem getStructureDiagramParentNode(
			SWTWorkbenchBot bot, SWTBotTree projectTree, String testProjectName) {
		SWTBotTreeItem node = projectTree.expandNode(testProjectName)
				.expandNode("diagrams").getNode("structure").expand();
		return node;
	}

	public static final void createNewRestStructureDiagramAndOpenEditor(SWTWorkbenchBot bot,
			String testProjectName, String diagramFilename) {
		final String editorTitle = "New REST Structure Diagram";

		SWTBotTree tree = getProjectExplorerTree(bot);
		SWTBotTreeItem structureDiagramParentNode = getStructureDiagramParentNode(
				bot, tree, testProjectName);

		structureDiagramParentNode.select();
		ContextMenuHelper.clickContextMenu(tree, "New",
				"vREST Structure Diagram");

		SWTBotShell shell = bot.shell("New Rest Structure Diagram");
		shell.activate();
		bot.textWithLabel("File name:").setText(diagramFilename);

		assertEnabled(bot.button("Finish"));
		bot.button("Finish").click();

		Matcher<IEditorReference> withPartName = withPartName(editorTitle);
		// Matcher<Object> instanceOfEditor =
		// IsInstanceOf.instanceOf(IEditorReference.class);
		// Matcher<IEditorReference> matcher = allOf(withPartName,
		// instanceOfEditor);
		WaitForEditor waitForEditor = waitForEditor(withPartName);
		bot.waitUntil(waitForEditor);
	}

	/**
	 * @param diagramFilename
	 */
	public static void checkStructureDiagramFileExists(SWTWorkbenchBot bot,
			String testProjectName, String diagramFilename) {
		try {
			SWTBotTreeItem node = UITasks.getStructureDiagramParentNode(bot,
					UITasks.getProjectExplorerTree(bot), testProjectName);
			bot.waitUntil(new TreeNodeIsExpandedCondition(node));
			node.select().expand().select(diagramFilename);
		} catch (WidgetNotFoundException ex) {
			fail(diagramFilename + " file was not found");
		}
	}

}
