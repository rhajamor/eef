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
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.mapping.DocumentedElement;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.parts.DocumentationPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class DocumentedElementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String DOCUMENTATION_PART = "Documentation"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public DocumentedElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject documentedElement, String editing_mode) {
		super(editingContext, documentedElement, editing_mode);
		parts = new String[] { DOCUMENTATION_PART };
		repositoryKey = MappingViewsRepository.class;
		partKey = MappingViewsRepository.Documentation.class;
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
			final DocumentedElement documentedElement = (DocumentedElement)elt;
			final DocumentationPropertiesEditionPart documentationPart = (DocumentationPropertiesEditionPart)editingPart;
			// init values
			if (documentedElement.getDocumentation() != null)
				documentationPart.setDocumentation(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), documentedElement.getDocumentation()));
			// init filters
			
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
		DocumentedElement documentedElement = (DocumentedElement)semanticObject;
		if (MappingViewsRepository.Documentation.Documentation_.documentation__ == event.getAffectedEditor()) {
			documentedElement.setDocumentation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DocumentationPropertiesEditionPart documentationPart = (DocumentationPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getDocumentedElement_Documentation().equals(msg.getFeature()) && documentationPart != null){
				if (msg.getNewValue() != null) {
					documentationPart.setDocumentation(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					documentationPart.setDocumentation("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == MappingViewsRepository.Documentation.Documentation_.documentation__)
			return "The documentation of the element"; //$NON-NLS-1$
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
				if (MappingViewsRepository.Documentation.Documentation_.documentation__ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(MappingPackage.eINSTANCE.getDocumentedElement_Documentation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getDocumentedElement_Documentation().getEAttributeType(), newValue);
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
