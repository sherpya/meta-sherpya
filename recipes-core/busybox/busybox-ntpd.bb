# Copyright (C) 2015 sherpya <sherpya@netfarm.it>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "BusyBox ntpd server support"
HOMEPAGE = "http://www.busybox.net"
LICENSE = "MIT"
SECTION = "base"

SRC_URI = "file://busybox-ntpd"
# BusyBox is GPLv2
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

S = "${WORKDIR}"

FILES_${PN} = "${sysconfdir}/init.d/busybox-ntpd"

inherit update-rc.d

INITSCRIPT_NAME = "busybox-ntpd"
INITSCRIPT_PARAMS = "defaults"

do_install() {
    install -d ${D}/etc/init.d
    install -m 0755 ${S}/busybox-ntpd ${D}/etc/init.d/
}

RDEPENDS_${PN} = "busybox"
