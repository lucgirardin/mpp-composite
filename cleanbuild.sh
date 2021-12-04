#!/usr/bin/env bash
./gradlew clean :common:clean :app:clean
./gradlew --stop
rm -rf ~/.m2
rm -rf ~/.gradle
rm -rf ~/.konan
./gradlew :common:build
./gradlew :app:build
