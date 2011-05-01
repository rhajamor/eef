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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.TypedEReferencePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicyWithResult;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.wizards.EEFWizardDialog;
import org.eclipse.emf.eef.runtime.ui.wizards.PropertiesEditingWizard;
import org.eclipse.emf.eef.runtime.util.EEFUtils;
import org.eclipse.jface.window.Window;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class CreateEditingPolicy implements PropertiesEditingPolicyWithResult {

	protected EReferencePropertiesEditingContext editionContext;

	protected EObject result;

	/**
	 * @param editionContext
	 */
	public CreateEditingPolicy(EReferencePropertiesEditingContext editionContext) {
		this.editionContext = editionContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy#execute()
	 */
	public void execute() {
		EClassifier eType = editionContext.getEReference().getEType();
		PropertiesEditingWizard wizard;
		if (editionContext instanceof TypedEReferencePropertiesEditingContext) {
			EObject create = EcoreUtil.create(((TypedEReferencePropertiesEditingContext)editionContext).getExpectedType()); 
			editionContext.seteObject(create);
			if (editionContext.getSettings() != null) {
				EEFUtils.putToReference(editionContext.getSettings(), create);
			}
			wizard = new PropertiesEditingWizard(editionContext, editionContext.getAdapterFactory(), create);
		} else if (eType instanceof EClass && ((EClass)eType).isAbstract()) {
			wizard = new PropertiesEditingWizard(editionContext, editionContext.getAdapterFactory(), editionContext.getEReference());
		} else {
			EObject create = EcoreUtil.create((EClass)eType);
			editionContext.seteObject(create);
			if (editionContext.getSettings() != null) {
				EEFUtils.putToReference(editionContext.getSettings(), create);
			}
			wizard = new PropertiesEditingWizard(editionContext, editionContext.getAdapterFactory(), create);
		}
		EEFWizardDialog wDialog = new EEFWizardDialog(EditingUtils.getShell(), wizard);
		int executionResult = wDialog.open();
		result = wizard.getEObject();
		ChangeDescription change = editionContext.getChangeRecorder().endRecording();
		editionContext.dispose();
		if (executionResult == Window.CANCEL) {
			change.applyAndReverse();
			result = null;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicyWithResult#getResult()
	 */
	public Object getResult() {
		return result;
	}

}
