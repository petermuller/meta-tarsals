#This image adds onto core-image-minimal
require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "python \
	psplash \
	python-twitter \
	cronie \
	"

SPLASH = "psplash-rpi-tarsals"
