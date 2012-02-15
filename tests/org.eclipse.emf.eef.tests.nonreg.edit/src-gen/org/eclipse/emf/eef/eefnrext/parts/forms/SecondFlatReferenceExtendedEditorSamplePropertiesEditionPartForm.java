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
package org.eclipse.emf.eef.eefnrext.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnrext.parts.EefnrextViewsRepository;
import org.eclipse.emf.eef.eefnrext.parts.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnrext.providers.EefnrextMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
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


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart {

	protected Text demo;
	protected Text size;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence secondFlatReferenceExtendedEditorSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep extendedStep = secondFlatReferenceExtendedEditorSampleStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.class);
		extendedStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo);
		extendedStep.addStep(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size);
		
		
		composer = new PartComposer(secondFlatReferenceExtendedEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.class) {
					return createExtendedGroup(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo) {
					return 		createDemoText(widgetFactory, parent);
				}
				if (key == EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size) {
					return 		createSizeText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createExtendedGroup(FormToolkit widgetFactory, final Composite parent) {
		Section extendedSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		extendedSection.setText(EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_ExtendedGroupLabel);
		GridData extendedSectionData = new GridData(GridData.FILL_HORIZONTAL);
		extendedSectionData.horizontalSpan = 3;
		extendedSection.setLayoutData(extendedSectionData);
		Composite extendedGroup = widgetFactory.createComposite(extendedSection);
		GridLayout extendedGroupLayout = new GridLayout();
		extendedGroupLayout.numColumns = 3;
		extendedGroup.setLayout(extendedGroupLayout);
		extendedSection.setClient(extendedGroup);
		return extendedGroup;
	}

	
	protected Composite createDemoText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_DemoLabel, propertiesEditionComponent.isRequired(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, EefnrextViewsRepository.FORM_KIND));
		demo = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		demo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData demoData = new GridData(GridData.FILL_HORIZONTAL);
		demo.setLayoutData(demoData);
		demo.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, demo.getText()));
			}
		});
		demo.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, demo.getText()));
				}
			}
		});
		EditingUtils.setID(demo, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo);
		EditingUtils.setEEFtype(demo, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.demo, EefnrextViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSizeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrextMessages.SecondFlatReferenceExtendedEditorSamplePropertiesEditionPart_SizeLabel, propertiesEditionComponent.isRequired(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, EefnrextViewsRepository.FORM_KIND));
		size = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		size.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sizeData = new GridData(GridData.FILL_HORIZONTAL);
		size.setLayoutData(sizeData);
		size.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, size.getText()));
			}
		});
		size.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SecondFlatReferenceExtendedEditorSamplePropertiesEditionPartForm.this, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, size.getText()));
				}
			}
		});
		EditingUtils.setID(size, EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size);
		EditingUtils.setEEFtype(size, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrextViewsRepository.SecondFlatReferenceExtendedEditorSample.Extended.size, EefnrextViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrextMessages.SecondFlatReferenceExtendedEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
