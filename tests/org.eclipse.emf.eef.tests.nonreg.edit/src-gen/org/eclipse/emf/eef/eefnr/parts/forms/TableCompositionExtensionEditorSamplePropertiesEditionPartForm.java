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
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.policies.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
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
public class TableCompositionExtensionEditorSamplePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TableCompositionExtensionEditorSamplePropertiesEditionPart {

	protected Text name;
	protected EMFListEditUtil tablecompositionRequiredPropertyEditUtil;
		protected ReferencesTable<? extends EObject> tablecompositionRequiredProperty;
		protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil tablecompositionOptionalPropertyEditUtil;
		protected ReferencesTable<? extends EObject> tablecompositionOptionalProperty;
		protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TableCompositionExtensionEditorSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(widgetFactory, propertiesGroup);
		createTablecompositionRequiredPropertyTableComposition(widgetFactory, propertiesGroup);
		createTablecompositionOptionalPropertyTableComposition(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TableCompositionExtensionEditorSample.name, EefnrViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.name, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionRequiredPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionRequiredProperty = new ReferencesTable<AbstractTableCompositionTargetExtensionEditorSample>(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionRequiredPropertyLabel, new ReferencesTableListener<AbstractTableCompositionTargetExtensionEditorSample>() {			
			public void handleAdd() { addToTablecompositionRequiredProperty();}
			public void handleEdit(AbstractTableCompositionTargetExtensionEditorSample element) { editTablecompositionRequiredProperty(element); }
			public void handleMove(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) { moveTablecompositionRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(AbstractTableCompositionTargetExtensionEditorSample element) { removeFromTablecompositionRequiredProperty(element); }
			public void navigateTo(AbstractTableCompositionTargetExtensionEditorSample element) { }
		});
		this.tablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, EefnrViewsRepository.FORM_KIND));
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
	protected void moveTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void addToTablecompositionRequiredProperty() {
		// Start of user code addToTablecompositionRequiredProperty() method body
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(current);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(current);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EReferencePropertiesEditionContext(propertiesEditionComponent, EefnrPackage.eINSTANCE.getTableCompositionExtensionEditorSample_TablecompositionRequiredProperty(), resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionRequiredPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		// Start of user code for the removeFromTablecompositionRequiredProperty() method body
				EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				tablecompositionRequiredPropertyEditUtil.removeElement(element);
				tablecompositionRequiredProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		// Start of user code editTablecompositionRequiredProperty() method body
				EObject editedElement = tablecompositionRequiredPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionRequiredPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						tablecompositionRequiredProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionOptionalPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.tablecompositionOptionalProperty = new ReferencesTable<AbstractTableCompositionTargetExtensionEditorSample>(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionOptionalPropertyLabel, new ReferencesTableListener<AbstractTableCompositionTargetExtensionEditorSample>() {			
			public void handleAdd() { addToTablecompositionOptionalProperty();}
			public void handleEdit(AbstractTableCompositionTargetExtensionEditorSample element) { editTablecompositionOptionalProperty(element); }
			public void handleMove(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) { moveTablecompositionOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(AbstractTableCompositionTargetExtensionEditorSample element) { removeFromTablecompositionOptionalProperty(element); }
			public void navigateTo(AbstractTableCompositionTargetExtensionEditorSample element) { }
		});
		this.tablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, EefnrViewsRepository.FORM_KIND));
		this.tablecompositionOptionalProperty.createControls(parent, widgetFactory);
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.tablecompositionOptionalProperty.setLayoutData(tablecompositionOptionalPropertyData);
		this.tablecompositionOptionalProperty.setLowerBound(1);
		this.tablecompositionOptionalProperty.setUpperBound(-1);
	}

	/**
	 * 
	 */
	protected void moveTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void addToTablecompositionOptionalProperty() {
		// Start of user code addToTablecompositionOptionalProperty() method body
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(current);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(current);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EReferencePropertiesEditionContext(propertiesEditionComponent, EefnrPackage.eINSTANCE.getTableCompositionExtensionEditorSample_TablecompositionRequiredProperty(), resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionOptionalPropertyEditUtil.addElement(propertiesEditionObject);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		// Start of user code for the removeFromTablecompositionOptionalProperty() method body
				EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				tablecompositionOptionalPropertyEditUtil.removeElement(element);
				tablecompositionOptionalProperty.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		// Start of user code editTablecompositionOptionalProperty() method body
				EObject editedElement = tablecompositionOptionalPropertyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						tablecompositionOptionalPropertyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						tablecompositionOptionalProperty.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartForm.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToAdd()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToAdd() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToRemove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToRemove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionRequiredPropertyToEdit() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyToMove()
	 * 
	 */
	public List getTablecompositionRequiredPropertyToMove() {
		return tablecompositionRequiredPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionRequiredPropertyTable()
	 * 
	 */
	public List getTablecompositionRequiredPropertyTable() {
		return tablecompositionRequiredPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionRequiredProperty(EObject newValue)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
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
		return tablecompositionRequiredPropertyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToAdd()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToAdd() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToRemove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToRemove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToEdit()
	 * 
	 */
	public Map getTablecompositionOptionalPropertyToEdit() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyToMove()
	 * 
	 */
	public List getTablecompositionOptionalPropertyToMove() {
		return tablecompositionOptionalPropertyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getTablecompositionOptionalPropertyTable()
	 * 
	 */
	public List getTablecompositionOptionalPropertyTable() {
		return tablecompositionOptionalPropertyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionOptionalProperty(EObject newValue)
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
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
		return tablecompositionOptionalPropertyEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TableCompositionExtensionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
