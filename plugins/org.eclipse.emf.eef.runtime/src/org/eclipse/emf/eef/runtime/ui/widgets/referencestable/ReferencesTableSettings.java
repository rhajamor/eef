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
package org.eclipse.emf.eef.runtime.ui.widgets.referencestable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class ReferencesTableSettings implements EEFEditorSettings {

	protected EObject source;

	protected EReference[] features;

	/**
	 * @param source
	 * @param path
	 */
	public ReferencesTableSettings(EObject source, EReference... features) {
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
	 * @return the last reference of the settings.
	 */
	public EReference getLastReference() {
		return features[features.length - 1];
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
	 * * getElements() * *
	 ************************************************************************************************/

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#getValue()
	 */
	public Object[] getValue() {
		if (((EClass)features[0].eContainer()).isInstance(source)) {
			Object value1 = ((EObject)source).eGet(features[0]);
			if (value1 != null) {
				if (features.length == 1) {
					return features[0].isMany() ? ((List<EObject>)value1).toArray() : new Object[] {value1};
				} else {
					if (features[0].isMany()) {
						List<Object> result = new ArrayList<Object>();
						for (EObject elem : ((List<EObject>)value1)) {
							if (features[1].isMany())
								result.addAll((List<EObject>)elem.eGet(features[1]));
							else {
								EObject value2 = (EObject)elem.eGet(features[1]);
								result.add(value2 == null ? "" : value2);
							}
						}
						return result.toArray();
					} else {
						if (features[1].isMany()) {
							return ((List)((EObject)value1).eGet(features[1])).toArray();
						} else {
							Object value2 = ((EObject)value1).eGet(features[1]);
							return new Object[] {value2 == null ? "" : value2};
						}
					}
				}
			}
		}
		return new Object[0];
	}

	/************************************************************************************************
	 * * Add via ModelNavigation * *
	 ************************************************************************************************/

	/**
	 * Add a new value following a list of StructualFeatures to a given EObject
	 * 
	 * @param newValue
	 *            the value to add
	 */
	public void addToReference(EObject newValue) {
		Object value1 = source.eGet(features[0]);
		if (features[0].isMany()) {
			addFirstMany((List<EObject>)value1, newValue);
		} else /* ref is Single */{
			addFirstSingle((EObject)value1, newValue);
		}
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a multiple
	 * reference
	 * 
	 * @param ref1Values
	 * @param newValue
	 */
	protected void addFirstMany(List<EObject> ref1Values, EObject newValue) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				addFirstManySecondMany(ref1Values, newValue);
			} else {
				addFirstManySecondSingle(ref1Values, newValue);
			}
		} else {
			// There is only one multiple reference in the path, we simply add
			// the new value to
			// the existing values
			((List<EObject>)ref1Values).add(newValue);
		}
	}

	/**
	 * @param ref1Values
	 * @param newValue
	 */
	protected void addFirstManySecondMany(List<EObject> ref1Values, EObject newValue) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation with more than one multiple reference");
	}

	/**
	 * @param newValue
	 * @param ref2
	 */
	protected void addFirstManySecondSingle(List<EObject> ref1Values, EObject newValue) {
		EObject intermediate = EcoreUtil.create(features[0].getEReferenceType());
		((EObject)intermediate).eSet(features[1], newValue);
		ref1Values.add(intermediate);
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a single
	 * reference
	 * 
	 * @param ref1Value
	 * @param newValue
	 */
	protected void addFirstSingle(EObject ref1Value, EObject newValue) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				addFirstSingleSecondMany(ref1Value, newValue);
			} else {
				addFirstSingleSecondSingle(ref1Value, newValue);
			}
		} else {
			// There is only one single reference in the path, we simply add the
			// new value to
			// the existing values. Must be an error ?
			source.eSet(features[0], newValue);
		}
	}

	/**
	 * @param ref1Value
	 * @param newValue
	 */
	protected void addFirstSingleSecondMany(EObject ref1Value, EObject newValue) {
		if (ref1Value == null) {
			ref1Value = EcoreUtil.create(features[0].getEReferenceType());
			// WARNING: Cannot be an abstract class
			source.eSet(features[0], ref1Value);
		}
		((List<EObject>)ref1Value.eGet(features[1])).add(newValue);
	}

	/**
	 * @param ref1Value
	 * @param newValue
	 */
	protected void addFirstSingleSecondSingle(EObject ref1Value, EObject newValue) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation without multiple reference");
	}

	/************************************************************************************************
	 * * Set via ModelNavigation * *
	 ************************************************************************************************/

	/**
	 * Add a new value following a list of StructualFeatures to a given EObject
	 * 
	 * @param newValues
	 *            the value to add
	 */
	public void setToReference(List<EObject> newValues) {
		Object value1 = source.eGet(features[0]);
		if (features[0].isMany()) {
			setFirstMany((List<EObject>)value1, newValues);
		} else /* ref is Single */{
			setFirstSingle((EObject)value1, newValues);
		}
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a multiple
	 * reference
	 * 
	 * @param ref1Values
	 * @param newValues
	 */
	protected void setFirstMany(List<EObject> ref1Values, List<EObject> newValues) {
		if (features.length > 1) {
			EReference ref2 = features[1];
			if (ref2.isMany()) {
				setFirstManySecondMany(ref1Values, newValues);
			} else {
				setFirstManySecondSingle(ref1Values, newValues);
			}
		} else {
			// There is only one multiple reference in the path, we simply add
			// the new value to
			// the existing values
			source.eSet(features[0], newValues);
		}
	}

	/**
	 * @param ref1Values
	 * @param newValues
	 */
	protected void setFirstManySecondMany(List<EObject> ref1Values, List<EObject> newValues) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation with more than one multiple reference");
	}

	/**
	 * @param ref1Values
	 * @param newValues
	 */
	protected void setFirstManySecondSingle(List<EObject> ref1Values, List<EObject> newValues) {
		List<EObject> todo = new ArrayList<EObject>(newValues);
		List<EObject> toremove = new ArrayList<EObject>();
		// First, we check the existing values. Mainly, we create a list of
		// elements
		// to remove (i.e. not in the new values.
		for (EObject ref1Value : ref1Values) {
			EObject ref2Value = (EObject)ref1Value.eGet(features[1]);
			if (todo.contains(ref2Value))
				todo.remove(ref2Value);
			else
				toremove.add(ref1Value);
		}
		// We remove those we have detected to remove
		for (EObject eObject : toremove) {
			ref1Values.remove(eObject);
		}
		// Finally we have those we don't have found in the existing values
		for (EObject eObject : todo) {
			EObject intermediate = EcoreUtil.create(features[0].getEReferenceType());
			intermediate.eSet(features[1], eObject);
			ref1Values.add(intermediate);
		}
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a single
	 * reference
	 * 
	 * @param ref1Value
	 * @param newValues
	 * @param ref
	 */
	protected void setFirstSingle(EObject ref1Value, List<EObject> newValues) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				setFirstSingleSecondMany(ref1Value, newValues);
			} else {
				setFirstSingleSecondSingle(features[1], newValues);
			}
		} else {
			// There is only one single reference in the path, we simply add the
			// new value to
			// the existing values. Must be an error ?
			source.eSet(features[0], newValues);
		}
	}

	/**
	 * @param ref1Value
	 * @param newValues
	 */
	protected void setFirstSingleSecondMany(EObject ref1Value, List<EObject> newValues) {
		if (ref1Value == null) {
			ref1Value = EcoreUtil.create(features[0].getEReferenceType());
			// WARNING: Cannot be an abstract class
			source.eSet(features[0], ref1Value);
		}
		ref1Value.eSet(features[1], newValues);
	}

	/**
	 * @param value2
	 * @param newValues
	 */
	protected void setFirstSingleSecondSingle(Object value2, List<EObject> newValues) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation without multiple reference");
	}

	/************************************************************************************************
	 * * Remove via ModelNavigation * *
	 ************************************************************************************************/

	/**
	 * Remove a value following a list of StructualFeatures to a given EObject
	 * @param valueToRemove the value to remove
	 */

	public void removeFromReference(EObject valueToRemove) {
		EReference ref = features[0];
		Object value1 = source.eGet(ref);
		if (ref.isMany()) {
			removeFirstMany((List<EObject>)value1, valueToRemove);
		} else /* ref is Single */{
			removeFirstSingle((EObject)value1, valueToRemove);
		}
	}

	protected void removeFirstMany(List<EObject> value1, EObject valueToRemove) {
		if (features.length > 1) {
			EReference ref2 = features[1];
			if (ref2.isMany()) {
				removeFirstManySecondMany(value1, valueToRemove);
			} else { /* ref2 is Single */
				removeFirstManySecondSingle(value1, valueToRemove);
			}
		} else {
			// EcoreUtil.delete if the reference is containment.
			if (features[0].isContainment()) {
				EcoreUtil.delete(valueToRemove);
			} else {
				value1.remove(valueToRemove);
			}
		}
	}

	protected void removeFirstManySecondMany(List<EObject> ref1Values, EObject valueToRemove) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation with more than one multiple reference");
	}

	protected void removeFirstManySecondSingle(List<EObject> value1, EObject valueToRemove) {
		EObject elemToRemove = null;
		for (EObject elem : value1) {
			EObject elem2 = (EObject)((EObject)elem).eGet(features[1]);
			if (elem2 != null && elem2.equals(valueToRemove)) {
				elemToRemove = elem;
			}
		}
		if (features[0].isContainment()) {
			EcoreUtil.delete(elemToRemove);
		} else {
			value1.remove(elemToRemove);
		}
	}

    protected void removeFirstSingle(EObject value1, EObject valueToRemove) {
        if (features.length > 1) {
              Object value2 = value1.eGet(features[1]);
              if (features[1].isMany()) {
                    removeFirstSingleSecondMany((List<EObject>)value2, valueToRemove);
              } else { /* ref2 is Single */
                    removeFirstSingleSecondSingle();
              }
        } else {
              // EcoreUtil.delete if the reference is containment.
              if (features[0].isContainment()) {
                    EcoreUtil.delete(valueToRemove);
              } else {
                    source.eUnset(features[0]);
              }
        }
  }
    
	protected void removeFirstSingleSecondMany(List<EObject> value2, EObject valueToRemove) {
		if (features[1].isContainment()) {
			EcoreUtil.delete(valueToRemove);
		} else {
			value2.remove(valueToRemove);
		}
	}


	protected void removeFirstSingleSecondSingle() {
		if (features[0].isContainment()) {
			EcoreUtil.delete((EObject) source.eGet(features[0]));
		} else {
			source.eUnset(features[0]);
		}
	}

	/**
	 * Defines if the given value is already contained in the given path
	 * 
	 * @param toCheck
	 *            the element to check
	 */
	public boolean contains(EObject toCheck) {
		EReference ref = features[0];
		Object value1 = source.eGet(ref);
		if (ref.isMany()) {
			if (features.length > 1) {
				EReference ref2 = features[1];
				if (ref2.isMany()) {
					for (EObject elem : (List<EObject>)value1) {
						List<EObject> value2 = (List<EObject>)((EObject)elem).eGet(ref2);
						if (value2.contains(toCheck))
							return true;
					}
					return false;
				} else { /* ref2 is Single */
					EObject elemToRemove = null;
					for (EObject elem : (List<EObject>)value1) {
						EObject elem2 = (EObject)((EObject)elem).eGet(ref2);
						if (elem2 != null && elem2.equals(toCheck)) {
							return true;
						}
					}
					return false;
				}
			} else {
				return ((List<EObject>)value1).contains(toCheck);
			}
		} else /* ref is Single */{
			if (features.length > 1) {
				EReference ref2 = features[1];
				Object value2 = ((EObject)value1).eGet(ref2);
				if (ref2.isMany()) {
					return ((List<EObject>)value2).contains(toCheck);
				} else { /* ref2 is Single */
					return value2.equals(toCheck);
				}
			} else {
				return value1.equals(toCheck);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings#choiceOfValues(org.eclipse.emf.common.notify.AdapterFactory)
	 */
	public Object choiceOfValues(AdapterFactory adapterFactory) {
		// FIXME: choiceOfValues should be called with the adapterFactory in
		// parameter
		if (features.length == 1)
			return EEFUtils.choiceOfValues(source, features[0]);
		else {
			if (features.length > 1) {
				EObject tmp = EcoreUtil.create((EClass)features[0].getEType());
				source.eResource().getContents().add(tmp);
				Object result = EEFUtils.choiceOfValues(tmp, features[1]);
				EcoreUtil.delete(tmp);
				return result;
			}
		}
		return null;
	}

	/************************************************************************************************
	 * * Move via ModelNavigation * *
	 ************************************************************************************************/

	/**
	 * Move an element to the new index
	 * 
	 * @param newValue
	 *            the value to add
	 */
	public void move(int newIndex, EObject element) {
		Object value1 = source.eGet(features[0]);
		if (features[0].isMany()) {
			moveFirstMany((EList<EObject>)value1, newIndex, element);
		} else /* ref is Single */{
			moveFirstSingle((EObject)value1, newIndex, element);
		}
	}

	/**
	 * This method move an element to the managed reference(s) if the first reference in the path is a multiple
	 * reference
	 * 
	 * @param ref1Values
	 * @param newValue
	 */
	protected void moveFirstMany(EList<EObject> ref1Values, int newIndex, EObject element) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				moveFirstManySecondMany(ref1Values, newIndex, element);
			} else {
				moveFirstManySecondSingle(ref1Values, newIndex, element);
			}
		} else {
			// There is only one multiple reference in the path, we simply add
			// the new value to
			// the existing values
			((EList<EObject>)ref1Values).move(newIndex, element);
		}
	}

	/**
	 * @param ref1Values
	 * @param newValue
	 */
	protected void moveFirstManySecondMany(EList<EObject> ref1Values, int newIndex, EObject element) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation with more than one multiple reference");
	}

	/**
	 * @param newValue
	 * @param ref2
	 */
	protected void moveFirstManySecondSingle(EList<EObject> ref1Values, int newIndex, EObject element) {
		for (EObject eObject : ref1Values) {
			if (eObject.eGet(features[1]).equals(element)) {
				ref1Values.move(newIndex, eObject);
				return;
			}
		}
	}

	/**
	 * This method add newValue to the managed reference(s) if the first reference in the path is a single
	 * reference
	 * 
	 * @param ref1Value
	 * @param newValue
	 */
	protected void moveFirstSingle(EObject ref1Value, int newIndex, EObject element) {
		if (features.length > 1) {
			if (features[1].isMany()) {
				moveFirstSingleSecondMany(ref1Value, newIndex, element);
			} else {
				moveFirstSingleSecondSingle(ref1Value, newIndex, element);
			}
		} else {
			// There is only one single reference in the path, we simply add the
			// new value to
			// the existing values. Must be an error ?
			throw new IllegalStateException("Ambigous case - Cannot process move for ModelNavigation with one single reference");
		}
	}

	/**
	 * @param ref1Value
	 * @param newValue
	 */
	protected void moveFirstSingleSecondMany(EObject ref1Value, int newIndex, EObject element) {
		((EList<EObject>)ref1Value.eGet(features[1])).move(newIndex, element);
	}

	/**
	 * @param ref1Value
	 * @param newValue
	 */
	protected void moveFirstSingleSecondSingle(EObject ref1Value, int newIndex, EObject element) {
		throw new IllegalStateException(
				"Ambigous case - Cannot process ModelNavigation without multiple reference");
	}
}
