#This image adds onto the rpi-basic-image
require recipes-core/images/rpi-basic-image.bb

#Include additional features to add to the image
IMAGE_INSTALL += "python \
	rpi-gpio \
	gpio-server \
	psplash \
	python-twitter \
	cronie \
	apache2 \
	php \
	modphp \
	mariadb \
	"

SPLASH = "psplash-rpi-tarsals"
