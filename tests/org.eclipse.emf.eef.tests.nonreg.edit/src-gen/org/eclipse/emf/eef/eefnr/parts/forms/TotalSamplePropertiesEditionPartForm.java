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
package org.eclipse.emf.eef.eefnr.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableColumn;
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
public class TotalSamplePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TotalSamplePropertiesEditionPart {

	protected Text textRequiredProperty;
	protected Text textOptionalProperty;
	protected Button checkboxRequiredProperty;
	protected Button checkboxOptionalProperty;
	protected Text textareaRequiredProperty;
	protected Text textareaOptionalProperty;
	protected EMFComboViewer radioRequiredProperty;
	protected EMFComboViewer radioOptionalProperty;
	protected EObjectFlatComboViewer eobjectflatcomboviewerRequiredProperty;
	protected EObjectFlatComboViewer eobjectflatcomboviewerOptionalProperty;
		protected ReferencesTable referencestableRequiredProperty;
		protected List<ViewerFilter> referencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> referencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable referencestableOptionalProperty;
		protected List<ViewerFilter> referencestableOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> referencestableOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer emfcomboviewerRequiredProperty;
	protected EMFComboViewer emfcomboviewerOptionalProperty;
	protected Text multivaluededitorRequiredProperty;
		protected Button editMultivaluededitorRequiredProperty;
		private EList multivaluededitorRequiredPropertyList;
	protected Text multivaluededitorOptionalProperty;
		protected Button editMultivaluededitorOptionalProperty;
		private EList multivaluededitorOptionalPropertyList;
		protected TableViewer tablecompositionRequiredProperty;
		protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
		protected TableViewer tablecompositionOptionalProperty;
		protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable advancedreferencestableRequiredProperty;
		protected List<ViewerFilter> advancedreferencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedreferencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable advancedreferencestableOptionalProperty;
		protected List<ViewerFilter> advancedreferencestableOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedreferencestableOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer advancedeobjectflatcomboviewerRequiredPropery;
	protected EObjectFlatComboViewer advancedeobjectflatcomboviewerOptionalPropery;
	protected ReferencesTable advancedtablecompositionRequiredProperty;
	protected List<ViewerFilter> advancedtablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedtablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable advancedtablecompositionOptionalProperty;
	protected List<ViewerFilter> advancedtablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> advancedtablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	protected Text name;
		// Start of user code for CustomElementEditor widgets declarations
		
