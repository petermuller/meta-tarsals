DESCRIPTION = "Adds a python server for use with phone app controllers."
HOMEPAGE = "http://www.github.com/petermuller/meta-tarsals"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r3"

RDEPENDS_${PN} = "python rpi-gpio python-argparse"

LIC_FILES_CHKSUM = "file://LICENSE;md5=20829d0414e90525c97c4cab6db008a0"

SRC_URI = "git://github.com/petermuller/pi-phone-server.git"
SRCREV_default_pn-gpio-server ?= "${AUTOREV}"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "raspberrypi"

PACKAGES = " \
	${PN} \
	"

FILES_${PN} = " \
	/home/root/gpio-server \
	/home/root/gpio-server/PiServer.py \
	/home/root/gpio-server/ServerInstance.py \
	"

do_install() {
	install -m 0755 -d ${D}/home/root/gpio-server
	install -m 0644 ${S}/ServerInstance.py ${D}/home/root/gpio-server
	install -m 0644 ${S}/PiServer.py ${D}/home/root/gpio-server
}
