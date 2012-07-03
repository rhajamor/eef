/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.eef.modelingBot.helper;

import java.util.List;

import org.eclipse.emf.eef.modelingBot.menu.SWTBotContextMenu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.waits.WaitForObjectCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyList;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyList.ListElement;
import org.hamcrest.Matcher;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class SWTBotHelper {
	/**
	 * SWTWorkbenchBot.
	 */
	private static SWTWorkbenchBot bot = new SWTWorkbenchBot();

	/**
	 * Press the enter key.
	 * 
	 * @param widget
	 * @throws Exception
	 */
	public static void pressEnterKey(final Widget widget) {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				widget.notifyListeners(SWT.KeyDown, keyEvent(SWT.NONE, SWT.CR, SWT.Selection, widget));
			}
		});
	}
	
	public static void sendFocusLost(final Widget widget) {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				Event event = createEvent(widget);
				event.type = SWT.FocusOut;

				widget.notifyListeners(SWT.FocusOut, event);
			}
		});
	}

	/**
	 * Press the enter key.
	 * 
	 * @param widget
	 * @throws Exception
	 */
	public static void pressEnterKeyInTabContainer(final Widget widget) {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				searchTabContainer(widget).notifyListeners(SWT.Traverse,
						keyEvent(SWT.NONE, SWT.CR, SWT.Selection, widget));
			}
		});
	}

	private static Composite searchTabContainer(final Widget wid) {
		Composite parent = ((Text)wid).getParent();
		while (parent != null) {
			if (parent instanceof Composite)
				return parent;
			parent = parent.getParent();
		}
		return null;
	}

	/**
	 * @param modificationKey
	 *            the modification key.
	 * @param c
	 *            the character.
	 * @param keyCode
	 *            the keycode.
	 * @return a key event with the specified keys.
	 * @see Event#keyCode
	 * @see Event#character
	 * @see Event#stateMask
	 * @since 1.2
	 */
	private static Event keyEvent(int modificationKey, char c, int keyCode, Widget widget) {
		Event keyEvent = createEvent(widget);
		keyEvent.stateMask = modificationKey;
		keyEvent.character = c;
		keyEvent.keyCode = keyCode;

		return keyEvent;
	}

	private static Event createEvent(Widget widget) {
		Event event = new Event();
		event.time = (int)System.currentTimeMillis();
		event.widget = widget;
		event.display = bot.getDisplay();
		return event;
	}

	/**
	 * Select the tab with the name label in the property views.
	 * 
	 * @param label
	 *            Label to find.
	 */
	// CHECKSTYLE:OFF
	@SuppressWarnings({"restriction", "unchecked"})
	// CHECKSTYLE:ON
	public static void selectPropertyTabItem(final String label) {
		final Matcher<TabbedPropertyList> matcher = WidgetMatcherFactory.allOf(WidgetMatcherFactory
				.widgetOfType(TabbedPropertyList.class));
		final List<TabbedPropertyList> widgets = widget(matcher);

		UIThreadRunnable.syncExec(SWTUtils.display(), new VoidResult() {
			public void run() {
				for (final TabbedPropertyList tabbedProperty : widgets) {
					final ListElement tabItem = getTabItem(label, tabbedProperty);
					if (tabItem != null) {
						final Event mouseEvent = createEvent(tabItem, tabItem.getBounds().x, tabItem.getBounds().y, 1,
								SWT.BUTTON1, 1);
						tabItem.notifyListeners(SWT.MouseUp, mouseEvent);
					}
				}
			}
		});
	}

	/**
	 * Find widget.
	 * 
	 * @param matcher
	 *            the matcher used to match widgets.
	 * @return all the widgets matching the matcher.
	 */
	@SuppressWarnings("restriction")
	public static List<TabbedPropertyList> widget(final Matcher<TabbedPropertyList> matcher) {
		final WaitForObjectCondition<TabbedPropertyList> waitForWidget = Conditions.waitForWidget(matcher);
		bot.waitUntilWidgetAppears(waitForWidget);
		return waitForWidget.getAllMatches();
	}

	/**
	 * Create a event <br>
	 * 
	 * @param x
	 *            the x coordinate of the mouse event.
	 * @param y
	 *            the y coordinate of the mouse event.
	 * @param button
	 *            the mouse button that was clicked.
	 * @param stateMask
	 *            the state of the keyboard modifier keys.
	 * @param count
	 *            the number of times the mouse was clicked.
	 * @return an event that encapsulates {@link #widget} and {@link #display}
	 */
	private static Event createEvent(final Widget widget, final int x, final int y, final int button,
			final int stateMask, final int count) {
		final Event event = new Event();
		event.time = (int)System.currentTimeMillis();
		event.widget = widget;
		event.display = bot.getDisplay();
		event.x = x;
		event.y = y;
		event.button = button;
		event.stateMask = stateMask;
		event.count = count;
		return event;
	}

	/**
	 * Select the tab with the name label in the property views
	 * 
	 * @param label
	 */
	@SuppressWarnings("restriction")
	private static ListElement getTabItem(final String label, final TabbedPropertyList tabbedProperty) {
		for (final Object listElement : tabbedProperty.getTabList()) {
			if (listElement instanceof ListElement && ((ListElement)listElement).getTabItem().getText().equals(label)) {
				return (ListElement)listElement;
			}
		}
		return null;
	}

	/**
	 * WARNING this class should move in SWTBot one day. WARNING if the text is not found it will not failed
	 * this method to get disposed elements with the current click on context menu SWTBot method
	 * 
	 * @param treeItem
	 *            the current item
	 * @param text
	 *            the menu text
	 */
	public static void clickContextMenu(final SWTBotTreeItem treeItem, final String text) {
		UIThreadRunnable.asyncExec(new VoidResult() {

			public void run() {
				final SWTBotContextMenu menu = new SWTBotContextMenu(treeItem);
				menu.click(text);
			}
		});
	}

	/**
	 * WARNING this class should move in SWTBot one day. WARNING if the text is not found it will not failed
	 * this method to get disposed elements with the current click on context menu SWTBot method
	 * 
	 * @param tree
	 *            the tree
	 * @param text
	 *            the menu text
	 */
	public static void clickContextMenu(final SWTBotTree tree, final String text) {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				final SWTBotContextMenu menu = new SWTBotContextMenu(tree);
				menu.click(text);
			}
		});
	}

	/**
	 * Hack method to ensure that previous call was processed fully.
	 */
	public static void waitAllUiEvents() {
		// use another sync exec to ensure that previous call was processed
		// fully
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				// do nothing, just wait for all events to be processed
			}
		});
	}

	
	
}
