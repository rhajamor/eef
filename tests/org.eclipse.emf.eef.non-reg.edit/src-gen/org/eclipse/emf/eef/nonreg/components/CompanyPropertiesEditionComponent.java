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
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.parts.CompanyPropertiesEditionPart;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;


// End of user code

/**
 * 
 * 
 */
public class CompanyPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private CompanyPropertiesEditionPart basePart;

	/**
	 * The CompanyBasePropertiesEditionComponent sub component
	 * 
	 */
	protected CompanyBasePropertiesEditionComponent companyBasePropertiesEditionComponent;
	/**
	 * The NamedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected NamedElementPropertiesEditionComponent namedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param company the EObject to edit
	 * 
	 */
	public CompanyPropertiesEditionComponent(EObject company, String editing_mode) {
		super(editing_mode);
		if (company instanceof Company) {
			IPropertiesEditionProvider provider = null;
			provider = PropertiesEditionComponentService.getInstance().getProvider(company, CompanyBasePropertiesEditionComponent.class);
			companyBasePropertiesEditionComponent = (CompanyBasePropertiesEditionComponent)provider.getPropertiesEditionComponent(company, editing_mode, CompanyBasePropertiesEditionComponent.BASE_PART, CompanyBasePropertiesEditionComponent.class);
			addSubComponent(companyBasePropertiesEditionComponent);
			provider = PropertiesEditionComponentService.getInstance().getProvider(company, NamedElementPropertiesEditionComponent.class);
			namedElementPropertiesEditionComponent = (NamedElementPropertiesEditionComponent)provider.getPropertiesEditionComponent(company, editing_mode, NamedElementBasePropertiesEditionComponent.BASE_PART, NamedElementPropertiesEditionComponent.class);
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
		if (CompanyBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (CompanyPropertiesEditionPart)companyBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (NonregViewsRepository.Company.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (CompanyPropertiesEditionPart)propertiesEditionPart;
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
		if (key == NonregViewsRepository.Company.class) {
			super.initPart(key, kind, element, allResource);
			namedElementPropertiesEditionComponent.setPropertiesEditionPart(MiddlenonregViewsRepository.NamedElement.class, kind, basePart.getNamedElementReferencedView());
			namedElementPropertiesEditionComponent.initPart(MiddlenonregViewsRepository.NamedElement.class, kind, element, allResource);
		}
		if (key == MiddlenonregViewsRepository.NamedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
