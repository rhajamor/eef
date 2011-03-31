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
package org.eclipse.emf.eef.runtime.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

/**
 * Interface to implement by {@link IPropertiesEditionComponent} providers.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface PropertiesEditingProvider {

	/**
	 * Indicates whether this provider provides the specified {@link PropertiesEditingContext}.
	 * 
	 * @param editingContext
	 *            the {@link PropertiesEditingContext} to provide
	 * @return <code>true</code> if this provider provides the editingContext; <code>false</code> otherwise.
	 */
	public abstract boolean provides(PropertiesEditingContext editingContext);

	/**
	 * Indicates whether this provider provides the specified {@link PropertiesEditingContext} for the given
	 * part.
	 * 
	 * @param editingContext
	 *            the {@link PropertiesEditingContext} to provide
	 * @param part
	 *            the key of the PropertiesEditingPart to provide
	 * @return <code>true</code> if this provider provides for the specified parameters; <code>false</code>
	 *         otherwise.
	 */
	public abstract boolean provides(PropertiesEditingContext editingContext, String part);

	/**
	 * Indicates whether this provider provides the specified {@link PropertiesEditingContext} for the
	 * expected type.
	 * 
	 * @param editingContext
	 *            the {@link PropertiesEditingContext} to provide
	 * @return <code>true</code> if this provider provides the eObject; <code>false</code> otherwise.
	 */
	public abstract boolean provides(PropertiesEditingContext editingContext, Class refinement);

	/**
	 * Indicates whether this provider provides the specified {@link PropertiesEditingContext} for the given
	 * part (with the expected type).
	 * 
	 * @param editingContext
	 *            the {@link PropertiesEditingContext} to provide
	 * @param part
	 *            the key of the PropertiesEditingPart to provide
	 * @param refinement
	 *            the expected type
	 * @return <code>true</code> if this provider provides the eObject; <code>false</code> otherwise.
	 */
	public abstract boolean provides(PropertiesEditingContext editingContext, String part, Class refinement);

	/**
	 * Returns a {@link IPropertiesEditionComponent} able to edit the {@link EObject} in the current
	 * {@link PropertiesEditingContext}.
	 * 
	 * @param editingContext
	 *            the current {@link PropertiesEditingContext}
	 * @param mode
	 *            the editing mode. Available modes are IPropertiesEditionComponent.BATCH_MODE or
	 *            IPropertiesEditionComponent.LIVE_MODE.
	 * @return a {@link IPropertiesEditionComponent} to edit the {@link EObject} in the editingContext
	 */
	public abstract IPropertiesEditionComponent getPropertiesEditingComponent(
			PropertiesEditingContext editingContext, String mode);

	/**
	 * Returns a {@link IPropertiesEditionComponent} able to edit the {@link EObject} in the current
	 * {@link PropertiesEditingContext} for the given part.
	 * 
	 * @param editingContext
	 *            the current {@link PropertiesEditingContext}
	 * @param mode
	 *            the editing mode. Available modes are IPropertiesEditionComponent.BATCH_MODE or
	 *            IPropertiesEditionComponent.LIVE_MODE.
	 * @param part
	 *            the key of the part determining the {@link IPropertiesEditionComponent} to provide
	 * @return a {@link IPropertiesEditionComponent} to edit the {@link EObject} in the editingContext
	 */
	public abstract IPropertiesEditionComponent getPropertiesEditingComponent(
			PropertiesEditingContext editingContext, String mode, String part);

	/**
	 * Returns a {@link IPropertiesEditionComponent} able to edit the specified eObject for a specific part
	 * with a specific type.
	 * 
	 * @param editingContext
	 *            the current {@link PropertiesEditingContext}
	 * @param mode
	 *            the editing mode. Available modes are IPropertiesEditionComponent.BATCH_MODE or
	 *            IPropertiesEditionComponent.LIVE_MODE.
	 * @param part
	 *            the key of the part determining the {@link IPropertiesEditionComponent} to provide
	 * @param refinement
	 *            the expected type
	 * @return a {@link IPropertiesEditionComponent} to edit the {@link EObject} in the editingContext
	 */
	public abstract IPropertiesEditionComponent getPropertiesEditingComponent(
			PropertiesEditingContext editingContext, String mode, String part, Class refinement);

	/**
	 * Returns a {@link PropertiesEditingPolicy} defining the editing policy for the given context.
	 * 
	 * @param editingContext
	 *            the current {@link PropertiesEditingContext}
	 * @return a {@link PropertiesEditingPolicy} to edit the given context
	 */
	public abstract PropertiesEditingPolicy getPolicy(PropertiesEditingContext context);

}
