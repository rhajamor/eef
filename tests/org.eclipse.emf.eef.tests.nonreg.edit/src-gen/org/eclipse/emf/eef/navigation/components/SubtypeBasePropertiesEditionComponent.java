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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.Owner;
import org.eclipse.emf.eef.eefnr.navigation.Subtype;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.eefnr.navigation.parts.SubtypePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SubtypeBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SubtypeBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject subtype, String editing_mode) {
		super(editingContext, subtype, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.Subtype.class;
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
			final Subtype subtype = (Subtype)elt;
			final SubtypePropertiesEditionPart basePart = (SubtypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NavigationViewsRepository.Subtype.Specialisation.specialisedElement)) {
				basePart.setSpecialisedElement(subtype.isSpecialisedElement());
			}
			// init filters
			
			// init values for referenced views
					basePart.getOwnerReferencedView().setContext(elt, allResource);
			
			// init filters for referenced views
			
			basePart.addFilterToMultipleSampleForTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 *
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for multipleSampleForTableComposition
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToMultipleSampleForAdvancedTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 *
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for multipleSampleForAdvancedTableComposition
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToMultipleSampleForReferencesTable(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for multipleSampleForReferencesTable
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToMultipleSampleForAdvancedReferencesTable(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for multipleSampleForAdvancedReferencesTable
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToMultipleSampleForFlatReferencesTable(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInMultipleSampleForFlatReferencesTableTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToMultipleSampleForFlatReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
			// Start of user code for additional businessfilters for multipleSampleForFlatReferencesTables
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToSingleSampleForTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof String)
							return element.equals(""); //$NON-NLS-1$ 
						if (element instanceof Owner)
							return true;
						return element instanceof Resource;
					}
			
			});
			// Start of user code for additional businessfilters for singleSampleForTableComposition
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToSingleSampleForAdvancedTableComposition(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof String)
							return element.equals(""); //$NON-NLS-1$ 
						if (element instanceof Owner)
							return true;
						return element instanceof Resource;
					}
			
			});
			// Start of user code for additional businessfilters for singleSampleForAdvancedTableComposition
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToSingleSampleForReferencesTable(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSingleSampleForReferencesTableTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToSingleSampleForReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
			// Start of user code for additional businessfilters for singleSampleForReferencesTable
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToSingleSampleForAdvancedReferencesTable(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSingleSampleForAdvancedReferencesTableTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToSingleSampleForAdvancedReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
			// Start of user code for additional businessfilters for singleSampleForAdvancedReferencesTable
																																																																																																
																																																																																																// End of user code
			
			basePart.addFilterToSingleSampleForFlatReferencesTable(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSingleSampleForFlatReferencesTableTable((EObject)element));
					return element instanceof String && element.equals("");
				}
			
			});
			basePart.addFilterToSingleSampleForFlatReferencesTable(new EObjectStrictFilter(NavigationPackage.eINSTANCE.getOwner()));
			// Start of user code for additional businessfilters for singleSampleForFlatReferencesTable
																																																																																																
																																																																																																// End of user code
			
			
			basePart.addFilterToSingleReferencesForEObjectFlatComboViewer(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Owner); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for singleReferenceForEObjectFlatComboViewer
																																																																																																
																																																																																																// End of user code
			
			
			basePart.addFilterToSingleReferencesForAdvancedEObjectFlatComboViewer(new EObjectFilter(NavigationPackage.eINSTANCE.getOwner()));
			
		}
		setInitializing(false);
	}



















	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NavigationViewsRepository.Subtype.Specialisation.specialisedElement) {
			return NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Subtype subtype = (Subtype)semanticObject;
		if (NavigationViewsRepository.Subtype.Specialisation.specialisedElement == event.getAffectedEditor()) {
			subtype.setSpecialisedElement((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SubtypePropertiesEditionPart basePart = (SubtypePropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement().equals(msg.getFeature()) && basePart != null && isAccessible(NavigationViewsRepository.Subtype.Specialisation.specialisedElement))
				basePart.setSpecialisedElement((Boolean)msg.getNewValue());
			
			
		}
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
				if (NavigationViewsRepository.Subtype.Specialisation.specialisedElement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.Owner.Properties.name == event.getAffectedEditor()) {
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
