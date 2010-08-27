/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.middle.middlenonreg.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.ab.abstractnonreg.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.middle.middlenonreg.NamedElement;
import org.eclipse.emf.eef.middle.middlenonreg.parts.MiddlenonregViewsRepository;
import org.eclipse.emf.eef.middle.middlenonreg.parts.NamedElementPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;

// End of user code

/**
 * 
 * 
 */
public class NamedElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private NamedElementPropertiesEditionPart basePart;

	/**
	 * The NamedElementBasePropertiesEditionComponent sub component
	 * 
	 */
	protected NamedElementBasePropertiesEditionComponent namedElementBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param namedElement the EObject to edit
	 * 
	 */
	public NamedElementPropertiesEditionComponent(EObject namedElement, String editing_mode) {
		super(editing_mode);
		if (namedElement instanceof NamedElement) {
			IPropertiesEditionProvider provider = null;
			provider = PropertiesEditionComponentService.getInstance().getProvider(namedElement, NamedElementBasePropertiesEditionComponent.class);
			namedElementBasePropertiesEditionComponent = (NamedElementBasePropertiesEditionComponent)provider.getPropertiesEditionComponent(namedElement, editing_mode, NamedElementBasePropertiesEditionComponent.BASE_PART, NamedElementBasePropertiesEditionComponent.class);
			addSubComponent(namedElementBasePropertiesEditionComponent);
			provider = PropertiesEditionComponentService.getInstance().getProvider(namedElement, DocumentedElementPropertiesEditionComponent.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditionComponent(namedElement, editing_mode, DocumentedElementPropertiesEditionComponent.BASE_PART, DocumentedElementPropertiesEditionComponent.class);
			addSubComponent(documentedElementPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (NamedElementBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (NamedElementPropertiesEditionPart)namedElementBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (MiddlenonregViewsRepository.NamedElement.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (NamedElementPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject element, ResourceSet allResource) {
		if (key == MiddlenonregViewsRepository.NamedElement.class) {
			super.initPart(key, kind, element, allResource);
			documentedElementPropertiesEditionComponent.setPropertiesEditionPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, basePart.getDocumentedElementReferencedView());
			documentedElementPropertiesEditionComponent.initPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, element, allResource);
		}
		if (key == AbstractnonregViewsRepository.DocumentedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
