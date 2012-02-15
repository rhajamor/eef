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
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.DeferedReferencesTableSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
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
public class DeferedReferencesTableSampleEditorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String DEFEREDREFERENCESTABLESAMPLE_PART = "DeferedReferencesTableSample"; //$NON-NLS-1$

	
	/**
	 * Settings for flatReferencesTableSampleEditor ReferencesTable
	 */
	private	ReferencesTableSettings flatReferencesTableSampleEditorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeferedReferencesTableSampleEditorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deferedReferenceTableEditorSample, String editing_mode) {
		super(editingContext, deferedReferenceTableEditorSample, editing_mode);
		parts = new String[] { DEFEREDREFERENCESTABLESAMPLE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.DeferedReferencesTableSample.class;
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
			final DeferedReferenceTableEditorSample deferedReferenceTableEditorSample = (DeferedReferenceTableEditorSample)elt;
			final DeferedReferencesTableSamplePropertiesEditionPart deferedReferencesTableSamplePart = (DeferedReferencesTableSamplePropertiesEditionPart)editingPart;
			// init values
			if (deferedReferenceTableEditorSample.getName() != null && isAccessible(NavigationViewsRepository.DeferedReferencesTableSample.Properties.name))
				deferedReferencesTableSamplePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), deferedReferenceTableEditorSample.getName()));
			
			if (isAccessible(NavigationViewsRepository.DeferedReferencesTableSample.Properties.referencesTableSampleEditor)) {
				flatReferencesTableSampleEditorSettings = new ReferencesTableSettings(deferedReferenceTableEditorSample, NavigationPackage.eINSTANCE.getDeferedReferenceTableEditorSample_References(), NavigationPackage.eINSTANCE.getDeferedReference_FlatreferenceEditor());
				deferedReferencesTableSamplePart.initReferencesTableSampleEditor(flatReferencesTableSampleEditorSettings);
			}
			// init filters
			
			deferedReferencesTableSamplePart.addFilterToReferencesTableSampleEditor(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof TotalSample);
				}
			
			});
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
		if (event.getAffectedEditor() == NavigationViewsRepository.DeferedReferencesTableSample.Properties.referencesTableSampleEditor) {
			return (flatReferencesTableSampleEditorSettings.getValue() == null) ? (event.getNewValue() != null) : (!flatReferencesTableSampleEditorSettings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NavigationViewsRepository.DeferedReferencesTableSample.Properties.name) {
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
		DeferedReferenceTableEditorSample deferedReferenceTableEditorSample = (DeferedReferenceTableEditorSample)semanticObject;
		if (NavigationViewsRepository.DeferedReferencesTableSample.Properties.name == event.getAffectedEditor()) {
			deferedReferenceTableEditorSample.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NavigationViewsRepository.DeferedReferencesTableSample.Properties.referencesTableSampleEditor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TotalSample) {
					flatReferencesTableSampleEditorSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					flatReferencesTableSampleEditorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				flatReferencesTableSampleEditorSettings.move(event.getNewIndex(), (TotalSample) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DeferedReferencesTableSamplePropertiesEditionPart deferedReferencesTableSamplePart = (DeferedReferencesTableSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getAbstractSample_Name().equals(msg.getFeature()) && deferedReferencesTableSamplePart != null && isAccessible(NavigationViewsRepository.DeferedReferencesTableSample.Properties.name)) {
				if (msg.getNewValue() != null) {
					deferedReferencesTableSamplePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					deferedReferencesTableSamplePart.setName("");
				}
			}
			if (flatReferencesTableSampleEditorSettings.isAffectingFeature((EStructuralFeature)msg.getFeature()) && isAccessible(NavigationViewsRepository.DeferedReferencesTableSample.Properties.referencesTableSampleEditor)) {
				deferedReferencesTableSamplePart.updateReferencesTableSampleEditor();
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NavigationViewsRepository.DeferedReferencesTableSample.Properties.referencesTableSampleEditor;
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
				if (NavigationViewsRepository.DeferedReferencesTableSample.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefnrPackage.eINSTANCE.getAbstractSample_Name().getEAttributeType(), (String)newValue);
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
