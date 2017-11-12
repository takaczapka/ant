#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

GRADLEW_OPTS="--console plain"

alias ant="cd $DIR"
# full build
alias antb="ant && ./gradlew ${GRADLEW_OPTS} clean build test"
# just run scala tests
alias ant-stest="ant; ./gradlew ${GRADLEW_OPTS} scalaTest"
# run uiBuild continuously watching webapp folder for changes
alias antui="ant && ./gradlew ${GRADLEW_OPTS} -t uiBuild"
# build a jar file
alias antjar="ant && ./gradlew ${GRADLEW_OPTS} jar"
# run uiTests (elm only now)
alias antui-test="ant && ./gradlew ${GRADLEW_OPTS} uiTest"
# fully refresh ui modules (download elm dependencies, etc) and rebuild
alias antui-refresh="ant && ./gradlew ${GRADLEW_OPTS} uiNuke uiInstall uiBuild"
# git pull + ant build + git push
alias ffsp='ant && figlet "Git rebase FFS..." && git pull --rebase && figlet "Building FFS..." && antb && figlet "Pushing FFS..." && git push'
