meta-tarsals
============

A layer for customizing the OpenEmbedded Raspberry Pi image.

What this layer does
--------------------

* Adds Python and RPi.GPIO module
* Adds a custom splash screen
* Includes a server for listening for connections to control the GPIO

Todo
----

* Boot loader for testing build as a VM
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
