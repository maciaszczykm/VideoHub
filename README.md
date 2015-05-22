![VideoHub](http://i.imgur.com/4Rcmqxn.png)

***

## Information
VideoHub is a video-sharing webservice.

## Running the application
1. Checkout project from GitHub.
2. Update Bower dependencies.
3. Import Maven project into your IDE.
4. To configure JRebel add `videohub.basedir` property to your VM options. It should point at VideoHub base directory. For example `-Dvideohub.basedir=D:\Workspace\VideoHub`.
5. Execute `database/database.sql` script to create MySQL database.
5. Check server configuration.

## JBoss Server
If using JBoss server to deploy:

1. Name war artifact (exploded or not) "ROOT.war" (folder name) in order to deploy on default root context path. (f.e.: localhost:8080/index.html)
2. In ${JBOSS_HOME}/standalone/configuration/standalone.xml file change "virtual-server" parameter "enable-welcome-root" to false in order to free ROOT context path.
3. Deploy and start the app.

## Current status
[![GitHub version](https://badge.fury.io/gh/maciaszczykm%2FVideoHub.svg)](http://badge.fury.io/gh/maciaszczykm%2FVideoHub)
[![Build Status](https://travis-ci.org/maciaszczykm/VideoHub.svg)](https://travis-ci.org/maciaszczykm/VideoHub)