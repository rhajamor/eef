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
public class BindingCompositionStep extends CompositionStep {

    private IPropertiesEditionComponent component;

    /**
     * @param parent
     * @param key
     */
    public BindingCompositionStep(IPropertiesEditionComponent component, CompositionStep parent, Object key) {
        super(parent, key);
        this.component = component;
    }

    /**
     * (inheritDoc)
     * 
     * @see org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep#isVisibile()
     */
    @Override
    public boolean isVisibile() {
        return super.isVisibile() && component.mustBeComposed(key, 0);
    }

    @Override
    public CompositionStep addStep(Object key) {
        CompositionStep compositionStep = new BindingCompositionStep(component, this, key);
        subSteps.add(compositionStep);
        return compositionStep;
    }

}
