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
package org.eclipse.keyple.core.distributed.remote;

import org.eclipse.keyple.core.distributed.remote.spi.RemoteReaderSpi;

/**
 * API associated to a {@link
 * org.eclipse.keyple.core.distributed.remote.spi.ObservableRemotePluginSpi}.
 *
 * @since 2.0.0
 */
public interface ObservableRemotePluginApi {

  /**
   * Creates a remote reader using the provided {@link RemoteReaderSpi} or {@link
   * org.eclipse.keyple.core.distributed.remote.spi.ObservableRemoteReaderSpi}, registers it and
   * notifies all plugin's observers for the connection of the new reader.
   *
   * <p>The {@code clientCoreApiLevel} parameter will enable the Distributed layer to transmit the
   * client's Core layer API level to the server's Core layer when a reader creation request is
   * made.
   *
   * @param remoteReaderSpi The remote reader to use.
   * @param clientCoreApiLevel The JSON API level of the associated client Core layer or -1 if
   *     unknown at this step.
   * @throws IllegalArgumentException If the provided reader is null.
   * @since 2.0.0
   */
  void addRemoteReader(RemoteReaderSpi remoteReaderSpi, int clientCoreApiLevel);

  /**
   * Tries to remove the remote reader having the provided name.
   *
   * @param remoteReaderName The name of the remote reader.
   * @throws IllegalArgumentException If reader name is null or empty.
   * @since 2.0.0
   */
  void removeRemoteReader(String remoteReaderName);

  /**
   * Must be invoked when a message containing a plugin event is received from the distributed local
   * service in order to be forward to the associated observable remote plugin.
   *
   * @param jsonData A JSON string containing the plugin event.
   * @throws IllegalArgumentException If the JSON data is null, empty or malformed.
   * @since 2.0.0
   */
  void onPluginEvent(String jsonData);
}
