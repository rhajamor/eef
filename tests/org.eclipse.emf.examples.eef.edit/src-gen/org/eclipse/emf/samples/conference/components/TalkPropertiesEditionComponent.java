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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.emf.samples.conference.ConferenceFactory;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.TALK_TYPE;
import org.eclipse.emf.samples.conference.Talk;
import org.eclipse.emf.samples.conference.Topic;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TalkPropertiesEditionPart;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TalkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for topic EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings topicSettings;
	
	/**
	 * Settings for presenter EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings presenterSettings;
	
	/**
	 * Settings for creator EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings creatorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TalkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject talk, String editing_mode) {
		super(editingContext, talk, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Talk.class;
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
			final Talk talk = (Talk)elt;
			final TalkPropertiesEditionPart basePart = (TalkPropertiesEditionPart)editingPart;
			// init values
			if (talk.getTitle() != null && isAccessible(ConferenceViewsRepository.Talk.Properties.title_))
				basePart.setTitle_(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), talk.getTitle()));
			
			if (isAccessible(ConferenceViewsRepository.Talk.Properties.topic)) {
				// init part
				topicSettings = new EObjectFlatComboSettings(talk, ConferencePackage.eINSTANCE.getTalk_Topic());
				basePart.initTopic(topicSettings);
				// set the button mode
				basePart.setTopicButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ConferenceViewsRepository.Talk.Properties.type)) {
				basePart.initType((EEnum) ConferencePackage.eINSTANCE.getTalk_Type().getEType(), talk.getType());
			}
			if (isAccessible(ConferenceViewsRepository.Talk.Properties.presenter)) {
				// init part
				presenterSettings = new EObjectFlatComboSettings(talk, ConferencePackage.eINSTANCE.getTalk_Presenter());
				basePart.initPresenter(presenterSettings);
				// set the button mode
				basePart.setPresenterButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ConferenceViewsRepository.Talk.Properties.creator)) {
				// init part
				creatorSettings = new EObjectFlatComboSettings(talk, ConferencePackage.eINSTANCE.getTalk_Creator());
				basePart.initCreator(creatorSettings);
				// set the button mode
				basePart.setCreatorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (talk.getDocumentation() != null && isAccessible(ConferenceViewsRepository.Talk.Properties.documentation))
				basePart.setDocumentation(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), talk.getDocumentation()));
			// init filters
			
			basePart.addFilterToTopic(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Topic);
				}
			
			});
			// Start of user code for additional businessfilters for topic
																																										
																																										// End of user code
			
			
			basePart.addFilterToPresenter(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Person);
				}
			
			});
			// Start of user code for additional businessfilters for presenter
																																										
																																										// End of user code
			
			basePart.addFilterToCreator(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Person); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for creator
																																										
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
		if (editorKey == ConferenceViewsRepository.Talk.Properties.title_) {
			return ConferencePackage.eINSTANCE.getTalk_Title();
		}
		if (editorKey == ConferenceViewsRepository.Talk.Properties.topic) {
			return ConferencePackage.eINSTANCE.getTalk_Topic();
		}
		if (editorKey == ConferenceViewsRepository.Talk.Properties.type) {
			return ConferencePackage.eINSTANCE.getTalk_Type();
		}
		if (editorKey == ConferenceViewsRepository.Talk.Properties.presenter) {
			return ConferencePackage.eINSTANCE.getTalk_Presenter();
		}
		if (editorKey == ConferenceViewsRepository.Talk.Properties.creator) {
			return ConferencePackage.eINSTANCE.getTalk_Creator();
		}
		if (editorKey == ConferenceViewsRepository.Talk.Properties.documentation) {
			return ConferencePackage.eINSTANCE.getTalk_Documentation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Talk talk = (Talk)semanticObject;
		if (ConferenceViewsRepository.Talk.Properties.title_ == event.getAffectedEditor()) {
			talk.setTitle((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Talk.Properties.topic == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				topicSettings.setToReference((Topic)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Topic eObject = ConferenceFactory.eINSTANCE.createTopic();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				topicSettings.setToReference(eObject);
			}
		}
		if (ConferenceViewsRepository.Talk.Properties.type == event.getAffectedEditor()) {
			talk.setType((TALK_TYPE)event.getNewValue());
		}
		if (ConferenceViewsRepository.Talk.Properties.presenter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				presenterSettings.setToReference((Person)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Person eObject = ConferenceFactory.eINSTANCE.createPerson();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				presenterSettings.setToReference(eObject);
			}
		}
		if (ConferenceViewsRepository.Talk.Properties.creator == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				creatorSettings.setToReference((Person)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Person eObject = ConferenceFactory.eINSTANCE.createPerson();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				creatorSettings.setToReference(eObject);
			}
		}
		if (ConferenceViewsRepository.Talk.Properties.documentation == event.getAffectedEditor()) {
			talk.setDocumentation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TalkPropertiesEditionPart basePart = (TalkPropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getTalk_Title().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Talk.Properties.title_)) {
				if (msg.getNewValue() != null) {
					basePart.setTitle_(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTitle_("");
				}
			}
			if (ConferencePackage.eINSTANCE.getTalk_Topic().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Talk.Properties.topic))
				basePart.setTopic((EObject)msg.getNewValue());
			if (ConferencePackage.eINSTANCE.getTalk_Type().equals(msg.getFeature()) && isAccessible(ConferenceViewsRepository.Talk.Properties.type))
				basePart.setType((Enumerator)msg.getNewValue());
			
			if (ConferencePackage.eINSTANCE.getTalk_Presenter().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Talk.Properties.presenter))
				basePart.setPresenter((EObject)msg.getNewValue());
			if (ConferencePackage.eINSTANCE.getTalk_Creator().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Talk.Properties.creator))
				basePart.setCreator((EObject)msg.getNewValue());
			if (ConferencePackage.eINSTANCE.getTalk_Documentation().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Talk.Properties.documentation)){
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
		return key == ConferenceViewsRepository.Talk.Properties.title_ || key == ConferenceViewsRepository.Talk.Properties.topic || key == ConferenceViewsRepository.Talk.Properties.presenter || key == ConferenceViewsRepository.Talk.Properties.documentation;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Talk.Properties.title_)
			return "The title of the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Talk.Properties.topic)
			return "Topics discussed during the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Talk.Properties.type)
			return "Type of the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Talk.Properties.presenter)
			return "Person presenting the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Talk.Properties.creator)
			return "Person who created the talk"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Talk.Properties.documentation)
			return "Description of the talk"; //$NON-NLS-1$
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
				if (ConferenceViewsRepository.Talk.Properties.title_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getTalk_Title().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTalk_Title().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Talk.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getTalk_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTalk_Type().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Talk.Properties.documentation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getTalk_Documentation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getTalk_Documentation().getEAttributeType(), newValue);
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
