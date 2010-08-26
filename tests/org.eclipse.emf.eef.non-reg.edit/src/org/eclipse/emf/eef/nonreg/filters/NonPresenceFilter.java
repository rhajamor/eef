/**
 * 
 */
package org.eclipse.emf.eef.nonreg.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.runtime.impl.filters.business.BusinessViewerFilter;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author glefur
 *
 */
public class NonPresenceFilter extends BusinessViewerFilter {
	
	private Person person;
	
	public NonPresenceFilter(EObject object) {
		super(object, "Exclude Talk that the given person present", false);
		if (object instanceof Person)
			this.person = (Person) object;
		else
			this.person = null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return this.person == null ||
			(element instanceof Talk && ((Talk)element).getPresenter() != person);
	}

}
