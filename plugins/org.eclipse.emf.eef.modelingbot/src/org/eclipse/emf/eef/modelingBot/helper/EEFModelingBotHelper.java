package org.eclipse.emf.eef.modelingBot.helper;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.Sequence;
import org.eclipse.emf.eef.modelingBot.Wizard;
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
	
	public static Processing getPrecedingEditActionOrSequence(Action action) {
		Collection<EObject> precedingSiblings = EMFHelper.precedingSiblings(action);
		if (precedingSiblings != null && !precedingSiblings.isEmpty()) {
			for (EObject prev : precedingSiblings) {
				if (prev instanceof EditAction || prev instanceof Sequence) {
					return (Processing) prev;
				}
			}
		}
		return null;
	}
	
	public static boolean isWizard(Processing processing) {
		return processing != null && processing instanceof Wizard;
	}

	public static int getNumberOfActionToUndo(Processing processing) {
		EList<EObject> eContents = processing.eContents();
		Collection<EObject> eContentsAction = new ArrayList<EObject>();
		for (EObject eObject : eContents) {
			if (eObject instanceof EditAction && !(eObject instanceof Cancel)) {
				eContentsAction.add(eObject);
			}
		}
		return eContentsAction.size();
	}

}
