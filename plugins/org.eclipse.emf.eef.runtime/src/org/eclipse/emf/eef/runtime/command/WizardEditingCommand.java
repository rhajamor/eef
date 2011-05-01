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
package org.eclipse.emf.eef.runtime.command;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.wizards.EEFWizardDialog;
import org.eclipse.emf.eef.runtime.ui.wizards.PropertiesEditingWizard;
import org.eclipse.jface.window.Window;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class WizardEditingCommand extends AbstractCommand {

	protected DomainPropertiesEditingContext editionContext;

	protected ChangeDescription description;

	/**
	 * @param editionContext
	 */
	public WizardEditingCommand(DomainPropertiesEditingContext editionContext) {
		this.editionContext = editionContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		PropertiesEditingWizard wizard = new PropertiesEditingWizard(editionContext,
				editionContext.getAdapterFactory(), editionContext.getEObject());
		EEFWizardDialog wDialog = new EEFWizardDialog(EditingUtils.getShell(), wizard);
		int open = wDialog.open();
		description = editionContext.getChangeRecorder().endRecording();
		if (open == Window.OK) {
			return true;
		} else {
			description.applyAndReverse();
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		description.applyAndReverse();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {
		description.applyAndReverse();
	}

}
