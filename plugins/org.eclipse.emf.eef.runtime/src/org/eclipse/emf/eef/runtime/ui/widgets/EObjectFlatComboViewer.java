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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EObjectFlatComboViewer extends Composite implements ISelectionProvider, IPropertiesFilteredWidget {

	private Text selection;

	protected Button editer;

	protected List<ViewerFilter> filters;

	private List<ISelectionChangedListener> listeners;

	protected List<ViewerFilter> bpFilters;

	protected Object selectedElement;

	protected ILabelProvider labelProvider;

	protected Object input;

	private ButtonsModeEnum button_mode = ButtonsModeEnum.BROWSE;

	public EObjectFlatComboViewer(Composite parent, final boolean nullable) {
		super(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		this.setLayout(layout);
		selection = new Text(this, SWT.BORDER);
		GridData selectionData = new GridData(GridData.FILL_HORIZONTAL);
		selection.setLayoutData(selectionData);
		selection.setEditable(false);
		EditingUtils.setEEFtype(selection, "eef::EObjectFlatComboViewer::field");
		editer = new Button(this, SWT.PUSH);
		editer.setText(EEFRuntimeUIMessages.EObjectFlatComboViewer_add_button); //$NON-NLS-1$

		filters = new ArrayList<ViewerFilter>();
		bpFilters = new ArrayList<ViewerFilter>();
		listeners = new ArrayList<ISelectionChangedListener>();

		editer.addSelectionListener(getSelectionAdapter(nullable));
		EditingUtils.setEEFtype(editer, "eef::EObjectFlatComboViewer::editbutton");

	}

	/**
	 * @param nullable
	 * @return
	 */
	protected SelectionAdapter getSelectionAdapter(final boolean nullable) {

		return new SelectionAdapter() {

			/*
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse
			 * .swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				switch (button_mode) {
					case BROWSE:
						if (input instanceof EObjectFlatComboSettings) {
							EMFModelViewerDialog dialog = new EMFModelViewerDialog(labelProvider, input,
									filters.isEmpty() ? null : filters, bpFilters.isEmpty() ? null
											: bpFilters, nullable, false) {

								public void process(IStructuredSelection selection) {
									if (selection == null) {
										selectedElement = null;
										initComponent();
										selectionChanged(new StructuredSelection(Collections.EMPTY_LIST));
									} else {
										selectedElement = selection.getFirstElement();
										initComponent();
										if (selectedElement != null)
											selectionChanged(new StructuredSelection(selectedElement));
										else
											selectionChanged(new StructuredSelection(Collections.EMPTY_LIST));
									}
								}
							};
							dialog.open();
						}
						break;

					default:
						break;
				}
			}
		};

	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	public ISelection getSelection() {
		if (selectedElement != null)
			return new StructuredSelection(selectedElement);
		return new StructuredSelection(Collections.EMPTY_LIST);
	}

	public void setLabelProvider(ILabelProvider provider) {
		this.labelProvider = provider;
	}

	public void setInput(Object input) {
		if (this.input != input) {
			this.input = input;
			this.selectedElement = null;
			this.selection.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * Sets the given ID to the EObjectFlatComboViewer
	 * 
	 * @param id
	 *            the id of the widget
	 */
	public void setID(Object id) {
		EditingUtils.setID(selection, id);
		EditingUtils.setID(editer, id);
	}

	/**
	 * @return the ID of the EObjectFlatComboViewer
	 */
	public Object getID() {
		return EditingUtils.getID(selection);
	}

	public void setSelection(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			this.selectedElement = ((StructuredSelection)selection).getFirstElement();
			initComponent();
		}
	}

	public void addFilter(ViewerFilter filter) {
		filters.add(filter);
	}

	public void addBusinessRuleFilter(ViewerFilter filter) {
		bpFilters.add(filter);
	}

	public void resetFilters() {
		filters.clear();
	}

	protected void initComponent() {
		if (selectedElement != null && selection != null) {
			if (labelProvider != null)
				selection.setText(labelProvider.getText(selectedElement));
			else
				selection.setText(selectedElement.toString());
		} else
			selection.setText(""); //$NON-NLS-1$
	}

	protected void selectionChanged(ISelection selection) {
		if (listeners != null && !listeners.isEmpty()) {
			for (ISelectionChangedListener nextListener : listeners) {
				nextListener.selectionChanged(new SelectionChangedEvent(this, selection));
			}
		}
	}

	public void removeBusinessRuleFilter(ViewerFilter filter) {
		bpFilters.remove(filter);
	}

	public void removeFilter(ViewerFilter filter) {
		filters.remove(filter);
	}

	public void setButtonMode(ButtonsModeEnum button_mode) {
		this.button_mode = button_mode;
	}
}
