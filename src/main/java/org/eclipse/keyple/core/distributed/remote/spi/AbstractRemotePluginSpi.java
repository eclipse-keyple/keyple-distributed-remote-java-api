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
 * Abstract API extended by all types of distributed remote plugin extensions able to communicate
 * with a distributed local service extension.
 *
 * @since 2.0.0
 */
public interface AbstractRemotePluginSpi {

  /**
   * Gets the name of the distributed remote plugin extension.
   *
   * @return A not empty string.
   * @since 2.0.0
   */
  String getName();

  /**
   * Forwards the provided JSON data to the associated distributed local service.
   *
   * @param jsonData A JSON string containing the data to transmit.
   * @return A JSON string containing the response received from the distributed local service. It
   *     can be empty if the command returns nothing.
   * @since 2.0.0
   */
  String executeRemotely(String jsonData);

  /**
   * Invoked when unregistering the plugin.
   *
   * @since 2.0.0
   */
  void onUnregister();
}
