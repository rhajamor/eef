package org.eclipse.emf.eef.modelingBot.helper;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.EEFActions.Cancel;
import org.eclipse.emf.eef.modelingBot.EEFActions.EditAction;

public class EEFModelingBotHelper {


	public static boolean isFollowingByCancel(Action action) {
		Collection<EObject> followingSiblings = EMFHelper.followingSiblings(action);
		if (followingSiblings != null && !followingSiblings.isEmpty()) {
			EObject next = followingSiblings.iterator().next();
			if (next instanceof Cancel) {
				return true;
			}
		}
		return false;
		
	}
	
	public static Cancel getFollowingCancelAction(Action action) {
		Collection<EObject> followingSiblings = EMFHelper.followingSiblings(action);
		if (followingSiblings != null && !followingSiblings.isEmpty()) {
			EObject next = followingSiblings.iterator().next();
			if (next instanceof Cancel) {
				return (Cancel) next;
			}
		}
		return null;
		
	}
	
	public static EditAction getCancelPrecedingAction(Cancel action) {
		Collection<EObject> precedingSiblings = EMFHelper.precedingSiblings(action);
		if (precedingSiblings != null && !precedingSiblings.isEmpty()) {
			EObject prev = precedingSiblings.iterator().next();
			if (prev instanceof EditAction) {
				return (EditAction) prev;
			}
		}
		return null;
		
	}
	
	
	

}
