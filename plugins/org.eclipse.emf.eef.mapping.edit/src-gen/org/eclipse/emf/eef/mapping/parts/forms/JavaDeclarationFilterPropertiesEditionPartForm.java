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
import org.eclipse.emf.eef.mapping.parts.JavaDeclarationFilterPropertiesEditionPart;
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
public class JavaDeclarationFilterPropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, JavaDeclarationFilterPropertiesEditionPart {

	protected Text methodName;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public JavaDeclarationFilterPropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence javaDeclarationFilterStep = new CompositionSequence();
		javaDeclarationFilterStep
			.addStep(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.class)
			.addStep(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		
		javaDeclarationFilterStep.addStep(MappingViewsRepository.JavaDeclarationFilter.filterProperties);
		
		composer = new PartComposer(javaDeclarationFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.JavaDeclarationFilter.FilterExpression.class) {
					return createFilterExpressionGroup(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName) {
					return 		createMethodNameText(widgetFactory, parent);
				}
				if (key == MappingViewsRepository.JavaDeclarationFilter.filterProperties) {
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
		filterExpressionSection.setText(MappingMessages.JavaDeclarationFilterPropertiesEditionPart_FilterExpressionGroupLabel);
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

	
	protected Composite createMethodNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MappingMessages.JavaDeclarationFilterPropertiesEditionPart_MethodNameLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, MappingViewsRepository.FORM_KIND));
		methodName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		methodName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData methodNameData = new GridData(GridData.FILL_HORIZONTAL);
		methodName.setLayoutData(methodNameData);
		methodName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(JavaDeclarationFilterPropertiesEditionPartForm.this, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, methodName.getText()));
			}
		});
		methodName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(JavaDeclarationFilterPropertiesEditionPartForm.this, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, methodName.getText()));
				}
			}
		});
		EditingUtils.setID(methodName, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		EditingUtils.setEEFtype(methodName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, MappingViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getMethodName()
	 * 
	 */
	public String getMethodName() {
		return methodName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setMethodName(String newValue)
	 * 
	 */
	public void setMethodName(String newValue) {
		if (newValue != null) {
			methodName.setText(newValue);
		} else {
			methodName.setText(""); //$NON-NLS-1$
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public PropertiesEditingPart getFilterPropertiesReferencedView() {
			return (PropertiesEditingPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setMandatory(Boolean newValue)
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
		return MappingMessages.JavaDeclarationFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
