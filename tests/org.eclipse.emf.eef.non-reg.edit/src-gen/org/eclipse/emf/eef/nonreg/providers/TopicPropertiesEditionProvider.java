/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.ab.abstractnonreg.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Topic;
import org.eclipse.emf.eef.nonreg.components.TopicBasePropertiesEditionComponent;
import org.eclipse.emf.eef.nonreg.components.TopicPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;

/**
 * 
 * @generated
 */
public class TopicPropertiesEditionProvider implements IPropertiesEditionProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public boolean provides(EObject eObject) {
    return (eObject instanceof Topic) && (NonregPackage.eINSTANCE.getTopic() == eObject.eClass());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part) {
    return (eObject instanceof Topic) && (TopicBasePropertiesEditionComponent.BASE_PART.equals(part) || DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, java.lang.Class refinement) {
    return (eObject instanceof Topic) && (refinement == TopicBasePropertiesEditionComponent.class || refinement == DocumentedElementPropertiesEditionComponent.class);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#provides(org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.Class)
	 * @generated
	 */
	public boolean provides(EObject eObject, String part, java.lang.Class refinement) {
    return (eObject instanceof Topic) && ((TopicBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == TopicBasePropertiesEditionComponent.class) || (DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part) && refinement == DocumentedElementPropertiesEditionComponent.class));
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider#getPropertiesEditionComponent(org.eclipse.emf.ecore.EObject,
	 *  java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditionComponent(EObject eObject, String editing_mode) {
    if (eObject instanceof Topic) {
      return new TopicPropertiesEditionComponent(eObject, editing_mode);
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
    if (eObject instanceof Topic) {
      if (TopicBasePropertiesEditionComponent.BASE_PART.equals(part))
        return new TopicBasePropertiesEditionComponent(eObject, editing_mode);
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
    if (eObject instanceof Topic) {
      if (TopicBasePropertiesEditionComponent.BASE_PART.equals(part)
        && refinement == TopicBasePropertiesEditionComponent.class)
        return new TopicBasePropertiesEditionComponent(eObject, editing_mode);
      if (DocumentedElementPropertiesEditionComponent.BASE_PART.equals(part)
        && refinement == DocumentedElementPropertiesEditionComponent.class)
        return new DocumentedElementPropertiesEditionComponent(eObject, editing_mode);
    }
    return null;
  }

}
