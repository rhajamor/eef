/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.OCLFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class OCLFilterPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, OCLFilterPropertiesEditionPart {

	protected Text oCLExpressionBody;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public OCLFilterPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence oCLFilterStep = new CompositionSequence();
		oCLFilterStep
			.addStep(MappingViewsRepository.OCLFilter.FilterExpression.class)
			.addStep(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody);
		
		oCLFilterStep.addStep(MappingViewsRepository.OCLFilter.filterProperties);
		
		composer = new PartComposer(oCLFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.OCLFilter.FilterExpression.class) {
					return createFilterExpressionGroup(parent);
				}
				if (key == MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody) {
					return createOCLExpressionBodyTextarea(parent);
				}
				if (key == MappingViewsRepository.OCLFilter.filterProperties) {
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
	protected Composite createFilterExpressionGroup(Composite parent) {
		Group filterExpressionGroup = new Group(parent, SWT.NONE);
		filterExpressionGroup.setText(MappingMessages.OCLFilterPropertiesEditionPart_FilterExpressionGroupLabel);
		GridData filterExpressionGroupData = new GridData(GridData.FILL_HORIZONTAL);
		filterExpressionGroupData.horizontalSpan = 3;
		filterExpressionGroup.setLayoutData(filterExpressionGroupData);
		GridLayout filterExpressionGroupLayout = new GridLayout();
		filterExpressionGroupLayout.numColumns = 3;
		filterExpressionGroup.setLayout(filterExpressionGroupLayout);
		return filterExpressionGroup;
	}

	
	protected Composite createOCLExpressionBodyTextarea(Composite parent) {
		Label oCLExpressionBodyLabel = SWTUtils.createPartLabel(parent, MappingMessages.OCLFilterPropertiesEditionPart_OCLExpressionBodyLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, MappingViewsRepository.SWT_KIND));
		GridData oCLExpressionBodyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		oCLExpressionBodyLabelData.horizontalSpan = 3;
		oCLExpressionBodyLabel.setLayoutData(oCLExpressionBodyLabelData);
		oCLExpressionBody = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData oCLExpressionBodyData = new GridData(GridData.FILL_HORIZONTAL);
		oCLExpressionBodyData.horizontalSpan = 2;
		oCLExpressionBodyData.heightHint = 80;
		oCLExpressionBodyData.widthHint = 200;
		oCLExpressionBody.setLayoutData(oCLExpressionBodyData);
		oCLExpressionBody.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(OCLFilterPropertiesEditionPartImpl.this, MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, oCLExpressionBody.getText()));
			}

		});
		EditingUtils.setID(oCLExpressionBody, MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody);
		EditingUtils.setEEFtype(oCLExpressionBody, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditingPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.SWT_KIND, propertiesEditingComponent);
		((SWTPropertiesEditingPart)filterPropertiesPropertiesEditionPart).createControls(container);
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
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#getOCLExpressionBody()
	 * 
	 */
	public String getOCLExpressionBody() {
		return oCLExpressionBody.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#setOCLExpressionBody(String newValue)
	 * 
	 */
	public void setOCLExpressionBody(String newValue) {
		if (newValue != null) {
			oCLExpressionBody.setText(newValue);
		} else {
			oCLExpressionBody.setText("");  //$NON-NLS-1$
		}
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public PropertiesEditingPart getFilterPropertiesReferencedView() {
			return (PropertiesEditingPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#setMandatory(Boolean newValue)
	 * 
	 */
	public void setMandatory(Boolean newValue) {
		filterPropertiesPropertiesEditionPart.setMandatory(newValue);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.OCLFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
