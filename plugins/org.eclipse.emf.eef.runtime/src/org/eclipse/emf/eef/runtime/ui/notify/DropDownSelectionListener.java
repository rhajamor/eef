/*******************************************************************************
 * Copyright (c) 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.notify;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class DropDownSelectionListener extends SelectionAdapter{

	protected Button dropdown;
	protected Menu menu;

	public DropDownSelectionListener(Button dropdown) {
		this.dropdown = dropdown;
		this.menu = new Menu(dropdown.getParent().getShell());
	}
	
	public void add(String item) {
		MenuItem menuItem = new MenuItem(menu, SWT.NONE);
		menuItem.setText(item);
		menuItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MenuItem selected = (MenuItem) e.widget;
				dropdown.setText(selected.getText());
			}
		});
	}
	
	
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		
		Button item = (Button) e.widget;
		
		Rectangle rectangle = item.getBounds();
		Point point = item.getParent().toDisplay(new Point(rectangle.x, rectangle.y));
		menu.setLocation(point.x, point.y + rectangle.height);
		menu.setVisible(true);
		
	}

}
