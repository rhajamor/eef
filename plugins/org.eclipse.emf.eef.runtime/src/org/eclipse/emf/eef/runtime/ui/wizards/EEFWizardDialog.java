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
package org.eclipse.emf.eef.runtime.ui.wizards;

import org.eclipse.emf.eef.runtime.ui.UIConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class EEFWizardDialog extends WizardDialog {

	private Button _finishButton;

	public EEFWizardDialog(Shell shell, IWizard wizard) {
		super(shell, wizard);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();
		return new Point(Math.min(UIConstants.INITIAL_WIZARD_SIZE.x, initialSize.x), Math.min(UIConstants.INITIAL_WIZARD_SIZE.y, initialSize.y));
	}



	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		_finishButton = super.createButton(parent, id, label, false);
		return _finishButton;
	}

	@Override
	public void updateButtons() {
		boolean canFinish = getWizard().canFinish();
		_finishButton.setEnabled(canFinish);
	}	
	
}
