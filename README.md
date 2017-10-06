# Initialisation 

### Source location

Put it into `~/dev/ant`


### Ant profile 

Append into `$HOME/.bash_profile`:

```bash
source ~/ant/ant_profile.sh
```

### Initialise the project

```bash

$ ant
$ ./gradlew wrapper
$ ./gradlew idea
$ brew install yarn
$ yarn global add elm
$ yarn global add elm-github-install

```

### Run a build

```bash

# run a clean build
$ antb
# Running ui build continuously (observing ui files changes)
$ antui

```
