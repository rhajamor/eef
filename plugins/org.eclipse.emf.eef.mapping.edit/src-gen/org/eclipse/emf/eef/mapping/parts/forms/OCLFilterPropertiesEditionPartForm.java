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

import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.OCLFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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
public class OCLFilterPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, OCLFilterPropertiesEditionPart {

	protected Text oCLExpressionBody;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OCLFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence oCLFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		oCLFilterStep
			.addStep(MappingViewsRepository.OCLFilter.FilterExpression.class)
			.addStep(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody);
		
		oCLFilterStep.addStep(MappingViewsRepository.OCLFilter.filterProperties);
		
		composer = new PartComposer(oCLFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.OCLFilter.FilterExpression.class) {
					return createFilterExpressionGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody) {
					return createOCLExpressionBodyTextarea(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.OCLFilter.filterProperties) {
					return createFilterProperties(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createFilterExpressionGroup(FormToolkit widgetFactory, final Composite parent) {
		Section filterExpressionSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		filterExpressionSection.setText(MappingMessages.OCLFilterPropertiesEditionPart_FilterExpressionGroupLabel);
		GridData filterExpressionSectionData = new GridData(GridData.FILL_HORIZONTAL);
		filterExpressionSectionData.horizontalSpan = 3;
		filterExpressionSection.setLayoutData(filterExpressionSectionData);
		Composite filterExpressionGroup = widgetFactory.createComposite(filterExpressionSection);
		GridLayout filterExpressionGroupLayout = new GridLayout();
		filterExpressionGroupLayout.numColumns = 3;
		filterExpressionGroup.setLayout(filterExpressionGroupLayout);
		filterExpressionSection.setClient(filterExpressionGroup);
		return filterExpressionGroup;
	}

	
	protected Composite createOCLExpressionBodyTextarea(FormToolkit widgetFactory, Composite parent) {
		Label oCLExpressionBodyLabel = FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.OCLFilterPropertiesEditionPart_OCLExpressionBodyLabel, propertiesEditionComponent.isRequired(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, MappingViewsRepository.FORM_KIND));
		GridData oCLExpressionBodyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		oCLExpressionBodyLabelData.horizontalSpan = 3;
		oCLExpressionBodyLabel.setLayoutData(oCLExpressionBodyLabelData);
		oCLExpressionBody = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLFilterPropertiesEditionPartForm.this, MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, oCLExpressionBody.getText()));
			}

		});
		EditingUtils.setID(oCLExpressionBody, MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody);
		EditingUtils.setEEFtype(oCLExpressionBody, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MappingViewsRepository.OCLFilter.FilterExpression.oCLExpressionBody, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(FormToolkit widgetFactory, Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.FORM_KIND, propertiesEditionComponent);
		((IFormPropertiesEditionPart)filterPropertiesPropertiesEditionPart).createControls(widgetFactory, container);
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
			oCLExpressionBody.setText(""); //$NON-NLS-1$
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OCLFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.OCLFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
