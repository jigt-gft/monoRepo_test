package(default_visibility = ["//visibility:public"])

load("@bazel_skylib//rules:build_test.bzl", "build_test")
load("@build_bazel_rules_apple//apple:ios.bzl", "ios_application")
load("@build_bazel_rules_swift//swift:swift.bzl", "swift_library")

licenses(["notice"])

swift_library(
    name = "Sources",
    srcs = [
        "Sources/AppDelegate.swift",
    ],
    data = [
        "Resources/Main.storyboard",
    ],
)

ios_application(
    name = "app2",
    app_icons = ["//IOS/ios/resources:PhoneAppIcon.xcassets"],
    bundle_id = "com.example.hello-world-swift",
    families = [
        "iphone",
        "ipad",
    ],
    infoplists = [":Info.plist"],
    launch_storyboard = "//IOS/ios/resources:Launch.storyboard",
    minimum_os_version = "8.0",
    deps = [":Sources"],
)

# Not normally needed, just done for rules_apple's examples so a
# 'bazel test examples/...' ensures all Examples still build.
build_test(
    name = "ExamplesBuildTest",
    targets = [":HelloWorldSwift"],
)
