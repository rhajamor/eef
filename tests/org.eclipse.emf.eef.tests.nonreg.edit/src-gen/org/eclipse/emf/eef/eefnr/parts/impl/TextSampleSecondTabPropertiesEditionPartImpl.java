/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
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
		CompositionSequence textSampleSecondTabStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textSampleSecondTabStep.addStep(EefnrViewsRepository.TextSampleSecondTab.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab);
		
		
		composer = new PartComposer(textSampleSecondTabStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TextSampleSecondTab.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab) {
					return createTextRequiredPropertyInSecondTabText(parent);
				}
				if (key == EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab) {
					return createTextOptionalPropertyInSecondTabText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.TextSampleSecondTabPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createTextRequiredPropertyInSecondTabText(Composite parent) {
		createDescription(parent, EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab, EefnrMessages.TextSampleSecondTabPropertiesEditionPart_TextRequiredPropertyInSecondTabLabel);
		textRequiredPropertyInSecondTab = SWTUtils.createScrollableText(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInSecondTab.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInSecondTab.getText()));
				}
			}

		});
		EditingUtils.setID(textRequiredPropertyInSecondTab, EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab);
		EditingUtils.setEEFtype(textRequiredPropertyInSecondTab, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleSecondTab.Properties.textRequiredPropertyInSecondTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextOptionalPropertyInSecondTabText(Composite parent) {
		createDescription(parent, EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab, EefnrMessages.TextSampleSecondTabPropertiesEditionPart_TextOptionalPropertyInSecondTabLabel);
		textOptionalPropertyInSecondTab = SWTUtils.createScrollableText(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInSecondTab.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleSecondTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInSecondTab.getText()));
				}
			}

		});
		EditingUtils.setID(textOptionalPropertyInSecondTab, EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab);
		EditingUtils.setEEFtype(textOptionalPropertyInSecondTab, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleSecondTab.Properties.textOptionalPropertyInSecondTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
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
