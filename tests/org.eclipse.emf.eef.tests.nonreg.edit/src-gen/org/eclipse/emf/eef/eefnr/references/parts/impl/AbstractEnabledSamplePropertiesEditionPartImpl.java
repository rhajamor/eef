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
package org.eclipse.emf.eef.eefnr.references.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.references.parts.AbstractEnabledSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.AbstractSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnr.references.providers.ReferencesMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AbstractEnabledSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AbstractEnabledSamplePropertiesEditionPart {

	protected Button enabled;
	private AbstractSamplePropertiesEditionPart abstractSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AbstractEnabledSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		createEnabledPropertiesGroup(view);

		createAbstractSample(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createEnabledPropertiesGroup(Composite parent) {
		Group enabledPropertiesGroup = new Group(parent, SWT.NONE);
		enabledPropertiesGroup.setText(ReferencesMessages.AbstractEnabledSamplePropertiesEditionPart_EnabledPropertiesGroupLabel);
		GridData enabledPropertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		enabledPropertiesGroupData.horizontalSpan = 3;
		enabledPropertiesGroup.setLayoutData(enabledPropertiesGroupData);
		GridLayout enabledPropertiesGroupLayout = new GridLayout();
		enabledPropertiesGroupLayout.numColumns = 3;
		enabledPropertiesGroup.setLayout(enabledPropertiesGroupLayout);
		createEnabledCheckbox(enabledPropertiesGroup);
	}

	
	protected void createEnabledCheckbox(Composite parent) {
		enabled = new Button(parent, SWT.CHECK);
		enabled.setText(ReferencesMessages.AbstractEnabledSamplePropertiesEditionPart_EnabledLabel);
		GridData enabledData = new GridData(GridData.FILL_HORIZONTAL);
		enabledData.horizontalSpan = 2;
		enabled.setLayoutData(enabledData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ReferencesViewsRepository.AbstractEnabledSample.enabled, ReferencesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	protected void createAbstractSample(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ReferencesViewsRepository.class);
		abstractSamplePropertiesEditionPart = (AbstractSamplePropertiesEditionPart)provider.getPropertiesEditionPart(ReferencesViewsRepository.AbstractSample.class, ReferencesViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)abstractSamplePropertiesEditionPart).createControls(container);
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
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getEnabled()
	 * 
	 */
	public Boolean getEnabled() {
		return Boolean.valueOf(enabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#setEnabled(Boolean newValue)
	 * 
	 */
	public void setEnabled(Boolean newValue) {
		if (newValue != null) {
			enabled.setSelection(newValue.booleanValue());
		} else {
			enabled.setSelection(false);
		}
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getAbstractSampleReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getAbstractSampleReferencedView() {
			return (IPropertiesEditionPart) abstractSamplePropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return abstractSamplePropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		abstractSamplePropertiesEditionPart.setName(newValue);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReferencesMessages.AbstractEnabledSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
