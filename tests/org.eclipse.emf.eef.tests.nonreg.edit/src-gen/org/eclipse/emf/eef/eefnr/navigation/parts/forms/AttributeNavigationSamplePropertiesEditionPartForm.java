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
package org.eclipse.emf.eef.eefnr.navigation.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.navigation.parts.AttributeNavigationSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
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
public class AttributeNavigationSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, AttributeNavigationSamplePropertiesEditionPart {

	protected Text name;
	protected Text delegate1ForSingleValued;
	protected Text delegate2ForSingleValued;
	protected Text delegate1ForMultiValued;
	protected Text delegate2ForMultiValued;



	/**
	 * For {@link ISection} use only.
	 */
	public AttributeNavigationSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeNavigationSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeNavigationSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeNavigationSampleStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.class);
		propertiesStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.name);
		propertiesStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued);
		propertiesStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued);
		propertiesStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued);
		propertiesStep.addStep(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued);
		
		
		composer = new PartComposer(attributeNavigationSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued) {
					return createDelegate1ForSingleValuedText(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued) {
					return createDelegate2ForSingleValuedText(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued) {
					return createDelegate1ForMultiValuedText(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued) {
					return createDelegate2ForMultiValuedText(widgetFactory, parent);
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
		propertiesSection.setText(NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NavigationViewsRepository.AttributeNavigationSample.Properties.name, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AttributeNavigationSamplePropertiesEditionPartForm.this,
							NavigationViewsRepository.AttributeNavigationSample.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									NavigationViewsRepository.AttributeNavigationSample.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartForm.this, NavigationViewsRepository.AttributeNavigationSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, NavigationViewsRepository.AttributeNavigationSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.name, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate1ForSingleValuedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate1ForSingleValuedLabel);
		delegate1ForSingleValued = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delegate1ForSingleValued.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delegate1ForSingleValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate1ForSingleValued.setLayoutData(delegate1ForSingleValuedData);
		delegate1ForSingleValued.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AttributeNavigationSamplePropertiesEditionPartForm.this,
							NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForSingleValued.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delegate1ForSingleValued.getText()));
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
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delegate1ForSingleValued.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartForm.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForSingleValued.getText()));
				}
			}
		});
		EditingUtils.setID(delegate1ForSingleValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued);
		EditingUtils.setEEFtype(delegate1ForSingleValued, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate2ForSingleValuedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate2ForSingleValuedLabel);
		delegate2ForSingleValued = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delegate2ForSingleValued.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delegate2ForSingleValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate2ForSingleValued.setLayoutData(delegate2ForSingleValuedData);
		delegate2ForSingleValued.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AttributeNavigationSamplePropertiesEditionPartForm.this,
							NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForSingleValued.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delegate2ForSingleValued.getText()));
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
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delegate2ForSingleValued.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartForm.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForSingleValued.getText()));
				}
			}
		});
		EditingUtils.setID(delegate2ForSingleValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued);
		EditingUtils.setEEFtype(delegate2ForSingleValued, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate1ForMultiValuedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate1ForMultiValuedLabel);
		delegate1ForMultiValued = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delegate1ForMultiValued.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delegate1ForMultiValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate1ForMultiValued.setLayoutData(delegate1ForMultiValuedData);
		delegate1ForMultiValued.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AttributeNavigationSamplePropertiesEditionPartForm.this,
							NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForMultiValued.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delegate1ForMultiValued.getText()));
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
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delegate1ForMultiValued.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartForm.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForMultiValued.getText()));
				}
			}
		});
		EditingUtils.setID(delegate1ForMultiValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued);
		EditingUtils.setEEFtype(delegate1ForMultiValued, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate2ForMultiValuedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate2ForMultiValuedLabel);
		delegate2ForMultiValued = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delegate2ForMultiValued.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delegate2ForMultiValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate2ForMultiValued.setLayoutData(delegate2ForMultiValuedData);
		delegate2ForMultiValued.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AttributeNavigationSamplePropertiesEditionPartForm.this,
							NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForMultiValued.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delegate2ForMultiValued.getText()));
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
									AttributeNavigationSamplePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delegate2ForMultiValued.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartForm.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForMultiValued.getText()));
				}
			}
		});
		EditingUtils.setID(delegate2ForMultiValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued);
		EditingUtils.setEEFtype(delegate2ForMultiValued, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#getDelegate1ForSingleValued()
	 * 
	 */
	public String getDelegate1ForSingleValued() {
		return delegate1ForSingleValued.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#setDelegate1ForSingleValued(String newValue)
	 * 
	 */
	public void setDelegate1ForSingleValued(String newValue) {
		if (newValue != null) {
			delegate1ForSingleValued.setText(newValue);
		} else {
			delegate1ForSingleValued.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#getDelegate2ForSingleValued()
	 * 
	 */
	public String getDelegate2ForSingleValued() {
		return delegate2ForSingleValued.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#setDelegate2ForSingleValued(String newValue)
	 * 
	 */
	public void setDelegate2ForSingleValued(String newValue) {
		if (newValue != null) {
			delegate2ForSingleValued.setText(newValue);
		} else {
			delegate2ForSingleValued.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#getDelegate1ForMultiValued()
	 * 
	 */
	public String getDelegate1ForMultiValued() {
		return delegate1ForMultiValued.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#setDelegate1ForMultiValued(String newValue)
	 * 
	 */
	public void setDelegate1ForMultiValued(String newValue) {
		if (newValue != null) {
			delegate1ForMultiValued.setText(newValue);
		} else {
			delegate1ForMultiValued.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#getDelegate2ForMultiValued()
	 * 
	 */
	public String getDelegate2ForMultiValued() {
		return delegate2ForMultiValued.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.AttributeNavigationSamplePropertiesEditionPart#setDelegate2ForMultiValued(String newValue)
	 * 
	 */
	public void setDelegate2ForMultiValued(String newValue) {
		if (newValue != null) {
			delegate2ForMultiValued.setText(newValue);
		} else {
			delegate2ForMultiValued.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.AttributeNavigationSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
