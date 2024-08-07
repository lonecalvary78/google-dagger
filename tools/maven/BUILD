# Copyright (C) 2024 The Dagger Authors.
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

# Starlark rules for generating Maven pom files

load("@bazel_skylib//:bzl_library.bzl", "bzl_library")
load(":maven_info.bzl", "maven_info_tests")
load(":pom_file.bzl", "pom_file_tests")

package(default_visibility = ["//:src"])

exports_files(["pom-template.xml"])

bzl_library(
    name = "maven_bzl",
    srcs = ["maven.bzl"],
    deps = [
        ":maven_info_bzl",
        "@rules_java//java:rules",
    ],
)

bzl_library(
    name = "maven_info_bzl",
    srcs = ["maven_info.bzl"],
    deps = [
        "@bazel_skylib//lib:unittest",
        "@rules_java//java:rules",
    ],
)

maven_info_tests()

pom_file_tests()
