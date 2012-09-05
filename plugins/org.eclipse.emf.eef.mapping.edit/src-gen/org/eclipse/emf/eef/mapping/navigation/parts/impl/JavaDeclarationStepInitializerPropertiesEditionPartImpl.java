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
package org.eclipse.emf.eef.mapping.navigation.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.mapping.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.navigation.parts.NavigationViewsRepository;

import org.eclipse.emf.eef.mapping.navigation.providers.NavigationMessages;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class JavaDeclarationStepInitializerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, JavaDeclarationStepInitializerPropertiesEditionPart {

	protected Text qualifiedClass;
	protected Text methodFilter;
	protected Button staticMethod;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JavaDeclarationStepInitializerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence javaDeclarationStepInitializerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = javaDeclarationStepInitializerStep.addStep(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.class);
		propertiesStep.addStep(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass);
		propertiesStep.addStep(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter);
		propertiesStep.addStep(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod);
		
		
		composer = new PartComposer(javaDeclarationStepInitializerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass) {
					return createQualifiedClassText(parent);
				}
				if (key == NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter) {
					return createMethodFilterText(parent);
				}
				if (key == NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod) {
					return createStaticMethodCheckbox(parent);
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
		propertiesGroup.setText(NavigationMessages.JavaDeclarationStepInitializerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createQualifiedClassText(Composite parent) {
		createDescription(parent, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass, NavigationMessages.JavaDeclarationStepInitializerPropertiesEditionPart_QualifiedClassLabel);
		qualifiedClass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData qualifiedClassData = new GridData(GridData.FILL_HORIZONTAL);
		qualifiedClass.setLayoutData(qualifiedClassData);
		qualifiedClass.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepInitializerPropertiesEditionPartImpl.this, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedClass.getText()));
			}

		});
		qualifiedClass.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepInitializerPropertiesEditionPartImpl.this, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedClass.getText()));
				}
			}

		});
		EditingUtils.setID(qualifiedClass, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass);
		EditingUtils.setEEFtype(qualifiedClass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.qualifiedClass, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMethodFilterText(Composite parent) {
		createDescription(parent, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter, NavigationMessages.JavaDeclarationStepInitializerPropertiesEditionPart_MethodFilterLabel);
		methodFilter = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData methodFilterData = new GridData(GridData.FILL_HORIZONTAL);
		methodFilter.setLayoutData(methodFilterData);
		methodFilter.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepInitializerPropertiesEditionPartImpl.this, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodFilter.getText()));
			}

		});
		methodFilter.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepInitializerPropertiesEditionPartImpl.this, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodFilter.getText()));
				}
			}

		});
		EditingUtils.setID(methodFilter, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter);
		EditingUtils.setEEFtype(methodFilter, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.methodFilter, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStaticMethodCheckbox(Composite parent) {
		staticMethod = new Button(parent, SWT.CHECK);
		staticMethod.setText(getDescription(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod, NavigationMessages.JavaDeclarationStepInitializerPropertiesEditionPart_StaticMethodLabel));
		staticMethod.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationStepInitializerPropertiesEditionPartImpl.this, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(staticMethod.getSelection())));
			}

		});
		GridData staticMethodData = new GridData(GridData.FILL_HORIZONTAL);
		staticMethodData.horizontalSpan = 2;
		staticMethod.setLayoutData(staticMethodData);
		EditingUtils.setID(staticMethod, NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod);
		EditingUtils.setEEFtype(staticMethod, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.JavaDeclarationStepInitializer.Properties.staticMethod, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#getQualifiedClass()
	 * 
	 */
	public String getQualifiedClass() {
		return qualifiedClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#setQualifiedClass(String newValue)
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
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#getMethodFilter()
	 * 
	 */
	public String getMethodFilter() {
		return methodFilter.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#setMethodFilter(String newValue)
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
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#getStaticMethod()
	 * 
	 */
	public Boolean getStaticMethod() {
		return Boolean.valueOf(staticMethod.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.JavaDeclarationStepInitializerPropertiesEditionPart#setStaticMethod(Boolean newValue)
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
		return NavigationMessages.JavaDeclarationStepInitializer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
