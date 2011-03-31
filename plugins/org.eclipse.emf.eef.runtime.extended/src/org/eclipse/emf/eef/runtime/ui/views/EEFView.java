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
package org.eclipse.emf.eef.runtime.ui.views;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.tree.EEFTreeMasterDetailsBlock;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFView extends ViewPart implements IEditingDomainProvider {
	
	/**
	 * The toolkit to use
	 */
	private FormToolkit toolkit;
	
	/**
	 * The view's form
	 */
	protected ManagedForm form;
	
	/**
	 * The master/details block for model edition 
	 */
	protected AbstractEEFMasterDetailsBlock block;
	
	/**
	 * The editor/view sychronizer
	 */
	private IPartListener2 partListener;
	
	/**
	 * @return the toolkit
	 */
	public FormToolkit getToolkit() {
		if (toolkit == null)
			toolkit = new FormToolkit(Display.getCurrent());
		return toolkit;
	}

	/**
	 * @param toolkit the toolkit to set
	 */
	public void setToolkit(FormToolkit toolkit) {
		this.toolkit = toolkit;
	}

	/**
	 * @return the adapterFactory
	 */
	public AdapterFactory getAdapterFactory() {
		return block.getAdapterFactory();
	}

	/**
	 * @param adapterFactory the adapterFactory to set
	 */
	public void setAdapterFactory(ComposedAdapterFactory adapterFactory) {
		block.setAdapterFactory(adapterFactory);
	}

	/**
	 * @return the editingDomain
	 */
	public EditingDomain getEditingDomain() {
		return block.getEditingDomain();
	}

	/**
	 * @param editingDomain the editingDomain to set
	 */
	public void setEditingDomain(EditingDomain editingDomain) {
		block.setEditingDomain(editingDomain);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		form = new ManagedForm(parent);
		block = new EEFTreeMasterDetailsBlock() {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock#additionalPageActions()
			 */
			protected List<Action> additionalPageActions() {
				return EEFView.this.additionalPageUserActions();
			}
			
		};
		
		block.createContent(form);
		block.getMasterPart().addSelectionChangeListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				form.fireSelectionChanged(block.getMasterPart(), event.getSelection());
			}
			
		});
		createContextMenuFor(block.getMasterPart().getModelViewer());
		// Initialize the partListener and register it
		getSite().getPage().addPartListener(getPartListener());
	}

	/**
	 * @return 
	 * 
	 */
	protected IPartListener2 getPartListener() {
		partListener = new IPartListener2() {
			
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			public void partOpened(IWorkbenchPartReference partRef) {
			}

			public void partInputChanged(IWorkbenchPartReference partRef) {
			}

			public void partHidden(IWorkbenchPartReference partRef) {
			}

			public void partDeactivated(IWorkbenchPartReference partRef) {
			}

			public void partClosed(IWorkbenchPartReference partRef) {
			}

			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			public void partActivated(IWorkbenchPartReference partRef) {
				IWorkbenchPart part = partRef.getPart(false);
				if (part instanceof IEditorPart) {
					if (part instanceof IEditingDomainProvider) {
						IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
						EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
						setEditingDomain(editingDomain);
						editingDomainChanged(editingDomain);
					}
				}
			}
		};
		return partListener;
	}

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
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));
	}

	protected List<Action> additionalPageUserActions() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		if (partListener != null)
			getSite().getPage().removePartListener(partListener);
		super.dispose();
	}

	/**
	 * @param editingDomain the {@link EditingDomain} of the new selected part
	 */
	protected void editingDomainChanged(EditingDomain editingDomain) {
		block.setInput(editingDomain.getResourceSet());
	}
	
	

}
