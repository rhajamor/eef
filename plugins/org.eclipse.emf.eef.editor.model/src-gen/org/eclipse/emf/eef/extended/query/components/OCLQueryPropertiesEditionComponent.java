/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.extended.query.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.extended.query.OCLQuery;
import org.eclipse.emf.eef.extended.query.QueryPackage;
import org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart;
import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class OCLQueryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for context EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings contextSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OCLQueryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject oCLQuery, String editing_mode) {
		super(editingContext, oCLQuery, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = QueryViewsRepository.class;
		partKey = QueryViewsRepository.OCLQuery.class;
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
			final OCLQuery oCLQuery = (OCLQuery)elt;
			final OCLQueryPropertiesEditionPart basePart = (OCLQueryPropertiesEditionPart)editingPart;
			// init values
			if (oCLQuery.getQuery() != null && isAccessible(QueryViewsRepository.OCLQuery.Properties.query_))
				basePart.setQuery(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), oCLQuery.getQuery()));
			
			if (isAccessible(QueryViewsRepository.OCLQuery.Properties.context)) {
				// init part
				contextSettings = new EObjectFlatComboSettings(oCLQuery, QueryPackage.eINSTANCE.getOCLQuery_Context());
				basePart.initContext(contextSettings);
				// set the button mode
				basePart.setContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToContext(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EClassifier);
				}
			
			});
			// Start of user code for additional businessfilters for context
																								
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
		if (editorKey == QueryViewsRepository.OCLQuery.Properties.query_) {
			return QueryPackage.eINSTANCE.getOCLQuery_Query();
		}
		if (editorKey == QueryViewsRepository.OCLQuery.Properties.context) {
			return QueryPackage.eINSTANCE.getOCLQuery_Context();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OCLQuery oCLQuery = (OCLQuery)semanticObject;
		if (QueryViewsRepository.OCLQuery.Properties.query_ == event.getAffectedEditor()) {
			oCLQuery.setQuery((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (QueryViewsRepository.OCLQuery.Properties.context == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				contextSettings.setToReference((EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, contextSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			OCLQueryPropertiesEditionPart basePart = (OCLQueryPropertiesEditionPart)editingPart;
			if (QueryPackage.eINSTANCE.getOCLQuery_Query().equals(msg.getFeature()) && basePart != null && isAccessible(QueryViewsRepository.OCLQuery.Properties.query_)) {
				if (msg.getNewValue() != null) {
					basePart.setQuery(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setQuery("");
				}
			}
			if (QueryPackage.eINSTANCE.getOCLQuery_Context().equals(msg.getFeature()) && basePart != null && isAccessible(QueryViewsRepository.OCLQuery.Properties.context))
				basePart.setContext((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == QueryViewsRepository.OCLQuery.Properties.query_ || key == QueryViewsRepository.OCLQuery.Properties.context;
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
				if (QueryViewsRepository.OCLQuery.Properties.query_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(QueryPackage.eINSTANCE.getOCLQuery_Query().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(QueryPackage.eINSTANCE.getOCLQuery_Query().getEAttributeType(), newValue);
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
