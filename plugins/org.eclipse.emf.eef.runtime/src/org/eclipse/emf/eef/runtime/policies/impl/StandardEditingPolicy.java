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
package org.eclipse.emf.eef.runtime.policies.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.wizards.EEFWizardDialog;
import org.eclipse.emf.eef.runtime.ui.wizards.PropertiesEditingWizard;
import org.eclipse.jface.window.Window;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class StandardEditingPolicy implements PropertiesEditingPolicy {

	protected PropertiesEditingContext context;

	/**
	 * @param propertiesEditingContext
	 */
	public StandardEditingPolicy(PropertiesEditingContext propertiesEditingContext) {
		this.context = propertiesEditingContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy#execute()
	 */
	public void execute() {
		PropertiesEditingContext editionContext = (PropertiesEditingContext)context;
		EObject eObject = editionContext.getEObject();
		PropertiesEditingWizard wizard = new PropertiesEditingWizard(editionContext,
				editionContext.getAdapterFactory(), eObject);
		EEFWizardDialog wDialog = new EEFWizardDialog(EditingUtils.getShell(), wizard);
		int result = wDialog.open();
		ChangeDescription change = editionContext.getChangeRecorder().endRecording();
		editionContext.dispose();
		if (result == Window.CANCEL) {
			change.applyAndReverse();
		}
	}
}
