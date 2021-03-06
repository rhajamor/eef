/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.worldcupforecast.provider;

import org.eclipse.worldcupforecast.util.WorldcupforecastAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldcupforecastItemProviderAdapterFactory extends WorldcupforecastAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n      Obeo - initial API and implementation";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldcupforecastItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.WorldCupForecast} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCupForecastItemProvider worldCupForecastItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.WorldCupForecast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorldCupForecastAdapter() {
		if (worldCupForecastItemProvider == null) {
			worldCupForecastItemProvider = new WorldCupForecastItemProvider(this);
		}

		return worldCupForecastItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.Forecast} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForecastItemProvider forecastItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.Forecast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForecastAdapter() {
		if (forecastItemProvider == null) {
			forecastItemProvider = new ForecastItemProvider(this);
		}

		return forecastItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.Team} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamItemProvider teamItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamAdapter() {
		if (teamItemProvider == null) {
			teamItemProvider = new TeamItemProvider(this);
		}

		return teamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.WorldCupGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCupGroupItemProvider worldCupGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.WorldCupGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorldCupGroupAdapter() {
		if (worldCupGroupItemProvider == null) {
			worldCupGroupItemProvider = new WorldCupGroupItemProvider(this);
		}

		return worldCupGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.Player} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerItemProvider playerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlayerAdapter() {
		if (playerItemProvider == null) {
			playerItemProvider = new PlayerItemProvider(this);
		}

		return playerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.ValidatePlayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidatePlayerItemProvider validatePlayerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.ValidatePlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValidatePlayerAdapter() {
		if (validatePlayerItemProvider == null) {
			validatePlayerItemProvider = new ValidatePlayerItemProvider(this);
		}

		return validatePlayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.FinalScore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalScoreItemProvider finalScoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.FinalScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalScoreAdapter() {
		if (finalScoreItemProvider == null) {
			finalScoreItemProvider = new FinalScoreItemProvider(this);
		}

		return finalScoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.MatchDay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchDayItemProvider matchDayItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.MatchDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchDayAdapter() {
		if (matchDayItemProvider == null) {
			matchDayItemProvider = new MatchDayItemProvider(this);
		}

		return matchDayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.ForecastDay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForecastDayItemProvider forecastDayItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.ForecastDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForecastDayAdapter() {
		if (forecastDayItemProvider == null) {
			forecastDayItemProvider = new ForecastDayItemProvider(this);
		}

		return forecastDayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.GroupStageMatch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupStageMatchItemProvider groupStageMatchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.GroupStageMatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupStageMatchAdapter() {
		if (groupStageMatchItemProvider == null) {
			groupStageMatchItemProvider = new GroupStageMatchItemProvider(this);
		}

		return groupStageMatchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.OtherKnockoutStageMatch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherKnockoutStageMatchItemProvider otherKnockoutStageMatchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.OtherKnockoutStageMatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOtherKnockoutStageMatchAdapter() {
		if (otherKnockoutStageMatchItemProvider == null) {
			otherKnockoutStageMatchItemProvider = new OtherKnockoutStageMatchItemProvider(this);
		}

		return otherKnockoutStageMatchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.ThirdPlaceMatch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThirdPlaceMatchItemProvider thirdPlaceMatchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.ThirdPlaceMatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThirdPlaceMatchAdapter() {
		if (thirdPlaceMatchItemProvider == null) {
			thirdPlaceMatchItemProvider = new ThirdPlaceMatchItemProvider(this);
		}

		return thirdPlaceMatchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.worldcupforecast.RoundOfSixteenMatch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundOfSixteenMatchItemProvider roundOfSixteenMatchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.worldcupforecast.RoundOfSixteenMatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoundOfSixteenMatchAdapter() {
		if (roundOfSixteenMatchItemProvider == null) {
			roundOfSixteenMatchItemProvider = new RoundOfSixteenMatchItemProvider(this);
		}

		return roundOfSixteenMatchItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (worldCupForecastItemProvider != null) worldCupForecastItemProvider.dispose();
		if (forecastItemProvider != null) forecastItemProvider.dispose();
		if (teamItemProvider != null) teamItemProvider.dispose();
		if (worldCupGroupItemProvider != null) worldCupGroupItemProvider.dispose();
		if (playerItemProvider != null) playerItemProvider.dispose();
		if (validatePlayerItemProvider != null) validatePlayerItemProvider.dispose();
		if (finalScoreItemProvider != null) finalScoreItemProvider.dispose();
		if (matchDayItemProvider != null) matchDayItemProvider.dispose();
		if (forecastDayItemProvider != null) forecastDayItemProvider.dispose();
		if (groupStageMatchItemProvider != null) groupStageMatchItemProvider.dispose();
		if (otherKnockoutStageMatchItemProvider != null) otherKnockoutStageMatchItemProvider.dispose();
		if (thirdPlaceMatchItemProvider != null) thirdPlaceMatchItemProvider.dispose();
		if (roundOfSixteenMatchItemProvider != null) roundOfSixteenMatchItemProvider.dispose();
	}

}
