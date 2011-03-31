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
package org.eclipse.emf.eef.runtime.ui.widgets;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class FormUtils {

	/**
	 * Image registry key for help image (value <code>"dialog_help_image"</code> ).
	 */
	public static final String DLG_IMG_HELP = "dialog_help_image"; //$NON-NLS-1$

	/**
	 * Create a label describing a properties of the view
	 * 
	 * @param parent
	 *            the parent composite
	 * @param text
	 *            the label text
	 * @param required
	 *            defines if the associated properties is required or not
	 */
	public static Label createPartLabel(FormToolkit widgetFactory, Composite parent, String text,
			boolean required) {
		Label label = widgetFactory.createLabel(parent, text);
		if (required)
			label.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		return label;
	}

	/**
	 * Creates a button with a help image and put the defined tooltip in parameter.
	 * 
	 * @param parent
	 *            the parent composite
	 * @param the
	 *            message to use for tooltip
	 */
	public static Control createHelpButton(FormToolkit widgetFactory, Composite parent, String helpMessage,
			String helpID) {
		Image image = JFaceResources.getImage(DLG_IMG_HELP);
		if (helpID != null && !"".equals(helpID)) { //$NON-NLS-1$
			ToolBar result = new ToolBar(parent, SWT.FLAT | SWT.NO_FOCUS);
			((GridLayout)parent.getLayout()).numColumns++;
			result.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
			ToolItem item = new ToolItem(result, SWT.NONE);
			item.setImage(image);
			if (helpMessage != null && !"".equals(helpMessage)) //$NON-NLS-1$
				item.setToolTipText(helpMessage);
			return result;
		} else {
			Label result = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
			if (helpMessage != null && !"".equals(helpMessage)) { //$NON-NLS-1$
				result.setImage(image);
				result.setToolTipText(helpMessage);
			}
			return result;
		}
	}

}
