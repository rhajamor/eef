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
package org.eclipse.emf.eef.runtime.ui.comparator;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EMFModelViewerComparator extends ViewerComparator {

	private final ITableLabelProvider labelProvider;

	private int columnIndex;

	private int order;

	public EMFModelViewerComparator(ITableLabelProvider labelProvider) {
		this.labelProvider = labelProvider;
		columnIndex = 0;
		order = 1;
	}

	public void doSort(int columnIndex) {
		this.columnIndex = columnIndex;
		order = -order;
	}

	public int compare(Viewer viewer, Object o1, Object o2) {
		final String text1 = labelProvider.getColumnText(o1, columnIndex);
		final String text2 = labelProvider.getColumnText(o2, columnIndex);
		int r = order * text1.compareTo(text2);
		if (r == 0) {
			String text11 = ""; //$NON-NLS-1$
			String text22 = ""; //$NON-NLS-1$
			if (columnIndex == 0) {
				text11 = labelProvider.getColumnText(o1, 1);
				text22 = labelProvider.getColumnText(o2, 1);
			}
			if (columnIndex == 1) {
				text11 = labelProvider.getColumnText(o1, 0);
				text22 = labelProvider.getColumnText(o2, 0);
			}
			if (text11 != null && text22 != null && text11 != "" && text22 != "") { //$NON-NLS-1$//$NON-NLS-2$
				return order * text11.compareToIgnoreCase(text22);
			}
		}
		return order * text1.compareToIgnoreCase(text2);
	}
}
