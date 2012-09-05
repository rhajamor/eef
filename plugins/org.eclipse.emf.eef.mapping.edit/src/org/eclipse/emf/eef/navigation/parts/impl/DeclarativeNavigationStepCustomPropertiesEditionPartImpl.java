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
package org.eclipse.emf.eef.navigation.parts.impl;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep;
import org.eclipse.emf.eef.mapping.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.mapping.navigation.parts.impl.DeclarativeNavigationStepPropertiesEditionPartImpl;
import org.eclipse.emf.eef.mapping.navigation.providers.NavigationMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class DeclarativeNavigationStepCustomPropertiesEditionPartImpl extends DeclarativeNavigationStepPropertiesEditionPartImpl {

	public DeclarativeNavigationStepCustomPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * @param propertiesGroup
	 */
	protected Composite createFeatureFlatComboViewer(Composite parent) {

		SWTUtils.createPartLabel(parent,
				NavigationMessages.DeclarativeNavigationStepPropertiesEditionPart_FeatureLabel, true);
		feature = new EObjectFlatComboViewer(parent, false);
		feature.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		feature.addFilter(new ViewerFilter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
			 *      java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EReference);
			}

		});
		feature.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						DeclarativeNavigationStepCustomPropertiesEditionPartImpl.this,
						NavigationViewsRepository.DeclarativeNavigationStep.Properties.feature, PropertiesEditionEvent.COMMIT,
						PropertiesEditionEvent.SET, null, getFeature()));
				// TODO : firePropertyChanged has to call setFeature !
				// if (event.getSelection() instanceof StructuredSelection) {
				// Object selection = ((StructuredSelection)event.getSelection()).getFirstElement();
				// if (selection instanceof EReference) {
				// current.setFeature((EReference) selection);
				setDiscriminatorInput((DeclarativeNavigationStep)current, resourceSet);
				// }
				// }
			}

		});
		GridData featureData = new GridData(GridData.FILL_HORIZONTAL);
		feature.setLayoutData(featureData);
		SWTUtils.createHelpButton(parent, null, null); //$NON-NLS-1$
		return parent;
	}

}
