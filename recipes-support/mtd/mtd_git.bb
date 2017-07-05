# Copyright (C) 2016 sherpya <sherpya@netfarm.it>
# Released under the MIT license

SUMMARY = "mtd - simple memory technology device manipulation tool"
SECTION = "base"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mtd.c;beginline=7;endline=18;md5=f171807d734f328ea03aedfedde53bb5"

SRC_URI = "file://mtd.tar.gz"

S = "${WORKDIR}/mtd"

do_install() {
    install -d ${D}/sbin
    install -m 755 mtd ${D}/sbin/
}
