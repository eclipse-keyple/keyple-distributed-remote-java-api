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

/**
 * Distributed remote observable reader extension able to communicate with a distributed local
 * service extension.
 *
 * @since 2.0
 */
public interface ObservableRemoteReaderSpi extends RemoteReaderSpi {

  /**
   * Invoked when the associated distributed local service <b>starts</b> the observation of a
   * specific observable local reader.
   *
   * @since 2.0
   */
  void onStartObservation();

  /**
   * Invoked when the associated distributed local service <b>stops</b> the observation of a
   * specific observable local reader.
   *
   * @since 2.0
   */
  void onStopObservation();
}
