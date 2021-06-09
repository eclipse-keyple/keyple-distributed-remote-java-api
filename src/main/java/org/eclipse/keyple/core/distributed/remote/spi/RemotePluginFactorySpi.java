/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
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

/**
 * Factory of {@link RemotePluginSpi}.
 *
 * @since 2.0
 */
public interface RemotePluginFactorySpi {

  /**
   * Gets the distributed remote's API version used at compile time.
   *
   * @return A not empty string.
   * @since 2.0
   */
  String getDistributedRemoteApiVersion();

  /**
   * Gets the commons's API version used at compile time.
   *
   * @return A not empty string.
   * @since 2.0
   */
  String getCommonsApiVersion();

  /**
   * Retrieves the name of the distributed remote plugin that will be instantiated by this factory.
   *
   * @return A not empty string.
   * @since 2.0
   */
  String getRemotePluginName();

  /**
   * Retrieves an instance of a distributed remote plugin SPI (can be a singleton or not).
   *
   * @return A not null reference.
   * @since 2.0
   */
  AbstractRemotePluginSpi getRemotePlugin();
}