		// End of user code
	



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TotalSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence totalSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = totalSampleStep.addStep(EefnrViewsRepository.TotalSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.textRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.textOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.name);
		propertiesStep.addStep(EefnrViewsRepository.TotalSample.Properties.customElementEditor);
		
		
		composer = new PartComposer(totalSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TotalSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.textRequiredProperty) {
					return 		createTextRequiredPropertyText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.textOptionalProperty) {
					return 		createTextOptionalPropertyText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty) {
					return createCheckboxRequiredPropertyCheckbox(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty) {
					return createCheckboxOptionalPropertyCheckbox(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty) {
					return 		createTextareaRequiredPropertyText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty) {
					return 		createTextareaOptionalPropertyText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty) {
					return createRadioRequiredPropertyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty) {
					return createRadioOptionalPropertyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty) {
					return createEobjectflatcomboviewerRequiredPropertyFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty) {
					return createEobjectflatcomboviewerOptionalPropertyFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty) {
					return createReferencestableRequiredPropertyReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty) {
					return createReferencestableOptionalPropertyReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty) {
					return createEmfcomboviewerRequiredPropertyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty) {
					return createEmfcomboviewerOptionalPropertyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty) {
					return createMultivaluededitorRequiredPropertyMultiValuedEditor(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty) {
					return createMultivaluededitorOptionalPropertyMultiValuedEditor(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty) {
					return createTablecompositionRequiredPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty) {
					return createTablecompositionOptionalPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty) {
					return createAdvancedreferencestableRequiredPropertyReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty) {
					return createAdvancedreferencestableOptionalPropertyReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery) {
					return createAdvancedeobjectflatcomboviewerRequiredProperyFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery) {
					return createAdvancedeobjectflatcomboviewerOptionalProperyFlatComboViewer(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty) {
					return createAdvancedtablecompositionRequiredPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty) {
					return createAdvancedtablecompositionOptionalPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TotalSample.Properties.name) {
					return 		createNameText(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.TotalSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createTextRequiredPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.textRequiredProperty, EefnrViewsRepository.FORM_KIND));
		textRequiredProperty = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textRequiredProperty.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textRequiredProperty.setLayoutData(textRequiredPropertyData);
		textRequiredProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredProperty.getText()));
			}
		});
		textRequiredProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredProperty.getText()));
				}
			}
		});
		EditingUtils.setID(textRequiredProperty, EefnrViewsRepository.TotalSample.Properties.textRequiredProperty);
		EditingUtils.setEEFtype(textRequiredProperty, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.textRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextOptionalPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.textOptionalProperty, EefnrViewsRepository.FORM_KIND));
		textOptionalProperty = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textOptionalProperty.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textOptionalProperty.setLayoutData(textOptionalPropertyData);
		textOptionalProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalProperty.getText()));
			}
		});
		textOptionalProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalProperty.getText()));
				}
			}
		});
		EditingUtils.setID(textOptionalProperty, EefnrViewsRepository.TotalSample.Properties.textOptionalProperty);
		EditingUtils.setEEFtype(textOptionalProperty, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.textOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCheckboxRequiredPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxRequiredProperty = widgetFactory.createButton(parent, EefnrMessages.TotalSamplePropertiesEditionPart_CheckboxRequiredPropertyLabel, SWT.CHECK);
		checkboxRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkboxRequiredProperty.getSelection())));
			}

		});
		GridData checkboxRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxRequiredPropertyData.horizontalSpan = 2;
		checkboxRequiredProperty.setLayoutData(checkboxRequiredPropertyData);
		EditingUtils.setID(checkboxRequiredProperty, EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty);
		EditingUtils.setEEFtype(checkboxRequiredProperty, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.checkboxRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCheckboxOptionalPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
		checkboxOptionalProperty = widgetFactory.createButton(parent, EefnrMessages.TotalSamplePropertiesEditionPart_CheckboxOptionalPropertyLabel, SWT.CHECK);
		checkboxOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkboxOptionalProperty.getSelection())));
			}

		});
		GridData checkboxOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxOptionalPropertyData.horizontalSpan = 2;
		checkboxOptionalProperty.setLayoutData(checkboxOptionalPropertyData);
		EditingUtils.setID(checkboxOptionalProperty, EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty);
		EditingUtils.setEEFtype(checkboxOptionalProperty, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.checkboxOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextareaRequiredPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND));
		textareaRequiredProperty = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textareaRequiredProperty.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textareaRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textareaRequiredProperty.setLayoutData(textareaRequiredPropertyData);
		textareaRequiredProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaRequiredProperty.getText()));
			}
		});
		textareaRequiredProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaRequiredProperty.getText()));
				}
			}
		});
		EditingUtils.setID(textareaRequiredProperty, EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty);
		EditingUtils.setEEFtype(textareaRequiredProperty, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTextareaOptionalPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND));
		textareaOptionalProperty = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		textareaOptionalProperty.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData textareaOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		textareaOptionalProperty.setLayoutData(textareaOptionalPropertyData);
		textareaOptionalProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaOptionalProperty.getText()));
			}
		});
		textareaOptionalProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaOptionalProperty.getText()));
				}
			}
		});
		EditingUtils.setID(textareaOptionalProperty, EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty);
		EditingUtils.setEEFtype(textareaOptionalProperty, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRadioRequiredPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_RadioRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty, EefnrViewsRepository.FORM_KIND));
		radioRequiredProperty = new EMFComboViewer(parent);
		radioRequiredProperty.setContentProvider(new ArrayContentProvider());
		radioRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData radioRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		radioRequiredProperty.getCombo().setLayoutData(radioRequiredPropertyData);
		radioRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRadioRequiredProperty()));
			}

		});
		radioRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.radioRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRadioOptionalPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_RadioOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty, EefnrViewsRepository.FORM_KIND));
		radioOptionalProperty = new EMFComboViewer(parent);
		radioOptionalProperty.setContentProvider(new ArrayContentProvider());
		radioOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData radioOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		radioOptionalProperty.getCombo().setLayoutData(radioOptionalPropertyData);
		radioOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRadioOptionalProperty()));
			}

		});
		radioOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.radioOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEobjectflatcomboviewerRequiredPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EobjectflatcomboviewerRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND));
		eobjectflatcomboviewerRequiredProperty = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND));
		widgetFactory.adapt(eobjectflatcomboviewerRequiredProperty);
		eobjectflatcomboviewerRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData eobjectflatcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		eobjectflatcomboviewerRequiredProperty.setLayoutData(eobjectflatcomboviewerRequiredPropertyData);
		eobjectflatcomboviewerRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewerRequiredProperty()));
			}

		});
		eobjectflatcomboviewerRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEobjectflatcomboviewerOptionalPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EobjectflatcomboviewerOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND));
		eobjectflatcomboviewerOptionalProperty = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND));
		widgetFactory.adapt(eobjectflatcomboviewerOptionalProperty);
		eobjectflatcomboviewerOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData eobjectflatcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		eobjectflatcomboviewerOptionalProperty.setLayoutData(eobjectflatcomboviewerOptionalPropertyData);
		eobjectflatcomboviewerOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewerOptionalProperty()));
			}

		});
		eobjectflatcomboviewerOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.eobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencestableRequiredPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencestableRequiredProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_ReferencestableRequiredPropertyLabel, new ReferencesTableListener	() {
			public void handleAdd() { addReferencestableRequiredProperty(); }
			public void handleEdit(EObject element) { editReferencestableRequiredProperty(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencestableRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencestableRequiredProperty(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencestableRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.referencestableRequiredProperty.createControls(parent, widgetFactory);
		this.referencestableRequiredProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableRequiredPropertyData.horizontalSpan = 3;
		this.referencestableRequiredProperty.setLayoutData(referencestableRequiredPropertyData);
		this.referencestableRequiredProperty.disableMove();
		referencestableRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty);
		referencestableRequiredProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReferencestableRequiredProperty() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(referencestableRequiredProperty.getInput(), referencestableRequiredPropertyFilters, referencestableRequiredPropertyBusinessFilters,
		"referencestableRequiredProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				referencestableRequiredProperty.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReferencestableRequiredProperty(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencestableRequiredProperty.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencestableRequiredProperty(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		referencestableRequiredProperty.refresh();
	}

	/**
	 * 
	 */
	protected void editReferencestableRequiredProperty(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				referencestableRequiredProperty.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createReferencestableOptionalPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencestableOptionalProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_ReferencestableOptionalPropertyLabel, new ReferencesTableListener	() {
			public void handleAdd() { addReferencestableOptionalProperty(); }
			public void handleEdit(EObject element) { editReferencestableOptionalProperty(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencestableOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencestableOptionalProperty(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencestableOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.referencestableOptionalProperty.createControls(parent, widgetFactory);
		this.referencestableOptionalProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableOptionalPropertyData.horizontalSpan = 3;
		this.referencestableOptionalProperty.setLayoutData(referencestableOptionalPropertyData);
		this.referencestableOptionalProperty.disableMove();
		referencestableOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty);
		referencestableOptionalProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReferencestableOptionalProperty() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(referencestableOptionalProperty.getInput(), referencestableOptionalPropertyFilters, referencestableOptionalPropertyBusinessFilters,
		"referencestableOptionalProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				referencestableOptionalProperty.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReferencestableOptionalProperty(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencestableOptionalProperty.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencestableOptionalProperty(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		referencestableOptionalProperty.refresh();
	}

	/**
	 * 
	 */
	protected void editReferencestableOptionalProperty(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				referencestableOptionalProperty.refresh();
			}
		}
	}

	
	protected Composite createEmfcomboviewerRequiredPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND));
		emfcomboviewerRequiredProperty = new EMFComboViewer(parent);
		emfcomboviewerRequiredProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerRequiredProperty.getCombo().setLayoutData(emfcomboviewerRequiredPropertyData);
		emfcomboviewerRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerRequiredProperty()));
			}

		});
		emfcomboviewerRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEmfcomboviewerOptionalPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND));
		emfcomboviewerOptionalProperty = new EMFComboViewer(parent);
		emfcomboviewerOptionalProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerOptionalProperty.getCombo().setLayoutData(emfcomboviewerOptionalPropertyData);
		emfcomboviewerOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerOptionalProperty()));
			}

		});
		emfcomboviewerOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.emfcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMultivaluededitorRequiredPropertyMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitorRequiredProperty = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluededitorRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorRequiredPropertyData.horizontalSpan = 2;
		multivaluededitorRequiredProperty.setLayoutData(multivaluededitorRequiredPropertyData);
		EditingUtils.setID(multivaluededitorRequiredProperty, EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty);
		EditingUtils.setEEFtype(multivaluededitorRequiredProperty, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMultivaluededitorRequiredProperty = widgetFactory.createButton(parent, EefnrMessages.TotalSamplePropertiesEditionPart_MultivaluededitorRequiredPropertyLabel, SWT.NONE);
		GridData editMultivaluededitorRequiredPropertyData = new GridData();
		editMultivaluededitorRequiredProperty.setLayoutData(editMultivaluededitorRequiredPropertyData);
		editMultivaluededitorRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						multivaluededitorRequiredProperty.getShell(), "TotalSample", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						multivaluededitorRequiredPropertyList, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorRequiredProperty().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					multivaluededitorRequiredPropertyList = dialog.getResult();
					if (multivaluededitorRequiredPropertyList == null) {
						multivaluededitorRequiredPropertyList = new BasicEList();
					}
					multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(multivaluededitorRequiredPropertyList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMultivaluededitorRequiredProperty, EefnrViewsRepository.TotalSample.Properties.multivaluededitorRequiredProperty);
		EditingUtils.setEEFtype(editMultivaluededitorRequiredProperty, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMultivaluededitorOptionalPropertyMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitorOptionalProperty = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluededitorOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorOptionalPropertyData.horizontalSpan = 2;
		multivaluededitorOptionalProperty.setLayoutData(multivaluededitorOptionalPropertyData);
		EditingUtils.setID(multivaluededitorOptionalProperty, EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty);
		EditingUtils.setEEFtype(multivaluededitorOptionalProperty, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMultivaluededitorOptionalProperty = widgetFactory.createButton(parent, EefnrMessages.TotalSamplePropertiesEditionPart_MultivaluededitorOptionalPropertyLabel, SWT.NONE);
		GridData editMultivaluededitorOptionalPropertyData = new GridData();
		editMultivaluededitorOptionalProperty.setLayoutData(editMultivaluededitorOptionalPropertyData);
		editMultivaluededitorOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						multivaluededitorOptionalProperty.getShell(), "TotalSample", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						multivaluededitorOptionalPropertyList, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorOptionalProperty().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					multivaluededitorOptionalPropertyList = dialog.getResult();
					if (multivaluededitorOptionalPropertyList == null) {
						multivaluededitorOptionalPropertyList = new BasicEList();
					}
					multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(multivaluededitorOptionalPropertyList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMultivaluededitorOptionalProperty, EefnrViewsRepository.TotalSample.Properties.multivaluededitorOptionalProperty);
		EditingUtils.setEEFtype(editMultivaluededitorOptionalProperty, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite container) {
		Composite tableContainer = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableTablecompositionRequiredProperty = widgetFactory.createTable(tableContainer, SWT.FULL_SELECTION | SWT.BORDER);
		tableTablecompositionRequiredProperty.setHeaderVisible(true);
		GridData gdTablecompositionRequiredProperty = new GridData();
		gdTablecompositionRequiredProperty.grabExcessHorizontalSpace = true;
		gdTablecompositionRequiredProperty.horizontalAlignment = GridData.FILL;
		gdTablecompositionRequiredProperty.grabExcessVerticalSpace = true;
		gdTablecompositionRequiredProperty.verticalAlignment = GridData.FILL;
		tableTablecompositionRequiredProperty.setLayoutData(gdTablecompositionRequiredProperty);
		tableTablecompositionRequiredProperty.setLinesVisible(true);

		// Start of user code for columns definition for TablecompositionRequiredProperty
				TableColumn name = new TableColumn(tableTablecompositionRequiredProperty, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		tablecompositionRequiredProperty = new TableViewer(tableTablecompositionRequiredProperty);
		tablecompositionRequiredProperty.setContentProvider(new ArrayContentProvider());
		tablecompositionRequiredProperty.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for TablecompositionRequiredProperty
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			//End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		tablecompositionRequiredProperty.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.minimumHeight = 120;
		tablecompositionRequiredPropertyData.heightHint = 120;
		tablecompositionRequiredProperty.getTable().setLayoutData(tablecompositionRequiredPropertyData);
		for (ViewerFilter filter : this.tablecompositionRequiredPropertyFilters) {
			tablecompositionRequiredProperty.addFilter(filter);
		}
		EditingUtils.setID(tablecompositionRequiredProperty.getTable(), EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(tablecompositionRequiredProperty.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createTablecompositionRequiredPropertyPanel(widgetFactory, tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionRequiredPropertyPanel(FormToolkit widgetFactory, Composite container) {
		Composite tablecompositionRequiredPropertyPanel = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout tablecompositionRequiredPropertyPanelLayout = new GridLayout();
		tablecompositionRequiredPropertyPanelLayout.numColumns = 1;
		tablecompositionRequiredPropertyPanel.setLayout(tablecompositionRequiredPropertyPanelLayout);
		Button addTablecompositionRequiredProperty = widgetFactory.createButton(tablecompositionRequiredPropertyPanel, EefnrMessages.PropertiesEditionPart_AddTableViewerLabel, SWT.NONE);
		GridData addTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		addTablecompositionRequiredProperty.setLayoutData(addTablecompositionRequiredPropertyData);
		addTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				tablecompositionRequiredProperty.refresh();
			}
		});
		EditingUtils.setID(addTablecompositionRequiredProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(addTablecompositionRequiredProperty, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeTablecompositionRequiredProperty = widgetFactory.createButton(tablecompositionRequiredPropertyPanel, EefnrMessages.PropertiesEditionPart_RemoveTableViewerLabel, SWT.NONE);
		GridData removeTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		removeTablecompositionRequiredProperty.setLayoutData(removeTablecompositionRequiredPropertyData);
		removeTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeTablecompositionRequiredProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(removeTablecompositionRequiredProperty, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editTablecompositionRequiredProperty = widgetFactory.createButton(tablecompositionRequiredPropertyPanel, EefnrMessages.PropertiesEditionPart_EditTableViewerLabel, SWT.NONE);
		GridData editTablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		editTablecompositionRequiredProperty.setLayoutData(editTablecompositionRequiredPropertyData);
		editTablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionRequiredProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionRequiredProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionRequiredProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editTablecompositionRequiredProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionRequiredProperty);
		EditingUtils.setEEFtype(editTablecompositionRequiredProperty, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return tablecompositionRequiredPropertyPanel;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite container) {
		Composite tableContainer = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout tableContainerLayout = new GridLayout();
		GridData tableContainerData = new GridData(GridData.FILL_BOTH);
		tableContainerData.horizontalSpan = 3;
		tableContainer.setLayoutData(tableContainerData);
		tableContainerLayout.numColumns = 2;
		tableContainer.setLayout(tableContainerLayout);
		org.eclipse.swt.widgets.Table tableTablecompositionOptionalProperty = widgetFactory.createTable(tableContainer, SWT.FULL_SELECTION | SWT.BORDER);
		tableTablecompositionOptionalProperty.setHeaderVisible(true);
		GridData gdTablecompositionOptionalProperty = new GridData();
		gdTablecompositionOptionalProperty.grabExcessHorizontalSpace = true;
		gdTablecompositionOptionalProperty.horizontalAlignment = GridData.FILL;
		gdTablecompositionOptionalProperty.grabExcessVerticalSpace = true;
		gdTablecompositionOptionalProperty.verticalAlignment = GridData.FILL;
		tableTablecompositionOptionalProperty.setLayoutData(gdTablecompositionOptionalProperty);
		tableTablecompositionOptionalProperty.setLinesVisible(true);

		// Start of user code for columns definition for TablecompositionOptionalProperty
				TableColumn name = new TableColumn(tableTablecompositionOptionalProperty, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		tablecompositionOptionalProperty = new TableViewer(tableTablecompositionOptionalProperty);
		tablecompositionOptionalProperty.setContentProvider(new ArrayContentProvider());
		tablecompositionOptionalProperty.setLabelProvider(new ITableLabelProvider() {
			//Start of user code for label provider definition for TablecompositionOptionalProperty
						public String getColumnText(Object object, int columnIndex) {
							AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
							if (object instanceof EObject) {
								switch (columnIndex) {
								case 0:
									return labelProvider.getText(object);
								}
							}
							return ""; //$NON-NLS-1$
						}
			
						public Image getColumnImage(Object element, int columnIndex) {
							return null;
						}
			
			//End of user code

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}

		});
		tablecompositionOptionalProperty.getTable().addListener(SWT.MouseDoubleClick, new Listener(){

			public void handleEvent(Event event) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.minimumHeight = 120;
		tablecompositionOptionalPropertyData.heightHint = 120;
		tablecompositionOptionalProperty.getTable().setLayoutData(tablecompositionOptionalPropertyData);
		for (ViewerFilter filter : this.tablecompositionOptionalPropertyFilters) {
			tablecompositionOptionalProperty.addFilter(filter);
		}
		EditingUtils.setID(tablecompositionOptionalProperty.getTable(), EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(tablecompositionOptionalProperty.getTable(), "eef::TableComposition::field"); //$NON-NLS-1$
		createTablecompositionOptionalPropertyPanel(widgetFactory, tableContainer);
		return container;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionOptionalPropertyPanel(FormToolkit widgetFactory, Composite container) {
		Composite tablecompositionOptionalPropertyPanel = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout tablecompositionOptionalPropertyPanelLayout = new GridLayout();
		tablecompositionOptionalPropertyPanelLayout.numColumns = 1;
		tablecompositionOptionalPropertyPanel.setLayout(tablecompositionOptionalPropertyPanelLayout);
		Button addTablecompositionOptionalProperty = widgetFactory.createButton(tablecompositionOptionalPropertyPanel, EefnrMessages.PropertiesEditionPart_AddTableViewerLabel, SWT.NONE);
		GridData addTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		addTablecompositionOptionalProperty.setLayoutData(addTablecompositionOptionalPropertyData);
		addTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				tablecompositionOptionalProperty.refresh();
			}
		});
		EditingUtils.setID(addTablecompositionOptionalProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(addTablecompositionOptionalProperty, "eef::TableComposition::addbutton"); //$NON-NLS-1$
		Button removeTablecompositionOptionalProperty = widgetFactory.createButton(tablecompositionOptionalPropertyPanel, EefnrMessages.PropertiesEditionPart_RemoveTableViewerLabel, SWT.NONE);
		GridData removeTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		removeTablecompositionOptionalProperty.setLayoutData(removeTablecompositionOptionalPropertyData);
		removeTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						EObject selectedElement = (EObject) selection.getFirstElement();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, selectedElement));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(removeTablecompositionOptionalProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(removeTablecompositionOptionalProperty, "eef::TableComposition::removebutton"); //$NON-NLS-1$
		Button editTablecompositionOptionalProperty = widgetFactory.createButton(tablecompositionOptionalPropertyPanel, EefnrMessages.PropertiesEditionPart_EditTableViewerLabel, SWT.NONE);
		GridData editTablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		editTablecompositionOptionalProperty.setLayoutData(editTablecompositionOptionalPropertyData);
		editTablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (tablecompositionOptionalProperty.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) tablecompositionOptionalProperty.getSelection();
					if (selection.getFirstElement() instanceof EObject) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, selection.getFirstElement()));
						tablecompositionOptionalProperty.refresh();
					}
				}
			}

		});
		EditingUtils.setID(editTablecompositionOptionalProperty, EefnrViewsRepository.TotalSample.Properties.tablecompositionOptionalProperty);
		EditingUtils.setEEFtype(editTablecompositionOptionalProperty, "eef::TableComposition::editbutton"); //$NON-NLS-1$
		return tablecompositionOptionalPropertyPanel;
	}

	/**
	 * 
	 */
	protected Composite createAdvancedreferencestableRequiredPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.advancedreferencestableRequiredProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedreferencestableRequiredPropertyLabel, new ReferencesTableListener	() {
			public void handleAdd() { addAdvancedreferencestableRequiredProperty(); }
			public void handleEdit(EObject element) { editAdvancedreferencestableRequiredProperty(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAdvancedreferencestableRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAdvancedreferencestableRequiredProperty(element); }
			public void navigateTo(EObject element) { }
		});
		this.advancedreferencestableRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedreferencestableRequiredProperty.createControls(parent, widgetFactory);
		this.advancedreferencestableRequiredProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData advancedreferencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableRequiredPropertyData.horizontalSpan = 3;
		this.advancedreferencestableRequiredProperty.setLayoutData(advancedreferencestableRequiredPropertyData);
		this.advancedreferencestableRequiredProperty.disableMove();
		advancedreferencestableRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty);
		advancedreferencestableRequiredProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAdvancedreferencestableRequiredProperty() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(advancedreferencestableRequiredProperty.getInput(), advancedreferencestableRequiredPropertyFilters, advancedreferencestableRequiredPropertyBusinessFilters,
		"advancedreferencestableRequiredProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				advancedreferencestableRequiredProperty.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableRequiredProperty(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		advancedreferencestableRequiredProperty.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableRequiredProperty(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		advancedreferencestableRequiredProperty.refresh();
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableRequiredProperty(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				advancedreferencestableRequiredProperty.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createAdvancedreferencestableOptionalPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.advancedreferencestableOptionalProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedreferencestableOptionalPropertyLabel, new ReferencesTableListener	() {
			public void handleAdd() { addAdvancedreferencestableOptionalProperty(); }
			public void handleEdit(EObject element) { editAdvancedreferencestableOptionalProperty(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAdvancedreferencestableOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAdvancedreferencestableOptionalProperty(element); }
			public void navigateTo(EObject element) { }
		});
		this.advancedreferencestableOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedreferencestableOptionalProperty.createControls(parent, widgetFactory);
		this.advancedreferencestableOptionalProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData advancedreferencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableOptionalPropertyData.horizontalSpan = 3;
		this.advancedreferencestableOptionalProperty.setLayoutData(advancedreferencestableOptionalPropertyData);
		this.advancedreferencestableOptionalProperty.disableMove();
		advancedreferencestableOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty);
		advancedreferencestableOptionalProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAdvancedreferencestableOptionalProperty() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(advancedreferencestableOptionalProperty.getInput(), advancedreferencestableOptionalPropertyFilters, advancedreferencestableOptionalPropertyBusinessFilters,
		"advancedreferencestableOptionalProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				advancedreferencestableOptionalProperty.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableOptionalProperty(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		advancedreferencestableOptionalProperty.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableOptionalProperty(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		advancedreferencestableOptionalProperty.refresh();
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableOptionalProperty(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				advancedreferencestableOptionalProperty.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerRequiredProperyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredProperyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery, EefnrViewsRepository.FORM_KIND));
		advancedeobjectflatcomboviewerRequiredPropery = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery, EefnrViewsRepository.FORM_KIND));
		widgetFactory.adapt(advancedeobjectflatcomboviewerRequiredPropery);
		advancedeobjectflatcomboviewerRequiredPropery.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData advancedeobjectflatcomboviewerRequiredProperyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerRequiredPropery.setLayoutData(advancedeobjectflatcomboviewerRequiredProperyData);
		advancedeobjectflatcomboviewerRequiredPropery.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdvancedeobjectflatcomboviewerRequiredPropery()));
			}

		});
		advancedeobjectflatcomboviewerRequiredPropery.setID(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerRequiredPropery, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAdvancedeobjectflatcomboviewerOptionalProperyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalProperyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery, EefnrViewsRepository.FORM_KIND));
		advancedeobjectflatcomboviewerOptionalPropery = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery, EefnrViewsRepository.FORM_KIND));
		widgetFactory.adapt(advancedeobjectflatcomboviewerOptionalPropery);
		advancedeobjectflatcomboviewerOptionalPropery.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData advancedeobjectflatcomboviewerOptionalProperyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedeobjectflatcomboviewerOptionalPropery.setLayoutData(advancedeobjectflatcomboviewerOptionalProperyData);
		advancedeobjectflatcomboviewerOptionalPropery.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdvancedeobjectflatcomboviewerOptionalPropery()));
			}

		});
		advancedeobjectflatcomboviewerOptionalPropery.setID(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedeobjectflatcomboviewerOptionalPropery, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAdvancedtablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.advancedtablecompositionRequiredProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedtablecompositionRequiredPropertyLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				advancedtablecompositionRequiredProperty.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				advancedtablecompositionRequiredProperty.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				advancedtablecompositionRequiredProperty.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				advancedtablecompositionRequiredProperty.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.advancedtablecompositionRequiredPropertyFilters) {
			this.advancedtablecompositionRequiredProperty.addFilter(filter);
		}
		this.advancedtablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedtablecompositionRequiredProperty.createControls(parent, widgetFactory);
		this.advancedtablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData advancedtablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionRequiredProperty.setLayoutData(advancedtablecompositionRequiredPropertyData);
		this.advancedtablecompositionRequiredProperty.setLowerBound(1);
		this.advancedtablecompositionRequiredProperty.setUpperBound(-1);
		advancedtablecompositionRequiredProperty.setID(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionRequiredProperty);
		advancedtablecompositionRequiredProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAdvancedtablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.advancedtablecompositionOptionalProperty = new ReferencesTable(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedtablecompositionOptionalPropertyLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				advancedtablecompositionOptionalProperty.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				advancedtablecompositionOptionalProperty.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				advancedtablecompositionOptionalProperty.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				advancedtablecompositionOptionalProperty.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.advancedtablecompositionOptionalPropertyFilters) {
			this.advancedtablecompositionOptionalProperty.addFilter(filter);
		}
		this.advancedtablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedtablecompositionOptionalProperty.createControls(parent, widgetFactory);
		this.advancedtablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData advancedtablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionOptionalProperty.setLayoutData(advancedtablecompositionOptionalPropertyData);
		this.advancedtablecompositionOptionalProperty.setLowerBound(0);
		this.advancedtablecompositionOptionalProperty.setUpperBound(-1);
		advancedtablecompositionOptionalProperty.setID(EefnrViewsRepository.TotalSample.Properties.advancedtablecompositionOptionalProperty);
		advancedtablecompositionOptionalProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.Properties.name, EefnrViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EefnrViewsRepository.TotalSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.Properties.name, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTextRequiredProperty()
	 * 
	 */
	public String getTextRequiredProperty() {
		return textRequiredProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setTextRequiredProperty(String newValue)
	 * 
	 */
	public void setTextRequiredProperty(String newValue) {
		if (newValue != null) {
			textRequiredProperty.setText(newValue);
		} else {
			textRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTextOptionalProperty()
	 * 
	 */
	public String getTextOptionalProperty() {
		return textOptionalProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setTextOptionalProperty(String newValue)
	 * 
	 */
	public void setTextOptionalProperty(String newValue) {
		if (newValue != null) {
			textOptionalProperty.setText(newValue);
		} else {
			textOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getCheckboxRequiredProperty()
	 * 
	 */
	public Boolean getCheckboxRequiredProperty() {
		return Boolean.valueOf(checkboxRequiredProperty.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setCheckboxRequiredProperty(Boolean newValue)
	 * 
	 */
	public void setCheckboxRequiredProperty(Boolean newValue) {
		if (newValue != null) {
			checkboxRequiredProperty.setSelection(newValue.booleanValue());
		} else {
			checkboxRequiredProperty.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getCheckboxOptionalProperty()
	 * 
	 */
	public Boolean getCheckboxOptionalProperty() {
		return Boolean.valueOf(checkboxOptionalProperty.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setCheckboxOptionalProperty(Boolean newValue)
	 * 
	 */
	public void setCheckboxOptionalProperty(Boolean newValue) {
		if (newValue != null) {
			checkboxOptionalProperty.setSelection(newValue.booleanValue());
		} else {
			checkboxOptionalProperty.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTextareaRequiredProperty()
	 * 
	 */
	public String getTextareaRequiredProperty() {
		return textareaRequiredProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setTextareaRequiredProperty(String newValue)
	 * 
	 */
	public void setTextareaRequiredProperty(String newValue) {
		if (newValue != null) {
			textareaRequiredProperty.setText(newValue);
		} else {
			textareaRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTextareaOptionalProperty()
	 * 
	 */
	public String getTextareaOptionalProperty() {
		return textareaOptionalProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setTextareaOptionalProperty(String newValue)
	 * 
	 */
	public void setTextareaOptionalProperty(String newValue) {
		if (newValue != null) {
			textareaOptionalProperty.setText(newValue);
		} else {
			textareaOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getRadioRequiredProperty()
	 * 
	 */
	public Enumerator getRadioRequiredProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) radioRequiredProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initRadioRequiredProperty(Object input, Enumerator current)
	 */
	public void initRadioRequiredProperty(Object input, Enumerator current) {
		radioRequiredProperty.setInput(input);
		radioRequiredProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setRadioRequiredProperty(Enumerator newValue)
	 * 
	 */
	public void setRadioRequiredProperty(Enumerator newValue) {
		radioRequiredProperty.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getRadioOptionalProperty()
	 * 
	 */
	public Enumerator getRadioOptionalProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) radioOptionalProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initRadioOptionalProperty(Object input, Enumerator current)
	 */
	public void initRadioOptionalProperty(Object input, Enumerator current) {
		radioOptionalProperty.setInput(input);
		radioOptionalProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setRadioOptionalProperty(Enumerator newValue)
	 * 
	 */
	public void setRadioOptionalProperty(Enumerator newValue) {
		radioOptionalProperty.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getEobjectflatcomboviewerRequiredProperty()
	 * 
	 */
	public EObject getEobjectflatcomboviewerRequiredProperty() {
		if (eobjectflatcomboviewerRequiredProperty.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) eobjectflatcomboviewerRequiredProperty.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEobjectflatcomboviewerRequiredProperty(EObjectFlatComboSettings)
	 */
	public void initEobjectflatcomboviewerRequiredProperty(EObjectFlatComboSettings settings) {
		eobjectflatcomboviewerRequiredProperty.setInput(settings);
		if (current != null) {
			eobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEobjectflatcomboviewerRequiredProperty(EObject newValue)
	 * 
	 */
	public void setEobjectflatcomboviewerRequiredProperty(EObject newValue) {
		if (newValue != null) {
			eobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(newValue));
		} else {
			eobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEobjectflatcomboviewerRequiredPropertyButtonMode(ButtonsModeEnum newValue) {
		eobjectflatcomboviewerRequiredProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterEobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		eobjectflatcomboviewerRequiredProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterEobjectflatcomboviewerRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerRequiredProperty(ViewerFilter filter) {
		eobjectflatcomboviewerRequiredProperty.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getEobjectflatcomboviewerOptionalProperty()
	 * 
	 */
	public EObject getEobjectflatcomboviewerOptionalProperty() {
		if (eobjectflatcomboviewerOptionalProperty.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) eobjectflatcomboviewerOptionalProperty.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEobjectflatcomboviewerOptionalProperty(EObjectFlatComboSettings)
	 */
	public void initEobjectflatcomboviewerOptionalProperty(EObjectFlatComboSettings settings) {
		eobjectflatcomboviewerOptionalProperty.setInput(settings);
		if (current != null) {
			eobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEobjectflatcomboviewerOptionalProperty(EObject newValue)
	 * 
	 */
	public void setEobjectflatcomboviewerOptionalProperty(EObject newValue) {
		if (newValue != null) {
			eobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(newValue));
		} else {
			eobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEobjectflatcomboviewerOptionalPropertyButtonMode(ButtonsModeEnum newValue) {
		eobjectflatcomboviewerOptionalProperty.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterEobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		eobjectflatcomboviewerOptionalProperty.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterEobjectflatcomboviewerOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEobjectflatcomboviewerOptionalProperty(ViewerFilter filter) {
		eobjectflatcomboviewerOptionalProperty.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initReferencestableRequiredProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencestableRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencestableRequiredProperty.setContentProvider(contentProvider);
		referencestableRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateReferencestableRequiredProperty()
	 * 
	 */
	public void updateReferencestableRequiredProperty() {
	referencestableRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterReferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencestableRequiredProperty(ViewerFilter filter) {
		referencestableRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterReferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencestableRequiredProperty(ViewerFilter filter) {
		referencestableRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInReferencestableRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencestableRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)referencestableRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initReferencestableOptionalProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencestableOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencestableOptionalProperty.setContentProvider(contentProvider);
		referencestableOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateReferencestableOptionalProperty()
	 * 
	 */
	public void updateReferencestableOptionalProperty() {
	referencestableOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterReferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencestableOptionalProperty(ViewerFilter filter) {
		referencestableOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterReferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencestableOptionalProperty(ViewerFilter filter) {
		referencestableOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInReferencestableOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencestableOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)referencestableOptionalProperty.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getEmfcomboviewerRequiredProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerRequiredProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEmfcomboviewerRequiredProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerRequiredProperty(Object input, Enumerator current) {
		emfcomboviewerRequiredProperty.setInput(input);
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEmfcomboviewerRequiredProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerRequiredProperty(Enumerator newValue) {
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getEmfcomboviewerOptionalProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerOptionalProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerOptionalProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEmfcomboviewerOptionalProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerOptionalProperty(Object input, Enumerator current) {
		emfcomboviewerOptionalProperty.setInput(input);
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setEmfcomboviewerOptionalProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerOptionalProperty(Enumerator newValue) {
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getMultivaluededitorRequiredProperty()
	 * 
	 */
	public EList getMultivaluededitorRequiredProperty() {
		return multivaluededitorRequiredPropertyList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setMultivaluededitorRequiredProperty(EList newValue)
	 * 
	 */
	public void setMultivaluededitorRequiredProperty(EList newValue) {
		multivaluededitorRequiredPropertyList = newValue;
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMultivaluededitorRequiredProperty(Object newValue) {
		multivaluededitorRequiredPropertyList.add(newValue);
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMultivaluededitorRequiredProperty(Object newValue) {
		multivaluededitorRequiredPropertyList.remove(newValue);
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getMultivaluededitorOptionalProperty()
	 * 
	 */
	public EList getMultivaluededitorOptionalProperty() {
		return multivaluededitorOptionalPropertyList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setMultivaluededitorOptionalProperty(EList newValue)
	 * 
	 */
	public void setMultivaluededitorOptionalProperty(EList newValue) {
		multivaluededitorOptionalPropertyList = newValue;
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMultivaluededitorOptionalProperty(Object newValue) {
		multivaluededitorOptionalPropertyList.add(newValue);
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMultivaluededitorOptionalProperty(Object newValue) {
		multivaluededitorOptionalPropertyList.remove(newValue);
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionRequiredProperty.setContentProvider(contentProvider);
		tablecompositionRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateTablecompositionRequiredProperty()
	 * 
	 */
	public void updateTablecompositionRequiredProperty() {
	tablecompositionRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
		if (this.tablecompositionRequiredProperty != null) {
			this.tablecompositionRequiredProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInTablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionOptionalProperty.setContentProvider(contentProvider);
		tablecompositionOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateTablecompositionOptionalProperty()
	 * 
	 */
	public void updateTablecompositionOptionalProperty() {
	tablecompositionOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
		if (this.tablecompositionOptionalProperty != null) {
			this.tablecompositionOptionalProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInTablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionOptionalProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedreferencestableRequiredProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAdvancedreferencestableRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		advancedreferencestableRequiredProperty.setContentProvider(contentProvider);
		advancedreferencestableRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedreferencestableRequiredProperty()
	 * 
	 */
	public void updateAdvancedreferencestableRequiredProperty() {
	advancedreferencestableRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedreferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter) {
		advancedreferencestableRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedreferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableRequiredProperty(ViewerFilter filter) {
		advancedreferencestableRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)advancedreferencestableRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedreferencestableOptionalProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAdvancedreferencestableOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		advancedreferencestableOptionalProperty.setContentProvider(contentProvider);
		advancedreferencestableOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedreferencestableOptionalProperty()
	 * 
	 */
	public void updateAdvancedreferencestableOptionalProperty() {
	advancedreferencestableOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedreferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter) {
		advancedreferencestableOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedreferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedreferencestableOptionalProperty(ViewerFilter filter) {
		advancedreferencestableOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedreferencestableOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)advancedreferencestableOptionalProperty.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerRequiredPropery()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerRequiredPropery() {
		if (advancedeobjectflatcomboviewerRequiredPropery.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) advancedeobjectflatcomboviewerRequiredPropery.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerRequiredPropery(EObjectFlatComboSettings)
	 */
	public void initAdvancedeobjectflatcomboviewerRequiredPropery(EObjectFlatComboSettings settings) {
		advancedeobjectflatcomboviewerRequiredPropery.setInput(settings);
		if (current != null) {
			advancedeobjectflatcomboviewerRequiredPropery.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredPropery(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredPropery(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerRequiredPropery.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerRequiredPropery.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredProperyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerRequiredPropery.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredPropery.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerRequiredPropery(ViewerFilter filter) {
		advancedeobjectflatcomboviewerRequiredPropery.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedeobjectflatcomboviewerOptionalPropery()
	 * 
	 */
	public EObject getAdvancedeobjectflatcomboviewerOptionalPropery() {
		if (advancedeobjectflatcomboviewerOptionalPropery.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) advancedeobjectflatcomboviewerOptionalPropery.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerOptionalPropery(EObjectFlatComboSettings)
	 */
	public void initAdvancedeobjectflatcomboviewerOptionalPropery(EObjectFlatComboSettings settings) {
		advancedeobjectflatcomboviewerOptionalPropery.setInput(settings);
		if (current != null) {
			advancedeobjectflatcomboviewerOptionalPropery.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalPropery(EObject newValue)
	 * 
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalPropery(EObject newValue) {
		if (newValue != null) {
			advancedeobjectflatcomboviewerOptionalPropery.setSelection(new StructuredSelection(newValue));
		} else {
			advancedeobjectflatcomboviewerOptionalPropery.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setAdvancedeobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalProperyButtonMode(ButtonsModeEnum newValue) {
		advancedeobjectflatcomboviewerOptionalPropery.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalPropery.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedeobjectflatcomboviewerOptionalPropery(ViewerFilter filter) {
		advancedeobjectflatcomboviewerOptionalPropery.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedtablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		advancedtablecompositionRequiredProperty.setContentProvider(contentProvider);
		advancedtablecompositionRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedtablecompositionRequiredProperty()
	 * 
	 */
	public void updateAdvancedtablecompositionRequiredProperty() {
	advancedtablecompositionRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedtablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter) {
		advancedtablecompositionRequiredPropertyFilters.add(filter);
		if (this.advancedtablecompositionRequiredProperty != null) {
			this.advancedtablecompositionRequiredProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedtablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter) {
		advancedtablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)advancedtablecompositionRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedtablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		advancedtablecompositionOptionalProperty.setContentProvider(contentProvider);
		advancedtablecompositionOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedtablecompositionOptionalProperty()
	 * 
	 */
	public void updateAdvancedtablecompositionOptionalProperty() {
	advancedtablecompositionOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedtablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter) {
		advancedtablecompositionOptionalPropertyFilters.add(filter);
		if (this.advancedtablecompositionOptionalProperty != null) {
			this.advancedtablecompositionOptionalProperty.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addBusinessFilterAdvancedtablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter) {
		advancedtablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInAdvancedtablecompositionOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)advancedtablecompositionOptionalProperty.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	// Start of user code for CustomElementEditor specific getters and setters implementation

// End of user code
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TotalSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
