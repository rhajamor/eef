/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.ab.abstractnonreg.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.nonreg.Topic;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TopicPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;


// End of user code

/**
 * 
 * 
 */
public class TopicPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private TopicPropertiesEditionPart basePart;

	/**
	 * The TopicBasePropertiesEditionComponent sub component
	 * 
	 */
	protected TopicBasePropertiesEditionComponent topicBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param topic the EObject to edit
	 * 
	 */
	public TopicPropertiesEditionComponent(EObject topic, String editing_mode) {
		super(editing_mode);
		if (topic instanceof Topic) {
			IPropertiesEditionProvider provider = null;
			provider = PropertiesEditionComponentService.getInstance().getProvider(topic, TopicBasePropertiesEditionComponent.class);
			topicBasePropertiesEditionComponent = (TopicBasePropertiesEditionComponent)provider.getPropertiesEditionComponent(topic, editing_mode, TopicBasePropertiesEditionComponent.BASE_PART, TopicBasePropertiesEditionComponent.class);
			addSubComponent(topicBasePropertiesEditionComponent);
			provider = PropertiesEditionComponentService.getInstance().getProvider(topic, DocumentedElementPropertiesEditionComponent.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditionComponent(topic, editing_mode, DocumentedElementPropertiesEditionComponent.BASE_PART, DocumentedElementPropertiesEditionComponent.class);
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
		if (TopicBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (TopicPropertiesEditionPart)topicBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (NonregViewsRepository.Topic.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (TopicPropertiesEditionPart)propertiesEditionPart;
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
		if (key == NonregViewsRepository.Topic.class) {
			super.initPart(key, kind, element, allResource);
			documentedElementPropertiesEditionComponent.setPropertiesEditionPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, basePart.getDocumentedElementReferencedView());
			documentedElementPropertiesEditionComponent.initPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, element, allResource);
		}
		if (key == AbstractnonregViewsRepository.DocumentedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
