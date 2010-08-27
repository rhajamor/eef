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
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSampleSecondTabPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextSampleSecondTabPropertiesEditionPart {

	protected Text textRequiredPropertyInSecondTab;
	protected Text textOptionalPropertyInSecondTab;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextSampleSecondTabPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EefnrMessages.TextSampleSecondTabPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createTextRequiredPropertyInSecondTabText(propertiesGroup);
		createTextOptionalPropertyInSecondTabText(propertiesGroup);
	}

	
	protected void createTextRequiredPropertyInSecondTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleSecondTabPropertiesEditionPart_TextRequiredPropertyInSecondTabLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TextSampleSecondTab.textRequiredPropertyInSecondTab, EefnrViewsRepository.SWT_KIND));
		textRequiredPropertyInSecondTab = new Text(parent, SWT.BORDER);
		GridData textRequiredPropertyInSecondTabData = new GridData(GridData.FILL_HORIZONTAL);
		textRequiredPropertyInSecondTab.setLayoutData(textRequiredPropertyInSecondTabData);
		textRequiredPropertyInSecondTab.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.textRequiredPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInSecondTab.getText()));
			}

		});
		textRequiredPropertyInSecondTab.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.textRequiredPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInSecondTab.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleSecondTab.textRequiredPropertyInSecondTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextOptionalPropertyInSecondTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleSecondTabPropertiesEditionPart_TextOptionalPropertyInSecondTabLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TextSampleSecondTab.textOptionalPropertyInSecondTab, EefnrViewsRepository.SWT_KIND));
		textOptionalPropertyInSecondTab = new Text(parent, SWT.BORDER);
		GridData textOptionalPropertyInSecondTabData = new GridData(GridData.FILL_HORIZONTAL);
		textOptionalPropertyInSecondTab.setLayoutData(textOptionalPropertyInSecondTabData);
		textOptionalPropertyInSecondTab.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.textOptionalPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInSecondTab.getText()));
			}

		});
		textOptionalPropertyInSecondTab.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.textOptionalPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInSecondTab.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleSecondTab.textOptionalPropertyInSecondTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart#getTextRequiredPropertyInSecondTab()
	 * 
	 */
	public String getTextRequiredPropertyInSecondTab() {
		return textRequiredPropertyInSecondTab.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart#setTextRequiredPropertyInSecondTab(String newValue)
	 * 
	 */
	public void setTextRequiredPropertyInSecondTab(String newValue) {
		if (newValue != null) {
			textRequiredPropertyInSecondTab.setText(newValue);
		} else {
			textRequiredPropertyInSecondTab.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart#getTextOptionalPropertyInSecondTab()
	 * 
	 */
	public String getTextOptionalPropertyInSecondTab() {
		return textOptionalPropertyInSecondTab.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart#setTextOptionalPropertyInSecondTab(String newValue)
	 * 
	 */
	public void setTextOptionalPropertyInSecondTab(String newValue) {
		if (newValue != null) {
			textOptionalPropertyInSecondTab.setText(newValue);
		} else {
			textOptionalPropertyInSecondTab.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TextSampleSecondTab_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
