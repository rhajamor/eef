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
import org.eclipse.emf.ecore.EEnum;
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
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.GENDER;
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.PersonPropertiesEditionPart;


// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class PersonBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PersonBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject person, String editing_mode) {
		super(editingContext, person, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Person.class;
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
			final Person person = (Person)elt;
			final PersonPropertiesEditionPart basePart = (PersonPropertiesEditionPart)editingPart;
			// init values
			if (person.getFirstname() != null && isAccessible(ConferenceViewsRepository.Person.Identity.firstname))
				basePart.setFirstname(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), person.getFirstname()));
			
			if (person.getLastname() != null && isAccessible(ConferenceViewsRepository.Person.Identity.lastname))
				basePart.setLastname(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), person.getLastname()));
			
			if (isAccessible(ConferenceViewsRepository.Person.Identity.age)) {
				basePart.setAge(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), person.getAge()));
			}
			
			if (isAccessible(ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter)) {
				basePart.setEclipseCommiter(person.isEclipseCommiter());
			}
			if (isAccessible(ConferenceViewsRepository.Person.Identity.gender)) {
				basePart.initGender((EEnum) ConferencePackage.eINSTANCE.getPerson_Gender().getEType(), person.getGender());
			}
			if (isAccessible(ConferenceViewsRepository.Person.EclipseStatus.isRegistered)) {
				basePart.setIsRegistered(person.isIsRegistered());
			}
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
		if (editorKey == ConferenceViewsRepository.Person.Identity.firstname) {
			return ConferencePackage.eINSTANCE.getPerson_Firstname();
		}
		if (editorKey == ConferenceViewsRepository.Person.Identity.lastname) {
			return ConferencePackage.eINSTANCE.getPerson_Lastname();
		}
		if (editorKey == ConferenceViewsRepository.Person.Identity.age) {
			return ConferencePackage.eINSTANCE.getPerson_Age();
		}
		if (editorKey == ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter) {
			return ConferencePackage.eINSTANCE.getPerson_EclipseCommiter();
		}
		if (editorKey == ConferenceViewsRepository.Person.Identity.gender) {
			return ConferencePackage.eINSTANCE.getPerson_Gender();
		}
		if (editorKey == ConferenceViewsRepository.Person.EclipseStatus.isRegistered) {
			return ConferencePackage.eINSTANCE.getPerson_IsRegistered();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Person person = (Person)semanticObject;
		if (ConferenceViewsRepository.Person.Identity.firstname == event.getAffectedEditor()) {
			person.setFirstname((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Person.Identity.lastname == event.getAffectedEditor()) {
			person.setLastname((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Person.Identity.age == event.getAffectedEditor()) {
			person.setAge((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter == event.getAffectedEditor()) {
			person.setEclipseCommiter((Boolean)event.getNewValue());
		}
		if (ConferenceViewsRepository.Person.Identity.gender == event.getAffectedEditor()) {
			person.setGender((GENDER)event.getNewValue());
		}
		if (ConferenceViewsRepository.Person.EclipseStatus.isRegistered == event.getAffectedEditor()) {
			person.setIsRegistered((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PersonPropertiesEditionPart basePart = (PersonPropertiesEditionPart)editingPart;
			if (ConferencePackage.eINSTANCE.getPerson_Firstname().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Person.Identity.firstname)) {
				if (msg.getNewValue() != null) {
					basePart.setFirstname(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setFirstname("");
				}
			}
			if (ConferencePackage.eINSTANCE.getPerson_Lastname().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Person.Identity.lastname)) {
				if (msg.getNewValue() != null) {
					basePart.setLastname(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLastname("");
				}
			}
			if (ConferencePackage.eINSTANCE.getPerson_Age().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Person.Identity.age)) {
				if (msg.getNewValue() != null) {
					basePart.setAge(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setAge("");
				}
			}
			if (ConferencePackage.eINSTANCE.getPerson_EclipseCommiter().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter))
				basePart.setEclipseCommiter((Boolean)msg.getNewValue());
			
			if (ConferencePackage.eINSTANCE.getPerson_Gender().equals(msg.getFeature()) && isAccessible(ConferenceViewsRepository.Person.Identity.gender))
				basePart.setGender((GENDER)msg.getNewValue());
			
			if (ConferencePackage.eINSTANCE.getPerson_IsRegistered().equals(msg.getFeature()) && basePart != null && isAccessible(ConferenceViewsRepository.Person.EclipseStatus.isRegistered))
				basePart.setIsRegistered((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ConferenceViewsRepository.Person.Identity.firstname || key == ConferenceViewsRepository.Person.Identity.age;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Person.Identity.firstname)
			return "Firstname of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.lastname)
			return "Last name of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.age)
			return "age of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter)
			return "Does the person commit on Eclipse"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Presence.Talks.assists)
			return "Talks which the person attends"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.Identity.gender)
			return "Gender of the person"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Person.EclipseStatus.isRegistered)
			return "Does the person is registered for the conference"; //$NON-NLS-1$
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
				if (ConferenceViewsRepository.Person.Identity.firstname == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_Firstname().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_Firstname().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Person.Identity.lastname == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_Lastname().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_Lastname().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Person.Identity.age == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_Age().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_Age().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Person.EclipseStatus.eclipseCommiter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_EclipseCommiter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_EclipseCommiter().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Person.Identity.gender == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_Gender().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_Gender().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Person.EclipseStatus.isRegistered == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getPerson_IsRegistered().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getPerson_IsRegistered().getEAttributeType(), newValue);
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
