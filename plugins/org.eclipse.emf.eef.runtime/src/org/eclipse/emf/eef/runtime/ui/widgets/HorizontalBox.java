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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Horizontal box are regular boxes that stack items horizontally.
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class HorizontalBox extends Composite {

	private GridLayout layout;

	/**
	 * @param parent
	 */
	public HorizontalBox(Composite parent) {
		super(parent, SWT.NONE);
		layout = new GridLayout();
		layout.marginHeight = 2;
		layout.marginWidth = 2;
		layout.numColumns = 10;
		layout.makeColumnsEqualWidth = false;
		this.setLayout(layout);
	}

	/**
	 * @param count
	 */
	public void setEditorCount(int count) {
		layout.numColumns = count * 3;
		layout();
	}

}
