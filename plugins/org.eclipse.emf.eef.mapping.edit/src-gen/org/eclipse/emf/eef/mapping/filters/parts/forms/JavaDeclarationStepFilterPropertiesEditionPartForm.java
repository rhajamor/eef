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
package org.eclipse.emf.eef.mapping.filters.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.mapping.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart;

import org.eclipse.emf.eef.mapping.filters.providers.FiltersMessages;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class JavaDeclarationStepFilterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, JavaDeclarationStepFilterPropertiesEditionPart {

	protected Text qualifiedClass;
	protected Text methodFilter;
	protected Button staticMethod;



	/**
	 * For {@link ISection} use only.
	 */
	public JavaDeclarationStepFilterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JavaDeclarationStepFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence javaDeclarationStepFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = javaDeclarationStepFilterStep.addStep(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.class);
		propertiesStep.addStep(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass);
		propertiesStep.addStep(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter);
		propertiesStep.addStep(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod);
		
		
		composer = new PartComposer(javaDeclarationStepFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass) {
					return createQualifiedClassText(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter) {
					return createMethodFilterText(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod) {
					return createStaticMethodCheckbox(widgetFactory, parent);
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
		propertiesSection.setText(FiltersMessages.JavaDeclarationStepFilterPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createQualifiedClassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass, FiltersMessages.JavaDeclarationStepFilterPropertiesEditionPart_QualifiedClassLabel);
		qualifiedClass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		qualifiedClass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData qualifiedClassData = new GridData(GridData.FILL_HORIZONTAL);
		qualifiedClass.setLayoutData(qualifiedClassData);
		qualifiedClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							JavaDeclarationStepFilterPropertiesEditionPartForm.this,
							FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedClass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									JavaDeclarationStepFilterPropertiesEditionPartForm.this,
									FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, qualifiedClass.getText()));
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
									JavaDeclarationStepFilterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		qualifiedClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepFilterPropertiesEditionPartForm.this, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedClass.getText()));
				}
			}
		});
		EditingUtils.setID(qualifiedClass, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass);
		EditingUtils.setEEFtype(qualifiedClass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.qualifiedClass, FiltersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMethodFilterText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter, FiltersMessages.JavaDeclarationStepFilterPropertiesEditionPart_MethodFilterLabel);
		methodFilter = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		methodFilter.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData methodFilterData = new GridData(GridData.FILL_HORIZONTAL);
		methodFilter.setLayoutData(methodFilterData);
		methodFilter.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							JavaDeclarationStepFilterPropertiesEditionPartForm.this,
							FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodFilter.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									JavaDeclarationStepFilterPropertiesEditionPartForm.this,
									FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, methodFilter.getText()));
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
									JavaDeclarationStepFilterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		methodFilter.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepFilterPropertiesEditionPartForm.this, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodFilter.getText()));
				}
			}
		});
		EditingUtils.setID(methodFilter, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter);
		EditingUtils.setEEFtype(methodFilter, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.methodFilter, FiltersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStaticMethodCheckbox(FormToolkit widgetFactory, Composite parent) {
		staticMethod = widgetFactory.createButton(parent, getDescription(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod, FiltersMessages.JavaDeclarationStepFilterPropertiesEditionPart_StaticMethodLabel), SWT.CHECK);
		staticMethod.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepFilterPropertiesEditionPartForm.this, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(staticMethod.getSelection())));
			}

		});
		GridData staticMethodData = new GridData(GridData.FILL_HORIZONTAL);
		staticMethodData.horizontalSpan = 2;
		staticMethod.setLayoutData(staticMethodData);
		EditingUtils.setID(staticMethod, FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod);
		EditingUtils.setEEFtype(staticMethod, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.JavaDeclarationStepFilter.Properties.staticMethod, FiltersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#getQualifiedClass()
	 * 
	 */
	public String getQualifiedClass() {
		return qualifiedClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#setQualifiedClass(String newValue)
	 * 
	 */
	public void setQualifiedClass(String newValue) {
		if (newValue != null) {
			qualifiedClass.setText(newValue);
		} else {
			qualifiedClass.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#getMethodFilter()
	 * 
	 */
	public String getMethodFilter() {
		return methodFilter.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#setMethodFilter(String newValue)
	 * 
	 */
	public void setMethodFilter(String newValue) {
		if (newValue != null) {
			methodFilter.setText(newValue);
		} else {
			methodFilter.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#getStaticMethod()
	 * 
	 */
	public Boolean getStaticMethod() {
		return Boolean.valueOf(staticMethod.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationStepFilterPropertiesEditionPart#setStaticMethod(Boolean newValue)
	 * 
	 */
	public void setStaticMethod(Boolean newValue) {
		if (newValue != null) {
			staticMethod.setSelection(newValue.booleanValue());
		} else {
			staticMethod.setSelection(false);
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FiltersMessages.JavaDeclarationStepFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
