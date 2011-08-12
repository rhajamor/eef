/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.parts.forms;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
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
public class ElementBindingReferencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ElementBindingReferencePropertiesEditionPart {

	protected EObjectFlatComboViewer binding;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ElementBindingReferencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence elementBindingReferenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		elementBindingReferenceStep
			.addStep(MappingViewsRepository.ElementBindingReference.Reference.class)
			.addStep(MappingViewsRepository.ElementBindingReference.Reference.binding);
		
		
		composer = new PartComposer(elementBindingReferenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.ElementBindingReference.Reference.class) {
					return createReferenceGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.ElementBindingReference.Reference.binding) {
					return createBindingFlatComboViewer(parent, widgetFactory);
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
		referenceSection.setText(MappingMessages.ElementBindingReferencePropertiesEditionPart_ReferenceGroupLabel);
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
	protected Composite createBindingFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.ElementBindingReferencePropertiesEditionPart_BindingLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.FORM_KIND));
		binding = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.FORM_KIND));
		widgetFactory.adapt(binding);
		binding.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData bindingData = new GridData(GridData.FILL_HORIZONTAL);
		binding.setLayoutData(bindingData);
		binding.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementBindingReferencePropertiesEditionPartForm.this, MappingViewsRepository.ElementBindingReference.Reference.binding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBinding()));
			}

		});
		binding.setID(MappingViewsRepository.ElementBindingReference.Reference.binding);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.ElementBindingReference.Reference.binding, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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

// Nothing to do
// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#getBinding()
	 * 
	 */
	public EObject getBinding() {
		if (binding.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) binding.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#initBinding(EObjectFlatComboSettings)
	 */
	public void initBinding(EObjectFlatComboSettings settings) {
		binding.setInput(settings);
		if (current != null) {
			binding.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#setBinding(EObject newValue)
	 * 
	 */
	public void setBinding(EObject newValue) {
		if (newValue != null) {
			binding.setSelection(new StructuredSelection(newValue));
		} else {
			binding.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#setBindingButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBindingButtonMode(ButtonsModeEnum newValue) {
		binding.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#addFilterBinding(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBinding(ViewerFilter filter) {
		binding.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.parts.ElementBindingReferencePropertiesEditionPart#addBusinessFilterBinding(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBinding(ViewerFilter filter) {
		binding.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.ElementBindingReference_Part_Title;
	}

	// Start of user code additional methods
 	
	// End of user code


}
