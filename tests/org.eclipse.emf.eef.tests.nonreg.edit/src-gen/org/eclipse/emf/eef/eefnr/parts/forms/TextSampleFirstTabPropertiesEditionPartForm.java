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
package org.eclipse.emf.eef.eefnr.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSampleFirstTabPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TextSampleFirstTabPropertiesEditionPart {

	protected Text textRequiredPropertyInFirstTab;
	protected Text textOptionalPropertyInFirstTab;



	/**
	 * For {@link ISection} use only.
	 */
	public TextSampleFirstTabPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextSampleFirstTabPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence textSampleFirstTabStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textSampleFirstTabStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab);
		propertiesStep.addStep(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab);
		
		
		composer = new PartComposer(textSampleFirstTabStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab) {
					return createTextRequiredPropertyInFirstTabText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab) {
					return createTextOptionalPropertyInFirstTabText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefnrMessages.TextSampleFirstTabPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createTextRequiredPropertyInFirstTabText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextRequiredPropertyInFirstTabLabel);
		textRequiredPropertyInFirstTab = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textRequiredPropertyInFirstTab.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textRequiredPropertyInFirstTabData = new GridData(GridData.FILL_HORIZONTAL);
		textRequiredPropertyInFirstTab.setLayoutData(textRequiredPropertyInFirstTabData);
		textRequiredPropertyInFirstTab.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TextSampleFirstTabPropertiesEditionPartForm.this,
							EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInFirstTab.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TextSampleFirstTabPropertiesEditionPartForm.this,
									EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, textRequiredPropertyInFirstTab.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TextSampleFirstTabPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		textRequiredPropertyInFirstTab.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartForm.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredPropertyInFirstTab.getText()));
				}
			}
		});
		EditingUtils.setID(textRequiredPropertyInFirstTab, EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab);
		EditingUtils.setEEFtype(textRequiredPropertyInFirstTab, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.Properties.textRequiredPropertyInFirstTab, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextOptionalPropertyInFirstTabText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, EefnrMessages.TextSampleFirstTabPropertiesEditionPart_TextOptionalPropertyInFirstTabLabel);
		textOptionalPropertyInFirstTab = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textOptionalPropertyInFirstTab.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textOptionalPropertyInFirstTabData = new GridData(GridData.FILL_HORIZONTAL);
		textOptionalPropertyInFirstTab.setLayoutData(textOptionalPropertyInFirstTabData);
		textOptionalPropertyInFirstTab.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TextSampleFirstTabPropertiesEditionPartForm.this,
							EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInFirstTab.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TextSampleFirstTabPropertiesEditionPartForm.this,
									EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, textOptionalPropertyInFirstTab.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TextSampleFirstTabPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		textOptionalPropertyInFirstTab.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextSampleFirstTabPropertiesEditionPartForm.this, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalPropertyInFirstTab.getText()));
				}
			}
		});
		EditingUtils.setID(textOptionalPropertyInFirstTab, EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab);
		EditingUtils.setEEFtype(textOptionalPropertyInFirstTab, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TextSampleFirstTab.Properties.textOptionalPropertyInFirstTab, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
