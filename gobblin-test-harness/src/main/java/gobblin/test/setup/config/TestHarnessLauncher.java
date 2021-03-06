/*
 * Copyright (C) 2014-2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */

package gobblin.test.setup.config;

import java.io.File;


/**
 * An interface for parsing the config data for test harness.
 * This interface is allows to parse and validate the config setting
 *
 * @author sveerama
 *
 */

public interface TestHarnessLauncher extends ConfigStepsGenerator {

  /**
   *  This method will parse the config based on the input provided
   *
   */

  public void parseConfigEntry(File f);

  /**
   *  This method will validate the config implementer, this allows to customize the config validation
   *   for each type of config
   *
   */

  public void prepareTest();

  /**
   *  This method will launch the test for config entry after validation
   */

  public void launchTest();

}
