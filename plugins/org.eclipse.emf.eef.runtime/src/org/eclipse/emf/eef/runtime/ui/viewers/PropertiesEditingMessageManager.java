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
package org.eclipse.emf.eef.runtime.ui.viewers;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesValidationEditingEvent;
import org.eclipse.swt.widgets.Display;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public abstract class PropertiesEditingMessageManager {

	private Diagnostic oldFailedDiagnostic = null;

	private Object oldFailedEvent = null;

	public void processMessage(PropertiesEditingEvent event) {
		if (event instanceof PropertiesValidationEditingEvent) {
			final Diagnostic diag = ((PropertiesValidationEditingEvent)event).getDiagnostic();
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						updateStatus(computeMessage(diag));
					}
				});
			} else {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						updateStatus(null);
					}
				});
			}
		}
	}

	protected abstract void updateStatus(final String message);

	private String computeMessage(Diagnostic diag) {
		for (Diagnostic child : diag.getChildren()) {
			if (child.getSeverity() != Diagnostic.OK) {
				if (child.getChildren().isEmpty()) {
					return child.getMessage();
				}
				return computeMessage(child);
			}
		}
		return diag.getMessage();
	}

}
