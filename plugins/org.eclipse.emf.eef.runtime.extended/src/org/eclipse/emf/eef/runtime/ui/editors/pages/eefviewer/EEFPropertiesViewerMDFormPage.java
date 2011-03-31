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
package org.eclipse.emf.eef.runtime.ui.editors.pages.eefviewer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFMDFormPage;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.eefviewer.PropertiesViewerMasterDetailsBlock;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.forms.editor.FormEditor;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFPropertiesViewerMDFormPage extends AbstractEEFMDFormPage {

	/**
	 * The page ID
	 */
	public static final String PAGE_ID = "EEF-md-form-page";  //$NON-NLS-1$
	
	private boolean orientable = true;
	private boolean showValidateAction = true;
	private List<Object> activatingKeys;
	
	/**
	 * @param editor the form editor in which this page will be included
	 * @param pageTitle the title of the page
	 */
	public EEFPropertiesViewerMDFormPage(FormEditor editor, String pageTitle) {
		super(editor, pageTitle);
		activatingKeys = new ArrayList<Object>();
	}

	/**
	 * @param editor the form editor in which this page will be included
	 * @param pageTitle the title of the page
	 */
	public EEFPropertiesViewerMDFormPage(FormEditor editor, String pageTitle, boolean isOrientable, boolean showValidatePage) {
		this(editor, pageTitle);
		this.orientable = isOrientable;
		this.showValidateAction = showValidatePage;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFMDFormPage#createMasterDetailsBlock()
	 */
	protected AbstractEEFMasterDetailsBlock createMasterDetailsBlock() {
		return new PropertiesViewerMasterDetailsBlock(orientable, showValidateAction);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFMDFormPage#refreshFormContents()
	 */
	protected void refreshFormContents() {
		PropertiesEditionContentProvider contentProvider = new PropertiesEditionContentProvider(getAdapterFactory(), IPropertiesEditionComponent.LIVE_MODE, editingDomain);
		getModelViewer().setContentProvider(contentProvider);
		contentProvider.addPropertiesListener(new IPropertiesEditionListener() {

			public void firePropertiesChanged(IPropertiesEditionEvent event) {
				if (event.getState() == PropertiesEditionEvent.CHANGE && event.getKind() == PropertiesEditionEvent.SELECTION_CHANGED && isAffectingEditor(event)) {
					getManagedForm().fireSelectionChanged(block.getMasterPart(), new StructuredSelection(event.getNewValue()));
				}
			}
		});
		super.refreshFormContents();
	}

	/**
	 * @param activatingKeys the activatingKeys to set
	 */
	public void setActivatingKeys(List<Object> activatingKeys) {
		this.activatingKeys = activatingKeys;
	}

	/**
	 * @param event
	 * @return
	 */
	protected boolean isAffectingEditor(IPropertiesEditionEvent event) {
		return activatingKeys.isEmpty() || activatingKeys.contains(event.getAffectedEditor());
	}
	
}
