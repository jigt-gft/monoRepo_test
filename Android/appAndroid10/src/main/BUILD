package(default_visibility = ["//visibility:public"])
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_library")

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")


MANIFEST = "AndroidManifest.xml"
PACKAGE = "com.gft.bazelapp10"

android_library(
    name = "bazel_res_app10",
    manifest = MANIFEST,
    custom_package = PACKAGE,
    resource_files = glob(["res/**"]),
    enable_data_binding = False,
    deps = [
        artifact("androidx.constraintlayout:constraintlayout"),
        artifact("com.google.android.material:material"),
    ],
)

kt_android_library(
    name = "bazel_kt_app10",
    srcs = glob(["kotlin/**/*.kt"]),
    deps = [
        ":bazel_res_app10",
        "//Android/organismeAndroid2/src/main:bazel_organismeAndroid2",
        "//Android/organismeAndroid4/src/main:bazel_organismeAndroid4",
        artifact("androidx.appcompat:appcompat"),
        artifact("androidx.fragment:fragment"),
        artifact("androidx.core:core"),
        artifact("androidx.lifecycle:lifecycle-runtime"),
        artifact("androidx.lifecycle:lifecycle-viewmodel"),
        artifact("androidx.lifecycle:lifecycle-common"),
        artifact("androidx.drawerlayout:drawerlayout"),
        artifact("org.jetbrains.kotlinx:kotlinx-coroutines-core"),
        artifact("org.jetbrains.kotlinx:kotlinx-coroutines-android"),
    ]
)

android_binary(
    name = "bazel_app10",
    manifest = MANIFEST,
    custom_package = PACKAGE,
    manifest_values = {
        "minSdkVersion": "21",
        "versionCode" : "2",
        "versionName" : "0.2",
        "targetSdkVersion": "29",
    },
    deps = [
        ":bazel_res_app10",
        ":bazel_kt_app10",
        "//Android/organismeAndroid2/src/main:bazel_organismeAndroid2",
        "//Android/organismeAndroid4/src/main:bazel_organismeAndroid4",
        artifact("androidx.appcompat:appcompat"),
    ],
)