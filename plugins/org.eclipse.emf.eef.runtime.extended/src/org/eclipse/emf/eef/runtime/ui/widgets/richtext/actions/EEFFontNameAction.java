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
package org.eclipse.emf.eef.runtime.ui.widgets.richtext.actions;

import java.util.Iterator;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.RichTextResources;
import org.eclipse.epf.richtext.actions.FontNameAction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFFontNameAction extends FontNameAction {

	/**
	 * @param richText
	 */
	public EEFFontNameAction(IRichText richText) {
		super(richText);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.epf.ui.actions.CComboContributionItem#createControl(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createControl(Composite parent) {
		Control createControl = super.createControl(parent);
		selectFontName();
		return createControl;
	}

	protected void selectFontName() {
		String fontName = richText.getSelected().getFontName();
		if (fontName.equals(RichTextResources.fontNameAction_CSS_Default)
				|| fontName.equals(RichTextResources.fontNameAction_CSS_Default_Mozilla)
				|| fontName.equals("default")) { //$NON-NLS-1$
			fontName = RichTextResources.fontNameAction_DefaultFontName;
		}
		int index = findFontNameInItems(fontName);
		if (index == -1) {
			index = 0;
		}
		setNotifyListeners(false);
		getCCombo().select(index);
		setNotifyListeners(true);
	}

	private int findFontNameInItems(String fontName) {
		int index = -1;
		for (Iterator<String> iter = input.iterator(); iter.hasNext();) {
			String font = iter.next();
			index++;
			if (font.equalsIgnoreCase(fontName)) {
				return index;
			}
		}
		return -1;
	}
}
