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
package org.eclipse.emf.eef.runtime.api.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

/**
 * Interface to implement by {@link IPropertiesEditionPart} providers.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface IPropertiesEditionPartProvider {

	/**
	 * Indicates whether this provider provides the specified ViewRepository.
	 * 
	 * @param key
	 *            the key identifing the ViewRepository to check
	 * @return <code>true</code> if this provider provides for this ; <code>false</code> otherwise.
	 */
	public abstract boolean provides(Object key);

	/**
	 * @param key
	 *            the key identifing the expected View.
	 * @param kind
	 *            the kind of the expected view
	 * @param component
	 *            the {@link IPropertiesEditionComponent} that manages this view
	 * @return the expected view
	 */
	public abstract IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind,
			IPropertiesEditionComponent component);

}
