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

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Test;

public class DistributedRemoteApiPropertiesTest {

  private static final Properties properties = new Properties();

  @Test
  public void versionIsCorrectlyWritten() throws Exception {
    InputStream inputStream = new FileInputStream("gradle.properties");
    try {
      properties.load(inputStream);
    } finally {
      inputStream.close();
    }
    String libVersion = properties.getProperty("version");
    assertThat(DistributedRemoteApiProperties.VERSION).isEqualTo(libVersion);
    assertThat(DistributedRemoteApiProperties.VERSION).matches("\\d+\\.\\d+");
  }
}
