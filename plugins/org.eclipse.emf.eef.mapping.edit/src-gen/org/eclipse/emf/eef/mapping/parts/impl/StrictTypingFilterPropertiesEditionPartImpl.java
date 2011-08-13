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
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.StrictTypingFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class StrictTypingFilterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StrictTypingFilterPropertiesEditionPart {

	protected EObjectFlatComboViewer restriction;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StrictTypingFilterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence strictTypingFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		strictTypingFilterStep
			.addStep(MappingViewsRepository.StrictTypingFilter.Type.class)
			.addStep(MappingViewsRepository.StrictTypingFilter.Type.restriction);
		
		strictTypingFilterStep.addStep(MappingViewsRepository.StrictTypingFilter.filterProperties);
		
		composer = new PartComposer(strictTypingFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.StrictTypingFilter.Type.class) {
					return createTypeGroup(parent);
				}
				if (key == MappingViewsRepository.StrictTypingFilter.Type.restriction) {
					return createRestrictionFlatComboViewer(parent);
				}
				if (key == MappingViewsRepository.StrictTypingFilter.filterProperties) {
					return createFilterProperties(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createTypeGroup(Composite parent) {
		Group typeGroup = new Group(parent, SWT.NONE);
		typeGroup.setText(MappingMessages.StrictTypingFilterPropertiesEditionPart_TypeGroupLabel);
		GridData typeGroupData = new GridData(GridData.FILL_HORIZONTAL);
		typeGroupData.horizontalSpan = 3;
		typeGroup.setLayoutData(typeGroupData);
		GridLayout typeGroupLayout = new GridLayout();
		typeGroupLayout.numColumns = 3;
		typeGroup.setLayout(typeGroupLayout);
		return typeGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRestrictionFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.StrictTypingFilterPropertiesEditionPart_RestrictionLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.StrictTypingFilter.Type.restriction, MappingViewsRepository.SWT_KIND));
		restriction = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MappingViewsRepository.StrictTypingFilter.Type.restriction, MappingViewsRepository.SWT_KIND));
		restriction.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		restriction.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrictTypingFilterPropertiesEditionPartImpl.this, MappingViewsRepository.StrictTypingFilter.Type.restriction, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRestriction()));
			}

		});
		GridData restrictionData = new GridData(GridData.FILL_HORIZONTAL);
		restriction.setLayoutData(restrictionData);
		restriction.setID(MappingViewsRepository.StrictTypingFilter.Type.restriction);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.StrictTypingFilter.Type.restriction, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)filterPropertiesPropertiesEditionPart).createControls(container);
		return container;
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
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#getRestriction()
	 * 
	 */
	public EObject getRestriction() {
		if (restriction.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) restriction.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#initRestriction(EObjectFlatComboSettings)
	 */
	public void initRestriction(EObjectFlatComboSettings settings) {
		restriction.setInput(settings);
		if (current != null) {
			restriction.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#setRestriction(EObject newValue)
	 * 
	 */
	public void setRestriction(EObject newValue) {
		if (newValue != null) {
			restriction.setSelection(new StructuredSelection(newValue));
		} else {
			restriction.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#setRestrictionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRestrictionButtonMode(ButtonsModeEnum newValue) {
		restriction.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#addFilterRestriction(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRestriction(ViewerFilter filter) {
		restriction.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#addBusinessFilterRestriction(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRestriction(ViewerFilter filter) {
		restriction.addBusinessRuleFilter(filter);
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.StrictTypingFilterPropertiesEditionPart#setMandatory(Boolean newValue)
	 * 
	 */
	public void setMandatory(Boolean newValue) {
		filterPropertiesPropertiesEditionPart.setMandatory(newValue);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.StrictTypingFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
