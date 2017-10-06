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

On linux, install brew this way
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/install/master/install)"
```

Then add this to your PATH
```
/home/linuxbrew/.linuxbrew/bin
```

Then continue with brew install steps

### Run a build

```bash

# run a clean build
$ antb
# Running ui build continuously (observing ui files changes)
$ antui

```
