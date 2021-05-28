/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.core.distributed.remote.spi;

import org.eclipse.keyple.core.distributed.remote.ObservableRemotePluginApi;

/**
 * Distributed observable remote plugin extension able to communicate with a distributed local
 * service extension.
 *
 * @since 2.0
 */
public interface ObservableRemotePluginSpi extends RemotePluginSpi {

  /**
   * Connects the associated Keyple Core {@link ObservableRemotePluginApi} API.
   *
   * @param observableRemotePluginApi The API to connect.
   * @since 2.0
   */
  void connect(ObservableRemotePluginApi observableRemotePluginApi);

  /**
   * Invoked when the associated distributed local service <b>starts</b> the observation of all
   * observable local plugins.
   *
   * @since 2.0
   */
  void onStartObservation();

  /**
   * Invoked when the associated distributed local service <b>stops</b> the observation of all
   * observable local plugins.
   *
   * @since 2.0
   */
  void onStopObservation();
}
