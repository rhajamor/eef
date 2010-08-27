/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * @generated
 */
public class NonregPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public boolean provides(EObject eObject) {
    return NonregPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || NonregPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
  }

}
