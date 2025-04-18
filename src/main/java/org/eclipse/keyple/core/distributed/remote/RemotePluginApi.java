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

/**
 * API associated to a {@link org.eclipse.keyple.core.distributed.remote.spi.RemotePluginSpi}.
 *
 * @since 2.0.0
 */
public interface RemotePluginApi {

  /**
   * Must be invoked when a message containing a reader event is received from the distributed local
   * service in order to be forward to the associated observable remote reader.
   *
   * @param jsonData A JSON string containing the reader event.
   * @throws IllegalArgumentException If the JSON data is null, empty or malformed.
   * @throws IllegalStateException If there is no associated observable remote reader registered.
   * @since 2.0.0
   */
  void onReaderEvent(String jsonData);
}
