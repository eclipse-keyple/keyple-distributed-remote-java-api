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
 * Distributed remote reader extension able to communicate with a distributed local service
 * extension.
 *
 * @since 2.0.0
 */
public interface RemoteReaderSpi {

  /**
   * Returns the name of the distributed remote reader extension.
   *
   * @return A not empty string.
   * @since 2.0.0
   */
  String getName();

  /**
   * Indicates if the local reader is contactless or not.
   *
   * @return Null if the information is unknown.
   * @since 3.1.0
   */
  Boolean isContactless();

  /**
   * Forwards the provided JSON data to the associated distributed local service in order to perform
   * a command on the associated local reader.
   *
   * @param jsonData A JSON string containing the data to transmit.
   * @return A JSON string containing the response received from the distributed local service. It
   *     can be empty if the command returns nothing.
   * @since 2.0.0
   */
  String executeRemotely(String jsonData);
}
