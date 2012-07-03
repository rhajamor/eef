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

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withId;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withMnemonic;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withStyle;

import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.runtime.ui.UIConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRadio;
import org.hamcrest.Matcher;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class SWTEEFBotHelper {

	private SWTBot bot;

	/**
	 * @param bot
	 */
	public SWTEEFBotHelper(SWTBot bot) {
		super();
		this.bot = bot;
	}

	/**
	 * @param viewID
	 *            the edited advEOFCV
	 * @return the browse button of the given advEOFCV
	 */
	public SWTBotButton browseButtonAdvancedEObjectFlatComboViewer(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedEObjectFlatComboViewer::browsebutton"))));
	}
	
	/**
	 * @param viewID
	 *            the edited EOFCV
	 * @return the edit button of the given EOFCV
	 */
	public SWTBotButton editButtonEObjectFlatComboViewer(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::EObjectFlatComboViewer::editbutton"))));
	}
	
	/**
	 * @param viewID
	 *            the edited FlatReferencesTable
	 * @return the browse button of the given FlatReferencesTable
	 */
	public SWTBotButton browseButtonFlatReferencesTable(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::FlatReferencesTable::browsebutton"))));
	}

	/**
	 * @param viewID
	 *            the edited advEOFCV
	 * @return the remove button of the given advEOFCV
	 */
	public SWTBotButton removeButtonAdvancedEObjectFlatComboViewer(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedEObjectFlatComboViewer::removebutton"))));
	}

	/**
	 * @param viewID
	 *            the edited AdvancedReferencesTable
	 * @return the add button of the given AdvancedReferencesTable
	 */
	public SWTBotButton addButtonAdvancedReferencesTable(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedReferencesTable::addbutton"))));
	}

	/**
	 * @param viewID
	 *            the edited AdvancedReferencesTable
	 * @return the remove button of the given AdvancedReferencesTable
	 */
	public SWTBotButton removeButtonAdvancedReferencesTable(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedReferencesTable::removebutton"))));
	}

	/**
	 * @param viewID
	 *            the edited AdvancedTableComposition
	 * @return the add button of the given AdvancedTableComposition
	 */
	public SWTBotButton addButtonAdvancedTableComposition(String viewID) {
		Matcher<Widget> allOf = allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedTableComposition::addbutton"));
		return new SWTBotButton((Button) bot.widget(allOf));
	}

	/**
	 * @param viewID
	 *            the edited advTableComposition
	 * @return the remove button of the given advTableComposition
	 */
	public SWTBotButton removeButtonAdvancedTableComposition(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::AdvancedTableComposition::removebutton"))));
	}
	
	/**
	 * @param viewID
	 *            the edited MultiValuedEditor
	 * @return the browse button of the given MultiValuedEditor
	 */
	public SWTBotButton browseButtonMultiValuedEditor(String viewID) {
		Matcher<Widget> allOf = allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::MultiValuedEditor::browsebutton"));
		return new SWTBotButton((Button) bot.widget(allOf));
	}

	/**
	 * @param viewID
	 *            the edited radio
	 * @param mnemonicText
	 *            the mnemonic to select
	 * @return the radio to select
	 */
	public SWTBotRadio radioWithIdAndMnemonic(String viewID, String mnemonicText) {
		Matcher matcher = allOf(withId(UIConstants.EEF_WIDGET_ID_KEY, viewID), widgetOfType(Button.class), withMnemonic(mnemonicText), withStyle(SWT.RADIO, "SWT.RADIO"));
		return new SWTBotRadio((Button) bot.widget(matcher), matcher);
	}

	/**
	 * @param viewID
	 *            the edited ReferencesTable
	 * @return the browse button of the given ReferencesTable
	 */
	public SWTBotButton addButtonReferencesTable(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::ReferencesTable::addbutton"))));
	}

	/**
	 * @param viewID
	 *            the edited ReferencesTable
	 * @return the remove button of the given ReferencesTable
	 */
	public SWTBotButton removeButtonReferencesTable(String viewID) {
		return new SWTBotButton((Button) bot.widget(allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::ReferencesTable::removebutton"))));
	}

	/**
	 * @param viewID
	 *            the edited ReferencesTable
	 * @return the add button of the given ReferencesTable
	 */
	public SWTBotButton addButtonTableComposition(String viewID) {
		Matcher<Widget> allOf = allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::TableComposition::addbutton"));
		return new SWTBotButton((Button) bot.widget(allOf));
	}

	/**
	 * @param viewID
	 *            the edited ReferencesTable
	 * @return the remove button of the given ReferencesTable
	 */
	public SWTBotButton removeButtonTableComposition(String viewID) {
		Matcher<Widget> allOf = allOf(widgetOfType(Button.class), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_ID_KEY, viewID), withId(org.eclipse.emf.eef.runtime.ui.UIConstants.EEF_WIDGET_TYPE_KEY, "eef::TableComposition::removebutton"));
		return new SWTBotButton((Button) bot.widget(allOf));
	}

}
