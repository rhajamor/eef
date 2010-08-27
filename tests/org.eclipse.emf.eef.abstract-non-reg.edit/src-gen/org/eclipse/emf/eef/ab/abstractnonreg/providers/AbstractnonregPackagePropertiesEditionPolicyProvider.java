/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.ab.abstractnonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * 
 */
public class AbstractnonregPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return AbstractnonregPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || AbstractnonregPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
