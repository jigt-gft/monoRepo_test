package(default_visibility = ["//visibility:public"])
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_library")

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
# A kotlin test rule that depends on a kotlin rule
kt_jvm_test(
    name = "unit_test",
    test_class = "com.gft.library1.AddFunctionUnitTest",
    srcs = glob(["java/**/*.kt"]),
    size = "small",
     deps = [
         artifact("junit:junit"),
         "//library1/src/main:bazel_module1"

     ]    

)