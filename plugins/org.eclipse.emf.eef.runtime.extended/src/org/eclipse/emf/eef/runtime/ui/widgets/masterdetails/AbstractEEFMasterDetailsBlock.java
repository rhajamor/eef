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
package org.eclipse.emf.eef.runtime.ui.widgets.masterdetails;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.ui.editors.pages.EEFDetailsPage;
import org.eclipse.emf.eef.runtime.ui.layout.EEFFormLayoutFactory;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class AbstractEEFMasterDetailsBlock extends MasterDetailsBlock {

	protected FormToolkit toolkit;
	protected AbstractEEFMasterPart masterPart;
	protected EditingDomain editingDomain;
	private AdapterFactory adapterFactory;
	protected ValidateAction validateAction;
	private EEFDetailsPage lastDetailsPage;
	
	private boolean orientable = true;
	private boolean showValidateAction = true;
	
	/**
	 * Default constructor. 
	 * The block is orientable.
	 */
	public AbstractEEFMasterDetailsBlock() {
		super();
	}

	/**
	 * Constructor defining if the orientation of the block can be changed and if the validate action is visible.
	 * @param isOrientable the block is orientable or not.
	 * @param showValidationAction defining the visibility of the action.
	 */
	public AbstractEEFMasterDetailsBlock(boolean isOrientable, boolean showValidationAction) {
		this();
		orientable = isOrientable;
		this.showValidateAction = showValidationAction;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#createMasterPart(org.eclipse.ui.forms.IManagedForm, org.eclipse.swt.widgets.Composite)
	 */
	protected final void createMasterPart(IManagedForm managedForm, Composite parent) {
		this.toolkit = managedForm.getToolkit();
		Composite masterContainer = managedForm.getToolkit().createComposite(parent);
		masterContainer.setLayout(EEFFormLayoutFactory.createMasterGridLayout(false, 1));
		masterContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		masterPart = createEEFMasterPart(masterContainer);
		managedForm.addPart(masterPart);
		Section section = masterPart.getSection();
		section.setLayout(EEFFormLayoutFactory.createClearGridLayout(false, 1));
		section.setLayoutData(new GridData(GridData.FILL_BOTH));
		if (showValidateAction) {
			masterPart.addSelectionChangeListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					ISelection selection = event.getSelection();
					if (selection instanceof IStructuredSelection)
						validateAction.updateSelection((IStructuredSelection) selection);
				}

			});
		}
	}

	/**
	 * Create contents of the Master part
	 * @param masterContainer the container of this contents
	 * @return an EEFMasterPart defining the contents of the MasterPart 
	 */
	protected abstract AbstractEEFMasterPart createEEFMasterPart(Composite masterContainer);

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#createToolBarActions(org.eclipse.ui.forms.IManagedForm)
	 */
	protected void createToolBarActions(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		if (showValidateAction) {
			validateAction = new ValidateAction();
			validateAction.setToolTipText(EEFRuntimeUIMessages.AbstractEEFMasterDetailsBlock_validate_action_tooltip);
			validateAction.setImageDescriptor(EEFRuntimePlugin.getImageDescriptor(EEFRuntimePlugin.ICONS_16x16 + "validate.gif")); //$NON-NLS-1$
			form.getToolBarManager().add(validateAction);
		}
		if (orientable) {
			Action haction = new Action("hor", IAction.AS_RADIO_BUTTON) {  //$NON-NLS-1$
				public void run() {
					sashForm.setOrientation(SWT.HORIZONTAL);
					form.reflow(true);
				}
			};
			haction.setChecked(true);
			haction.setToolTipText(EEFRuntimeUIMessages.AbstractEEFMasterDetailsBlock_horizontal_layout);
			haction.setImageDescriptor(EEFRuntimePlugin.getImageDescriptor(EEFRuntimePlugin.ICONS_16x16 + "th_horizontal.gif")); //$NON-NLS-1$
			haction.setDisabledImageDescriptor(EEFRuntimePlugin.getImageDescriptor(EEFRuntimePlugin.ICONS_16x16 + "disabled/th_horizontal.gif")); //$NON-NLS-1$
			form.getToolBarManager().add(haction);

			Action vaction = new Action("ver", IAction.AS_RADIO_BUTTON) {  //$NON-NLS-1$
				public void run() {
					sashForm.setOrientation(SWT.VERTICAL);
					form.reflow(true);
				}
			};
			vaction.setChecked(false);
			vaction.setToolTipText(EEFRuntimeUIMessages.AbstractEEFMasterDetailsBlock_vertical_layout);
			vaction.setImageDescriptor(EEFRuntimePlugin.getImageDescriptor(EEFRuntimePlugin.ICONS_16x16 + "th_vertical.gif")); //$NON-NLS-1$
			vaction.setDisabledImageDescriptor(EEFRuntimePlugin.getImageDescriptor(EEFRuntimePlugin.ICONS_16x16 + "disabled/th_vertical.gif")); //$NON-NLS-1$
			form.getToolBarManager().add(vaction);
		}
		if (additionalPageActions() != null) {
			for (Action additionalAction : additionalPageActions()) {
				form.getToolBarManager().add(additionalAction);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#registerPages(org.eclipse.ui.forms.DetailsPart)
	 */
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(new IDetailsPageProvider() {

			public Object getPageKey(Object object) {
				if (object instanceof EObject)
					return EObject.class;
				return object.getClass();
			}

			public IDetailsPage getPage(Object key) {
				if (key.equals(EObject.class)) {
					lastDetailsPage = new EEFDetailsPage(toolkit, editingDomain, adapterFactory);
					return lastDetailsPage;
				}
				return null;
			}
		});
	}

	/**
	 * @return the master part of the block
	 */
	public AbstractEEFMasterPart getMasterPart() {
		return masterPart;
	}
		
	/**
	 * @return the lastDetailsPage
	 */
	public EEFDetailsPage getLastDetailsPage() {
		return lastDetailsPage;
	}

	/**
	 * Defines the orientation of the block.
	 * @param orientation the orientation to set
	 */
	public void setOrientation(int orientation) {
		sashForm.setOrientation(orientation);
	}
		
	/**
	 * @return the adapterFactory
	 */
	public AdapterFactory getAdapterFactory() {
		return masterPart.getAdapterFactory();
	}

	/**
	 * @param adapterFactory the adapterFactory to set
	 */
	public void setAdapterFactory(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
		masterPart.setAdapterFactory(adapterFactory);
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
	 * @param input the input of the model viewer
	 */
	public void setInput(Object input) {
		masterPart.setInput(input);
	}

	/**
	 * @param filter add a filter to the model viewer
	 */
	public void addFilter(ViewerFilter filter) {
		masterPart.addFilter(filter);
	}
	
	/**
	 * @return the list of actions to add to the form toolbar
	 */
	protected List<Action> additionalPageActions() {
		// nothing to add
		return null;
	}

}
