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
package org.eclipse.emf.eef.eefnr.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.TableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TableCompositionEditorSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for tablecompositionRequiredProperty ReferencesTable
	 */
	protected ReferencesTableSettings tablecompositionRequiredPropertySettings;
	
	/**
	 * Settings for tablecompositionOptionalProperty ReferencesTable
	 */
	protected ReferencesTableSettings tablecompositionOptionalPropertySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TableCompositionEditorSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject tableCompositionEditorSample, String editing_mode) {
		super(editingContext, tableCompositionEditorSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.TableCompositionEditorSample.class;
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
			final TableCompositionEditorSample tableCompositionEditorSample = (TableCompositionEditorSample)elt;
			final TableCompositionEditorSamplePropertiesEditionPart basePart = (TableCompositionEditorSamplePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty)) {
				tablecompositionRequiredPropertySettings = new ReferencesTableSettings(tableCompositionEditorSample, EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionRequiredProperty());
				basePart.initTablecompositionRequiredProperty(tablecompositionRequiredPropertySettings);
			}
			if (isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty)) {
				tablecompositionOptionalPropertySettings = new ReferencesTableSettings(tableCompositionEditorSample, EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionOptionalProperty());
				basePart.initTablecompositionOptionalProperty(tablecompositionOptionalPropertySettings);
			}
			// init filters
			if (isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty)) {
				basePart.addFilterToTablecompositionRequiredProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Sample);
					}
			
				});
				// Start of user code for additional businessfilters for tablecompositionRequiredProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							// End of user code
			}
			if (isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty)) {
				basePart.addFilterToTablecompositionOptionalProperty(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Sample); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for tablecompositionOptionalProperty
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty) {
			return EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionRequiredProperty();
		}
		if (editorKey == EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty) {
			return EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionOptionalProperty();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TableCompositionEditorSample tableCompositionEditorSample = (TableCompositionEditorSample)semanticObject;
		if (EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, tablecompositionRequiredPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				tablecompositionRequiredPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tablecompositionRequiredPropertySettings.move(event.getNewIndex(), (Sample) event.getNewValue());
			}
		}
		if (EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, tablecompositionOptionalPropertySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				tablecompositionOptionalPropertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tablecompositionOptionalPropertySettings.move(event.getNewIndex(), (Sample) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TableCompositionEditorSamplePropertiesEditionPart basePart = (TableCompositionEditorSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionRequiredProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty))
				basePart.updateTablecompositionRequiredProperty();
			if (EefnrPackage.eINSTANCE.getTableCompositionEditorSample_TablecompositionOptionalProperty().equals(msg.getFeature()) && isAccessible(EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionOptionalProperty))
				basePart.updateTablecompositionOptionalProperty();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.TableCompositionEditorSample.Properties.tablecompositionRequiredProperty;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
