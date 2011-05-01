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
package org.eclipse.emf.eef.runtime.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFValidator extends EObjectValidator {

	private final IBatchValidator batchValidator;

	public EEFValidator() {
		super();
		batchValidator = (IBatchValidator)ModelValidationService.getInstance().newValidator(
				EvaluationMode.BATCH);
		batchValidator.setIncludeLiveConstraints(true);
		batchValidator.setReportSuccesses(false);
	}

	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		super.validate(eClass, eObject, diagnostics, context);
		IStatus status = Status.OK_STATUS;
		if (diagnostics != null) {
			if (!hasProcessed(eObject, context)) {
				status = batchValidator.validate(eObject, new NullProgressMonitor());
				processed(eObject, context, status);
				appendDiagnostics(status, diagnostics);
			}
		}
		return status.isOK();
	}

	private void processed(EObject eObject, Map<Object, Object> context, IStatus status) {
		if (context != null) {
			context.put(eObject, status);
		}
	}

	private boolean hasProcessed(EObject eObject, Map<Object, Object> context) {
		EObject toTest = eObject;
		boolean result = false;
		if (context != null) {
			while (toTest != null) {
				if (context.containsKey(toTest)) {
					result = true;
					toTest = null;
				} else {
					toTest = toTest.eContainer();
				}
			}
		}
		return result;
	}

	private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			for (int i = 0; i < children.length; i++) {
				appendDiagnostics(children[i], diagnostics);
			}
		} else if (status instanceof IConstraintStatus) {
			diagnostics.add(new BasicDiagnostic(status.getSeverity(), status.getPlugin(), status.getCode(),
					status.getMessage(), ((IConstraintStatus)status).getResultLocus().toArray()));
		}
	}

}
