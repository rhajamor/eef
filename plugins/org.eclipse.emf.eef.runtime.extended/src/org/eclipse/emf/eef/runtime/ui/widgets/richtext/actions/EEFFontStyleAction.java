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

import java.util.List;

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.actions.FontStyleAction;
import org.eclipse.epf.richtext.html.FontStyle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFFontStyleAction extends FontStyleAction {

	/**
	 * @param richText
	 */
	public EEFFontStyleAction(IRichText richText) {
		super(richText);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.epf.ui.actions.CComboContributionItem#createControl(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createControl(Composite parent) {
		Control createControl = super.createControl(parent);
		selectFontStyle();
		return createControl;
	}

	/**
	 * 
	 */
	protected void selectFontStyle() {
		String blockStyle = richText.getSelected().getBlockStyle();
		String name = FontStyle.getFontStyleName(blockStyle);

		int index = ((List<String>)input).indexOf(name);
		if (index == -1) {
			index = 0;
		}
		setNotifyListeners(false);
		getCCombo().select(index);
		setNotifyListeners(true);

	}

}
