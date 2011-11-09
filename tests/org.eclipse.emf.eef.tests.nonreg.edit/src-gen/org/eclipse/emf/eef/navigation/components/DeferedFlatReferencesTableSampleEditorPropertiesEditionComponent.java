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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.DeferedFlatReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class DeferedFlatReferencesTableSampleEditorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String DEFEREDFLATREFERENCESTABLESAMPLE_PART = "DeferedFlatReferencesTableSample"; //$NON-NLS-1$

	
	/**
	 * Settings for flatReferencesTableSampleEditor ReferencesTable
	 */
	private	ReferencesTableSettings flatReferencesTableSampleEditorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeferedFlatReferencesTableSampleEditorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deferedFlatReferenceTableEditorSample, String editing_mode) {
		super(editingContext, deferedFlatReferenceTableEditorSample, editing_mode);
		parts = new String[] { DEFEREDFLATREFERENCESTABLESAMPLE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.DeferedFlatReferencesTableSample.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final DeferedFlatReferenceTableEditorSample deferedFlatReferenceTableEditorSample = (DeferedFlatReferenceTableEditorSample)elt;
			final DeferedFlatReferencesTableSamplePropertiesEditionPart deferedFlatReferencesTableSamplePart = (DeferedFlatReferencesTableSamplePropertiesEditionPart)editingPart;
			// init values
			if (deferedFlatReferenceTableEditorSample.getName() != null && isAccessible(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name))
				deferedFlatReferencesTableSamplePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), deferedFlatReferenceTableEditorSample.getName()));
			
			if (isAccessible(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor)) {
				flatReferencesTableSampleEditorSettings = new ReferencesTableSettings(deferedFlatReferenceTableEditorSample, NavigationPackage.eINSTANCE.getDeferedFlatReferenceTableEditorSample_References(), NavigationPackage.eINSTANCE.getDeferedReference_FlatreferenceEditor());
				deferedFlatReferencesTableSamplePart.initFlatReferencesTableSampleEditor(flatReferencesTableSampleEditorSettings);
			}
			// init filters
			
			deferedFlatReferencesTableSamplePart.addFilterToFlatReferencesTableSampleEditor(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!deferedFlatReferencesTableSamplePart.isContainedInFlatReferencesTableSampleEditorTable((EObject)element));
					return false;
				}
			
			});
			deferedFlatReferencesTableSamplePart.addFilterToFlatReferencesTableSampleEditor(new EObjectStrictFilter(EefnrPackage.eINSTANCE.getTotalSample()));
			// Start of user code for additional businessfilters for flatReferencesTableSampleEditor
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent#shouldProcess(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	protected boolean shouldProcess(IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor) {
			return (flatReferencesTableSampleEditorSettings.getValue() == null) ? (event.getNewValue() != null) : (!flatReferencesTableSampleEditorSettings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name) {
			return EefnrPackage.eINSTANCE.getAbstractSample_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DeferedFlatReferenceTableEditorSample deferedFlatReferenceTableEditorSample = (DeferedFlatReferenceTableEditorSample)semanticObject;
		if (NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name == event.getAffectedEditor()) {
			deferedFlatReferenceTableEditorSample.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)
				flatReferencesTableSampleEditorSettings.setToReference((List<EObject>) event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DeferedFlatReferencesTableSamplePropertiesEditionPart deferedFlatReferencesTableSamplePart = (DeferedFlatReferencesTableSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAbstractSample_Name().equals(msg.getFeature()) && deferedFlatReferencesTableSamplePart != null && isAccessible(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name)) {
				if (msg.getNewValue() != null) {
					deferedFlatReferencesTableSamplePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					deferedFlatReferencesTableSamplePart.setName("");
				}
			}
			if (flatReferencesTableSampleEditorSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor))
				deferedFlatReferencesTableSamplePart.updateFlatReferencesTableSampleEditor();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.flatReferencesTableSampleEditor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (NavigationViewsRepository.DeferedFlatReferencesTableSample.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
