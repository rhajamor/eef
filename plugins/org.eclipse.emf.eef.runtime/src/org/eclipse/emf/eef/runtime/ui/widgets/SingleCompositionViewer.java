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
package org.eclipse.emf.eef.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditingViewer;
import org.eclipse.emf.eef.runtime.util.EEFUtils;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.SharedScrolledComposite;

/**
 * @param <T>
 */
public class SingleCompositionViewer<T extends EObject> extends Composite {

	EObjectFlatComboViewer comboViewer;

	/**
	 * The Form tool kit use to use this widget in an Eclipse Forms compliant mode
	 */
	private FormToolkit widgetFactory;

	/**
	 * The adapter factory.
	 */
	private AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * The viewer to display the feature.
	 */
	private PropertiesEditingViewer viewer;

	/**
	 * 
	 */
	private Button setActiveEEFViewerCheckBox;

	/**
	 * The label of the feature.
	 */
	private Label label;

	/**
	 * The top part of the feature (usually the checkbox and the flat combo viewer).
	 */
	private Composite top;

	/**
	 * 
	 */
	private ArrayList<EObject> instanciableObjectsInHierarchy;

	/**
	 * The kind of the part.
	 */
	private int kind;

	private EditingDomain editingDomain;

	private String labelText;

	private boolean isRequired;

	private List<ISelectionChangedListener> comboListeners = new ArrayList<ISelectionChangedListener>();

	/**
	 * The constructor of the single composition viewer.
	 * 
	 * @param label
	 *            the label of the feature represented by this widget.
	 * @param parent
	 *            the parent composite.
	 * @param style
	 *            the SWT style.
	 * @param widgetFactory
	 *            the widget factory needed to create all contained widgets.
	 * @param kind
	 *            the kind of the part.
	 */
	public SingleCompositionViewer(String label, Composite parent, int style, FormToolkit widgetFactory,
			int kind, boolean isRequired) {
		super(parent, style);
		this.layout(true);
		this.isRequired = isRequired;
		this.labelText = label;
		this.widgetFactory = widgetFactory;
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		this.setLayout(layout);
		createTop(label);
		this.kind = kind;
	}

