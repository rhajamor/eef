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
import org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.imageviewer.EEFImageViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
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
public class ImageViewerSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ImageViewerSamplePropertiesEditionPart {

	protected EEFImageViewer imageviewerRequiredProperty;
	protected EEFImageViewer imageviewerOptionalProperty;



	/**
	 * For {@link ISection} use only.
	 */
	public ImageViewerSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ImageViewerSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence imageViewerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = imageViewerSampleStep.addStep(EefnrViewsRepository.ImageViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty);
		
		
		composer = new PartComposer(imageViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.ImageViewerSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty) {
					return createImageviewerRequiredPropertyImageViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty) {
					return createImageviewerOptionalPropertyImageViewer(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.ImageViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * 
	 */
	protected Composite createImageviewerRequiredPropertyImageViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty, EefnrMessages.ImageViewerSamplePropertiesEditionPart_ImageviewerRequiredPropertyLabel);
		imageviewerRequiredProperty = new EEFImageViewer(parent, SWT.BORDER);
		GridData imageviewerRequiredPropertyData = new GridData();
		// Start of user code for imageviewerRequiredProperty layout data customization
				imageviewerRequiredPropertyData.widthHint = 200;
				imageviewerRequiredPropertyData.heightHint = 200;
				imageviewerRequiredPropertyData.horizontalAlignment = SWT.CENTER;
				imageviewerRequiredPropertyData.verticalAlignment = SWT.CENTER;
		
		// End of user code
		imageviewerRequiredProperty.setLayoutData(imageviewerRequiredPropertyData);
		imageviewerRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImageViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getImageviewerRequiredProperty()));
			}
		});
		imageviewerRequiredProperty.setID(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createImageviewerOptionalPropertyImageViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty, EefnrMessages.ImageViewerSamplePropertiesEditionPart_ImageviewerOptionalPropertyLabel);
		imageviewerOptionalProperty = new EEFImageViewer(parent, SWT.BORDER);
		GridData imageviewerOptionalPropertyData = new GridData();
		// Start of user code for imageviewerOptionalProperty layout data customization
				imageviewerOptionalPropertyData.widthHint = 200;
				imageviewerOptionalPropertyData.heightHint = 200;
				imageviewerOptionalPropertyData.horizontalAlignment = SWT.CENTER;
				imageviewerOptionalPropertyData.verticalAlignment = SWT.CENTER;
		
		// End of user code
		imageviewerOptionalProperty.setLayoutData(imageviewerOptionalPropertyData);
		imageviewerOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImageViewerSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getImageviewerOptionalProperty()));
			}
		});
		imageviewerOptionalProperty.setID(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.ImageViewerSample.Properties.imageviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#getImageviewerRequiredProperty()
	 * 
	 */
	public String getImageviewerRequiredProperty() {
		ISelection selection = imageviewerRequiredProperty.getSelection();
		if (selection instanceof StructuredSelection && ((StructuredSelection)selection).getFirstElement() instanceof String) {
			return (String)((StructuredSelection)selection).getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#initImageviewerRequiredProperty(String key, String newValue)
	 */
	public void initImageviewerRequiredProperty(String key, String newValue) {
		if (newValue != null) {
			imageviewerRequiredProperty.initViewer(key, newValue);
		} else {
			imageviewerRequiredProperty.initViewer(key, ""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#setImageviewerRequiredProperty(String newValue)
	 * 
	 */
	public void setImageviewerRequiredProperty(String newValue) {
		if (newValue != null) {
			imageviewerRequiredProperty.setSelection(new StructuredSelection(newValue));
		} else {
			imageviewerRequiredProperty.setSelection(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#getImageviewerOptionalProperty()
	 * 
	 */
	public String getImageviewerOptionalProperty() {
		ISelection selection = imageviewerOptionalProperty.getSelection();
		if (selection instanceof StructuredSelection && ((StructuredSelection)selection).getFirstElement() instanceof String) {
			return (String)((StructuredSelection)selection).getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#initImageviewerOptionalProperty(String key, String newValue)
	 */
	public void initImageviewerOptionalProperty(String key, String newValue) {
		if (newValue != null) {
			imageviewerOptionalProperty.initViewer(key, newValue);
		} else {
			imageviewerOptionalProperty.initViewer(key, ""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ImageViewerSamplePropertiesEditionPart#setImageviewerOptionalProperty(String newValue)
	 * 
	 */
	public void setImageviewerOptionalProperty(String newValue) {
		if (newValue != null) {
			imageviewerOptionalProperty.setSelection(new StructuredSelection(newValue));
		} else {
			imageviewerOptionalProperty.setSelection(new StructuredSelection("")); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.ImageViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
