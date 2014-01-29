meta-tarsals
============

A layer for customizing the OpenEmbedded Raspberry Pi image.

What this layer does
--------------------

* Adds Python and RPi.GPIO module
* Adds a custom splash screen
* Includes a server for listening for connections to control the GPIO
* Adds Twitter support via the Python-Twitter API
* Adds cron job support
* QEMU-ARM image included for testing locally without Pi-specific packages
* Adds an Apache2 webserver with MariaDB (MySQL) and PHP

Todo
----

* Simple X window manager (hopefully built from scratch)

Dependencies
------------

* URI: git://git.openembedded.org/openembedded-core
  branch: master
  revision: HEAD
* URI: git://git.openembedded.org/meta-openembedded
  branch: master
  revision: HEAD
* URI: git://git.yoctoproject.org/meta-raspberrypi
  branch: master
  revision: HEAD
