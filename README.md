# GitMavenVersioning
## Synopsis and Motivation

This Project is a test to setup Version Controll in combination with Git and Maven.

## Versioning

Use Tags to tag commits with version:
```
$ git tag -a v1.4 -m 'my version 1.4'
$ git tag
v0.1
v1.3
v1.4
```
To view current version:
```
$ git describe --tags --always --dirty=-dirty
1.1
```
or:
```
$ git show v1.4
tag v1.4
Tagger: Scott Chacon <schacon@gee-mail.com>
Date:   Mon Feb 9 14:45:11 2009 -0800

my version 1.4

commit 15027957951b64cf874c3557a0f3547bd83b3ff6
Merge: 4a447f7... a6b4c97...
Author: Scott Chacon <schacon@gee-mail.com>
Date:   Sun Feb 8 19:02:46 2009 -0800

    Merge branch 'experiment'
```