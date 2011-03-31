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
package org.eclipse.emf.eef.codegen.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
class ImportMarker extends AdapterImpl {

    Collection<String> imports = new ArrayList<String>();

    public static ImportMarker getOrCreateMarker(EObject eObj) {
        ImportMarker found = null;
        Iterator<Adapter> it = eObj.eResource().getResourceSet().eAdapters().iterator();
        while (found == null && it.hasNext()) {
            Adapter cur = it.next();
            if (cur instanceof ImportMarker) {
                found = (ImportMarker) cur;
            }
        }
        if (found == null) {
            found = new ImportMarker();
            eObj.eResource().getResourceSet().eAdapters().add(found);
        }
        return found;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        for (String anImport : imports) {
            result.append(anImport);
            result.append(";\n");

        }
        return result.toString();
    }

    public void clear() {
        imports.clear();
    }

    public void add(String importNamespace) {
        imports.add(importNamespace);
    }
}