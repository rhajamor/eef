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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
public class TableCompositionExtensionEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, TableCompositionExtensionEditorSamplePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable tablecompositionRequiredProperty;
	protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable tablecompositionOptionalProperty;
	protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public TableCompositionExtensionEditorSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
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
		CompositionSequence tableCompositionExtensionEditorSampleStep = new CompositionSequence();
		CompositionStep propertiesStep = tableCompositionExtensionEditorSampleStep.addStep(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name);
		propertiesStep.addStep(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty);
		
		
		composer = new PartComposer(tableCompositionExtensionEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty) {
					return createTablecompositionRequiredPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty) {
					return createTablecompositionOptionalPropertyTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_NameLabel, propertiesEditingComponent.isRequired(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name, EefnrViewsRepository.FORM_KIND));
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.name, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionRequiredProperty = new ReferencesTable(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionRequiredPropertyLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, null));
				tablecompositionRequiredProperty.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.EDIT, null, element));
				tablecompositionRequiredProperty.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
				tablecompositionRequiredProperty.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
				tablecompositionRequiredProperty.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.tablecompositionRequiredPropertyFilters) {
			this.tablecompositionRequiredProperty.addFilter(filter);
		}
		this.tablecompositionRequiredProperty.setHelpText(propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, EefnrViewsRepository.FORM_KIND));
		this.tablecompositionRequiredProperty.createControls(parent, widgetFactory);
		this.tablecompositionRequiredProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.tablecompositionRequiredProperty.setLayoutData(tablecompositionRequiredPropertyData);
		this.tablecompositionRequiredProperty.setLowerBound(1);
		this.tablecompositionRequiredProperty.setUpperBound(-1);
		tablecompositionRequiredProperty.setID(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionRequiredProperty);
		tablecompositionRequiredProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionOptionalProperty = new ReferencesTable(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionOptionalPropertyLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, null));
				tablecompositionOptionalProperty.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.EDIT, null, element));
				tablecompositionOptionalProperty.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
				tablecompositionOptionalProperty.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
				tablecompositionOptionalProperty.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.tablecompositionOptionalPropertyFilters) {
			this.tablecompositionOptionalProperty.addFilter(filter);
		}
		this.tablecompositionOptionalProperty.setHelpText(propertiesEditingComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.tablecompositionOptionalProperty.createControls(parent, widgetFactory);
		this.tablecompositionOptionalProperty.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.tablecompositionOptionalProperty.setLayoutData(tablecompositionOptionalPropertyData);
		this.tablecompositionOptionalProperty.setLowerBound(0);
		this.tablecompositionOptionalProperty.setUpperBound(-1);
		tablecompositionOptionalProperty.setID(EefnrViewsRepository.TableCompositionExtensionEditorSample.Properties.tablecompositionOptionalProperty);
		tablecompositionOptionalProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionRequiredProperty()
	 * 
	 */
	public void updateTablecompositionRequiredProperty() {
	tablecompositionRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#isContainedInTablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionOptionalProperty()
	 * 
	 */
	public void updateTablecompositionOptionalProperty() {
	tablecompositionOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#isContainedInTablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionOptionalProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TableCompositionExtensionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
