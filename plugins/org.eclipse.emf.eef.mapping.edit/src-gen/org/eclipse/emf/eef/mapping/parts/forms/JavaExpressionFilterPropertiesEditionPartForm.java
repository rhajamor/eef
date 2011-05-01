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
package org.eclipse.emf.eef.mapping.parts.forms;

// Start of user code for imports

import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.JavaExpressionFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
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
public class JavaExpressionFilterPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, JavaExpressionFilterPropertiesEditionPart {

	protected Text javaExpressionBody;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public JavaExpressionFilterPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence javaExpressionFilterStep = new CompositionSequence();
		javaExpressionFilterStep
			.addStep(MappingViewsRepository.JavaExpressionFilter.FilterExpression.class)
			.addStep(MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody);
		
		javaExpressionFilterStep.addStep(MappingViewsRepository.JavaExpressionFilter.filterProperties);
		
		composer = new PartComposer(javaExpressionFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.JavaExpressionFilter.FilterExpression.class) {
					return createFilterExpressionGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody) {
					return createJavaExpressionBodyTextarea(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.JavaExpressionFilter.filterProperties) {
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
		filterExpressionSection.setText(MappingMessages.JavaExpressionFilterPropertiesEditionPart_FilterExpressionGroupLabel);
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

	
	protected Composite createJavaExpressionBodyTextarea(FormToolkit widgetFactory, Composite parent) {
		Label javaExpressionBodyLabel = FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.JavaExpressionFilterPropertiesEditionPart_JavaExpressionBodyLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody, MappingViewsRepository.FORM_KIND));
		GridData javaExpressionBodyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		javaExpressionBodyLabelData.horizontalSpan = 3;
		javaExpressionBodyLabel.setLayoutData(javaExpressionBodyLabelData);
		javaExpressionBody = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData javaExpressionBodyData = new GridData(GridData.FILL_HORIZONTAL);
		javaExpressionBodyData.horizontalSpan = 2;
		javaExpressionBodyData.heightHint = 80;
		javaExpressionBodyData.widthHint = 200;
		javaExpressionBody.setLayoutData(javaExpressionBodyData);
		javaExpressionBody.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(JavaExpressionFilterPropertiesEditionPartForm.this, MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, javaExpressionBody.getText()));
			}

		});
		EditingUtils.setID(javaExpressionBody, MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody);
		EditingUtils.setEEFtype(javaExpressionBody, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(FormToolkit widgetFactory, Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditingPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.FORM_KIND, propertiesEditingComponent);
		((FormPropertiesEditingPart)filterPropertiesPropertiesEditionPart).createControls(widgetFactory, container);
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
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getJavaExpressionBody()
	 * 
	 */
	public String getJavaExpressionBody() {
		return javaExpressionBody.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setJavaExpressionBody(String newValue)
	 * 
	 */
	public void setJavaExpressionBody(String newValue) {
		if (newValue != null) {
			javaExpressionBody.setText(newValue);
		} else {
			javaExpressionBody.setText("");  //$NON-NLS-1$
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public PropertiesEditingPart getFilterPropertiesReferencedView() {
			return (PropertiesEditingPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setMandatory(Boolean newValue)
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
		return MappingMessages.JavaExpressionFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
