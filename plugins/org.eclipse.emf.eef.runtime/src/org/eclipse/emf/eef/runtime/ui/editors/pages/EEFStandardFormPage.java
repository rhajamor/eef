/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editors.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.providers.RegistryPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.ui.layout.EEFFormLayoutFactory;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFStandardFormPage extends FormPage {

	/**
	 * The page ID
	 */
	public static final String PAGE_ID = "EEF-std-form-page";  //$NON-NLS-1$

	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 */
	protected EditingDomain editingDomain;

	/**
	 * The form containing this page
	 */
	private ScrolledForm form;

	/**
	 * The form toolkit to use
	 */
	private FormToolkit toolkit;

	/**
	 * The folder for the tab
	 */	
	protected PropertiesEditionViewer viewer;
	

	/**
	 * @param editor
	 *            the form editor in which this page will be included
	 */
	public EEFStandardFormPage(FormEditor editor, String pageTitle,
			EditingDomain editingDomain) {
		super(editor, PAGE_ID, pageTitle); 
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		form = managedForm.getForm();
		toolkit = managedForm.getToolkit();
		toolkit.decorateFormHeading(form.getForm());
		form.getBody().setLayout(EEFFormLayoutFactory.createDetailsGridLayout(false, 1));
		this.viewer = new PropertiesEditionViewer(form.getBody(), null, SWT.BORDER, 1);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setDynamicTabHeader(false);
		viewer.setToolkit(getManagedForm().getToolkit());
		viewer.setContentProvider(new PropertiesEditionContentProvider(new RegistryPropertiesEditionProvider(), IPropertiesEditionComponent.LIVE_MODE, editingDomain));

	}

	/**
	 * Defines the title of the page
	 * 
	 * @param title
	 *            the title to define
	 */
	public void setPageTitle(String title) {
		if (title != null && form != null)
			form.setText(title);
	}

	/**
	 * @param input
	 *            the input of the page
	 */
	public void setInput(EObject newEObject) {
		viewer.setInput(newEObject);
	}
	
	/**
	 * Sets the image to be rendered to the left of the title.
	 * @param image
	 *            the title image
	 */
	public void setImage(Image image) {
		if (image != null && form != null)
			form.setImage(image);
	}
	
	/**
	 * Add the given filter to the page viewer
	 * @param filter the page viewer filter
	 */
	public void addFilter(ViewerFilter filter) {
		viewer.addFilter(filter);
	}
}
