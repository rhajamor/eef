/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.utils;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class ValidationUtils {
	
	/**
	 * Append a new validation failure to an existing validation diagnostic
	 * @param diagnostic the original diagnostic
	 * @param validatedObject the object in failure
	 * @param severity the severity of the failure
	 * @param errorMessage the associated error message
	 */
	public static void appendDiagnostic(Diagnostic diagnostic, EObject validatedObject, int severity, String errorMessage) {
		Diagnostic newD = new BasicDiagnostic(EObjectValidator.DIAGNOSTIC_SOURCE, severity, errorMessage, new Object [] { validatedObject });
		((BasicDiagnostic)diagnostic).merge(newD);
	}


}
