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
package org.eclipse.emf.eef.runtime.ui.parts.sequence;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public class BindingCompositionSequence extends CompositionSequence {

    private IPropertiesEditionComponent component;

    public BindingCompositionSequence(IPropertiesEditionComponent component) {
        super();
        this.component = component;
    }

    public BindingCompositionSequence(IPropertiesEditionComponent component, CompositionStep parent, Object id) {
        super(parent, id);
        this.component = component;
    }

    public CompositionStep addStep(Object key) {
        CompositionStep compositionStep = new BindingCompositionStep(component, this, key);
        subSteps.add(compositionStep);
        return compositionStep;
    }

}
