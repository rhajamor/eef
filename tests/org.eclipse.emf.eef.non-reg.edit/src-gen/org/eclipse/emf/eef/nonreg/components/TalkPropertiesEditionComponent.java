/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.ab.abstractnonreg.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;


// End of user code

/**
 * 
 * 
 */
public class TalkPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private TalkPropertiesEditionPart basePart;

	/**
	 * The TalkBasePropertiesEditionComponent sub component
	 * 
	 */
	protected TalkBasePropertiesEditionComponent talkBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param talk the EObject to edit
	 * 
	 */
	public TalkPropertiesEditionComponent(EObject talk, String editing_mode) {
		super(editing_mode);
		if (talk instanceof Talk) {
			IPropertiesEditionProvider provider = null;
			provider = PropertiesEditionComponentService.getInstance().getProvider(talk, TalkBasePropertiesEditionComponent.class);
			talkBasePropertiesEditionComponent = (TalkBasePropertiesEditionComponent)provider.getPropertiesEditionComponent(talk, editing_mode, TalkBasePropertiesEditionComponent.BASE_PART, TalkBasePropertiesEditionComponent.class);
			addSubComponent(talkBasePropertiesEditionComponent);
			provider = PropertiesEditionComponentService.getInstance().getProvider(talk, DocumentedElementPropertiesEditionComponent.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditionComponent(talk, editing_mode, DocumentedElementPropertiesEditionComponent.BASE_PART, DocumentedElementPropertiesEditionComponent.class);
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
		if (TalkBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (TalkPropertiesEditionPart)talkBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (NonregViewsRepository.Talk.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (TalkPropertiesEditionPart)propertiesEditionPart;
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
		if (key == NonregViewsRepository.Talk.class) {
			super.initPart(key, kind, element, allResource);
			documentedElementPropertiesEditionComponent.setPropertiesEditionPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, basePart.getDocumentedElementReferencedView());
			documentedElementPropertiesEditionComponent.initPart(AbstractnonregViewsRepository.DocumentedElement.class, kind, element, allResource);
		}
		if (key == AbstractnonregViewsRepository.DocumentedElement.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
