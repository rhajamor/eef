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
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
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
public class TextSampleFirstTabPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, TextSampleFirstTabPropertiesEditionPart {

	protected Text textRequiredPropertyInFirstTab;
	protected Text textOptionalPropertyInFirstTab;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public TextSampleFirstTabPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence textSampleFirstTabStep = new CompositionSequence();
		CompositionStep propertiesStep = textSampleFirstTabStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab);
		
		
		composer = new PartComposer(textSampleFirstTabStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab) {
					return createTextRequiredPropertyInFirstTabText(parent);
				}
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab) {
					return createTextOptionalPropertyInFirstTabText(parent);
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
		propertiesGroup.setText(EefnrMessages.TextSampleFirstTabPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createTextRequiredPropertyInFirstTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextRequiredPropertyInFirstTabLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, EefnrViewsRepository.SWT_KIND));
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textRequiredPropertyInFirstTab.getText()));
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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textRequiredPropertyInFirstTab.getText()));
				}
			}

		});
		EditingUtils.setID(textRequiredPropertyInFirstTab, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab);
		EditingUtils.setEEFtype(textRequiredPropertyInFirstTab, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextOptionalPropertyInFirstTabText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextOptionalPropertyInFirstTabLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, EefnrViewsRepository.SWT_KIND));
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textOptionalPropertyInFirstTab.getText()));
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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TextSampleFirstTabPropertiesEditionPartImpl.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, textOptionalPropertyInFirstTab.getText()));
				}
			}

		});
		EditingUtils.setID(textOptionalPropertyInFirstTab, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab);
		EditingUtils.setEEFtype(textOptionalPropertyInFirstTab, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
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
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TextSampleFirstTab_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