	/**
	 * Creates the top part of the single composition viewer. The top includes the check box to activate or
	 * not the widget and the flat combo viewer to select what kind of object to instantiate.
	 * 
	 * @param label
	 *            the label of the feature
	 */
	private void createTop(String label) {
		top = new Composite(this, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		top.setLayout(layout);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		top.setLayoutData(data);
		createCheckBox(top);
		createLabel(label, top);
		createFlatComboViewer(top);

	}

	/**
	 * This method is used to re-create the top part without the checkbox. The reason to do this is that the
	 * feature lower bound is higher than 1. In this case, the single composition viewer cannot be disable.
	 */
	private void resetTopWithoutCheckBox() {
		top.dispose();
		setActiveEEFViewerCheckBox = null;
		top = new Composite(this, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		top.setLayout(layout);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		top.setLayoutData(data);
		createLabel(labelText, top);
		createFlatComboViewer(top);
		for (ISelectionChangedListener listener : comboListeners)
			comboViewer.addSelectionChangedListener(listener);

	}

	/**
	 * Creates the label on the top left-side.
	 * 
	 * @param label
	 *            The text to display.
	 * @param top
	 *            the top part.
	 */
	private void createLabel(String label, Composite top) {
		this.label = new Label(top, SWT.NONE);
		if (isRequired)
			this.label.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		this.label.setText(label);

	}

	/**
	 * Create the check box.
	 * 
	 * @param top
	 *            the top part.
	 */
	private void createCheckBox(Composite top) {
		setActiveEEFViewerCheckBox = new Button(top, SWT.CHECK);

	}

	/**
	 * Create the flat combo viewer.
	 * 
	 * @param top
	 *            the top part.
	 */
	private void createFlatComboViewer(Composite top) {
		comboViewer = new EObjectFlatComboViewer(top, false);
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		comboViewer.setEnabled(true);
		GridData matchData = new GridData(GridData.FILL_HORIZONTAL);
		comboViewer.setLayoutData(matchData);
		if (setActiveEEFViewerCheckBox != null) {
			comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					setActiveEEFViewerCheckBox.setSelection(true);

				}
			});

			setActiveEEFViewerCheckBox.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if (getCheckBoxSelection())
						comboViewer.getSelectionAdapter(false).widgetSelected(e);

				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}
	}

	/**
	 * Creates the viewer that will display the selected object properties.
	 * 
	 * @param kind
	 *            the kind of the part.
	 */
	private void createViewer(int kind) {
		GridData viewerStrategyData = new GridData(GridData.FILL_HORIZONTAL);
		viewerStrategyData.horizontalSpan = 3;
		this.viewer = new PropertiesEditingViewer(this, null, SWT.BORDER, kind);
		viewer.getControl().setLayoutData(viewerStrategyData);
		if (widgetFactory != null)
			viewer.setToolkit(widgetFactory);
		viewer.setDynamicTabHeader(true);
	}

	/**
	 * Update the single composition viewer with the given new eObject.
	 * 
	 * @param newValue
	 *            the new selected eObject.
	 */
	public void update(EObject newValue) {
		if (newValue != null)
			comboViewer.setSelection(new StructuredSelection(newValue));
		else
			clearComboViewer();
		updateEEFViewer(newValue);
		refresh();
	}

	/**
	 * @param newValue
	 */
	private void updateEEFViewer(EObject newValue) {
		if (viewer == null && hasFeatures(newValue)) {
			createViewer(kind);
			initViewer(editingDomain);
		}

		if (viewer != null) {
			viewer.setInput(newValue);
			if (!hasFeatures(newValue)) {
				viewer.getControl().dispose();
				viewer = null;
			} else
				viewer.getControl().setVisible(true);
		}
	}

	/**
	 * Clear the combo viewer selection.
	 */
	private void clearComboViewer() {

		comboViewer.selectedElement = null;
		comboViewer.initComponent();
	}

	/**
	 * Set the input feature of the viewer.
	 * 
	 * @param current
	 *            the eObject of the feature.
	 * @param feature
	 *            the feature to display.
	 * @param allResources
	 *            the resource set required to get all instanciable types in the hierarchy of the feature
	 *            type.
	 */
	public void setInput(EObject current, EReference feature, ResourceSet allResources) {

		List<EClass> instanciableTypesInHierarchy = EEFUtils.instanciableTypesInHierarchy(feature.getEType(),
				allResources);

		instanciableObjectsInHierarchy = new ArrayList<EObject>();
		for (EClass eClass : instanciableTypesInHierarchy) {
			instanciableObjectsInHierarchy.add(EcoreUtil.create(eClass));
		}
		if (feature.getLowerBound() > 0) {
			resetTopWithoutCheckBox();
		}
		comboViewer.setInput(instanciableObjectsInHierarchy);
		if (instanciableObjectsInHierarchy.size() == 1) {
			comboViewer.setVisible(false);
		}

	}

	/**
	 * Returns the current Object selected by the flat combo viewer.
	 * 
	 * @return the selected eObject.
	 */
	public EObject getElement() {
		if (comboViewer.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection)comboViewer.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				if (kind == 0 && viewer != null) {
					firstElement = viewer.getInput();
				}
				return (EObject)firstElement;
			}
		}
		return null;
	}

	/**
	 * Adds a selection change listener on the combo viewer.
	 * 
	 * @param listener
	 *            the selection changed listener.
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		comboViewer.addSelectionChangedListener(listener);
		this.comboListeners.add(listener);
	}

	/**
	 * Adds a selection listener on the check box.
	 * 
	 * @param selectionListener
	 *            the selection listener.
	 */
	public void addCheckBoxSelectionListener(SelectionListener selectionListener) {
		if (setActiveEEFViewerCheckBox != null)
			setActiveEEFViewerCheckBox.addSelectionListener(selectionListener);
	}

	/**
	 * @param provider
	 */
	public void setLabelProvider(AdapterFactoryLabelProvider provider) {
		comboViewer.setLabelProvider(provider);
	}

	/**
	 * @param structuredSelection
	 * @param feature
	 */
	public void setSelection(StructuredSelection structuredSelection, EReference feature) {
		EObject selectedObject = (EObject)((EObject)structuredSelection.getFirstElement()).eGet(feature);
		if (selectedObject != null) {
			StructuredSelection selection = new StructuredSelection(selectedObject);
			comboViewer.setSelection(selection);
			if (hasFeatures(selectedObject)) {
				if (viewer == null)
					createViewer(kind);
				initViewer(editingDomain);
				viewer.setInput(selectedObject);
			}
			if (setActiveEEFViewerCheckBox != null)
				setActiveEEFViewerCheckBox.setSelection(true);
		}
		comboViewer.initComponent();
	}

	/**
	 * @param editingDomain
	 */
	private void initViewer(EditingDomain editingDomain) {
		if (editingDomain != null)
			viewer.setContentProvider(new PropertiesEditingContentProvider(adapterFactory,
					PropertiesEditingComponent.LIVE_MODE, editingDomain));
		else {
			try {
				viewer.setContentProvider(new PropertiesEditingContentProvider(adapterFactory,
						PropertiesEditingComponent.BATCH_MODE));
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param editingDomain
	 */
	public void init(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;

	}

	/**
	 * @return
	 */
	public boolean getCheckBoxSelection() {
		return setActiveEEFViewerCheckBox.getSelection();
	}

	/**
	 * 
	 */
	public void refresh() {
		this.reflow();
		layout();
	}

	/**
	 * @param value
	 */
	public void setEnable(boolean value) {
		this.comboViewer.setEnabled(value);
		this.setActiveEEFViewerCheckBox.setEnabled(value);
	}

	/**
	 * Returns whether the given eObject has one feature at least. This method is usually used to know whether
	 * to display the check box or not.
	 * 
	 * @param eObject
	 *            the eObject.
	 * @return true if has one feature or more otherwise false.
	 */
	private boolean hasFeatures(EObject eObject) {
		if (eObject != null)
			return eObject.eClass().getEAllStructuralFeatures().size() > 0;
		return false;
	}

	/**
	 * Reflows this section and all the parents up the hierarchy until a SharedScrolledComposite is reached.
	 */
	protected void reflow() {
		Composite c = this;
		while (c != null) {
			c.setRedraw(false);
			c = c.getParent();
			if (c instanceof SharedScrolledComposite || c instanceof Shell) {
				break;
			}
		}
		c = this;
		while (c != null) {
			c.layout(true);
			c = c.getParent();
			if (c instanceof SharedScrolledComposite) {
				((SharedScrolledComposite)c).reflow(true);
				break;
			}
		}
		c = this;
		while (c != null) {
			c.setRedraw(true);
			c = c.getParent();
			if (c instanceof SharedScrolledComposite || c instanceof Shell) {
				break;
			}
		}
	}
}
