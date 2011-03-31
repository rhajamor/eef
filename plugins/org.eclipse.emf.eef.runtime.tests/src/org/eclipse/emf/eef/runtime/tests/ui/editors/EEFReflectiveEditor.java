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
package org.eclipse.emf.eef.runtime.tests.ui.editors;

import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.eef.runtime.ui.notify.OpenWizardOnDoubleClick;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFReflectiveEditor extends EcoreEditor implements ITabbedPropertySheetPageContributor {
	
	protected TabbedPropertySheetPage propertySheet;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor#getContributorId()
	 */
	public String getContributorId() {
		return "org.eclipse.emf.eef.reflect.editor";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.presentation.EcoreEditor#createPages()
	 */
	@Override
	public void createPages() {
		super.createPages();
		selectionViewer.addDoubleClickListener(new OpenWizardOnDoubleClick(editingDomain, adapterFactory));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.presentation.EcoreEditor#getPropertySheetPage()
	 */
	@Override
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheet == null)
			propertySheet = new TabbedPropertySheetPage(this);
		return propertySheet;
	}
	
	

}
