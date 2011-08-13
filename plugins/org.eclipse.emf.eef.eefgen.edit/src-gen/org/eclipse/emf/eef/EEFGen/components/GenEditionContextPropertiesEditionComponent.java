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
package org.eclipse.emf.eef.EEFGen.components;

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
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.parts.GenEditionContextPropertiesEditionPart;
import org.eclipse.emf.eef.components.ComponentsFactory;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
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
public class GenEditionContextPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for propertiesEditionContext EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings propertiesEditionContextSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public GenEditionContextPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject genEditionContext, String editing_mode) {
		super(editingContext, genEditionContext, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EEFGenViewsRepository.class;
		partKey = EEFGenViewsRepository.GenEditionContext.class;
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
			final GenEditionContext genEditionContext = (GenEditionContext)elt;
			final GenEditionContextPropertiesEditionPart basePart = (GenEditionContextPropertiesEditionPart)editingPart;
			// init values
			if (genEditionContext.getBasePackage() != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Parameters.basePackage))
				basePart.setBasePackage(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genEditionContext.getBasePackage()));
			
			if (genEditionContext.getDescriptorsContributorID() != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID))
				basePart.setDescriptorsContributorID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genEditionContext.getDescriptorsContributorID()));
			
			if (isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors)) {
				basePart.setGenericPropertiesViewsDescriptors(genEditionContext.isDescriptorsGenericPropertiesViews());
			}
			if (isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews)) {
				basePart.setGMFSpecificPropertiesViews(genEditionContext.isGmfPropertiesViews());
			}
			if (isAccessible(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext)) {
				// init part
				propertiesEditionContextSettings = new EObjectFlatComboSettings(genEditionContext, EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditionContext());
				basePart.initPropertiesEditionContext(propertiesEditionContextSettings);
				// set the button mode
				basePart.setPropertiesEditionContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases)) {
				basePart.setJUnitTestCases(genEditionContext.isGenerateJunitTestCases());
			}
			if (genEditionContext.getLeafComponentsSuperClass() != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass))
				basePart.setLeafComponentsSuperClass(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genEditionContext.getLeafComponentsSuperClass()));
			
			if (genEditionContext.getPropertiesEditingProvidersSuperClass() != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass))
				basePart.setPropertiesEditingProvidersSuperClass(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genEditionContext.getPropertiesEditingProvidersSuperClass()));
			
			// init filters
			
			
			
			
			basePart.addFilterToPropertiesEditionContext(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof PropertiesEditionContext);
				}
			
			});
			// Start of user code for additional businessfilters for propertiesEditionContext
																																													
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
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Parameters.basePackage) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_BasePackage();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsContributorID();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsGenericPropertiesViews();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_GmfPropertiesViews();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditionContext();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_GenerateJunitTestCases();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_LeafComponentsSuperClass();
		}
		if (editorKey == EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass) {
			return EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditingProvidersSuperClass();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GenEditionContext genEditionContext = (GenEditionContext)semanticObject;
		if (EEFGenViewsRepository.GenEditionContext.Parameters.basePackage == event.getAffectedEditor()) {
			genEditionContext.setBasePackage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID == event.getAffectedEditor()) {
			genEditionContext.setDescriptorsContributorID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors == event.getAffectedEditor()) {
			genEditionContext.setDescriptorsGenericPropertiesViews((Boolean)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews == event.getAffectedEditor()) {
			genEditionContext.setGmfPropertiesViews((Boolean)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				propertiesEditionContextSettings.setToReference((PropertiesEditionContext)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PropertiesEditionContext eObject = ComponentsFactory.eINSTANCE.createPropertiesEditionContext();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				propertiesEditionContextSettings.setToReference(eObject);
			}
		}
		if (EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases == event.getAffectedEditor()) {
			genEditionContext.setGenerateJunitTestCases((Boolean)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass == event.getAffectedEditor()) {
			genEditionContext.setLeafComponentsSuperClass((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass == event.getAffectedEditor()) {
			genEditionContext.setPropertiesEditingProvidersSuperClass((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			GenEditionContextPropertiesEditionPart basePart = (GenEditionContextPropertiesEditionPart)editingPart;
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_BasePackage().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Parameters.basePackage)) {
				if (msg.getNewValue() != null) {
					basePart.setBasePackage(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBasePackage("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsContributorID().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID)) {
				if (msg.getNewValue() != null) {
					basePart.setDescriptorsContributorID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescriptorsContributorID("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsGenericPropertiesViews().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors))
				basePart.setGenericPropertiesViewsDescriptors((Boolean)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_GmfPropertiesViews().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews))
				basePart.setGMFSpecificPropertiesViews((Boolean)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditionContext().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext))
				basePart.setPropertiesEditionContext((EObject)msg.getNewValue());
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_GenerateJunitTestCases().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases))
				basePart.setJUnitTestCases((Boolean)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_LeafComponentsSuperClass().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass)) {
				if (msg.getNewValue() != null) {
					basePart.setLeafComponentsSuperClass(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLeafComponentsSuperClass("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditingProvidersSuperClass().equals(msg.getFeature()) && basePart != null && isAccessible(EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass)) {
				if (msg.getNewValue() != null) {
					basePart.setPropertiesEditingProvidersSuperClass(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPropertiesEditingProvidersSuperClass("");
				}
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
		return key == EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EEFGenViewsRepository.GenEditionContext.Parameters.basePackage)
			return "The base package for all the generated code"; //$NON-NLS-1$
		if (key == EEFGenViewsRepository.GenEditionContext.Reference.propertiesEditionContext)
			return "The PropertiesEditioContext to describe"; //$NON-NLS-1$
		if (key == EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass)
			return "The base from which implementations of leaf PropertiesEditingComponents extend"; //$NON-NLS-1$
		if (key == EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass)
			return "The base from which implementations of leaf PropertiesEditingProviders extend"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
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
				if (EEFGenViewsRepository.GenEditionContext.Parameters.basePackage == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_BasePackage().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_BasePackage().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Parameters.descriptorsContributorID == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsContributorID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsContributorID().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Activation.genericPropertiesViewsDescriptors == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsGenericPropertiesViews().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_DescriptorsGenericPropertiesViews().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Activation.gMFSpecificPropertiesViews == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_GmfPropertiesViews().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_GmfPropertiesViews().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Activation.jUnitTestCases == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_GenerateJunitTestCases().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_GenerateJunitTestCases().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Implementation.leafComponentsSuperClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_LeafComponentsSuperClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_LeafComponentsSuperClass().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenEditionContext.Implementation.propertiesEditingProvidersSuperClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditingProvidersSuperClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenEditionContext_PropertiesEditingProvidersSuperClass().getEAttributeType(), newValue);
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
