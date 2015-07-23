/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.paypal.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mule.modules.paypal.system.ConnectivitySystemTestCases;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConnectivitySystemTestCases.class})
public class SystemTestSuite {
}
