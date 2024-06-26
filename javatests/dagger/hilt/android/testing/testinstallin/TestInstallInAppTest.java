/*
 * Copyright (C) 2020 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dagger.hilt.android.testing.testinstallin;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static com.google.common.truth.Truth.assertThat;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import dagger.hilt.android.testing.testinstallin.TestInstallInModules.SingletonBarModule;
import dagger.hilt.android.testing.testinstallin.TestInstallInModules.SingletonFooModule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

// Test that Foo and Bar use the global @InstallIn module
@RunWith(AndroidJUnit4.class)
@Config(application = TestInstallInApp.class)
public final class TestInstallInAppTest {

  @Test
  public void testFoo() {
    assertThat(getMyApplication().foo.moduleClass).isEqualTo(SingletonFooModule.class);
  }

  @Test
  public void testBar() {
    assertThat(getMyApplication().bar.moduleClass).isEqualTo(SingletonBarModule.class);
  }

  private static TestInstallInApp getMyApplication() {
    return (TestInstallInApp) getApplicationContext();
  }
}
