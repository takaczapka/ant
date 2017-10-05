#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"


alias ant="cd $DIR"
alias antb="ant; ./gradlew clean build"
alias antui="ant; ./gradlew -t uiBuild"