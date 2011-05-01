/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo;

import java.util.Arrays;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings;
import org.eclipse.emf.eef.runtime.util.EEFUtils;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EObjectFlatComboSettings implements EEFEditorSettings {

	protected EObject source;

	protected EReference[] features;

	/**
	 * @param source
	 * @param path
	 */
	public EObjectFlatComboSettings(EObject source, EReference... features) {
		super();
		this.source = source;
		this.features = features;
	}

	/**
	 * @return the source
	 */
	public EObject getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(EObject source) {
		this.source = source;
	}

	/**
	 * @return the type of the last feature
	 */
	public EClassifier getEType() {
		return features[features.length - 1].getEType();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#isAffectingFeature(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public boolean isAffectingFeature(EStructuralFeature feature) {
		return Arrays.asList(features).contains(feature);
	}

	/************************************************************************************************
	 * * getValue() * *
	 ************************************************************************************************/

	/**
	 * @return the list of elements following the path.
	 */
	public Object getValue() {
		if (((EClass)features[0].eContainer()).isInstance(source)) {
			if (features[0].isMany()) {
				throw new IllegalStateException(
						"Ambigous case - Cannot process ModelNavigation with multiple references");
			} else {
				Object value1 = ((EObject)source).eGet(features[0]);
				if (features.length == 1) {
					return value1 == null ? "" : value1;
				} else {
					if (features[1].isMany()) {
						throw new IllegalStateException(
								"Ambigous case - Cannot process ModelNavigation with multiple references");
					} else {
						return value1 == null ? "" : ((EObject)value1).eGet(features[1]);
					}
				}
			}
		}
		return null;
	}

	/************************************************************************************************
	 * * Set via ModelNavigation * *
	 ************************************************************************************************/

	/**
	 * Add a new value following a list of StructualFeatures to a given EObject
	 * 
	 * @param newValue
	 *            the value to add
	 */
	public void setToReference(Object newValue) {
		Object value1 = source.eGet(features[0]);
		if (features[0].isMany()) {
			throw new IllegalStateException(
					"Ambigous case - Cannot process ModelNavigation with multiple references");
		} else /* ref is Single */{
			setFirstSingle((EObject)value1, (newValue instanceof EObject ? (EObject)newValue : null));
		}
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a single
	 * reference
	 * 
	 * @param ref1Value
	 * @param newValue
	 */
	protected void setFirstSingle(EObject ref1Value, EObject newValue) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				throw new IllegalStateException(
						"Ambigous case - Cannot process ModelNavigation with multiple references");
			} else {
				setFirstSingleSecondSingle(features[1], newValue);
			}
		} else {
			source.eSet(features[0], newValue);
		}
	}

	/**
	 * @param value2
	 * @param newValue
	 */
	protected void setFirstSingleSecondSingle(Object value2, EObject newValue) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation without multiple reference");
	}

	/************************************************************************************************
	 * * Choice of Value * *
	 ************************************************************************************************/

	/**
	 * @param adapterFactory
	 * @return
	 */
	public Object choiceOfValues(AdapterFactory adapterFactory) {
		// FIXME: choiceOfValues should be called with the adapterFactory in
		// parameter
		if (features.length == 1)
			return EEFUtils.choiceOfValues(source, features[0]);
		else {
			if (features.length > 1) {
				EObject tmp = EcoreUtil.create((EClass)features[0].getEType());
				Object result = EEFUtils.choiceOfValues(tmp, features[1]);
				EcoreUtil.delete(tmp);
				return result;
			}
		}
		return null;
	}

	/**
	 * @return the last reference of the settings.
	 */
	public EReference getLastReference() {
		return features[features.length - 1];
	}

	
}
