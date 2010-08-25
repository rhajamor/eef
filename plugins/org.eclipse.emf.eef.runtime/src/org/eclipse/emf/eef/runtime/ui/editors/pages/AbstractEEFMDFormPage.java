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

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class AbstractEEFMDFormPage extends FormPage {

	/**
	 * The page ID
	 */
	public static final String PAGE_ID = "EEF-md-form-page";  //$NON-NLS-1$
	
	/**
	 * The form editor in which this page will be included
	 */
	private FormEditor editor;
	
	/**
	 * This keeps track of the editing domain that is used to track all changes
	 * to the model.
	 */
	private EditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 */
	private AdapterFactory adapterFactory;

	/**
	 * The master/details block for model edition 
	 */
	protected AbstractEEFMasterDetailsBlock block;

	/**
	 * The form containing this page
	 */
	private ScrolledForm form;

	/**
	 * The managed form
	 */
	private IManagedForm managedForm;
	
	/**
	 * @param editor the form editor in which this page will be included
	 */
	public AbstractEEFMDFormPage(FormEditor editor, String pageTitle) {
		super(editor, PAGE_ID, pageTitle); 
		this.editor = editor;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		block = createMasterDetailsBlock();
		block.setEditingDomain(editingDomain);
		this.managedForm = managedForm;
		form = managedForm.getForm();
		managedForm.getToolkit().decorateFormHeading(form.getForm());
		block.createContent(managedForm);
		block.getMasterPart().addSelectionChangeListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				getManagedForm().fireSelectionChanged(block.getMasterPart(), event.getSelection());
			}
			
		});
		createContextMenuFor(block.getMasterPart().getModelViewer());
	}

	/**
	 * @return the MasterDetailsBlock to use for the page
	 */
	protected abstract AbstractEEFMasterDetailsBlock createMasterDetailsBlock();

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator("additions")); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener((IMenuListener) editor);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}
	
	/**
	 * @return the form
	 */
	public IManagedForm getManagedForm() {
		return managedForm;
	}

	/**
	 * @return the modelViewer
	 */
	public StructuredViewer getModelViewer() {
		return block.getMasterPart().getModelViewer();
	}

	/**
	 * @return the editingDomain
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * @param editingDomain the editingDomain to set
	 */
	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/**
	 * @return the adapterFactory
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * @param adapterFactory the adapterFactory to set
	 */
	public void setAdapterFactory(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
	}

	/**
	 * Defines the title of the page
	 * @param title the title to define
	 */
	public void setPageTitle(String title) {
		if (title != null && form != null)
			form.setText(title);
	}
	
	/**
	 * @param input the input of the page
	 */
	public void setInput(Object input) {
		block.setAdapterFactory(adapterFactory);
		block.setEditingDomain(editingDomain);
		block.setInput(input);
		if (input instanceof ResourceSet) {
			Resource resource = ((ResourceSet)input).getResources().get(0);
			setPageTitle(resource.getURI().toString());
			form.setImage((new AdapterFactoryLabelProvider(adapterFactory)).getImage(resource));
		}
	}
	
	/**
	 * @param filter add a filter to the model viewer
	 */
	public void addFilter(ViewerFilter filter) {
		block.addFilter(filter);
	}
	
	/**
	 * @return the list of actions to add to the form toolbar
	 */
	protected List<Action> additionalPageUserActions() {
		// nothing to add
		return null;
	}
}
