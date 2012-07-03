/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFModelViewerDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ReferencesTableSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ReferencesTableSamplePropertiesEditionPart {

	protected TableViewer referencestableRequiredProperty;
	protected Button addReferencestableRequiredProperty;
	protected Button removeReferencestableRequiredProperty;
	protected List<ViewerFilter> referencestableRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencestableRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected TableViewer referencestableOptionalProperty;
	protected Button addReferencestableOptionalProperty;
	protected Button removeReferencestableOptionalProperty;
	protected List<ViewerFilter> referencestableOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencestableOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ReferencesTableSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReferencesTableSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence referencesTableSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = referencesTableSampleStep.addStep(EefnrViewsRepository.ReferencesTableSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty);
		
		
		composer = new PartComposer(referencesTableSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.ReferencesTableSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty) {
					return createReferencestableRequiredPropertyReferencesTable(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty) {
					return createReferencestableOptionalPropertyReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(EefnrMessages.ReferencesTableSamplePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * 
	 */
	protected Composite createReferencestableRequiredPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		Label referencestableRequiredPropertyLabel = createDescription(parent, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty, EefnrMessages.ReferencesTableSamplePropertiesEditionPart_ReferencestableRequiredPropertyLabel);
		GridData referencestableRequiredPropertyLabelData = new GridData();
		referencestableRequiredPropertyLabelData.horizontalSpan = 3;
		referencestableRequiredPropertyLabel.setLayoutData(referencestableRequiredPropertyLabelData);
		referencestableRequiredProperty = createReferencestableRequiredPropertyViewer(parent, widgetFactory, adapterFactory);
		GridData referencestableRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableRequiredPropertyData.horizontalSpan = 2;
		referencestableRequiredPropertyData.minimumHeight = 120;
		referencestableRequiredPropertyData.heightHint = 120;
		referencestableRequiredProperty.getTable().setLayoutData(referencestableRequiredPropertyData);
		EditingUtils.setID(referencestableRequiredProperty.getTable(), EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty);
		EditingUtils.setEEFtype(referencestableRequiredProperty.getTable(), "eef::ReferencesTable::field"); //$NON-NLS-1$
		createReferencestableRequiredPropertyControlPanel(parent, widgetFactory);
		return parent;
	}

	/**
	 * 
	 */
	protected TableViewer createReferencestableRequiredPropertyViewer(Composite container, FormToolkit widgetFactory, AdapterFactory adapter) {
		org.eclipse.swt.widgets.Table table = widgetFactory.createTable(container, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessVerticalSpace = true;
		gd.verticalAlignment = GridData.FILL;
		table.setLayoutData(gd);
		table.setLinesVisible(true);
		// Start of user code for table referencestableRequiredProperty s columns definition
				TableColumn name = new TableColumn(table, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		TableViewer result = new TableViewer(table);
		result.setLabelProvider(new ITableLabelProvider() {

			// Start of user code for table referencestableRequiredProperty label provider
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
			
			
			// End of user code

			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

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
		return result;
	}

	/**
	 * 
	 */
	protected void createReferencestableRequiredPropertyControlPanel(Composite container, FormToolkit widgetFactory) {
		Composite result = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		result.setLayout(layout);
		addReferencestableRequiredProperty = widgetFactory.createButton(result, EefnrMessages.PropertiesEditionPart_AddListViewerLabel, SWT.NONE);
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addReferencestableRequiredProperty.setLayoutData(addData);
		addReferencestableRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				addReferencestableRequiredProperty();
			}

		});
		EditingUtils.setID(addReferencestableRequiredProperty, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty);
		EditingUtils.setEEFtype(addReferencestableRequiredProperty, "eef::ReferencesTable::addbutton"); //$NON-NLS-1$
		removeReferencestableRequiredProperty = widgetFactory.createButton(result, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, SWT.NONE);
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeReferencestableRequiredProperty.setLayoutData(removeData);
		removeReferencestableRequiredProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (referencestableRequiredProperty.getSelection() instanceof IStructuredSelection) {
					removeReferencestableRequiredProperty((IStructuredSelection) referencestableRequiredProperty.getSelection());
				}
			}

		});
		EditingUtils.setID(removeReferencestableRequiredProperty, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty);
		EditingUtils.setEEFtype(removeReferencestableRequiredProperty, "eef::ReferencesTable::removebutton"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void addReferencestableRequiredProperty() {

		EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), referencestableRequiredProperty.getInput(), referencestableRequiredPropertyFilters, referencestableRequiredPropertyBusinessFilters, false, true) {
			public void process(IStructuredSelection selection) {
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTableSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
			}

		};
		dialog.open();
		referencestableRequiredProperty.refresh();
	}

	/**
	 * @param selection the referencestableRequiredProperty to remove
	 * 
	 */
	protected void removeReferencestableRequiredProperty(IStructuredSelection selection) {
		for (Iterator iter = selection.iterator(); iter.hasNext();) {
			EObject elem = (EObject) iter.next();
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTableSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, elem));
		}
		referencestableRequiredProperty.refresh();
	}

	/**
	 * 
	 */
	protected Composite createReferencestableOptionalPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		Label referencestableOptionalPropertyLabel = createDescription(parent, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty, EefnrMessages.ReferencesTableSamplePropertiesEditionPart_ReferencestableOptionalPropertyLabel);
		GridData referencestableOptionalPropertyLabelData = new GridData();
		referencestableOptionalPropertyLabelData.horizontalSpan = 3;
		referencestableOptionalPropertyLabel.setLayoutData(referencestableOptionalPropertyLabelData);
		referencestableOptionalProperty = createReferencestableOptionalPropertyViewer(parent, widgetFactory, adapterFactory);
		GridData referencestableOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		referencestableOptionalPropertyData.horizontalSpan = 2;
		referencestableOptionalPropertyData.minimumHeight = 120;
		referencestableOptionalPropertyData.heightHint = 120;
		referencestableOptionalProperty.getTable().setLayoutData(referencestableOptionalPropertyData);
		EditingUtils.setID(referencestableOptionalProperty.getTable(), EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty);
		EditingUtils.setEEFtype(referencestableOptionalProperty.getTable(), "eef::ReferencesTable::field"); //$NON-NLS-1$
		createReferencestableOptionalPropertyControlPanel(parent, widgetFactory);
		return parent;
	}

	/**
	 * 
	 */
	protected TableViewer createReferencestableOptionalPropertyViewer(Composite container, FormToolkit widgetFactory, AdapterFactory adapter) {
		org.eclipse.swt.widgets.Table table = widgetFactory.createTable(container, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessVerticalSpace = true;
		gd.verticalAlignment = GridData.FILL;
		table.setLayoutData(gd);
		table.setLinesVisible(true);
		// Start of user code for table referencestableOptionalProperty s columns definition
				TableColumn name = new TableColumn(table, SWT.NONE);
				name.setWidth(80);
				name.setText("Label"); //$NON-NLS-1$
		
		// End of user code

		TableViewer result = new TableViewer(table);
		result.setLabelProvider(new ITableLabelProvider() {

			// Start of user code for table referencestableOptionalProperty label provider
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
			
			
			// End of user code

			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

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
		return result;
	}

	/**
	 * 
	 */
	protected void createReferencestableOptionalPropertyControlPanel(Composite container, FormToolkit widgetFactory) {
		Composite result = widgetFactory.createComposite(container, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		result.setLayout(layout);
		addReferencestableOptionalProperty = widgetFactory.createButton(result, EefnrMessages.PropertiesEditionPart_AddListViewerLabel, SWT.NONE);
		GridData addData = new GridData(GridData.FILL_HORIZONTAL);
		addReferencestableOptionalProperty.setLayoutData(addData);
		addReferencestableOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				addReferencestableOptionalProperty();
			}

		});
		EditingUtils.setID(addReferencestableOptionalProperty, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty);
		EditingUtils.setEEFtype(addReferencestableOptionalProperty, "eef::ReferencesTable::addbutton"); //$NON-NLS-1$
		removeReferencestableOptionalProperty = widgetFactory.createButton(result, EefnrMessages.PropertiesEditionPart_RemoveListViewerLabel, SWT.NONE);
		GridData removeData = new GridData(GridData.FILL_HORIZONTAL);
		removeReferencestableOptionalProperty.setLayoutData(removeData);
		removeReferencestableOptionalProperty.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (referencestableOptionalProperty.getSelection() instanceof IStructuredSelection) {
					removeReferencestableOptionalProperty((IStructuredSelection) referencestableOptionalProperty.getSelection());
				}
			}

		});
		EditingUtils.setID(removeReferencestableOptionalProperty, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty);
		EditingUtils.setEEFtype(removeReferencestableOptionalProperty, "eef::ReferencesTable::removebutton"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void addReferencestableOptionalProperty() {

		EMFModelViewerDialog dialog = new EMFModelViewerDialog(new AdapterFactoryLabelProvider(adapterFactory), referencestableOptionalProperty.getInput(), referencestableOptionalPropertyFilters, referencestableOptionalPropertyBusinessFilters, false, true) {
			public void process(IStructuredSelection selection) {
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTableSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
			}

		};
		dialog.open();
		referencestableOptionalProperty.refresh();
	}

	/**
	 * @param selection the referencestableOptionalProperty to remove
	 * 
	 */
	protected void removeReferencestableOptionalProperty(IStructuredSelection selection) {
		for (Iterator iter = selection.iterator(); iter.hasNext();) {
			EObject elem = (EObject) iter.next();
			propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencesTableSamplePropertiesEditionPartForm.this, EefnrViewsRepository.ReferencesTableSample.Properties.referencestableOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, elem));
		}
		referencestableOptionalProperty.refresh();
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
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#initReferencestableRequiredProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#updateReferencestableRequiredProperty()
	 * 
	 */
	public void updateReferencestableRequiredProperty() {
	referencestableRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#addFilterReferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencestableRequiredProperty(ViewerFilter filter) {
		referencestableRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#addBusinessFilterReferencestableRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencestableRequiredProperty(ViewerFilter filter) {
		referencestableRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#isContainedInReferencestableRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencestableRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)referencestableRequiredProperty.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#initReferencestableOptionalProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#updateReferencestableOptionalProperty()
	 * 
	 */
	public void updateReferencestableOptionalProperty() {
	referencestableOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#addFilterReferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencestableOptionalProperty(ViewerFilter filter) {
		referencestableOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#addBusinessFilterReferencestableOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencestableOptionalProperty(ViewerFilter filter) {
		referencestableOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.ReferencesTableSamplePropertiesEditionPart#isContainedInReferencestableOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencestableOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)referencestableOptionalProperty.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.ReferencesTableSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
