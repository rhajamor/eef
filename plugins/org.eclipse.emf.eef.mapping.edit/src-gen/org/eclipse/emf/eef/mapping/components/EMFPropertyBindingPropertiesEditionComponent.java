/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: EMFPropertyBindingPropertiesEditionComponent.java,v 1.3 2009/05/05 12:07:29 sbouchet Exp $
 */
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class EMFPropertyBindingPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * Parameterized constructor
	 * 
	 * @param eMFPropertyBinding
	 *            the EObject to edit
	 */
	public EMFPropertyBindingPropertiesEditionComponent(EObject eMFPropertyBinding, String editing_mode) {
		super(editing_mode);
		if (eMFPropertyBinding instanceof EMFPropertyBinding) {
			addSubComponent(new EMFPropertyBindingBasePropertiesEditionComponent(eMFPropertyBinding, editing_mode));
			addSubComponent(new DocumentedElementPropertiesEditionComponent(eMFPropertyBinding, editing_mode));
		}
	}
}

