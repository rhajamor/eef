/**
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 *
 * $Id: TarotFactoryImpl.java,v 1.1.2.1 2010/08/25 12:58:28 sbouchet Exp $
 */
package org.eclipse.emf.samples.eef.tarot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.samples.eef.tarot.BID;
import org.eclipse.emf.samples.eef.tarot.Game;
import org.eclipse.emf.samples.eef.tarot.HANDFUL_SIZE;
import org.eclipse.emf.samples.eef.tarot.Handful;
import org.eclipse.emf.samples.eef.tarot.LeastAtLast;
import org.eclipse.emf.samples.eef.tarot.Misere;
import org.eclipse.emf.samples.eef.tarot.PLAYER_SIDE;
import org.eclipse.emf.samples.eef.tarot.Player;
import org.eclipse.emf.samples.eef.tarot.Round;
import org.eclipse.emf.samples.eef.tarot.Slam;
import org.eclipse.emf.samples.eef.tarot.TarotFactory;
import org.eclipse.emf.samples.eef.tarot.TarotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TarotFactoryImpl extends EFactoryImpl implements TarotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TarotFactory init() {
		try {
			TarotFactory theTarotFactory = (TarotFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/samples/tarot/1.0.0"); 
			if (theTarotFactory != null) {
				return theTarotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TarotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TarotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TarotPackage.GAME: return createGame();
			case TarotPackage.PLAYER: return createPlayer();
			case TarotPackage.ROUND: return createRound();
			case TarotPackage.MISERE: return createMisere();
			case TarotPackage.HANDFUL: return createHandful();
			case TarotPackage.LEAST_AT_LAST: return createLeastAtLast();
			case TarotPackage.SLAM: return createSlam();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TarotPackage.BID:
				return createBIDFromString(eDataType, initialValue);
			case TarotPackage.HANDFUL_SIZE:
				return createHANDFUL_SIZEFromString(eDataType, initialValue);
			case TarotPackage.PLAYER_SIDE:
				return createPLAYER_SIDEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TarotPackage.BID:
				return convertBIDToString(eDataType, instanceValue);
			case TarotPackage.HANDFUL_SIZE:
				return convertHANDFUL_SIZEToString(eDataType, instanceValue);
			case TarotPackage.PLAYER_SIDE:
				return convertPLAYER_SIDEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round createRound() {
		RoundImpl round = new RoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Misere createMisere() {
		MisereImpl misere = new MisereImpl();
		return misere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handful createHandful() {
		HandfulImpl handful = new HandfulImpl();
		return handful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeastAtLast createLeastAtLast() {
		LeastAtLastImpl leastAtLast = new LeastAtLastImpl();
		return leastAtLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slam createSlam() {
		SlamImpl slam = new SlamImpl();
		return slam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BID createBIDFromString(EDataType eDataType, String initialValue) {
		BID result = BID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HANDFUL_SIZE createHANDFUL_SIZEFromString(EDataType eDataType, String initialValue) {
		HANDFUL_SIZE result = HANDFUL_SIZE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHANDFUL_SIZEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLAYER_SIDE createPLAYER_SIDEFromString(EDataType eDataType, String initialValue) {
		PLAYER_SIDE result = PLAYER_SIDE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPLAYER_SIDEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TarotPackage getTarotPackage() {
		return (TarotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TarotPackage getPackage() {
		return TarotPackage.eINSTANCE;
	}

} //TarotFactoryImpl
