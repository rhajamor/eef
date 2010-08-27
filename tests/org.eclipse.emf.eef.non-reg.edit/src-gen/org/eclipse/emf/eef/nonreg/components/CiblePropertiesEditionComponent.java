/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.middle.middlenonreg.components.NamedElementBasePropertiesEditionComponent;
import org.eclipse.emf.eef.middle.middlenonreg.components.NamedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.middle.middlenonreg.parts.MiddlenonregViewsRepository;
import org.eclipse.emf.eef.nonreg.modelNavigation.ConcreteCible;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.SuperCiblePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;


// End of user code

/**
 * 
 * 
 */
public class CiblePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The SuperCible part
	 * 
	 */
	private SuperCiblePropertiesEditionPart superCiblePart;

	/**
	 * The CibleSuperCiblePropertiesEditionComponent sub component
	 * 
	 */
	protected CibleSuperCiblePropertiesEditionComponent cibleSuperCiblePropertiesEditionComponent;
	/**
	 * The NamedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected NamedElementPropertiesEditionComponent namedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param concreteCible the EObject to edit
	 * 
	 */
	public CiblePropertiesEditionComponent(EObject concreteCible, String editing_mode) {
		super(editing_mode);
		if (concreteCible instanceof ConcreteCible) {
			IPropertiesEditionProvider provider = null;
			provider = PropertiesEditionComponentService.getInstance().getProvider(concreteCible, CibleSuperCiblePropertiesEditionComponent.class);
			cibleSuperCiblePropertiesEditionComponent = (CibleSuperCiblePropertiesEditionComponent)provider.getPropertiesEditionComponent(concreteCible, editing_mode, CibleSuperCiblePropertiesEditionComponent.SUPERCIBLE_PART, CibleSuperCiblePropertiesEditionComponent.class);
			addSubComponent(cibleSuperCiblePropertiesEditionComponent);
			provider = PropertiesEditionComponentService.getInstance().getProvider(concreteCible, NamedElementPropertiesEditionComponent.class);
			namedElementPropertiesEditionComponent = (NamedElementPropertiesEditionComponent)provider.getPropertiesEditionComponent(concreteCible, editing_mode, NamedElementBasePropertiesEditionComponent.BASE_PART, NamedElementPropertiesEditionComponent.class);
			addSubComponent(namedElementPropertiesEditionComponent);
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
		if (CibleSuperCiblePropertiesEditionComponent.SUPERCIBLE_PART.equals(key)) {
			superCiblePart = (SuperCiblePropertiesEditionPart)cibleSuperCiblePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)superCiblePart;
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
		if (NonregViewsRepository.SuperCible.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			superCiblePart = (SuperCiblePropertiesEditionPart)propertiesEditionPart;
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
		if (key == NonregViewsRepository.SuperCible.class) {
			super.initPart(key, kind, element, allResource);
			namedElementPropertiesEditionComponent.setPropertiesEditionPart(MiddlenonregViewsRepository.NamedElement.class, kind, superCiblePart.getNamedElementReferencedView());
			namedElementPropertiesEditionComponent.initPart(MiddlenonregViewsRepository.NamedElement.class, kind, element, allResource);
		}
		if (key == MiddlenonregViewsRepository.NamedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
