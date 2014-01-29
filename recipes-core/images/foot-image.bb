#This image adds onto core-image-minimal
require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "python \
	psplash \
	python-twitter \
	cronie \
	mariadb \
	mysql-python \
	apache2 \
	php \
	"

SPLASH = "psplash-rpi-tarsals"
