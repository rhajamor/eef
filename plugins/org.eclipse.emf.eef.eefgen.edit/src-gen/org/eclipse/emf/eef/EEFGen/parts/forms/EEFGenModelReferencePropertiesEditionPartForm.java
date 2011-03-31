/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.EEFGen.parts.forms;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.providers.EEFGenMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EEFGenModelReferencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EEFGenModelReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer referencedEEFGenModel;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EEFGenModelReferencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eEFGenModelReferenceStep = new CompositionSequence();
		eEFGenModelReferenceStep
			.addStep(EEFGenViewsRepository.EEFGenModelReference.Reference.class)
			.addStep(EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel);
		
		
		composer = new PartComposer(eEFGenModelReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EEFGenViewsRepository.EEFGenModelReference.Reference.class) {
					return createReferenceGroup(widgetFactory, parent);
				}
				if (key == EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel) {
					return createReferencedEEFGenModelFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createReferenceGroup(FormToolkit widgetFactory, final Composite parent) {
		Section referenceSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		referenceSection.setText(EEFGenMessages.EEFGenModelReferencePropertiesEditionPart_ReferenceGroupLabel);
		GridData referenceSectionData = new GridData(GridData.FILL_HORIZONTAL);
		referenceSectionData.horizontalSpan = 3;
		referenceSection.setLayoutData(referenceSectionData);
		Composite referenceGroup = widgetFactory.createComposite(referenceSection);
		GridLayout referenceGroupLayout = new GridLayout();
		referenceGroupLayout.numColumns = 3;
		referenceGroup.setLayout(referenceGroupLayout);
		referenceSection.setClient(referenceGroup);
		return referenceGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferencedEEFGenModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EEFGenMessages.EEFGenModelReferencePropertiesEditionPart_ReferencedEEFGenModelLabel, propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel, EEFGenViewsRepository.FORM_KIND));
		referencedEEFGenModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel, EEFGenViewsRepository.FORM_KIND));
		referencedEEFGenModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedEEFGenModelData = new GridData(GridData.FILL_HORIZONTAL);
		referencedEEFGenModel.setLayoutData(referencedEEFGenModelData);
		referencedEEFGenModel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EEFGenModelReferencePropertiesEditionPartForm.this, EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedEEFGenModel()));
			}

		});
		referencedEEFGenModel.setID(EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EEFGenViewsRepository.EEFGenModelReference.Reference.referencedEEFGenModel, EEFGenViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#getReferencedEEFGenModel()
	 * 
	 */
	public EObject getReferencedEEFGenModel() {
		if (referencedEEFGenModel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedEEFGenModel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#initReferencedEEFGenModel(EObjectFlatComboSettings)
	 */
	public void initReferencedEEFGenModel(EObjectFlatComboSettings settings) {
		referencedEEFGenModel.setInput(settings);
		if (current != null) {
			referencedEEFGenModel.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#setReferencedEEFGenModel(EObject newValue)
	 * 
	 */
	public void setReferencedEEFGenModel(EObject newValue) {
		if (newValue != null) {
			referencedEEFGenModel.setSelection(new StructuredSelection(newValue));
		} else {
			referencedEEFGenModel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#setReferencedEEFGenModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedEEFGenModelButtonMode(ButtonsModeEnum newValue) {
		referencedEEFGenModel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#addFilterReferencedEEFGenModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedEEFGenModel(ViewerFilter filter) {
		referencedEEFGenModel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.EEFGen.parts.EEFGenModelReferencePropertiesEditionPart#addBusinessFilterReferencedEEFGenModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedEEFGenModel(ViewerFilter filter) {
		referencedEEFGenModel.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EEFGenMessages.EEFGenModelReference_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
