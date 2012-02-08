/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.editor.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.StaticEEFEditorContributionPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class StaticEEFEditorContributionBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for views ReferencesTable
	 */
	private	ReferencesTableSettings viewsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StaticEEFEditorContributionBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject staticEEFEditorContribution, String editing_mode) {
		super(editingContext, staticEEFEditorContribution, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EditorViewsRepository.class;
		partKey = EditorViewsRepository.StaticEEFEditorContribution.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final StaticEEFEditorContribution staticEEFEditorContribution = (StaticEEFEditorContribution)elt;
			final StaticEEFEditorContributionPropertiesEditionPart basePart = (StaticEEFEditorContributionPropertiesEditionPart)editingPart;
			// init values
			if (staticEEFEditorContribution.getName() != null && isAccessible(EditorViewsRepository.StaticEEFEditorContribution.Naming.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), staticEEFEditorContribution.getName()));
			
			if (isAccessible(EditorViewsRepository.StaticEEFEditorContribution.Binding.views)) {
				viewsSettings = new ReferencesTableSettings(staticEEFEditorContribution, MappingPackage.eINSTANCE.getAbstractElementBinding_Views());
				basePart.initViews(viewsSettings);
			}
			// init filters
			
			basePart.addFilterToViews(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInViewsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToViews(new EObjectFilter(ViewsPackage.eINSTANCE.getView()));
			// Start of user code for additional businessfilters for views
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EditorViewsRepository.StaticEEFEditorContribution.Naming.name) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Name();
		}
		if (editorKey == EditorViewsRepository.StaticEEFEditorContribution.Binding.views) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Views();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		StaticEEFEditorContribution staticEEFEditorContribution = (StaticEEFEditorContribution)semanticObject;
		if (EditorViewsRepository.StaticEEFEditorContribution.Naming.name == event.getAffectedEditor()) {
			staticEEFEditorContribution.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EditorViewsRepository.StaticEEFEditorContribution.Binding.views == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof View) {
					viewsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				viewsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				viewsSettings.move(event.getNewIndex(), (View) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			StaticEEFEditorContributionPropertiesEditionPart basePart = (StaticEEFEditorContributionPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Name().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.StaticEEFEditorContribution.Naming.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Views().equals(msg.getFeature())  && isAccessible(EditorViewsRepository.StaticEEFEditorContribution.Binding.views))
				basePart.updateViews();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EditorViewsRepository.StaticEEFEditorContribution.Naming.name || key == EditorViewsRepository.StaticEEFEditorContribution.Binding.views;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EditorViewsRepository.StaticEEFEditorContribution.Naming.name)
			return "The name of this element binding"; //$NON-NLS-1$
		if (key == EditorViewsRepository.StaticEEFEditorContribution.Binding.views)
			return "The mapped views"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EditorViewsRepository.StaticEEFEditorContribution.Naming.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
