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
package org.eclipse.emf.eef.EEFGen.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.EEFGen.HELP_STRATEGY;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.emf.eef.views.ViewsRepository;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class GenViewsRepositoryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for viewsRepository EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings viewsRepositorySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public GenViewsRepositoryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject genViewsRepository, String editing_mode) {
		super(editingContext, genViewsRepository, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EEFGenViewsRepository.class;
		partKey = EEFGenViewsRepository.GenViewsRepository.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final GenViewsRepository genViewsRepository = (GenViewsRepository)elt;
			final GenViewsRepositoryPropertiesEditionPart basePart = (GenViewsRepositoryPropertiesEditionPart)editingPart;
			// init values
			if (genViewsRepository.getBasePackage() != null)
				basePart.setBasePackage(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genViewsRepository.getBasePackage()));
			
			basePart.setSWTViews(genViewsRepository.isSwtViews());
			
			basePart.setFormsViews(genViewsRepository.isFormViews());
			
			if (isAccessible(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy)) {
				basePart.initHelpStrategy((EEnum) EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEType(), genViewsRepository.getHelpStrategy());
			}
			// init part
			viewsRepositorySettings = new EObjectFlatComboSettings(genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_ViewsRepository());
			basePart.initViewsRepository(viewsRepositorySettings);
			// set the button mode
			basePart.setViewsRepositoryButtonMode(ButtonsModeEnum.BROWSE);
			if (genViewsRepository.getPartsSuperClass() != null)
				basePart.setPartsSuperClass(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), genViewsRepository.getPartsSuperClass()));
			
			// init filters
			
			
			
			
			basePart.addFilterToViewsRepository(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ViewsRepository);
				}
			
			});
			// Start of user code for additional businessfilters for viewsRepository
																																													
																																													// End of user code
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void updateSemanticModel(final PropertiesEditingEvent event) {
		GenViewsRepository genViewsRepository = (GenViewsRepository)semanticObject;
		if (EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage == event.getAffectedEditor()) {
			genViewsRepository.setBasePackage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews == event.getAffectedEditor()) {
			genViewsRepository.setSwtViews((Boolean)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenViewsRepository.Activation.formsViews == event.getAffectedEditor()) {
			genViewsRepository.setFormViews((Boolean)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy == event.getAffectedEditor()) {
			genViewsRepository.setHelpStrategy((HELP_STRATEGY)event.getNewValue());
		}
		if (EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditingEventImpl.SET)  {
				viewsRepositorySettings.setToReference((ViewsRepository)event.getNewValue());
			} else if (event.getKind() == PropertiesEditingEventImpl.ADD)  {
				ViewsRepository eObject = ViewsFactory.eINSTANCE.createViewsRepository();
				EObjectPropertiesEditingContext context = new EObjectPropertiesEditingContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				viewsRepositorySettings.setToReference(eObject);
			}
		}
		if (EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass == event.getAffectedEditor()) {
			genViewsRepository.setPartsSuperClass((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			GenViewsRepositoryPropertiesEditionPart basePart = (GenViewsRepositoryPropertiesEditionPart)editingPart;
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setBasePackage(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBasePackage("");
				}
			}
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().equals(msg.getFeature()) && basePart != null)
				basePart.setSWTViews((Boolean)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().equals(msg.getFeature()) && basePart != null)
				basePart.setFormsViews((Boolean)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().equals(msg.getFeature()) && isAccessible(EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy))
				basePart.setHelpStrategy((Enumerator)msg.getNewValue());
			
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_ViewsRepository().equals(msg.getFeature()) && basePart != null)
				basePart.setViewsRepository((EObject)msg.getNewValue());
			if (EEFGenPackage.eINSTANCE.getGenViewsRepository_PartsSuperClass().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setPartsSuperClass(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPartsSuperClass("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy || key == EEFGenViewsRepository.GenViewsRepository.Reference.viewsRepository;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass)
			return "The base from which implementations of leaf PropertiesEditingParts extend"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validateValue(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EEFGenViewsRepository.GenViewsRepository.Parameters.basePackage == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenViewsRepository.Activation.sWTViews == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenViewsRepository.Activation.formsViews == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenViewsRepository.Parameters.helpStrategy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEAttributeType(), newValue);
				}
				if (EEFGenViewsRepository.GenViewsRepository.Implementation.partsSuperClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_PartsSuperClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_PartsSuperClass().getEAttributeType(), newValue);
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
