#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

GRADLEW_OPTS="--console plain"

alias ant="cd $DIR"
alias antb="ant && ./gradlew ${GRADLEW_OPTS} clean build test"
alias ant-stest="ant; ./gradlew ${GRADLEW_OPTS} scalaTest"
alias antui="ant && ./gradlew ${GRADLEW_OPTS} -t uiBuild"
alias antjar="ant && ./gradlew ${GRADLEW_OPTS} jar"
alias antui-test="ant && ./gradlew ${GRADLEW_OPTS} uiTest"
alias antui-refresh="ant && ./gradlew ${GRADLEW_OPTS} uiNuke uiInstall uiBuild"
alias antui-install="ant && ./gradlew ${GRADLEW_OPTS} uiInstall"
alias antui-nuke="ant && ./gradlew ${GRADLEW_OPTS} uiNuke"
alias ffsp='ant && figlet "Git rebase FFS..." && git pull --rebase && figlet "Building FFS..." && antb && figlet "Pushing FFS..." && git push'
