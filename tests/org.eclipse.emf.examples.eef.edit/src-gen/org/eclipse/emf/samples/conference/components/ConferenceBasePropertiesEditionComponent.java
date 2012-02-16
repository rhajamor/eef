/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.components;

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
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferenceBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConferenceBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject conference, String editing_mode) {
		super(editingContext, conference, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Conference_.class;
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
			final Conference conference = (Conference)elt;
			final ConferencePropertiesEditionPart basePart = (ConferencePropertiesEditionPart)editingPart;
			// init values
			if (conference.getName() != null && isAccessible(ConferenceViewsRepository.Conference_.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), conference.getName()));
			
			if (conference.getOverview() != null && isAccessible(ConferenceViewsRepository.Conference_.Properties.overview))
				basePart.setOverview(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), conference.getOverview()));
			// init filters
			
			
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
		if (editorKey == ConferenceViewsRepository.Conference_.Properties.name) {
			return ConferencePackage.eINSTANCE.getConference_Name();
		}
		if (editorKey == ConferenceViewsRepository.Conference_.Properties.overview) {
			return ConferencePackage.eINSTANCE.getConference_Overview();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Conference conference = (Conference)semanticObject;
		if (ConferenceViewsRepository.Conference_.Properties.name == event.getAffectedEditor()) {
			conference.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Conference_.Properties.overview == event.getAffectedEditor()) {
			conference.setOverview((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ConferencePropertiesEditionPart basePart = (ConferencePropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getConference_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Conference_.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ConferencePackage.eINSTANCE.getConference_Overview().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Conference_.Properties.overview)){
				if (msg.getNewValue() != null) {
					basePart.setOverview(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOverview("");
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
		return key == ConferenceViewsRepository.Localisation.place || key == ConferenceViewsRepository.Conference_.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Localisation.place)
			return "The conference's place"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Localisation.sites)
			return "Where the conference take place"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Participants.participants_)
			return "Person attending to the conference"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.TalksAndTopics.talks)
			return "Talks of the conference"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.TalksAndTopics.topics)
			return "Topics discussed during the conference"; //$NON-NLS-1$
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
				if (ConferenceViewsRepository.Conference_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ConferencePackage.eINSTANCE.getConference_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getConference_Name().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Conference_.Properties.overview == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ConferencePackage.eINSTANCE.getConference_Overview().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getConference_Overview().getEAttributeType(), newValue);
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
