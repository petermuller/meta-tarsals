DESCRIPTION = "Raspberry Pi meta-tarsals image."
HOMEPAGE = "http://www.github.com/petermuller/meta-tarsals"
SECTION = "console/utils"
PRIORITY = "5"
LICENSE = "MIT"
PR = "r0"

SRC_URI =" \
	file://LICENSE \
	"

LIC_FILES_CHKSUM = "file://LICENSE;md5=20829d0414e90525c97c4cab6db008a0"

#This image adds onto the rpi-basic-image
include rpi-basic-image.bb

#Include additional features to add to the image
IMAGE_FEATURES += "python"

do_configure_prepend() {
	#move license to the correct spot
        cp ${WORKDIR}/LICENSE ${S}/LICENSE
}
