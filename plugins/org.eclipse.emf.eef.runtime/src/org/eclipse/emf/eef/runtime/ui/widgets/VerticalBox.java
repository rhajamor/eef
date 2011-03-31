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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Vertical box are regular boxes that stack items vertically.
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class VerticalBox extends Composite {
	public VerticalBox(Composite parent) {
		super(parent, SWT.NONE);

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 0;
		GridData constraint = new GridData(GridData.FILL_VERTICAL);

		constraint.grabExcessHorizontalSpace = true;
		// constraint.grabExcessVerticalSpace=true;
		// gridData.horizontalSpan=0;
		// gridData.verticalSpan=0;
		constraint.horizontalAlignment = GridData.FILL;
		// constraint.verticalAlignment = GridData.FILL;

		// constraint.horizontalSpan = 3;

		this.setLayout(layout);
		this.setLayoutData(constraint);

	}
}
