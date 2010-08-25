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
package org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.tree;

import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock;
import org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterPart;
import org.eclipse.swt.widgets.Composite;
/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFTreeMasterDetailsBlock extends AbstractEEFMasterDetailsBlock {

	private boolean initialMasterPartToolBarVisibility = true;
	
	/**
	 * Default constructor. 
	 * The block is orientable.
	 */
	public EEFTreeMasterDetailsBlock() {
		super();
	}

	/**
	 * Constructor defining if the orientation of the block can be changed.
	 * @param isOrientable the block is orientable or not.
	 * @param showValidationAction defining the visibility of the action.
	 */
	public EEFTreeMasterDetailsBlock(boolean isOrientable, boolean showValidationAction) {
		super(isOrientable, showValidationAction);
	}



	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.masterdetails.AbstractEEFMasterDetailsBlock#createEEFMasterPart(org.eclipse.swt.widgets.Composite)
	 */
	protected AbstractEEFMasterPart createEEFMasterPart(Composite masterContainer) {
		EEFTreeMasterPart masterPart = new EEFTreeMasterPart(toolkit, masterContainer, this);
		masterPart.showToolBar(initialMasterPartToolBarVisibility);
		return masterPart;
	}
	
	/**
	 * set the tool bar visibility
	 * @param value
	 */
	public void setInitialMasterPartToolBarVisibility(boolean value) {
		initialMasterPartToolBarVisibility = value;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isInitialMasterPartToolBarVisibility() {
		return initialMasterPartToolBarVisibility;
	}

}
