package de.van_porten.vrest.tests.recorded;

import com.windowtester.runtime.swt.UITestCaseSWT;
import com.windowtester.runtime.swt.locator.eclipse.WorkbenchLocator;
import com.windowtester.runtime.swt.locator.eclipse.ViewLocator;
import com.windowtester.runtime.swt.locator.SWTWidgetLocator;
import org.eclipse.swt.widgets.Tree;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swt.condition.shell.ShellShowingCondition;
import com.windowtester.runtime.WT;
import com.windowtester.runtime.swt.condition.shell.ShellDisposedCondition;
import com.windowtester.runtime.swt.locator.TreeItemLocator;
import com.windowtester.runtime.gef.locator.PaletteItemLocator;
import com.windowtester.runtime.gef.locator.FigureCanvasXYLocator;
import com.windowtester.runtime.swt.locator.CTabItemLocator;
import com.windowtester.runtime.swt.locator.ShellLocator;
import com.windowtester.runtime.swt.locator.ButtonLocator;

public class SimpleRecordedTest extends UITestCaseSWT {

	/* @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		IUIContext ui = getUI();
		ui.ensureThat(new WorkbenchLocator().hasFocus());
		ui.ensureThat(ViewLocator.forName("Welcome").isClosed());
		ui.ensureThat(new WorkbenchLocator().isMaximized());
	}

	/**
	 * Main test method.
	 */
	public void testNext() throws Exception {
		IUIContext ui = getUI();
		ui.contextClick(new SWTWidgetLocator(Tree.class, new ViewLocator(
				"org.eclipse.ui.navigator.ProjectExplorer")),
				"&New/vREST Project");
		ui.wait(new ShellShowingCondition("New Project"));
		ui.enterText("test_vrest_2");
		ui.keyClick(WT.CR);
		ui.wait(new ShellDisposedCondition("New Project"));
		ui.click(new TreeItemLocator("test_vrest_2/diagrams/structure",
				new ViewLocator("org.eclipse.ui.navigator.ProjectExplorer")));
		ui.contextClick(new TreeItemLocator("test_vrest_2/diagrams/structure",
				new ViewLocator("org.eclipse.ui.navigator.ProjectExplorer")),
				"New/vREST Structure Diagram");
		ui.wait(new ShellShowingCondition("New Rest Structure Diagram"));
		ui.keyClick(WT.CR);
		ui.wait(new ShellDisposedCondition("New Rest Structure Diagram"));
		ui.click(new PaletteItemLocator("Resources/Aggregation Resource"));
		ui.click(new FigureCanvasXYLocator(619, 272));
		ui.keyClick(WT.CR);
		ui.keyClick(WT.CR);
		ui.keyClick(WT.CTRL, 'S');
		ui.ensureThat(new CTabItemLocator("New REST Structure Diagram")
				.isClosed());
	}

}