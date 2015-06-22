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

## WildFly 9 Server
If using JBoss server to deploy:

1. Name war artifact (exploded or not) `ROOT.war` (folder name) in order to deploy on default root context path. (f.e.: localhost:8080/index.html)
2. Deploy and proceed to next step.

## MongoDB Setup
1. Download MongoDB database. https://www.mongodb.org
2. Install in desired location. (Example is based on `C:\Libraries\MongoDB`)
3. Change paths in `<VIDEOHUB_PROJECT_HOME>\database\db.cfg` to correct ones. `path` is for log file and `dbPath` for database folder path.
3. On windows create service that will start database on system startup.<br />
    a) Open cmd with administrative rights. (WinKey + X then A)<br />
    b) Copy this command and change paths to correct ones. Do not change anything else.<br />
    c) Execute command: `sc.exe create MongoDB binPath= "\"<MONGODB_HOME>\bin\mongod.exe\" --service --config=\"<VIDEOHUB_PROJECT_HOME>\database\db.cfg\"" DisplayName= "MongoDB" start= "auto"`<br />
    d) Start service with: net start MongoDB.
4. Database should be up and running.

Additionally you can download MongoDB UI client of your choice. List of clients can be found here: http://docs.mongodb.org/ecosystem/tools/administration-interfaces
I'm using `Robomongo` standalone windows client :)

## Current status
[![GitHub version](https://badge.fury.io/gh/maciaszczykm%2FVideoHub.svg)](http://badge.fury.io/gh/maciaszczykm%2FVideoHub)
[![Build Status](https://travis-ci.org/maciaszczykm/VideoHub.svg)](https://travis-ci.org/maciaszczykm/VideoHub)
[![Jenkins Status](https://jenkins-videohubapp.rhcloud.com:443/job/VideoHub%20Master/badge/icon)](https://jenkins-videohubapp.rhcloud.com/job/VideoHub%20Master/)
