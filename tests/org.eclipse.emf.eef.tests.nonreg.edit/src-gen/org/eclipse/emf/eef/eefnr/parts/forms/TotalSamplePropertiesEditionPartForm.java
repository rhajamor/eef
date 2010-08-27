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
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
	private EMFListEditUtil referencestableRequiredPropertyEditUtil;
		protected ReferencesTable<? extends EObject> referencestableRequiredProperty;
		protected List<ViewerFilter> referencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> referencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil referencestableOptionalPropertyEditUtil;
		protected ReferencesTable<? extends EObject> referencestableOptionalProperty;
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
	protected EMFListEditUtil tablecompositionRequiredPropertyEditUtil;
		protected ReferencesTable<? extends EObject> tablecompositionRequiredProperty;
		protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil tablecompositionOptionalPropertyEditUtil;
		protected ReferencesTable<? extends EObject> tablecompositionOptionalProperty;
		protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil advancedreferencestableRequiredPropertyEditUtil;
		protected ReferencesTable<? extends EObject> advancedreferencestableRequiredProperty;
		protected List<ViewerFilter> advancedreferencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedreferencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil advancedreferencestableOptionalPropertyEditUtil;
		protected ReferencesTable<? extends EObject> advancedreferencestableOptionalProperty;
		protected List<ViewerFilter> advancedreferencestableOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedreferencestableOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer advancedeobjectflatcomboviewerRequiredPropery;
	protected EObjectFlatComboViewer advancedeobjectflatcomboviewerOptionalPropery;
	protected EMFListEditUtil advancedtablecompositionRequiredPropertyEditUtil;
		protected ReferencesTable<? extends EObject> advancedtablecompositionRequiredProperty;
		protected List<ViewerFilter> advancedtablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedtablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil advancedtablecompositionOptionalPropertyEditUtil;
		protected ReferencesTable<? extends EObject> advancedtablecompositionOptionalProperty;
		protected List<ViewerFilter> advancedtablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> advancedtablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();
	protected Text name;



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
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefnrMessages.TotalSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createTextRequiredPropertyText(widgetFactory, propertiesGroup);
		createTextOptionalPropertyText(widgetFactory, propertiesGroup);
		createCheckboxRequiredPropertyCheckbox(widgetFactory, propertiesGroup);
		createCheckboxOptionalPropertyCheckbox(widgetFactory, propertiesGroup);
		createTextareaRequiredPropertyText(widgetFactory, propertiesGroup);
		createTextareaOptionalPropertyText(widgetFactory, propertiesGroup);
		createRadioRequiredPropertyEMFComboViewer(widgetFactory, propertiesGroup);
		createRadioOptionalPropertyEMFComboViewer(widgetFactory, propertiesGroup);
		createEobjectflatcomboviewerRequiredPropertyFlatComboViewer(propertiesGroup, widgetFactory);
		createEobjectflatcomboviewerOptionalPropertyFlatComboViewer(propertiesGroup, widgetFactory);
		createReferencestableRequiredPropertyReferencesTable(widgetFactory, propertiesGroup);
		createReferencestableOptionalPropertyReferencesTable(widgetFactory, propertiesGroup);
		createEmfcomboviewerRequiredPropertyEMFComboViewer(widgetFactory, propertiesGroup);
		createEmfcomboviewerOptionalPropertyEMFComboViewer(widgetFactory, propertiesGroup);
		createMultivaluededitorRequiredPropertyMultiValuedEditor(widgetFactory, propertiesGroup);
		createMultivaluededitorOptionalPropertyMultiValuedEditor(widgetFactory, propertiesGroup);
		createTablecompositionRequiredPropertyTableComposition(widgetFactory, propertiesGroup);
		createTablecompositionOptionalPropertyTableComposition(widgetFactory, propertiesGroup);
		createAdvancedreferencestableRequiredPropertyReferencesTable(widgetFactory, propertiesGroup);
		createAdvancedreferencestableOptionalPropertyReferencesTable(widgetFactory, propertiesGroup);
		createAdvancedeobjectflatcomboviewerRequiredProperyFlatComboViewer(propertiesGroup, widgetFactory);
		createAdvancedeobjectflatcomboviewerOptionalProperyFlatComboViewer(propertiesGroup, widgetFactory);
		createAdvancedtablecompositionRequiredPropertyTableComposition(widgetFactory, propertiesGroup);
		createAdvancedtablecompositionOptionalPropertyTableComposition(widgetFactory, propertiesGroup);
		createNameText(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createTextRequiredPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.textRequiredProperty, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredProperty.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textRequiredProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.textRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextOptionalPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.textOptionalProperty, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalProperty.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textOptionalProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.textOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createCheckboxRequiredPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.checkboxRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkboxRequiredProperty.getSelection())));
			}

		});
		GridData checkboxRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxRequiredPropertyData.horizontalSpan = 2;
		checkboxRequiredProperty.setLayoutData(checkboxRequiredPropertyData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.checkboxRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createCheckboxOptionalPropertyCheckbox(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.checkboxOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(checkboxOptionalProperty.getSelection())));
			}

		});
		GridData checkboxOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		checkboxOptionalPropertyData.horizontalSpan = 2;
		checkboxOptionalProperty.setLayoutData(checkboxOptionalPropertyData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.checkboxOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextareaRequiredPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textareaRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaRequiredProperty.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textareaRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaRequiredProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.textareaRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTextareaOptionalPropertyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_TextareaOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textareaOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaOptionalProperty.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.textareaOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, textareaOptionalProperty.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.textareaOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createRadioRequiredPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_RadioRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.radioRequiredProperty, EefnrViewsRepository.FORM_KIND));
		radioRequiredProperty = new EMFComboViewer(parent);
		radioRequiredProperty.setContentProvider(new ArrayContentProvider());
		radioRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.radioRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRadioRequiredProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.radioRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createRadioOptionalPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_RadioOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.radioOptionalProperty, EefnrViewsRepository.FORM_KIND));
		radioOptionalProperty = new EMFComboViewer(parent);
		radioOptionalProperty.setContentProvider(new ArrayContentProvider());
		radioOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.radioOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRadioOptionalProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.radioOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createEobjectflatcomboviewerRequiredPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EobjectflatcomboviewerRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.eobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND));
		eobjectflatcomboviewerRequiredProperty = new EObjectFlatComboViewer(parent, false);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.eobjectflatcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewerRequiredProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.eobjectflatcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createEobjectflatcomboviewerOptionalPropertyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EobjectflatcomboviewerOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.eobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND));
		eobjectflatcomboviewerOptionalProperty = new EObjectFlatComboViewer(parent, true);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.eobjectflatcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEobjectflatcomboviewerOptionalProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.eobjectflatcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void createReferencestableRequiredPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencestableRequiredProperty = new ReferencesTable<TotalSample>(EefnrMessages.TotalSamplePropertiesEditionPart_ReferencestableRequiredPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, referencestableRequiredPropertyFilters, referencestableRequiredPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!referencestableRequiredPropertyEditUtil.getVirtualList().contains(elem))
								referencestableRequiredPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableRequiredProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						referencestableRequiredProperty.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editReferencestableRequiredProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveReferencestableRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromReferencestableRequiredProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.referencestableRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.referencestableRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.referencestableRequiredProperty.createControls(parent, widgetFactory);
		GridData referencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableRequiredPropertyData.horizontalSpan = 3;
		this.referencestableRequiredProperty.setLayoutData(referencestableRequiredPropertyData);
		this.referencestableRequiredProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveReferencestableRequiredProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = referencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		referencestableRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		referencestableRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromReferencestableRequiredProperty(TotalSample element) {
		// Start of user code for the removeFromReferencestableRequiredProperty() method body
				EObject editedElement = referencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				referencestableRequiredPropertyEditUtil.removeElement(element);
				referencestableRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editReferencestableRequiredProperty(TotalSample element) {
		// Start of user code editReferencestableRequiredProperty() method body		
				EObject editedElement = referencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						referencestableRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						referencestableRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createReferencestableOptionalPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.referencestableOptionalProperty = new ReferencesTable<TotalSample>(EefnrMessages.TotalSamplePropertiesEditionPart_ReferencestableOptionalPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, referencestableOptionalPropertyFilters, referencestableOptionalPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!referencestableOptionalPropertyEditUtil.getVirtualList().contains(elem))
								referencestableOptionalPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableOptionalProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						referencestableOptionalProperty.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editReferencestableOptionalProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveReferencestableOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromReferencestableOptionalProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.referencestableOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.referencestableOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.referencestableOptionalProperty.createControls(parent, widgetFactory);
		GridData referencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableOptionalPropertyData.horizontalSpan = 3;
		this.referencestableOptionalProperty.setLayoutData(referencestableOptionalPropertyData);
		this.referencestableOptionalProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveReferencestableOptionalProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = referencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		referencestableOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		referencestableOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromReferencestableOptionalProperty(TotalSample element) {
		// Start of user code for the removeFromReferencestableOptionalProperty() method body
				EObject editedElement = referencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				referencestableOptionalPropertyEditUtil.removeElement(element);
				referencestableOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editReferencestableOptionalProperty(TotalSample element) {
		// Start of user code editReferencestableOptionalProperty() method body		
				EObject editedElement = referencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						referencestableOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						referencestableOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createEmfcomboviewerRequiredPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.emfcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND));
		emfcomboviewerRequiredProperty = new EMFComboViewer(parent);
		emfcomboviewerRequiredProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.emfcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerRequiredProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.emfcomboviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createEmfcomboviewerOptionalPropertyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.emfcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND));
		emfcomboviewerOptionalProperty = new EMFComboViewer(parent);
		emfcomboviewerOptionalProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.emfcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerOptionalProperty()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.emfcomboviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void createMultivaluededitorRequiredPropertyMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitorRequiredProperty = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluededitorRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorRequiredPropertyData.horizontalSpan = 2;
		multivaluededitorRequiredProperty.setLayoutData(multivaluededitorRequiredPropertyData);
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
				EObject totalSample = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), totalSample, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorRequiredProperty().getEType(), 
						multivaluededitorRequiredPropertyList, "TotalSample", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					multivaluededitorRequiredPropertyList = dialog.getResult();
					if (multivaluededitorRequiredPropertyList == null) {
						multivaluededitorRequiredPropertyList = new BasicEList();
					}
					multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.multivaluededitorRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, multivaluededitorRequiredPropertyList));
					setHasChanged(true);
				}
			}
		});
	}

	/**
	 * 
	 */
	protected void createMultivaluededitorOptionalPropertyMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		multivaluededitorOptionalProperty = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData multivaluededitorOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		multivaluededitorOptionalPropertyData.horizontalSpan = 2;
		multivaluededitorOptionalProperty.setLayoutData(multivaluededitorOptionalPropertyData);
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
				EObject totalSample = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), totalSample, EefnrPackage.eINSTANCE.getTotalSample_MultivaluededitorOptionalProperty().getEType(), 
						multivaluededitorOptionalPropertyList, "TotalSample", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					multivaluededitorOptionalPropertyList = dialog.getResult();
					if (multivaluededitorOptionalPropertyList == null) {
						multivaluededitorOptionalPropertyList = new BasicEList();
					}
					multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.multivaluededitorOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, multivaluededitorOptionalPropertyList));
					setHasChanged(true);
				}
			}
		});
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionRequiredProperty = new ReferencesTable<Sample>(EefnrMessages.TotalSamplePropertiesEditionPart_TablecompositionRequiredPropertyLabel, new ReferencesTableListener<Sample>() {			
			public void handleAdd() { addToTablecompositionRequiredProperty();}
			public void handleEdit(Sample element) { editTablecompositionRequiredProperty(element); }
			public void handleMove(Sample element, int oldIndex, int newIndex) { moveTablecompositionRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(Sample element) { removeFromTablecompositionRequiredProperty(element); }
			public void navigateTo(Sample element) { }
		});
		this.tablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.tablecompositionRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.tablecompositionRequiredProperty.createControls(parent, widgetFactory);
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.tablecompositionRequiredProperty.setLayoutData(tablecompositionRequiredPropertyData);
		this.tablecompositionRequiredProperty.setLowerBound(1);
		this.tablecompositionRequiredProperty.setUpperBound(-1);
	}

	/**
	 * 
	 */
	protected void moveTablecompositionRequiredProperty(Sample element, int oldIndex, int newIndex) {
		EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		tablecompositionRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		tablecompositionRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToTablecompositionRequiredProperty() {
		// Start of user code addToTablecompositionRequiredProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionRequiredPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromTablecompositionRequiredProperty(Sample element) {
		// Start of user code for the removeFromTablecompositionRequiredProperty() method body
				EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				tablecompositionRequiredPropertyEditUtil.removeElement(element);
				tablecompositionRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editTablecompositionRequiredProperty(Sample element) {
		// Start of user code editTablecompositionRequiredProperty() method body
				EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionOptionalProperty = new ReferencesTable<Sample>(EefnrMessages.TotalSamplePropertiesEditionPart_TablecompositionOptionalPropertyLabel, new ReferencesTableListener<Sample>() {			
			public void handleAdd() { addToTablecompositionOptionalProperty();}
			public void handleEdit(Sample element) { editTablecompositionOptionalProperty(element); }
			public void handleMove(Sample element, int oldIndex, int newIndex) { moveTablecompositionOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(Sample element) { removeFromTablecompositionOptionalProperty(element); }
			public void navigateTo(Sample element) { }
		});
		this.tablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.tablecompositionOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.tablecompositionOptionalProperty.createControls(parent, widgetFactory);
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.tablecompositionOptionalProperty.setLayoutData(tablecompositionOptionalPropertyData);
		this.tablecompositionOptionalProperty.setLowerBound(0);
		this.tablecompositionOptionalProperty.setUpperBound(-1);
	}

	/**
	 * 
	 */
	protected void moveTablecompositionOptionalProperty(Sample element, int oldIndex, int newIndex) {
		EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		tablecompositionOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		tablecompositionOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToTablecompositionOptionalProperty() {
		// Start of user code addToTablecompositionOptionalProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionOptionalPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromTablecompositionOptionalProperty(Sample element) {
		// Start of user code for the removeFromTablecompositionOptionalProperty() method body
				EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				tablecompositionOptionalPropertyEditUtil.removeElement(element);
				tablecompositionOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editTablecompositionOptionalProperty(Sample element) {
		// Start of user code editTablecompositionOptionalProperty() method body
				EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createAdvancedreferencestableRequiredPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.advancedreferencestableRequiredProperty = new ReferencesTable<TotalSample>(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedreferencestableRequiredPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, advancedreferencestableRequiredPropertyFilters, advancedreferencestableRequiredPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!advancedreferencestableRequiredPropertyEditUtil.getVirtualList().contains(elem))
								advancedreferencestableRequiredPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableRequiredProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						advancedreferencestableRequiredProperty.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editAdvancedreferencestableRequiredProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedreferencestableRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedreferencestableRequiredProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedreferencestableRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedreferencestableRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedreferencestableRequiredProperty.createControls(parent, widgetFactory);
		GridData advancedreferencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableRequiredPropertyData.horizontalSpan = 3;
		this.advancedreferencestableRequiredProperty.setLayoutData(advancedreferencestableRequiredPropertyData);
		this.advancedreferencestableRequiredProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableRequiredProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		advancedreferencestableRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedreferencestableRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableRequiredProperty(TotalSample element) {
		// Start of user code for the removeFromAdvancedreferencestableRequiredProperty() method body
				EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				advancedreferencestableRequiredPropertyEditUtil.removeElement(element);
				advancedreferencestableRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableRequiredProperty(TotalSample element) {
		// Start of user code editAdvancedreferencestableRequiredProperty() method body		
				EObject editedElement = advancedreferencestableRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedreferencestableRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedreferencestableRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createAdvancedreferencestableOptionalPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.advancedreferencestableOptionalProperty = new ReferencesTable<TotalSample>(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedreferencestableOptionalPropertyLabel, new ReferencesTableListener<TotalSample>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<TotalSample> dialog = new TabElementTreeSelectionDialog<TotalSample>(resourceSet, advancedreferencestableOptionalPropertyFilters, advancedreferencestableOptionalPropertyBusinessFilters,
				"TotalSample", EefnrPackage.eINSTANCE.getTotalSample(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!advancedreferencestableOptionalPropertyEditUtil.getVirtualList().contains(elem))
								advancedreferencestableOptionalPropertyEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableOptionalProperty,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						advancedreferencestableOptionalProperty.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(TotalSample element) { editAdvancedreferencestableOptionalProperty(element); }
			public void handleMove(TotalSample element, int oldIndex, int newIndex) { moveAdvancedreferencestableOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(TotalSample element) { removeFromAdvancedreferencestableOptionalProperty(element); }
			public void navigateTo(TotalSample element) { }
		});
		this.advancedreferencestableOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedreferencestableOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedreferencestableOptionalProperty.createControls(parent, widgetFactory);
		GridData advancedreferencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedreferencestableOptionalPropertyData.horizontalSpan = 3;
		this.advancedreferencestableOptionalProperty.setLayoutData(advancedreferencestableOptionalPropertyData);
		this.advancedreferencestableOptionalProperty.disableMove();
	}

	/**
	 * 
	 */
	protected void moveAdvancedreferencestableOptionalProperty(TotalSample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		advancedreferencestableOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedreferencestableOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAdvancedreferencestableOptionalProperty(TotalSample element) {
		// Start of user code for the removeFromAdvancedreferencestableOptionalProperty() method body
				EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				advancedreferencestableOptionalPropertyEditUtil.removeElement(element);
				advancedreferencestableOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedreferencestableOptionalProperty(TotalSample element) {
		// Start of user code editAdvancedreferencestableOptionalProperty() method body		
				EObject editedElement = advancedreferencestableOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedreferencestableOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedreferencestableOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedreferencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createAdvancedeobjectflatcomboviewerRequiredProperyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerRequiredProperyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerRequiredPropery, EefnrViewsRepository.FORM_KIND));
		advancedeobjectflatcomboviewerRequiredPropery = new EObjectFlatComboViewer(parent, false);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerRequiredPropery, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdvancedeobjectflatcomboviewerRequiredPropery()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerRequiredPropery, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createAdvancedeobjectflatcomboviewerOptionalProperyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedeobjectflatcomboviewerOptionalProperyLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerOptionalPropery, EefnrViewsRepository.FORM_KIND));
		advancedeobjectflatcomboviewerOptionalPropery = new EObjectFlatComboViewer(parent, true);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerOptionalPropery, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdvancedeobjectflatcomboviewerOptionalPropery()));
			}

		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedeobjectflatcomboviewerOptionalPropery, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAdvancedtablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.advancedtablecompositionRequiredProperty = new ReferencesTable<Sample>(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedtablecompositionRequiredPropertyLabel, new ReferencesTableListener<Sample>() {			
			public void handleAdd() { addToAdvancedtablecompositionRequiredProperty();}
			public void handleEdit(Sample element) { editAdvancedtablecompositionRequiredProperty(element); }
			public void handleMove(Sample element, int oldIndex, int newIndex) { moveAdvancedtablecompositionRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(Sample element) { removeFromAdvancedtablecompositionRequiredProperty(element); }
			public void navigateTo(Sample element) { }
		});
		this.advancedtablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedtablecompositionRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedtablecompositionRequiredProperty.createControls(parent, widgetFactory);
		GridData advancedtablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionRequiredProperty.setLayoutData(advancedtablecompositionRequiredPropertyData);
		this.advancedtablecompositionRequiredProperty.setLowerBound(1);
		this.advancedtablecompositionRequiredProperty.setUpperBound(-1);
	}

	/**
	 * 
	 */
	protected void moveAdvancedtablecompositionRequiredProperty(Sample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
		advancedtablecompositionRequiredPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedtablecompositionRequiredProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAdvancedtablecompositionRequiredProperty() {
		// Start of user code addToAdvancedtablecompositionRequiredProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionRequiredPropertyEditUtil.addElement(propertiesEditionObject);
						advancedtablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAdvancedtablecompositionRequiredProperty(Sample element) {
		// Start of user code for the removeFromAdvancedtablecompositionRequiredProperty() method body
				EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				advancedtablecompositionRequiredPropertyEditUtil.removeElement(element);
				advancedtablecompositionRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedtablecompositionRequiredProperty(Sample element) {
		// Start of user code editAdvancedtablecompositionRequiredProperty() method body
				EObject editedElement = advancedtablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedtablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAdvancedtablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.advancedtablecompositionOptionalProperty = new ReferencesTable<Sample>(EefnrMessages.TotalSamplePropertiesEditionPart_AdvancedtablecompositionOptionalPropertyLabel, new ReferencesTableListener<Sample>() {			
			public void handleAdd() { addToAdvancedtablecompositionOptionalProperty();}
			public void handleEdit(Sample element) { editAdvancedtablecompositionOptionalProperty(element); }
			public void handleMove(Sample element, int oldIndex, int newIndex) { moveAdvancedtablecompositionOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(Sample element) { removeFromAdvancedtablecompositionOptionalProperty(element); }
			public void navigateTo(Sample element) { }
		});
		this.advancedtablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.advancedtablecompositionOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.advancedtablecompositionOptionalProperty.createControls(parent, widgetFactory);
		GridData advancedtablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		advancedtablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.advancedtablecompositionOptionalProperty.setLayoutData(advancedtablecompositionOptionalPropertyData);
		this.advancedtablecompositionOptionalProperty.setLowerBound(0);
		this.advancedtablecompositionOptionalProperty.setUpperBound(-1);
	}

	/**
	 * 
	 */
	protected void moveAdvancedtablecompositionOptionalProperty(Sample element, int oldIndex, int newIndex) {
		EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
		advancedtablecompositionOptionalPropertyEditUtil.moveElement(element, oldIndex, newIndex);
		advancedtablecompositionOptionalProperty.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAdvancedtablecompositionOptionalProperty() {
		// Start of user code addToAdvancedtablecompositionOptionalProperty() method body
				Sample eObject = EefnrFactory.eINSTANCE.createSample();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionOptionalPropertyEditUtil.addElement(propertiesEditionObject);
						advancedtablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAdvancedtablecompositionOptionalProperty(Sample element) {
		// Start of user code for the removeFromAdvancedtablecompositionOptionalProperty() method body
				EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				advancedtablecompositionOptionalPropertyEditUtil.removeElement(element);
				advancedtablecompositionOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAdvancedtablecompositionOptionalProperty(Sample element) {
		// Start of user code editAdvancedtablecompositionOptionalProperty() method body
				EObject editedElement = advancedtablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						advancedtablecompositionOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						advancedtablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.advancedtablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TotalSamplePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TotalSample.name, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TotalSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TotalSample.name, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) radioRequiredProperty.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initRadioRequiredProperty(EEnum eenum, Enumerator current)
	 */
	public void initRadioRequiredProperty(EEnum eenum, Enumerator current) {
		radioRequiredProperty.setInput(eenum.getELiterals());
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
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) radioOptionalProperty.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initRadioOptionalProperty(EEnum eenum, Enumerator current)
	 */
	public void initRadioOptionalProperty(EEnum eenum, Enumerator current) {
		radioOptionalProperty.setInput(eenum.getELiterals());
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEobjectflatcomboviewerRequiredProperty(ResourceSet allResources, EObject current)
	 */
	public void initEobjectflatcomboviewerRequiredProperty(ResourceSet allResources, EObject current) {
		eobjectflatcomboviewerRequiredProperty.setInput(allResources);
		if (current != null) {
			eobjectflatcomboviewerRequiredProperty.setSelection(new StructuredSelection(current));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEobjectflatcomboviewerOptionalProperty(ResourceSet allResources, EObject current)
	 */
	public void initEobjectflatcomboviewerOptionalProperty(ResourceSet allResources, EObject current) {
		eobjectflatcomboviewerOptionalProperty.setInput(allResources);
		if (current != null) {
			eobjectflatcomboviewerOptionalProperty.setSelection(new StructuredSelection(current));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableRequiredPropertyToAdd()
	 * 
	 */
	public List getReferencestableRequiredPropertyToAdd() {
		return referencestableRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableRequiredPropertyToRemove()
	 * 
	 */
	public List getReferencestableRequiredPropertyToRemove() {
		return referencestableRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableRequiredPropertyTable()
	 * 
	 */
	public List getReferencestableRequiredPropertyTable() {
		return referencestableRequiredPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initReferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			referencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			referencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.referencestableRequiredProperty.setInput(referencestableRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateReferencestableRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateReferencestableRequiredProperty(EObject newValue) {
		if(referencestableRequiredPropertyEditUtil != null){
			referencestableRequiredPropertyEditUtil.reinit(newValue);
			referencestableRequiredProperty.refresh();
		}
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
		return referencestableRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableOptionalPropertyToAdd()
	 * 
	 */
	public List getReferencestableOptionalPropertyToAdd() {
		return referencestableOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableOptionalPropertyToRemove()
	 * 
	 */
	public List getReferencestableOptionalPropertyToRemove() {
		return referencestableOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getReferencestableOptionalPropertyTable()
	 * 
	 */
	public List getReferencestableOptionalPropertyTable() {
		return referencestableOptionalPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initReferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			referencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			referencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.referencestableOptionalProperty.setInput(referencestableOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateReferencestableOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateReferencestableOptionalProperty(EObject newValue) {
		if(referencestableOptionalPropertyEditUtil != null){
			referencestableOptionalPropertyEditUtil.reinit(newValue);
			referencestableOptionalProperty.refresh();
		}
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
		return referencestableOptionalPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getEmfcomboviewerRequiredProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) emfcomboviewerRequiredProperty.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEmfcomboviewerRequiredProperty(EEnum eenum, Enumerator current)
	 */
	public void initEmfcomboviewerRequiredProperty(EEnum eenum, Enumerator current) {
		emfcomboviewerRequiredProperty.setInput(eenum.getELiterals());
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
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) emfcomboviewerOptionalProperty.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initEmfcomboviewerOptionalProperty(EEnum eenum, Enumerator current)
	 */
	public void initEmfcomboviewerOptionalProperty(EEnum eenum, Enumerator current) {
		emfcomboviewerOptionalProperty.setInput(eenum.getELiterals());
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
	
	public void addToMultivaluededitorRequiredProperty(java.lang.String newValue) {
		multivaluededitorRequiredPropertyList.add(newValue);		
		if (newValue != null) {
			multivaluededitorRequiredProperty.setText(multivaluededitorRequiredPropertyList.toString());
		} else {
			multivaluededitorRequiredProperty.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMultivaluededitorRequiredProperty(java.lang.String newValue) {
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
	
	public void addToMultivaluededitorOptionalProperty(java.lang.String newValue) {
		multivaluededitorOptionalPropertyList.add(newValue);		
		if (newValue != null) {
			multivaluededitorOptionalProperty.setText(multivaluededitorOptionalPropertyList.toString());
		} else {
			multivaluededitorOptionalProperty.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMultivaluededitorOptionalProperty(java.lang.String newValue) {
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToAdd()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToAdd() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToRemove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToRemove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionRequiredPropertyToEdit() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToMove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToMove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionRequiredPropertyTable()
	 * 
	 */
	public List getTablecompositionRequiredPropertyTable() {
		return tablecompositionRequiredPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.tablecompositionRequiredProperty.setInput(tablecompositionRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateTablecompositionRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateTablecompositionRequiredProperty(EObject newValue) {
		if(tablecompositionRequiredPropertyEditUtil != null){
			tablecompositionRequiredPropertyEditUtil.reinit(newValue);
			tablecompositionRequiredProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
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
		return tablecompositionRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToAdd()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToAdd() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToRemove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToRemove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionOptionalPropertyToEdit() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToMove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToMove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getTablecompositionOptionalPropertyTable()
	 * 
	 */
	public List getTablecompositionOptionalPropertyTable() {
		return tablecompositionOptionalPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			tablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			tablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.tablecompositionOptionalProperty.setInput(tablecompositionOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateTablecompositionOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateTablecompositionOptionalProperty(EObject newValue) {
		if(tablecompositionOptionalPropertyEditUtil != null){
			tablecompositionOptionalPropertyEditUtil.reinit(newValue);
			tablecompositionOptionalProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
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
		return tablecompositionOptionalPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyToAdd()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyToAdd() {
		return advancedreferencestableRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyToRemove()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyToRemove() {
		return advancedreferencestableRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableRequiredPropertyTable()
	 * 
	 */
	public List getAdvancedreferencestableRequiredPropertyTable() {
		return advancedreferencestableRequiredPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedreferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedreferencestableRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedreferencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedreferencestableRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedreferencestableRequiredProperty.setInput(advancedreferencestableRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedreferencestableRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedreferencestableRequiredProperty(EObject newValue) {
		if(advancedreferencestableRequiredPropertyEditUtil != null){
			advancedreferencestableRequiredPropertyEditUtil.reinit(newValue);
			advancedreferencestableRequiredProperty.refresh();
		}
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
		return advancedreferencestableRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyToAdd()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyToAdd() {
		return advancedreferencestableOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyToRemove()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyToRemove() {
		return advancedreferencestableOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedreferencestableOptionalPropertyTable()
	 * 
	 */
	public List getAdvancedreferencestableOptionalPropertyTable() {
		return advancedreferencestableOptionalPropertyEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedreferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedreferencestableOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedreferencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedreferencestableOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedreferencestableOptionalProperty.setInput(advancedreferencestableOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedreferencestableOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedreferencestableOptionalProperty(EObject newValue) {
		if(advancedreferencestableOptionalPropertyEditUtil != null){
			advancedreferencestableOptionalPropertyEditUtil.reinit(newValue);
			advancedreferencestableOptionalProperty.refresh();
		}
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
		return advancedreferencestableOptionalPropertyEditUtil.contains(element);
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerRequiredPropery(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewerRequiredPropery(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewerRequiredPropery.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewerRequiredPropery.setSelection(new StructuredSelection(current));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedeobjectflatcomboviewerOptionalPropery(ResourceSet allResources, EObject current)
	 */
	public void initAdvancedeobjectflatcomboviewerOptionalPropery(ResourceSet allResources, EObject current) {
		advancedeobjectflatcomboviewerOptionalPropery.setInput(allResources);
		if (current != null) {
			advancedeobjectflatcomboviewerOptionalPropery.setSelection(new StructuredSelection(current));
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToAdd()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToAdd() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToRemove()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToRemove() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToEdit()
	 * 
	 */
	public Map getAdvancedtablecompositionRequiredPropertyToEdit() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyToMove()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyToMove() {
		return advancedtablecompositionRequiredPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionRequiredPropertyTable()
	 * 
	 */
	public List getAdvancedtablecompositionRequiredPropertyTable() {
		return advancedtablecompositionRequiredPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedtablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedtablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedtablecompositionRequiredPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedtablecompositionRequiredProperty.setInput(advancedtablecompositionRequiredPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedtablecompositionRequiredProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedtablecompositionRequiredProperty(EObject newValue) {
		if(advancedtablecompositionRequiredPropertyEditUtil != null){
			advancedtablecompositionRequiredPropertyEditUtil.reinit(newValue);
			advancedtablecompositionRequiredProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedtablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionRequiredProperty(ViewerFilter filter) {
		advancedtablecompositionRequiredPropertyFilters.add(filter);
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
		return advancedtablecompositionRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToAdd()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToAdd() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToRemove()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToRemove() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToEdit()
	 * 
	 */
	public Map getAdvancedtablecompositionOptionalPropertyToEdit() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyToMove()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyToMove() {
		return advancedtablecompositionOptionalPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#getAdvancedtablecompositionOptionalPropertyTable()
	 * 
	 */
	public List getAdvancedtablecompositionOptionalPropertyTable() {
		return advancedtablecompositionOptionalPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#initAdvancedtablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAdvancedtablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			advancedtablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			advancedtablecompositionOptionalPropertyEditUtil = new EMFListEditUtil(current, feature);
		this.advancedtablecompositionOptionalProperty.setInput(advancedtablecompositionOptionalPropertyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#updateAdvancedtablecompositionOptionalProperty(EObject newValue)
	 * 
	 */
	public void updateAdvancedtablecompositionOptionalProperty(EObject newValue) {
		if(advancedtablecompositionOptionalPropertyEditUtil != null){
			advancedtablecompositionOptionalPropertyEditUtil.reinit(newValue);
			advancedtablecompositionOptionalProperty.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TotalSamplePropertiesEditionPart#addFilterAdvancedtablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdvancedtablecompositionOptionalProperty(ViewerFilter filter) {
		advancedtablecompositionOptionalPropertyFilters.add(filter);
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
		return advancedtablecompositionOptionalPropertyEditUtil.contains(element);
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
