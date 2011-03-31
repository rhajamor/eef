/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.query.compound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.query.EEFQuery;
import org.eclipse.emf.eef.runtime.query.QueryProcessor;
import org.eclipse.emf.eef.runtime.query.QueryResult;
import org.eclipse.emf.eef.runtime.query.QueryWrapper;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class CompoundProcessor implements QueryProcessor {

	private List<QueryProcessor> processors;
	
	/**
	 * Empty constructor.
	 */
	public CompoundProcessor() {
		super();
		processors = new ArrayList<QueryProcessor>();
	}

	/**
	 * Parameterized constructor.
	 * @param processors the processors to use.
	 */
	public CompoundProcessor(QueryProcessor[] processors) {
		this.processors = Arrays.asList(processors);
	}
	
	/**
	 * Add a processor to the list of managed processors.
	 * @param processor the processor to add.
	 */
	public void addProcessor(QueryProcessor processor) {
		this.processors.add(processor);
	}

	/**
	 * Remove a processor to the list of managed processors.
	 * @param processor the processor to remove.
	 */
	public void removeProcessor(QueryProcessor processor) {
		this.processors.remove(processor);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.QueryProcessor#evaluate(org.eclipse.emf.ecore.EObject, org.eclipse.emf.eef.runtime.query.QueryWrapper)
	 */
	public QueryResult evaluate(EObject context, QueryWrapper query) {
		for (QueryProcessor processor : processors) {
			if (processor.canEvaluate(query))
				return processor.evaluate(context, query);
		}
		return new QueryResult(new Status(IStatus.ERROR, EEFQuery.PLUGIN_ID, "No processor can evaluate this query."), null);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.query.QueryProcessor#canEvaluate(org.eclipse.emf.eef.runtime.query.QueryWrapper)
	 */
	public boolean canEvaluate(QueryWrapper query) {
		for (QueryProcessor processor : processors) {
			if (processor.canEvaluate(query))
				return true;
		}
		return false;
	}

}
