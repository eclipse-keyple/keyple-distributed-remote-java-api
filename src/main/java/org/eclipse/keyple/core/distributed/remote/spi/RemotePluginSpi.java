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
public interface RemotePluginSpi extends AbstractRemotePluginSpi {

  /**
   * Connects the associated Keyple Core {@link RemotePluginApi} API.
   *
   * @param remotePluginApi The API to connect.
   * @since 2.0
   */
  void connect(RemotePluginApi remotePluginApi);

  /**
   * Creates a {@link RemoteReaderSpi} associated to the local reader having the provided name.
   *
   * @param localReaderName The name of the associated local reader.
   * @return A new instance.
   * @since 2.0
   */
  RemoteReaderSpi createRemoteReader(String localReaderName);

  /**
   * Creates a {@link ObservableRemoteReaderSpi} associated to the local reader having the provided
   * name.
   *
   * @param localReaderName The name of the associated local observable reader.
   * @return A new instance.
   * @throws IllegalStateException If the reader observation strategy is not configured.
   * @since 2.0
   */
  ObservableRemoteReaderSpi createObservableRemoteReader(String localReaderName);
}
