/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.SimpleModelNavigationPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SimpleModelNavigationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for feature EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings featureSettings;
	
	/**
	 * Settings for discriminatorType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings discriminatorTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SimpleModelNavigationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject simpleModelNavigation, String editing_mode) {
		super(editingContext, simpleModelNavigation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MappingViewsRepository.class;
		partKey = MappingViewsRepository.SimpleModelNavigation.class;
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
			final SimpleModelNavigation simpleModelNavigation = (SimpleModelNavigation)elt;
			final SimpleModelNavigationPropertiesEditionPart basePart = (SimpleModelNavigationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.index)) {
				basePart.setIndex(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), simpleModelNavigation.getIndex()));
			}
			
			if (isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.feature)) {
				// init part
				featureSettings = new EObjectFlatComboSettings(simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature());
				basePart.initFeature(featureSettings);
				// set the button mode
				basePart.setFeatureButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType)) {
				// init part
				discriminatorTypeSettings = new EObjectFlatComboSettings(simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType());
				basePart.initDiscriminatorType(discriminatorTypeSettings);
				// set the button mode
				basePart.setDiscriminatorTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToFeature(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EReference);
				}
			
			});
			// Start of user code for additional businessfilters for feature
																																																																																																						
																																																																																																						// End of user code
			
			basePart.addFilterToDiscriminatorType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof EClassifier); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for discriminatorType
																																																																																																						
																																																																																																						// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MappingViewsRepository.SimpleModelNavigation.Properties.index) {
			return NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index();
		}
		if (editorKey == MappingViewsRepository.SimpleModelNavigation.Properties.feature) {
			return NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature();
		}
		if (editorKey == MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType) {
			return NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SimpleModelNavigation simpleModelNavigation = (SimpleModelNavigation)semanticObject;
		if (MappingViewsRepository.SimpleModelNavigation.Properties.index == event.getAffectedEditor()) {
			simpleModelNavigation.setIndex((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (MappingViewsRepository.SimpleModelNavigation.Properties.feature == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				featureSettings.setToReference((EReference)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReference eObject = EcoreFactory.eINSTANCE.createEReference();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				featureSettings.setToReference(eObject);
			}
		}
		if (MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				discriminatorTypeSettings.setToReference((EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, discriminatorTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SimpleModelNavigationPropertiesEditionPart basePart = (SimpleModelNavigationPropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.index)) {
				if (msg.getNewValue() != null) {
					basePart.setIndex(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setIndex("");
				}
			}
			if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.feature))
				basePart.setFeature((EObject)msg.getNewValue());
			if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.SimpleModelNavigation.Properties.discriminatorType))
				basePart.setDiscriminatorType((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MappingViewsRepository.SimpleModelNavigation.Properties.feature;
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
				if (MappingViewsRepository.SimpleModelNavigation.Properties.index == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().getEAttributeType(), newValue);
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
