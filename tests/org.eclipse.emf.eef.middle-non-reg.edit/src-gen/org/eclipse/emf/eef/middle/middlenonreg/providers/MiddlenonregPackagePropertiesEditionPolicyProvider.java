/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.middle.middlenonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * 
 */
public class MiddlenonregPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return MiddlenonregPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || MiddlenonregPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
