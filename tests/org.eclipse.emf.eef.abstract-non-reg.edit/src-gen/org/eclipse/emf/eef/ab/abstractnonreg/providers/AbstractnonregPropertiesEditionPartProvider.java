/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.ab.abstractnonreg.providers;

import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.forms.DocumentedElementPropertiesEditionPartForm;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.impl.DocumentedElementPropertiesEditionPartImpl;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class AbstractnonregPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == AbstractnonregViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == AbstractnonregViewsRepository.DocumentedElement.class) {
			if (kind == AbstractnonregViewsRepository.SWT_KIND)
				return new DocumentedElementPropertiesEditionPartImpl(component);
			if (kind == AbstractnonregViewsRepository.FORM_KIND)
				return new DocumentedElementPropertiesEditionPartForm(component);
		}
		return null;
	}

}
