package(default_visibility = ["//visibility:public"])
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_library")

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
# A kotlin test rule that depends on a kotlin rule
kt_jvm_test(
    name = "unit_test_molecule1",
    test_class = "com.gft.bazelmolecule1.Molecule1FunctionTest",
    srcs = glob(["java/**/*.kt"]),
    size = "small",
     deps = [
         artifact("junit:junit"),
         "//Android/moleculeAndroid1/src/main:bazel_moleculeAndroid1",

     ]    

)