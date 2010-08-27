/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.RadioViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class RadioSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RadioSamplePropertiesEditionPart {

	protected RadioViewer radioRequiredPropertyRadioViewer;
	protected RadioViewer radioOptionalPropertyRadioViewer;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RadioSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.RadioSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createRadioRequiredPropertyRadioViewer(propertiesGroup);
		createRadioOptionalPropertyRadioViewer(propertiesGroup);
	}

	/**
	 * 
	 */
	protected void createRadioRequiredPropertyRadioViewer(Composite parent) {
		radioRequiredPropertyRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData radioRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		radioRequiredPropertyData.horizontalSpan = 2;
		radioRequiredPropertyRadioViewer.setLayoutData(radioRequiredPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.RadioSample.radioRequiredProperty, EefnrViewsRepository.SWT_KIND), null);
	}

	/**
	 * 
	 */
	protected void createRadioOptionalPropertyRadioViewer(Composite parent) {
		radioOptionalPropertyRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData radioOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		radioOptionalPropertyData.horizontalSpan = 2;
		radioOptionalPropertyRadioViewer.setLayoutData(radioOptionalPropertyData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.RadioSample.radioOptionalProperty, EefnrViewsRepository.SWT_KIND), null);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#getRadioRequiredProperty()
	 * 
	 */
	public Object getRadioRequiredProperty() {
		if (radioRequiredPropertyRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) radioRequiredPropertyRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#initRadioRequiredProperty(EEnum eenum, Enumerator current)
	 */
	public void initRadioRequiredProperty(EEnum eenum, Enumerator current) {
		radioRequiredPropertyRadioViewer.setInput(eenum.getELiterals());
		radioRequiredPropertyRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#setRadioRequiredProperty(Object newValue)
	 * 
	 */
	public void setRadioRequiredProperty(Object newValue) {
		radioRequiredPropertyRadioViewer.setSelection(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#getRadioOptionalProperty()
	 * 
	 */
	public Object getRadioOptionalProperty() {
		if (radioOptionalPropertyRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) radioOptionalPropertyRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#initRadioOptionalProperty(EEnum eenum, Enumerator current)
	 */
	public void initRadioOptionalProperty(EEnum eenum, Enumerator current) {
		radioOptionalPropertyRadioViewer.setInput(eenum.getELiterals());
		radioOptionalPropertyRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RadioSamplePropertiesEditionPart#setRadioOptionalProperty(Object newValue)
	 * 
	 */
	public void setRadioOptionalProperty(Object newValue) {
		radioOptionalPropertyRadioViewer.setSelection(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.RadioSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
