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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.views.ViewsPackage;


// End of user code

/**
 * 
 * 
 */
public class TreeMasterPageBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TreeMasterPageBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject treeMasterPage, String editing_mode) {
		super(editingContext, treeMasterPage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EditorViewsRepository.class;
		partKey = EditorViewsRepository.TreeMasterPage.class;
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
			final TreeMasterPage treeMasterPage = (TreeMasterPage)elt;
			final TreeMasterPagePropertiesEditionPart basePart = (TreeMasterPagePropertiesEditionPart)editingPart;
			// init values
			if (treeMasterPage.getName() != null && isAccessible(EditorViewsRepository.TreeMasterPage.Naming.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), treeMasterPage.getName()));
			
			if (treeMasterPage.getTitle() != null && isAccessible(EditorViewsRepository.TreeMasterPage.Naming.title_))
				basePart.setTitle_(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), treeMasterPage.getTitle()));
			
			if (isAccessible(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible)) {
				basePart.setToolbarVisible(treeMasterPage.isToolbarVisible());
			}
			// init filters
			
			
			
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
		if (editorKey == EditorViewsRepository.TreeMasterPage.Naming.name) {
			return ViewsPackage.eINSTANCE.getViewElement_Name();
		}
		if (editorKey == EditorViewsRepository.TreeMasterPage.Naming.title_) {
			return EditorPackage.eINSTANCE.getEEFPage_Title();
		}
		if (editorKey == EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible) {
			return EditorPackage.eINSTANCE.getTreeMasterPage_ToolbarVisible();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TreeMasterPage treeMasterPage = (TreeMasterPage)semanticObject;
		if (EditorViewsRepository.TreeMasterPage.Naming.name == event.getAffectedEditor()) {
			treeMasterPage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EditorViewsRepository.TreeMasterPage.Naming.title_ == event.getAffectedEditor()) {
			treeMasterPage.setTitle((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible == event.getAffectedEditor()) {
			treeMasterPage.setToolbarVisible((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TreeMasterPagePropertiesEditionPart basePart = (TreeMasterPagePropertiesEditionPart)editingPart;
			if (ViewsPackage.eINSTANCE.getViewElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.TreeMasterPage.Naming.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EditorPackage.eINSTANCE.getEEFPage_Title().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.TreeMasterPage.Naming.title_)) {
				if (msg.getNewValue() != null) {
					basePart.setTitle_(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTitle_("");
				}
			}
			if (EditorPackage.eINSTANCE.getTreeMasterPage_ToolbarVisible().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible))
				basePart.setToolbarVisible((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EditorViewsRepository.TreeMasterPage.Naming.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EditorViewsRepository.TreeMasterPage.Naming.name)
			return "The element name"; //$NON-NLS-1$
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
				if (EditorViewsRepository.TreeMasterPage.Naming.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.TreeMasterPage.Naming.title_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EditorPackage.eINSTANCE.getEEFPage_Title().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EditorPackage.eINSTANCE.getEEFPage_Title().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EditorPackage.eINSTANCE.getTreeMasterPage_ToolbarVisible().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EditorPackage.eINSTANCE.getTreeMasterPage_ToolbarVisible().getEAttributeType(), newValue);
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
