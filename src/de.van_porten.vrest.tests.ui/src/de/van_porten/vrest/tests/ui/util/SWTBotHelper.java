package de.van_porten.vrest.tests.ui.util;

import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.WidgetResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;

public class SWTBotHelper {
	public static SWTBotMenu getSubMenuItem(final SWTBotMenu parentMenu,
			final String itemText) throws WidgetNotFoundException {

		MenuItem menuItem = UIThreadRunnable
				.syncExec(new WidgetResult<MenuItem>() {
					public MenuItem run() {
						Menu bar = parentMenu.widget.getMenu();
						if (bar != null) {
							for (MenuItem item : bar.getItems()) {
								if (item.getText().equals(itemText)) {
									return item;
								}
							}
						}
						return null;
					}
				});

		if (menuItem == null) {
			throw new WidgetNotFoundException("MenuItem \"" + itemText
					+ "\" not found.");
		} else {
			return new SWTBotMenu(menuItem);
		}
	}
}
