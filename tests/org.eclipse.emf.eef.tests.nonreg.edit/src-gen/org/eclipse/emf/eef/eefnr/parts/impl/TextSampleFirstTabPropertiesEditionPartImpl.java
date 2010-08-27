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
import org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart;
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
public class TextSampleFirstTabPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextSampleFirstTabPropertiesEditionPart {

	protected Text textRequiredPropertyInFirstTab;
	protected Text textOptionalPropertyInFirstTab;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextSampleFirstTabPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EefnrMessages.TextSampleFirstTabPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createTextRequiredPropertyInFirstTabText(propertiesGroup);
		createTextOptionalPropertyInFirstTabText(propertiesGroup);
	}

	
	protected void createTextRequiredPropertyInFirstTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextRequiredPropertyInFirstTabLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TextSampleFirstTab.textRequiredPropertyInFirstTab, EefnrViewsRepository.SWT_KIND));
		textRequiredPropertyInFirstTab = new Text(parent, SWT.BORDER);
		GridData textRequiredPropertyInFirstTabData = new GridData(GridData.FILL_HORIZONTAL);
		textRequiredPropertyInFirstTab.setLayoutData(textRequiredPropertyInFirstTabData);
		textRequiredPropertyInFirstTab.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.textRequiredPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInFirstTab.getText()));
			}

		});
		textRequiredPropertyInFirstTab.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.textRequiredPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInFirstTab.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.textRequiredPropertyInFirstTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextOptionalPropertyInFirstTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextOptionalPropertyInFirstTabLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TextSampleFirstTab.textOptionalPropertyInFirstTab, EefnrViewsRepository.SWT_KIND));
		textOptionalPropertyInFirstTab = new Text(parent, SWT.BORDER);
		GridData textOptionalPropertyInFirstTabData = new GridData(GridData.FILL_HORIZONTAL);
		textOptionalPropertyInFirstTab.setLayoutData(textOptionalPropertyInFirstTabData);
		textOptionalPropertyInFirstTab.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.textOptionalPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInFirstTab.getText()));
			}

		});
		textOptionalPropertyInFirstTab.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.textOptionalPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInFirstTab.getText()));
				}
			}

		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.textOptionalPropertyInFirstTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart#getTextRequiredPropertyInFirstTab()
	 * 
	 */
	public String getTextRequiredPropertyInFirstTab() {
		return textRequiredPropertyInFirstTab.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart#setTextRequiredPropertyInFirstTab(String newValue)
	 * 
	 */
	public void setTextRequiredPropertyInFirstTab(String newValue) {
		if (newValue != null) {
			textRequiredPropertyInFirstTab.setText(newValue);
		} else {
			textRequiredPropertyInFirstTab.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart#getTextOptionalPropertyInFirstTab()
	 * 
	 */
	public String getTextOptionalPropertyInFirstTab() {
		return textOptionalPropertyInFirstTab.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart#setTextOptionalPropertyInFirstTab(String newValue)
	 * 
	 */
	public void setTextOptionalPropertyInFirstTab(String newValue) {
		if (newValue != null) {
			textOptionalPropertyInFirstTab.setText(newValue);
		} else {
			textOptionalPropertyInFirstTab.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TextSampleFirstTab_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
