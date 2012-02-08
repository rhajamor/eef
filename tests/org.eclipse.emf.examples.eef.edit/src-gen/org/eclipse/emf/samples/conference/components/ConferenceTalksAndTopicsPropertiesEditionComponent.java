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
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Talk;
import org.eclipse.emf.samples.conference.Topic;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferenceTalksAndTopicsPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TALKSANDTOPICS_PART = "Talks and Topics"; //$NON-NLS-1$

	
	/**
	 * Settings for talks ReferencesTable
	 */
	protected ReferencesTableSettings talksSettings;
	
	/**
	 * Settings for topics ReferencesTable
	 */
	protected ReferencesTableSettings topicsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConferenceTalksAndTopicsPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject conference, String editing_mode) {
		super(editingContext, conference, editing_mode);
		parts = new String[] { TALKSANDTOPICS_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.TalksAndTopics.class;
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
			final TalksAndTopicsPropertiesEditionPart talksAndTopicsPart = (TalksAndTopicsPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ConferenceViewsRepository.TalksAndTopics.talks)) {
				talksSettings = new ReferencesTableSettings(conference, ConferencePackage.eINSTANCE.getConference_Talks());
				talksAndTopicsPart.initTalks(talksSettings);
			}
			if (isAccessible(ConferenceViewsRepository.TalksAndTopics.topics)) {
				topicsSettings = new ReferencesTableSettings(conference, ConferencePackage.eINSTANCE.getConference_Topics());
				talksAndTopicsPart.initTopics(topicsSettings);
			}
			// init filters
			if (isAccessible(ConferenceViewsRepository.TalksAndTopics.talks)) {
				talksAndTopicsPart.addFilterToTalks(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Talk); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for talks
																						
																						// End of user code
			}
			if (isAccessible(ConferenceViewsRepository.TalksAndTopics.topics)) {
				talksAndTopicsPart.addFilterToTopics(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Topic); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for topics
																						
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
		if (editorKey == ConferenceViewsRepository.TalksAndTopics.talks) {
			return ConferencePackage.eINSTANCE.getConference_Talks();
		}
		if (editorKey == ConferenceViewsRepository.TalksAndTopics.topics) {
			return ConferencePackage.eINSTANCE.getConference_Topics();
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
		if (ConferenceViewsRepository.TalksAndTopics.talks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, talksSettings, editingContext.getAdapterFactory());
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
				talksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				talksSettings.move(event.getNewIndex(), (Talk) event.getNewValue());
			}
		}
		if (ConferenceViewsRepository.TalksAndTopics.topics == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, topicsSettings, editingContext.getAdapterFactory());
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
				topicsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				topicsSettings.move(event.getNewIndex(), (Topic) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TalksAndTopicsPropertiesEditionPart talksAndTopicsPart = (TalksAndTopicsPropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getConference_Talks().equals(msg.getFeature()) && isAccessible(ConferenceViewsRepository.TalksAndTopics.talks))
				talksAndTopicsPart.updateTalks();
			if (ConferencePackage.eINSTANCE.getConference_Topics().equals(msg.getFeature()) && isAccessible(ConferenceViewsRepository.TalksAndTopics.topics))
				talksAndTopicsPart.updateTopics();
			
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
