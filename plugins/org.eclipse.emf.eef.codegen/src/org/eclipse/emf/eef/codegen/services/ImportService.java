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

import org.eclipse.emf.ecore.EObject;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class ImportService {

    public void addImport(EObject current, String importNamespace) {
        ImportMarker.getOrCreateMarker(current).add(importNamespace);
    }

    public String getImports(EObject cur) {
        String importString = ImportMarker.getOrCreateMarker(cur).toString();
        ImportMarker.getOrCreateMarker(cur).clear();
        return importString;
    }

}

