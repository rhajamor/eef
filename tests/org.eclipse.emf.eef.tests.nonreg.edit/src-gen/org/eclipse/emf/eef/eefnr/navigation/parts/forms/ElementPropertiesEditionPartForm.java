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
package org.eclipse.emf.eef.eefnr.navigation.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.navigation.parts.ElementPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NamedElementPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.providers.NavigationMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
public class ElementPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, ElementPropertiesEditionPart {

	protected Button isVisible;
	private NamedElementPropertiesEditionPart namedElementPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public ElementPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence elementStep = new CompositionSequence();
		elementStep
			.addStep(NavigationViewsRepository.Element.Properties.class)
			.addStep(NavigationViewsRepository.Element.Properties.isVisible);
		
		elementStep.addStep(NavigationViewsRepository.Element.namedElementView);
		
		composer = new PartComposer(elementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NavigationViewsRepository.Element.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.Element.Properties.isVisible) {
					return createIsVisibleCheckbox(widgetFactory, parent);
				}
				if (key == NavigationViewsRepository.Element.namedElementView) {
					return createNamedElement(widgetFactory, parent);
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
		propertiesSection.setText(NavigationMessages.ElementPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIsVisibleCheckbox(FormToolkit widgetFactory, Composite parent) {
		isVisible = widgetFactory.createButton(parent, NavigationMessages.ElementPropertiesEditionPart_IsVisibleLabel, SWT.CHECK);
		isVisible.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(ElementPropertiesEditionPartForm.this, NavigationViewsRepository.Element.Properties.isVisible, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(isVisible.getSelection())));
			}

		});
		GridData isVisibleData = new GridData(GridData.FILL_HORIZONTAL);
		isVisibleData.horizontalSpan = 2;
		isVisible.setLayoutData(isVisibleData);
		EditingUtils.setID(isVisible, NavigationViewsRepository.Element.Properties.isVisible);
		EditingUtils.setEEFtype(isVisible, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(NavigationViewsRepository.Element.Properties.isVisible, NavigationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createNamedElement(FormToolkit widgetFactory, Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(NavigationViewsRepository.class);
		namedElementPropertiesEditionPart = (NamedElementPropertiesEditionPart)provider.getPropertiesEditingPart(NavigationViewsRepository.NamedElement.class, NavigationViewsRepository.FORM_KIND, propertiesEditingComponent);
		((FormPropertiesEditingPart)namedElementPropertiesEditionPart).createControls(widgetFactory, container);
		return container;
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
	 * @see org.eclipse.emf.eef.navigation.parts.ElementPropertiesEditionPart#getIsVisible()
	 * 
	 */
	public Boolean getIsVisible() {
		return Boolean.valueOf(isVisible.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.ElementPropertiesEditionPart#setIsVisible(Boolean newValue)
	 * 
	 */
	public void setIsVisible(Boolean newValue) {
		if (newValue != null) {
			isVisible.setSelection(newValue.booleanValue());
		} else {
			isVisible.setSelection(false);
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.ElementPropertiesEditionPart#getNamedElementReferencedView()
	 * 
	 */
		public PropertiesEditingPart getNamedElementReferencedView() {
			return (PropertiesEditingPart) namedElementPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.ElementPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return namedElementPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.navigation.parts.ElementPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		namedElementPropertiesEditionPart.setName(newValue);
	}





	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NavigationMessages.Element_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
