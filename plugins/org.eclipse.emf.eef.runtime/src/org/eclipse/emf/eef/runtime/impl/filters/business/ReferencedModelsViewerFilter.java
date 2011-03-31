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
package org.eclipse.emf.eef.runtime.impl.filters.business;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFRuntimeMessages;
import org.eclipse.jface.viewers.Viewer;

/**
 * Filter which returns elements of referenced models
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ReferencedModelsViewerFilter extends BusinessViewerFilter {

	/**
	 * @param eObject
	 * @param nullable
	 */
	public ReferencedModelsViewerFilter(EObject eObject, boolean nullable) {
		super(eObject, nullable);
		name = EEFRuntimeMessages.ReferencedModelsViewerFilter_name;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers .Viewer, java.lang.Object,
	 * java.lang.Object)
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (nullable && element instanceof String && element.equals("")) //$NON-NLS-1$
			return true;
		if (current.eResource() != null)
			return (element instanceof EObject && ((EObject)element).eResource() != null && !current
					.eResource().equals(((EObject)element).eResource()));
		else if (PropertiesContextService.getInstance().entryPointElement().eResource() != null)
			return (element instanceof EObject && ((EObject)element).eResource() != null && !PropertiesContextService
					.getInstance().entryPointElement().eResource().getURI()
					.equals(((EObject)element).eResource().getURI()));
		else
			return true;

	}

}
