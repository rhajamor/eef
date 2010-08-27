/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.ab.abstractnonreg.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.nonreg.components.TalkBasePropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.components.TalkPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;

/**
 * 
 * @generated
 */
public class TalkPropertiesEditionProvider implements IPropertiesEditionProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public boolean provides(EObject eObject) {
    return (eObject instanceof Talk) && (NonregPackage.eINSTANCE.getTalk() == eObject.eClass());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part) {
    return (eObject instanceof Talk) && (TalkBasePropertiesEditionComponent.BASE_PART.equals(part) || DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, java.lang.Class refinement) {
    return (eObject instanceof Talk) && (refinement == TalkBasePropertiesEditionComponent.class || refinement == DocumentedElementPropertiesEditionComponent.class);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part, java.lang.Class refinement) {
    return (eObject instanceof Talk) && ((TalkBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == TalkBasePropertiesEditionComponent.class) || (DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part) && refinement == DocumentedElementPropertiesEditionComponent.class));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode) {
    if (eObject instanceof Talk) {
      return new TalkPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String, java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode, String part) {
    if (eObject instanceof Talk) {
      if (TalkBasePropertiesEditionComponent.BASE_PART.equals(part))
        return new TalkBasePropertiesEditionComponent(eObject, editing_mode);
      if (DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part))
        return new DocumentedElementPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String, java.lang.String, java.lang.Class)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode, String part, java.lang.Class refinement) {
    if (eObject instanceof Talk) {
      if (TalkBasePropertiesEditionComponent.BASE_PART.equals(part)
        && refinement == TalkBasePropertiesEditionComponent.class)
        return new TalkBasePropertiesEditionComponent(eObject, editing_mode);
      if (DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part)
        && refinement == DocumentedElementPropertiesEditionComponent.class)
        return new DocumentedElementPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

}
