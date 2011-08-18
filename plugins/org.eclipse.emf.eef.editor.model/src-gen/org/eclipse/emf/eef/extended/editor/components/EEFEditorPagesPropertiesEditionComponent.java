/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.extended.editor.EEFEditorPages;
import org.eclipse.emf.eef.extended.editor.parts.EEFEditorPagesPropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.views.components.DocumentedElementPropertiesEditionComponent;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EEFEditorPagesPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private EEFEditorPagesPropertiesEditionPart basePart;

	/**
	 * The EEFEditorPagesBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EEFEditorPagesBasePropertiesEditionComponent eEFEditorPagesBasePropertiesEditionComponent;
	/**
	 * The DocumentedElementPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentedElementPropertiesEditionComponent documentedElementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param eEFEditorPages the EObject to edit
	 * 
	 */
	public EEFEditorPagesPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eEFEditorPages, String editing_mode) {
		super(editingContext, editing_mode);
		if (eEFEditorPages instanceof EEFEditorPages) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eEFEditorPages, PropertiesEditingProvider.class);
			eEFEditorPagesBasePropertiesEditionComponent = (EEFEditorPagesBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EEFEditorPagesBasePropertiesEditionComponent.BASE_PART, EEFEditorPagesBasePropertiesEditionComponent.class);
			addSubComponent(eEFEditorPagesBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eEFEditorPages, PropertiesEditingProvider.class);
			documentedElementPropertiesEditionComponent = (DocumentedElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART, DocumentedElementPropertiesEditionComponent.class);
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
		if (EEFEditorPagesBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EEFEditorPagesPropertiesEditionPart)eEFEditorPagesBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (EditorViewsRepository.EEFEditorPages.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (EEFEditorPagesPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == EditorViewsRepository.EEFEditorPages.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ViewsViewsRepository.Documentation.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
