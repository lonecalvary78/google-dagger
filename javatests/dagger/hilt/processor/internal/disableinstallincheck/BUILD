# Copyright (C) 2020 The Dagger Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# Description:
#  Builds and run tests related to DisableInstallInCheckProcessor.

load("//java/dagger/testing/compile:macros.bzl", "compiler_test")

package(default_visibility = ["//:src"])

compiler_test(
    name = "DisableInstallInCheckProcessorErrorsTest",
    size = "small",
    srcs = ["DisableInstallInCheckProcessorErrorsTest.java"],
    compiler_deps = [
        "//java/dagger/hilt/migration:disable_install_in_check",
        "//:dagger_with_compiler",
        "//third_party/java/jsr250_annotations",
        "//java/dagger/hilt:entry_point",
        "//java/dagger/hilt:install_in",
        "//java/dagger/hilt/android/components",
    ],
    deps = [
        "//java/dagger/hilt/android/testing/compile",
        "//java/dagger/hilt/processor/internal/disableinstallincheck:processor_lib",
        "//java/dagger/internal/codegen/xprocessing",
        "//java/dagger/internal/codegen/xprocessing:xprocessing-testing",
        "//third_party/java/junit",
    ],
)

filegroup(
    name = "srcs_filegroup",
    srcs = glob(["*"]),
)
