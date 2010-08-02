/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.eef.codegen.ui.initializer.ui;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.eef.codegen.core.initializer.AbstractPropertiesInitializer;
import org.eclipse.emf.eef.codegen.core.services.PropertiesInitializerStrategyServices;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class InitializeEEFModelsDialog extends ContainerSelectionDialog {

	private ComboViewer strategies;

	private Label description;

	private AbstractPropertiesInitializer selectedStrategy;

	public InitializeEEFModelsDialog(Shell parentShell, IContainer initialRoot,
			boolean allowNewContainerName, String message) {
		super(parentShell, initialRoot, allowNewContainerName, message);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		Group strategyGroup = new Group(container, SWT.NONE);
		strategyGroup.setText("Strategy");
		GridData strategyGroupData = new GridData(GridData.FILL_BOTH);
		strategyGroup.setLayoutData(strategyGroupData);
		GridLayout strategyGroupLayout = new GridLayout();
		strategyGroupLayout.numColumns = 2;
		strategyGroup.setLayout(strategyGroupLayout);
		Label strategyLabel = new Label(strategyGroup, SWT.NONE);
		strategyLabel.setText("Strategy : ");
		strategies = new ComboViewer(strategyGroup);
		strategies.setContentProvider(new ArrayContentProvider());
		strategies.setLabelProvider(new LabelProvider() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof AbstractPropertiesInitializer) {
					return ((AbstractPropertiesInitializer)element).getName();
				}
				return super.getText(element);
			}
		});
		strategies.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection
						&& ((StructuredSelection)event.getSelection()).getFirstElement() instanceof AbstractPropertiesInitializer) {
					newStrategySelected((AbstractPropertiesInitializer)((StructuredSelection)event
							.getSelection()).getFirstElement());
				}
			}

		});
		description = new Label(strategyGroup, SWT.NONE);
		description.setText("No description entered ...");
		GridData descriptionData = new GridData();
		descriptionData.horizontalSpan = 2;
		description.setLayoutData(descriptionData);
		Group targetGroup = new Group(container, SWT.NONE);
		targetGroup.setText("Target");
		GridData targetGroupData = new GridData(GridData.FILL_BOTH);
		targetGroup.setLayoutData(targetGroupData);
		GridLayout targetGroupLayout = new GridLayout();
		targetGroup.setLayout(targetGroupLayout);
		super.createDialogArea(targetGroup);
		initStrategies();
		return container;
	}

	public AbstractPropertiesInitializer getInitializer() {
		return selectedStrategy;
	}

	protected void newStrategySelected(AbstractPropertiesInitializer firstElement) {
		description.setText(firstElement.getDescription());
		selectedStrategy = firstElement;
	}

	private void initStrategies() {
		List<AbstractPropertiesInitializer> strategies2 = PropertiesInitializerStrategyServices.getInstance()
				.getStrategies();
		strategies.setInput(strategies2);
		if (strategies2.size() > 0) {
			strategies.setSelection(new StructuredSelection(strategies2.get(0)));
			description.setText(strategies2.get(0).getDescription());
		}
	}

}
