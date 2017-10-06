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

On linux
```
sudo apt install nodejs npm
sudo ln -s "$(which nodejs)" /usr/bin/node
sudo npm install -g bower
sudo npm install -g grunt-cli
sudo npm install -g elm
sudo npm install -g elm-github-install
```

### Run a build

```bash

# run a clean build
$ antb
# Running ui build continuously (observing ui files changes)
$ antui

```
