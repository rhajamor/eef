/*******************************************************************************
 * Copyright (c) 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFCommandParameter {

	private EReference reference;
	
	private EClass eClass;

	public EEFCommandParameter(EReference reference, EClass eClass) {
		super();
		this.reference = reference;
		this.eClass = eClass;
	}
	public EClass geteClass() {
		return eClass;
	}
	
	public EReference getReference() {
		return reference;
	}
	
}
