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
package org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.eefviewer;

import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingMessageManager;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterPart;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class PropertiesViewerMasterPart extends AbstractEEFMasterPart {

	/**
	 * @param toolkit the toolkit to use to create part widgets
	 * @param container the composite where to create the part
	 * @param block the AbstractEEFMasterDetailsBlock which will contain this part
	 */
	public PropertiesViewerMasterPart(FormToolkit toolkit, Composite container, AbstractEEFMasterDetailsBlock block) {
		super(toolkit, container, block);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterPart#createSectionClientContents(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 */
	protected StructuredViewer createSectionClientContents(Composite parent, FormToolkit toolkit) {
		GridLayout containerLayout = new GridLayout();
		parent.setLayout(containerLayout);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		new PropertiesEditingMessageManager() {

			@Override
			protected void updateStatus(String message) {
				if (message != null)
					getManagedForm().getForm().setMessage(message, IMessageProvider.ERROR);
				else
					getManagedForm().getForm().setMessage(null, IMessageProvider.NONE);
			}
		};
		PropertiesEditingViewer viewer = new PropertiesEditingViewer(parent, null, SWT.NONE, 1);
		viewer.setDynamicTabHeader(true);
		viewer.setToolkit(toolkit);
		return viewer;
	}

}
