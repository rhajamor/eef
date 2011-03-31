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

import org.eclipse.epf.richtext.IRichText;
import org.eclipse.epf.richtext.actions.FontSizeAction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author glefur
 */
public class EEFFontSizeAction extends FontSizeAction {

	public EEFFontSizeAction(IRichText richText) {
		super(richText);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.epf.ui.actions.CComboContributionItem#createControl(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createControl(Composite parent) {
		Control createControl = super.createControl(parent);
		selectFontSize();
		return createControl;
	}

	/**
	 * 
	 */
	protected void selectFontSize() {
		String fontSize = richText.getSelected().getFontSize();
		int index = -1;
		if (fontSize.equals("default")) { //$NON-NLS-1$
			index = 0;
		} else {
			try {
				index = Integer.parseInt(fontSize);
			} catch (NumberFormatException e) {
				// leave index at -1 so nothing is selected
			}
		}
		if (index == -1) {
			index = 0;
		}
		setNotifyListeners(false);
		getCCombo().select(index);
		setNotifyListeners(true);
	}

}
