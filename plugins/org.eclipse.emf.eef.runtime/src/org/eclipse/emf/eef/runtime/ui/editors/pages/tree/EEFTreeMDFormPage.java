/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editors.pages.tree;

import java.util.List;

import org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFMDFormPage;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.tree.EEFTreeMasterDetailsBlock;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.forms.editor.FormEditor;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFTreeMDFormPage extends AbstractEEFMDFormPage {

	/**
	 * The page ID
	 */
	public static final String PAGE_ID = "EEF-md-form-page";  //$NON-NLS-1$
	
	/**
	 * @param editor the form editor in which this page will be included
	 */
	public EEFTreeMDFormPage(FormEditor editor, String pageTitle) {
		super(editor, pageTitle); 
	}
	
	
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFMDFormPage#createMasterDetailsBlock()
	 */
	@Override
	protected AbstractEEFMasterDetailsBlock createMasterDetailsBlock() {
		return new EEFTreeMasterDetailsBlock() {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock#additionalPageActions()
			 */
			protected List<Action> additionalPageActions() {
				return EEFTreeMDFormPage.this.additionalPageUserActions();
			}
			
		};
	}

}
