/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.middle.middlenonreg.providers;

import org.eclipse.emf.eef.middle.middlenonreg.parts.MiddlenonregViewsRepository;
import org.eclipse.emf.eef.middle.middlenonreg.parts.forms.NamedElementPropertiesEditionPartForm;
import org.eclipse.emf.eef.middle.middlenonreg.parts.impl.NamedElementPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class MiddlenonregPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == MiddlenonregViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == MiddlenonregViewsRepository.NamedElement.class) {
			if (kind == MiddlenonregViewsRepository.SWT_KIND)
				return new NamedElementPropertiesEditionPartImpl(component);
			if (kind == MiddlenonregViewsRepository.FORM_KIND)
				return new NamedElementPropertiesEditionPartForm(component);
		}
		return null;
	}

}
