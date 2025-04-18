/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * MIT License which is available at https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 ************************************************************************************** */
package org.eclipse.keyple.core.distributed.remote.spi;

import java.util.concurrent.ExecutorService;
import org.eclipse.keyple.core.distributed.remote.ObservableRemotePluginApi;

/**
 * Distributed observable remote plugin extension able to communicate with a distributed local
 * service extension.
 *
 * @since 2.0.0
 */
public interface ObservableRemotePluginSpi extends RemotePluginSpi {

  /**
   * Connects the associated Keyple Core {@link ObservableRemotePluginApi} API.
   *
   * @param observableRemotePluginApi The API to connect.
   * @since 2.0.0
   */
  void connect(ObservableRemotePluginApi observableRemotePluginApi);

  /**
   * Returns the custom service to be used to asynchronously notify remote reader connection events.
   *
   * @return Null if there is no custom executor service provided.
   * @since 2.1.0
   */
  ExecutorService getExecutorService();

  /**
   * Invoked when the associated distributed local service <b>starts</b> the observation of all
   * observable local plugins.
   *
   * @since 2.0.0
   */
  void onStartObservation();

  /**
   * Invoked when the associated distributed local service <b>stops</b> the observation of all
   * observable local plugins.
   *
   * @since 2.0.0
   */
  void onStopObservation();
}
