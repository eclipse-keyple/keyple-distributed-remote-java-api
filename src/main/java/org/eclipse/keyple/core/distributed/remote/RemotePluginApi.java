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
package org.eclipse.keyple.core.distributed.remote;

/**
 * API associated to a not observable {@link
 * org.eclipse.keyple.core.distributed.remote.spi.RemotePluginSpi}.
 *
 * @since 2.0
 */
public interface RemotePluginApi {

  /**
   * Must be invoked when a message containing a reader event is received from the distributed local
   * service in order to be forward to the associated observable remote reader.
   *
   * <p><u>Note</u> : This feature is only useful when the remote plugin is on network <b>client</b>
   * side.
   *
   * @param jsonData A JSON string containing the reader event.
   * @throws IllegalArgumentException If the JSON data is null, empty or malformed.
   * @throws IllegalStateException If there is no associated observable remote reader registered.
   * @since 2.0
   */
  void onReaderEvent(String jsonData);
}
