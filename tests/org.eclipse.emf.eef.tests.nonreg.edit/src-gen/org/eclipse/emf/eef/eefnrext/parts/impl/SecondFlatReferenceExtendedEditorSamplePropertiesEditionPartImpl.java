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
package org.eclipse.emf.eef.eefnrext.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.providers.EefnrextMessages;
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
public class SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart {

	protected Text demo;
	protected Text size;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence secondFlatReferenceExtendedEditorSampleStep = new CompositionSequence();
		CompositionStep extendedStep = secondFlatReferenceExtendedEditorSampleStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.class);
		extendedStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo);
		extendedStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size);
		
		
		composer = new PartComposer(secondFlatReferenceExtendedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.class) {
					return createExtendedGroup(parent);
				}
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo) {
					return createDemoText(parent);
				}
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size) {
					return createSizeText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createExtendedGroup(Composite parent) {
		Group extendedGroup = new Group(parent, SWT.NONE);
		extendedGroup.setText(EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_ExtendedGroupLabel);
		GridData extendedGroupData = new GridData(GridData.FILL_HORIZONTAL);
		extendedGroupData.horizontalSpan = 3;
		extendedGroup.setLayoutData(extendedGroupData);
		GridLayout extendedGroupLayout = new GridLayout();
		extendedGroupLayout.numColumns = 3;
		extendedGroup.setLayout(extendedGroupLayout);
		return extendedGroup;
	}

	
	protected Composite createDemoText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_DemoLabel, propertiesEditingComponent.isRequired(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, EefnrextViewsRepository.SWT_KIND));
		demo = new Text(parent, SWT.BORDER);
		GridData demoData = new GridData(GridData.FILL_HORIZONTAL);
		demo.setLayoutData(demoData);
		demo.addFocusListener(new FocusAdapter() {

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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, demo.getText()));
			}

		});
		demo.addKeyListener(new KeyAdapter() {

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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, demo.getText()));
				}
			}

		});
		EditingUtils.setID(demo, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo);
		EditingUtils.setEEFtype(demo, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, EefnrextViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSizeText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_SizeLabel, propertiesEditingComponent.isRequired(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, EefnrextViewsRepository.SWT_KIND));
		size = new Text(parent, SWT.BORDER);
		GridData sizeData = new GridData(GridData.FILL_HORIZONTAL);
		size.setLayoutData(sizeData);
		size.addFocusListener(new FocusAdapter() {

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
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, size.getText()));
			}

		});
		size.addKeyListener(new KeyAdapter() {

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
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartImpl.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, size.getText()));
				}
			}

		});
		EditingUtils.setID(size, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size);
		EditingUtils.setEEFtype(size, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, EefnrextViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart#getDemo()
	 * 
	 */
	public String getDemo() {
		return demo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart#setDemo(String newValue)
	 * 
	 */
	public void setDemo(String newValue) {
		if (newValue != null) {
			demo.setText(newValue);
		} else {
			demo.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart#getSize()
	 * 
	 */
	public String getSize() {
		return size.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart#setSize(String newValue)
	 * 
	 */
	public void setSize(String newValue) {
		if (newValue != null) {
			size.setText(newValue);
		} else {
			size.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrextMessages.SecondFlatReferenceExtendedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
