DESCRIPTION = "Adds a python server for use with phone app controllers."
HOMEPAGE = "http://www.github.com/petermuller/meta-tarsals"
LICENSE = "GPLv3"
SECTION = "console/tools"
PR = "r2"

RDEPENDS_${PN} = "python rpi-gpio python-argparse"

LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/petermuller/windows-phone-gpio-controller.git"
SRCREV_default_pn-gpio-server ?= "${AUTOREV}"

S = "${WORKDIR}/git"

PACKAGES = " \
	${PN} \
	"

FILES_${PN} = " \
	/home/root/gpio-server \
	/home/root/gpio-server/PiServer.py \
	/home/root/gpio-server/PiFunctions.py \
	"

do_install() {
	install -m 0755 -d ${D}/home/root/gpio-server
	install -m 0644 ${S}/onThePi/PiFunctions.py ${D}/home/root/gpio-server
	install -m 0644 ${S}/onThePi/PiServer.py ${D}/home/root/gpio-server
}
