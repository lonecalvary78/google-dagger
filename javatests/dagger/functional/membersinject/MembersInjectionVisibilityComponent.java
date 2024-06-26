/*
 * Copyright (C) 2015 The Dagger Authors.
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

package dagger.functional.membersinject;

import dagger.Component;
import dagger.functional.membersinject.subpackage.a.AGrandchild;
import dagger.functional.membersinject.subpackage.a.AParent;
import dagger.functional.membersinject.subpackage.b.BChild;

/**
 * A component that tests members injection across packages and subclasses.
 */
@Component
public interface MembersInjectionVisibilityComponent {
  void inject(AParent aParent);

  void inject(BChild aChild);

  void inject(AGrandchild aGrandchild);
}
