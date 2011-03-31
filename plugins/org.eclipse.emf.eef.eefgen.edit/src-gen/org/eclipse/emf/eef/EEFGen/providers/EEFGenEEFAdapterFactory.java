/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.EEFGen.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.EEFGen.util.EEFGenAdapterFactory;


/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EEFGenEEFAdapterFactory extends EEFGenAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.EEFGen.util.EEFGenAdapterFactory#createGenEditionContextAdapter()
	 * 
	 */
	public Adapter createGenEditionContextAdapter() {
		return new GenEditionContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.EEFGen.util.EEFGenAdapterFactory#createEEFGenModelReferenceAdapter()
	 * 
	 */
	public Adapter createEEFGenModelReferenceAdapter() {
		return new EEFGenModelReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.EEFGen.util.EEFGenAdapterFactory#createEEFGenModelAdapter()
	 * 
	 */
	public Adapter createEEFGenModelAdapter() {
		return new EEFGenModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.EEFGen.util.EEFGenAdapterFactory#createGenViewsRepositoryAdapter()
	 * 
	 */
	public Adapter createGenViewsRepositoryAdapter() {
		return new GenViewsRepositoryPropertiesEditionProvider();
	}

}
