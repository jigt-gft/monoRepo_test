#!/bin/bash

if [ -d "bazel-bin" ]; then
   rm -r bazel-bin
fi

if [ -d "bazel-testlogs" ]; then
   rm -r bazel-testlogs
fi

if [ -d "bazel-out" ]; then
   rm -r bazel-out
fi

if [ -d "bazel-genfiles" ]; then
   rm -r bazel-genfiles
fi

if [ -d "bazel-angular" ]; then
   rm -r bazel-angular
fi

ng build
bazel query --output=graph ... | dot -Tpng > graph.png