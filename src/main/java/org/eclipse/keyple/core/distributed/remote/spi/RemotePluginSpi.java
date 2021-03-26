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

import org.eclipse.keyple.core.distributed.remote.RemotePluginApi;

/**
 * Distributed remote plugin extension able to communicate with a distributed local service
 * extension.
 *
 * @since 2.0
 */
public interface RemotePluginSpi {

  /**
   * Connects the associated Keyple Core {@link RemotePluginApi} API.
   *
   * @param remotePluginApi The API to connect.
   * @since 2.0
   */
  void connect(RemotePluginApi remotePluginApi);

  /**
   * Gets the name of the distributed remote plugin extension.
   *
   * @return A not empty string.
   * @since 2.0
   */
  String getName();

  /**
   * Forwards the provided JSON data to the associated distributed local service.
   *
   * @param jsonData A JSON string containing the data to transmit.
   * @return A JSON string containing the response received from the distributed local service. It
   *     can be empty if the command returns nothing.
   * @since 2.0
   */
  String executeRemotely(String jsonData);

  /**
   * Creates a {@link RemoteReaderSpi} associated to the local reader having the provided name.
   *
   * @param localReaderName The name of the associated local reader.
   * @param isObservable true if the local reader is observable.
   * @return A new instance.
   * @since 2.0
   */
  RemoteReaderSpi createRemoteReader(String localReaderName, boolean isObservable);

  /**
   * Indicates if the remote plugin is observable or not.
   *
   * @return true if it is observable.
   * @since 2.0
   */
  boolean isObservable();

  /**
   * Starts on the associated distributed local service the observation of all observable local
   * plugins.
   *
   * @since 2.0
   */
  void startPluginsObservation();

  /**
   * Tries to stops on the associated distributed local service the observation of all observable
   * local plugins.
   *
   * @since 2.0
   */
  void stopPluginsObservation();
}
