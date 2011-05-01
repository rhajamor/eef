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
package org.eclipse.emf.eef.runtime.workspace;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.wizards.EEFWizardDialog;
import org.eclipse.emf.eef.runtime.ui.wizards.PropertiesEditingWizard;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.window.Window;

/**
 * @author glefur
 */
public class WizardEditingOperation extends AbstractEMFOperation {

	protected PropertiesEditingContext editingContext;

	/**
	 * @param domain
	 * @param label
	 */
	public WizardEditingOperation(DomainPropertiesEditingContext editingContext) {
		super((TransactionalEditingDomain)editingContext.getEditingDomain(), "EEF Editing Operaiton");
		this.editingContext = editingContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.workspace.AbstractEMFOperation#doExecute(org.eclipse.core.runtime.IProgressMonitor,
	 *      org.eclipse.core.runtime.IAdaptable)
	 */
	protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		PropertiesEditingWizard wizard = new PropertiesEditingWizard(editingContext,
				editingContext.getAdapterFactory(), editingContext.getEObject());
		EEFWizardDialog wDialog = new EEFWizardDialog(EditingUtils.getShell(), wizard);
		int open = wDialog.open();
		ChangeDescription description = editingContext.getChangeRecorder().endRecording();
		if (open == Window.OK) {
			return Status.OK_STATUS;
		} else {
			description.applyAndReverse();
			return Status.CANCEL_STATUS;
		}
	}

}
