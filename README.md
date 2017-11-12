# Ant template

Project template for web application using:
* Scala - backend layer
* HTTP4S - SCALA http library - http://http4s.org/
* SASS - CSS extension language - http://sass-lang.com/
* ELM - Haskell inspired DSL for GUI - http://elm-lang.org/
* Gradle - build tool - https://gradle.org/ 


## Initialisation 

### Source location

Decide where to put the project. I assume that it's in `~/dev/ant` from now on. 

### Ant profile 

Append into `$HOME/.bash_profile`:

```bash
source ~/dev/ant/ant_profile.sh 
```


### Initialise the project

```bash

$ ant
$ ./gradlew wrapper
$ ./gradlew idea
$ brew install yarn
$ yarn global add elm
$ yarn global add elm-github-install
$ sudo gem install sass
```


### Run a build

```bash
# Fully refresh Ant ui modules (download elm dependencies, etc) and rebuild ui
$ antui-refresh
# run a full Ant build
$ antb
# run Ant ui build continuously watching webapp folder for changes
$ antui
```

Check `ant_profile.sh` for build aliases. 