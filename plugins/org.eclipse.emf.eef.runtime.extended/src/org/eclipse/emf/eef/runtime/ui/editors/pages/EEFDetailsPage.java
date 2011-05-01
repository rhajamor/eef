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
package org.eclipse.emf.eef.runtime.ui.editors.pages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.emf.eef.runtime.ui.layout.EEFFormLayoutFactory;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingMessageManager;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingViewer;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFDetailsPage extends AbstractFormPart implements IDetailsPage, PropertiesEditingListener {
	
	private FormToolkit toolkit;
	private EditingDomain editingDomain;
	protected EObject eObject;
	protected PropertiesEditingComponent propertiesEditionComponent;
	
	/**
     * Manager for error message
     */
	private PropertiesEditingMessageManager messageManager;

	protected PropertiesEditingViewer viewer;
	private AdapterFactory adapterFactory;

	public EEFDetailsPage(FormToolkit toolkit, EditingDomain editingDomain, AdapterFactory adapterFactory) {
		super();
		this.toolkit = toolkit; 
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
	}

	public void createContents(Composite parent) {
		toolkit = getManagedForm().getToolkit();
		parent.setLayout(EEFFormLayoutFactory.createDetailsGridLayout(false, 1));
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite container = toolkit.createComposite(parent, SWT.FLAT);
		GridLayout containerLayout = new GridLayout();
		container.setLayout(containerLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		messageManager = new PropertiesEditingMessageManager() {

			@Override
			protected void updateStatus(String message) {
				if (message != null)
					getManagedForm().getForm().setMessage(message, IMessageProvider.ERROR);
				else
					getManagedForm().getForm().setMessage(null, IMessageProvider.NONE);
			}
		};
		this.viewer = new PropertiesEditingViewer(container, null, SWT.NONE, 1);
		viewer.setDynamicTabHeader(true);
		viewer.setToolkit(getManagedForm().getToolkit());
		viewer.setContentProvider(new PropertiesEditingContentProvider(adapterFactory, PropertiesEditingComponent.LIVE_MODE, editingDomain));
	}

	public void selectionChanged(IFormPart part, ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		EObject newEObject = getEObjectFromSelection(selection);
		if (newEObject != null && newEObject != eObject) {
			eObject = newEObject;
			if (eObject != null) {
				if (viewer.getToolkit() == null)
					viewer.setToolkit(toolkit);
				viewer.setInput(new DomainPropertiesEditingContext(null, null, editingDomain, adapterFactory, eObject));
				viewer.addPropertiesListener(this);
			}
		}
	}

	private EObject getEObjectFromSelection(ISelection selection) {
		if (selection instanceof StructuredSelection && (((StructuredSelection)selection).getFirstElement() instanceof EObject))
			return (EObject) ((StructuredSelection)selection).getFirstElement();
		if (selection instanceof EObject)
			return (EObject) selection;
		if (selection instanceof IAdaptable && ((IAdaptable)selection).getAdapter(EObject.class) != null)
			return (EObject) ((IAdaptable)selection).getAdapter(EObject.class);
			
		return null;
	}

	/**
	 * @return the viewer
	 */
	public PropertiesEditingViewer getViewer() {
		return viewer;
	}

	public void firePropertiesChanged(PropertiesEditingEvent event) {
		handleChange(event);
	}

	private void handleChange(PropertiesEditingEvent event) {
		// do not handle changes if you are in initialization.
		if (viewer.isInitializing())
			return;
		messageManager.processMessage(event);
	}

}
