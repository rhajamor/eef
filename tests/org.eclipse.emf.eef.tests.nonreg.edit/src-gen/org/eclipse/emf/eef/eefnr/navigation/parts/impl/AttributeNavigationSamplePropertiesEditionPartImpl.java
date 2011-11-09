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
package org.eclipse.emf.eef.eefnr.navigation.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.navigation.parts.AttributeNavigationSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
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
public class AttributeNavigationSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AttributeNavigationSamplePropertiesEditionPart {

	protected Text name;
	protected Text delegate1ForSingleValued;
	protected Text delegate2ForSingleValued;
	protected Text delegate1ForMultiValued;
	protected Text delegate2ForMultiValued;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributeNavigationSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.name) {
					return createNameText(parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued) {
					return createDelegate1ForSingleValuedText(parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued) {
					return createDelegate2ForSingleValuedText(parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued) {
					return createDelegate1ForMultiValuedText(parent);
				}
				if (key == NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued) {
					return createDelegate2ForMultiValuedText(parent);
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
		propertiesGroup.setText(NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.AttributeNavigationSample.Properties.name, NavigationViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, NavigationViewsRepository.AttributeNavigationSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.name, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate1ForSingleValuedText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate1ForSingleValuedLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, NavigationViewsRepository.SWT_KIND));
		delegate1ForSingleValued = new Text(parent, SWT.BORDER);
		GridData delegate1ForSingleValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate1ForSingleValued.setLayoutData(delegate1ForSingleValuedData);
		delegate1ForSingleValued.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForSingleValued.getText()));
			}

		});
		delegate1ForSingleValued.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForSingleValued.getText()));
				}
			}

		});
		EditingUtils.setID(delegate1ForSingleValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued);
		EditingUtils.setEEFtype(delegate1ForSingleValued, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForSingleValued, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate2ForSingleValuedText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate2ForSingleValuedLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, NavigationViewsRepository.SWT_KIND));
		delegate2ForSingleValued = new Text(parent, SWT.BORDER);
		GridData delegate2ForSingleValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate2ForSingleValued.setLayoutData(delegate2ForSingleValuedData);
		delegate2ForSingleValued.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForSingleValued.getText()));
			}

		});
		delegate2ForSingleValued.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForSingleValued.getText()));
				}
			}

		});
		EditingUtils.setID(delegate2ForSingleValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued);
		EditingUtils.setEEFtype(delegate2ForSingleValued, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForSingleValued, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate1ForMultiValuedText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate1ForMultiValuedLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, NavigationViewsRepository.SWT_KIND));
		delegate1ForMultiValued = new Text(parent, SWT.BORDER);
		GridData delegate1ForMultiValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate1ForMultiValued.setLayoutData(delegate1ForMultiValuedData);
		delegate1ForMultiValued.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForMultiValued.getText()));
			}

		});
		delegate1ForMultiValued.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate1ForMultiValued.getText()));
				}
			}

		});
		EditingUtils.setID(delegate1ForMultiValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued);
		EditingUtils.setEEFtype(delegate1ForMultiValued, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate1ForMultiValued, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDelegate2ForMultiValuedText(Composite parent) {
		SWTUtils.createPartLabel(parent, NavigationMessages.AttributeNavigationSamplePropertiesEditionPart_Delegate2ForMultiValuedLabel, propertiesEditionComponent.isRequired(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, NavigationViewsRepository.SWT_KIND));
		delegate2ForMultiValued = new Text(parent, SWT.BORDER);
		GridData delegate2ForMultiValuedData = new GridData(GridData.FILL_HORIZONTAL);
		delegate2ForMultiValued.setLayoutData(delegate2ForMultiValuedData);
		delegate2ForMultiValued.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForMultiValued.getText()));
			}

		});
		delegate2ForMultiValued.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributeNavigationSamplePropertiesEditionPartImpl.this, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delegate2ForMultiValued.getText()));
				}
			}

		});
		EditingUtils.setID(delegate2ForMultiValued, NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued);
		EditingUtils.setEEFtype(delegate2ForMultiValued, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NavigationViewsRepository.AttributeNavigationSample.Properties.delegate2ForMultiValued, NavigationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
