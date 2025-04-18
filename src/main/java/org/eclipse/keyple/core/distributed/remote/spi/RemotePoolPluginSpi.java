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

/**
 * Distributed remote pool plugin extension able to communicate with a distributed local service
 * extension.
 *
 * @since 2.0.0
 */
public interface RemotePoolPluginSpi extends AbstractRemotePluginSpi {

  /**
   * Creates a {@link RemoteReaderSpi} associated to the local reader having the provided name.
   *
   * @param remoteReaderName The remote name of the associated local reader.
   * @param localReaderName The original name of the associated local reader.
   * @return A new instance.
   * @since 2.0.0
   */
  RemoteReaderSpi createRemoteReader(String remoteReaderName, String localReaderName);
}
