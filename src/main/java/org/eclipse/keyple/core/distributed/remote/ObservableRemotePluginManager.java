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

import org.eclipse.keyple.core.distributed.remote.spi.RemoteReaderSpi;

/**
 * Manager associated to an observable {@link
 * org.eclipse.keyple.core.distributed.remote.spi.RemotePluginSpi}.
 *
 * @since 2.0
 */
public interface ObservableRemotePluginManager extends RemotePluginManager {

  /**
   * Registers a {@link RemoteReaderSpi} as a master remote reader and notifies all plugin's
   * observers for the connection of a new reader.
   *
   * <p>The provided remote reader can be observable or not.
   *
   * <p><u>Note</u> : This feature is only useful when the remote plugin is on network <b>server</b>
   * side.
   *
   * @param masterReaderSpi The remote reader to register as a master.
   * @throws IllegalArgumentException If the provided reader is null.
   * @since 2.0
   */
  void registerMasterReader(RemoteReaderSpi masterReaderSpi);

  /**
   * Registers a {@link RemoteReaderSpi} as a slave observable remote reader, associates it to the
   * master observable remote reader having the provided name and notifies all associated master
   * reader's observers with the provided reader event.
   *
   * <p>The provided remote reader must be observable and the associated master reader too.
   *
   * <p>The observers that register to the slave will in fact be registered transparently to the
   * master and all events that occur on a slave will be transmitted to all observers of the master.
   *
   * <p><u>Note</u> : This feature is only useful when the remote plugin is on network <b>server</b>
   * side.
   *
   * @param slaveReaderSpi The remote observable reader to register as a slave.
   * @param masterReaderName The name of the associated master observable reader.
   * @param readerEventJsonData The reader event to forward.
   * @throws IllegalArgumentException If at least one of the parameters is null, empty or malformed.
   * @throws IllegalStateException If the associated master reader is not registered or not
   *     observable.
   * @since 2.0
   */
  void registerSlaveReader(
      RemoteReaderSpi slaveReaderSpi, String masterReaderName, String readerEventJsonData);

  /**
   * Tries to unregister the remote reader having the provided name.
   *
   * <p>If it is a slave, then it will be deleted too. If its master has no more observers, then it
   * will be deleted too.
   *
   * <p>If it is a master and is not observable or has no more observers, then it will be deleted.
   *
   * <p><u>Note</u> : This feature is only useful when the remote plugin is on network <b>server</b>
   * side.
   *
   * @param readerName The name of the remote reader.
   * @throws IllegalArgumentException If reader name is null or empty.
   * @since 2.0
   */
  void unregisterReader(String readerName);

  /**
   * Must be invoked when a message containing a plugin event is received from the distributed local
   * service.
   *
   * <p><u>Note</u> : This feature is only useful when the remote plugin is on network <b>client</b>
   * side.
   *
   * @param jsonData A JSON string containing the plugin event.
   * @throws IllegalArgumentException If the JSON data is null, empty or malformed.
   * @since 2.0
   */
  void onPluginEvent(String jsonData);
}
