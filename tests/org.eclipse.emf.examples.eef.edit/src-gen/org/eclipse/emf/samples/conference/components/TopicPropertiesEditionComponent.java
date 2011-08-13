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
import java.util.Iterator;
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
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Topic;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TopicPropertiesEditionPart;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TopicPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TopicPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject topic, String editing_mode) {
		super(editingContext, topic, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Topic.class;
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
			final Topic topic = (Topic)elt;
			final TopicPropertiesEditionPart basePart = (TopicPropertiesEditionPart)editingPart;
			// init values
			if (topic.getDescription() != null && isAccessible(ConferenceViewsRepository.Topic.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), topic.getDescription()));
			
			if (topic.getReferences() != null && isAccessible(ConferenceViewsRepository.Topic.Properties.references))
				basePart.setReferences(topic.getReferences());
			
			if (topic.getDocumentation() != null && isAccessible(ConferenceViewsRepository.Topic.Properties.documentation))
				basePart.setDocumentation(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), topic.getDocumentation()));
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
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ConferenceViewsRepository.Topic.Properties.description) {
			return ConferencePackage.eINSTANCE.getTopic_Description();
		}
		if (editorKey == ConferenceViewsRepository.Topic.Properties.references) {
			return ConferencePackage.eINSTANCE.getTopic_References();
		}
		if (editorKey == ConferenceViewsRepository.Topic.Properties.documentation) {
			return ConferencePackage.eINSTANCE.getTopic_Documentation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Topic topic = (Topic)semanticObject;
		if (ConferenceViewsRepository.Topic.Properties.description == event.getAffectedEditor()) {
			topic.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Topic.Properties.references == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				topic.getReferences().clear();
				topic.getReferences().addAll(((List) event.getNewValue()));
			}
		}
		if (ConferenceViewsRepository.Topic.Properties.documentation == event.getAffectedEditor()) {
			topic.setDocumentation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TopicPropertiesEditionPart basePart = (TopicPropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getTopic_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Topic.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ConferencePackage.eINSTANCE.getTopic_References().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Topic.Properties.references)) {
				basePart.setReferences(((Topic)semanticObject).getReferences());
			}
			
			if (ConferencePackage.eINSTANCE.getTopic_Documentation().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Topic.Properties.documentation)){
				if (msg.getNewValue() != null) {
					basePart.setDocumentation(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDocumentation("");
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
		return key == ConferenceViewsRepository.Topic.Properties.documentation;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Topic.Properties.description)
			return "Description of the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Topic.Properties.references)
			return "Some references on this topic"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Topic.Properties.documentation)
			return "Information about this topic"; //$NON-NLS-1$
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
				if (ConferenceViewsRepository.Topic.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getTopic_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTopic_Description().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Topic.Properties.references == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTopic_References().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (ConferenceViewsRepository.Topic.Properties.documentation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getTopic_Documentation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTopic_Documentation().getEAttributeType(), newValue);
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
