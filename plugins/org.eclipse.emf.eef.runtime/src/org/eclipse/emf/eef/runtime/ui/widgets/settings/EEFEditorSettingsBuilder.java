/**
 * 
 */
package org.eclipse.emf.eef.runtime.ui.widgets.settings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;



/**
 * @author glefur
 * @since 1.0
 *
 */
public class EEFEditorSettingsBuilder  {

	private EObject source;
	private EStructuralFeature feature;
	private List<NavigationStep> steps;
	
	/**
	 * @param source
	 * @param feature 
	 * @return a new instance of {@link EEFEditorSettingsBuilder}.
	 */
	public static EEFEditorSettingsBuilder create(EObject source, EStructuralFeature feature) {
		return new EEFEditorSettingsBuilder(source, feature);
	}
	
	/**
	 * @param source
	 * @param feature 
	 */
	private EEFEditorSettingsBuilder(EObject source, EStructuralFeature feature) { 
		this.source = source;
		this.feature = feature;
		steps = new ArrayList<NavigationStep>();
	}
	
	/**
	 * @param step
	 * @return
	 */
	public EEFEditorSettingsBuilder nextStep(NavigationStep step) {
		steps.add(step);
		return this;
	}

	/**
	 * @return
	 */
	public EEFEditorSettings build() {
		for (NavigationStep step : steps) {
			if (step.getReference().isMany() && step.getIndex() == NavigationStep.NOT_INITIALIZED) {
				throw new IllegalStateException("Navigation step misconfigured : Reference " + step.getReference().getName() + " is mulivalued. You must define an index.");
			}
		}
		return new EEFEditorSettingsImpl(source, feature, (List<NavigationStep>) Collections.unmodifiableList(steps));
	}
	
	/**
	 * @author glefur
	 *
	 */
	public class EEFEditorSettingsImpl implements EEFEditorSettings {

		private EObject source;
		private EStructuralFeature feature; 
		private List<NavigationStep> steps;
		private EObject significantObject;
		
		private EEFEditorSettingsImpl(EObject source, EStructuralFeature feature, List<NavigationStep> steps) {
			this.source = source;
			this.feature = feature;
			this.steps = steps;
		}
		
		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#getValue()
		 */
		public Object getValue() {
			return getSignificantObject().eGet(feature);
		}

		/**
		 * Compute and cache the object to edit following the NavigationStep.
		 * @return object to edit.
		 */
		private EObject getSignificantObject() {
			if (significantObject == null) {
				EObject current = source;
				for (NavigationStep step : EEFEditorSettingsImpl.this.steps) {
					if (step.getReference().isMany()) {
						@SuppressWarnings("unchecked")
						List<EObject> result = (List<EObject>)source.eGet(step.getReference());
						List<EObject> result2 = Collections.emptyList();
						if (step.getDiscriminator() != null) {
							for (EObject eObject : result) {
								if (step.getDiscriminator().isInstance(eObject)) {
									result2.add(eObject);
								}
							}
						} else {
							result2 = result;
						}
						if (step.getIndex() != NavigationStep.NOT_INITIALIZED && step.getIndex() < result2.size()) {
							current = result2.get(step.getIndex());
						} else {
							throw new IllegalStateException();
						}

					} else {
						current = (EObject) current.eGet(step.getReference());
					}
				}
				significantObject = current;
			}
			return significantObject;
		}
		
		public void setValue(Object newValue) {
			getSignificantObject().eSet(feature, newValue);
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#choiceOfValues(org.eclipse.emf.common.notify.AdapterFactory)
		 */
		public Object choiceOfValues(AdapterFactory adapterFactory) {
			return feature instanceof EReference ? EEFUtils.choiceOfValues(source, feature) : null;
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#isAffectingFeature(org.eclipse.emf.ecore.EStructuralFeature)
		 */
		public boolean isAffectingFeature(EStructuralFeature feature) {
			for (NavigationStep step : EEFEditorSettingsImpl.this.steps) {
				if (step.getReference().equals(feature)) {
					return true;
				}
			}
			return false;
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#getSource()
		 */
		public EObject getSource() {
			return source;
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#getEType()
		 */
		public EClassifier getEType() {
			return feature.getEType();
		}

		/**
		 * {@inheritDoc}
		 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#getLastReference()
		 */
		public EReference getLastReference() {
			if (feature instanceof EReference) {
				return (EReference) feature;
			} else if (EEFEditorSettingsImpl.this.steps.size() > 0) {
				return EEFEditorSettingsImpl.this.steps.get(EEFEditorSettingsImpl.this.steps.size() - 1).getReference();
			}
			return null;
		}
	}
	
}
