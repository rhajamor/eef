/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: SimpleModelNavigationPropertiesEditionComponent.java,v 1.7 2009/05/20 15:51:37 sbouchet Exp $
 */
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.parts.SimpleModelNavigationPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class SimpleModelNavigationPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 */
	private SimpleModelNavigation simpleModelNavigation;

	/**
	 * The Base part
	 */
	private SimpleModelNavigationPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 */
	public SimpleModelNavigationPropertiesEditionComponent(EObject simpleModelNavigation, String editing_mode) {
		if (simpleModelNavigation instanceof SimpleModelNavigation) {
			this.simpleModelNavigation = (SimpleModelNavigation)simpleModelNavigation;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.simpleModelNavigation.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			public void notifyChanged(Notification msg) {
				if (basePart == null)
					SimpleModelNavigationPropertiesEditionComponent.this.dispose();
				else {
					if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().equals(msg.getFeature()) && basePart != null)
						basePart.setIndex(((Integer)msg.getNewValue()).toString());

					if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature().equals(msg.getFeature()) && basePart != null)
						basePart.setFeature((EObject)msg.getNewValue());
					if (NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType().equals(msg.getFeature()) && basePart != null)
						basePart.setDiscriminatorType((EObject)msg.getNewValue());


				}
			}

		};
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return MappingViewsRepository.SimpleModelNavigation.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 * (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (simpleModelNavigation != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
				if (provider != null) {
					basePart = (SimpleModelNavigationPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.SimpleModelNavigation.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == MappingViewsRepository.SimpleModelNavigation.class)
			this.basePart = (SimpleModelNavigationPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == MappingViewsRepository.SimpleModelNavigation.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			SimpleModelNavigation simpleModelNavigation = (SimpleModelNavigation)elt;
			// init values
			basePart.setIndex(String.valueOf(simpleModelNavigation.getIndex()));

			basePart.initFeature(allResource, simpleModelNavigation.getFeature());
			basePart.initDiscriminatorType(allResource, simpleModelNavigation.getDiscriminatorType());
			
			// init filters

			basePart.addFilterToFeature(new ViewerFilter() {

				/*
				 * (non-Javadoc)
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

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof EClassifier); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for discriminatorType
			
			// End of user code
		}
		// init values for referenced views

		// init filters for referenced views

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if (simpleModelNavigation != null) {
			cc.append(SetCommand.create(editingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index(), new Integer(basePart.getIndex())));

			cc.append(SetCommand.create(editingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature(), basePart.getFeature()));
			cc.append(SetCommand.create(editingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType(), basePart.getDiscriminatorType()));


		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof SimpleModelNavigation) {
			SimpleModelNavigation simpleModelNavigationToUpdate = (SimpleModelNavigation)source;
			simpleModelNavigationToUpdate.setIndex(new Integer(basePart.getIndex()).intValue());

			simpleModelNavigationToUpdate.setFeature((EReference)basePart.getFeature());
			simpleModelNavigationToUpdate.setDiscriminatorType((EClassifier)basePart.getDiscriminatorType());


			return simpleModelNavigationToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
			CompoundCommand command = new CompoundCommand();
			if (MappingViewsRepository.SimpleModelNavigation.index == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index(), new Integer((String)event.getNewValue())));

			if (MappingViewsRepository.SimpleModelNavigation.feature == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_Feature(), event.getNewValue()));
			if (MappingViewsRepository.SimpleModelNavigation.discriminatorType == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, simpleModelNavigation, NavigationPackage.eINSTANCE.getSimpleModelNavigation_DiscriminatorType(), event.getNewValue()));


			liveEditingDomain.getCommandStack().execute(command);
		} else if (PropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				if (MappingViewsRepository.SimpleModelNavigation.index == event.getAffectedEditor())
					basePart.setMessageForIndex(diag.getMessage(), IMessageProvider.ERROR);




			} else {
				if (MappingViewsRepository.SimpleModelNavigation.index == event.getAffectedEditor())
					basePart.unsetMessageForIndex();




			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == MappingViewsRepository.SimpleModelNavigation.feature;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.common.notify.Notification)
	 */
	public Diagnostic validateValue(PropertiesEditionEvent event) {
		String newStringValue = event.getNewValue().toString();
		Diagnostic ret = null;
		try {
			if (MappingViewsRepository.SimpleModelNavigation.index == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getSimpleModelNavigation_Index().getEAttributeType(), newValue);
			}

		} catch (IllegalArgumentException iae) {
			ret = BasicDiagnostic.toDiagnostic(iae);
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 */
	public Diagnostic validate() {
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(PropertiesContextService.getInstance().entryPointElement());
			copy = PropertiesContextService.getInstance().entryPointComponent().getPropertiesEditionObject(copy);
			return Diagnostician.INSTANCE.validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			return Diagnostician.INSTANCE.validate(simpleModelNavigation);
		else
			return null;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 */
	public void dispose() {
		if (semanticAdapter != null)
			simpleModelNavigation.eAdapters().remove(semanticAdapter);
	}

}

