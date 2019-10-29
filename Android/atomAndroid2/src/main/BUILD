package(default_visibility = ["//visibility:public"])
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_library")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")


PACKAGE = "com.gft.bazelatom2"
MANIFEST = "AndroidManifest.xml"

android_library(
    name = "bazel_res_library",
    custom_package = PACKAGE,
    manifest = MANIFEST,
    resource_files = glob(["res/**"]),
    enable_data_binding = False,
    deps = [
        artifact("androidx.constraintlayout:constraintlayout"),
        artifact("com.google.android.material:material"),
    ],
)


kt_android_library(
    name = "bazel_atomAndroid2",
    srcs = glob(["kotlin/**/*.kt"]),
    deps = [
        artifact("androidx.appcompat:appcompat"),
        artifact("androidx.fragment:fragment"),
        artifact("androidx.core:core"),
        artifact("androidx.lifecycle:lifecycle-runtime"),
        artifact("androidx.lifecycle:lifecycle-viewmodel"),
        artifact("androidx.lifecycle:lifecycle-common"),
        artifact("org.jetbrains.kotlinx:kotlinx-coroutines-core"),
        artifact("org.jetbrains.kotlinx:kotlinx-coroutines-android"),
    ]
)


android_binary(
    name = "bazel_atom2_library",
    manifest = MANIFEST,
    custom_package = PACKAGE,
    manifest_values = {
        "minSdkVersion": "21",
        "versionCode" : "2",
        "versionName" : "0.2",
        "targetSdkVersion": "29",
    },
    deps = [
        ":bazel_atomAndroid2",
        artifact("androidx.appcompat:appcompat"),
    ],
)
