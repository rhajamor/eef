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
package org.eclipse.emf.eef.components.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.views.Container;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class BadReferencedEditorConstraint extends AbstractModelConstraint {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			if (eObj instanceof PropertiesEditionElement) {
				for (ElementEditor elementEditor : ((PropertiesEditionElement)eObj).getViews()) {
					if (!existElementEditorInInvolvedViews((PropertiesEditionComponent)eObj.eContainer(),
							elementEditor))
						return ctx.createFailureStatus(new Object[] {elementEditor,
								((PropertiesEditionElement)eObj).getName()});
				}
			}
		}
		return ctx.createSuccessStatus();
	}

	/**
	 * @param obj
	 * @return
	 */
	private boolean existElementEditorInInvolvedViews(PropertiesEditionComponent pec,
			ElementEditor elementEditor) {
		for (View view : pec.getViews()) {
			for (ViewElement viewElement : view.getElements())
				if (existElementEditorInViewElements(viewElement, elementEditor))
					return true;
		}
		return false;
	}

	private boolean existElementEditorInViewElements(ViewElement viewElement, ElementEditor elementEditor) {
		if (viewElement.equals(elementEditor))
			return true;
		if (viewElement instanceof Container) {
			for (ViewElement ve2 : ((Container)viewElement).getElements()) {
				if (existElementEditorInViewElements(ve2, elementEditor))
					return true;
			}
		}
		return false;
	}
}
