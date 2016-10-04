DESCRIPTION = "Program that can find unused packages"
LICENSE = "Artistic-1.0"
SECTION = "console/utils"

LIC_FILES_CHKSUM = "file://COPYING;md5=ad2335fd608844019f2cc88430097637"

SRC_URI = "http://ftp.debian.org/debian/pool/main/d/deborphan/${BPN}_${PV}.tar.gz \
           file://out_of_tree_build.patch \
           file://ignore_packagearch.patch "

SRC_URI[md5sum] = "4b17a405859476c8ad153dbaa7b3da1c"
SRC_URI[sha256sum] = "59e1e40a768f788a2f47975272a3b49b2a7888c5f3e92bcf5a9cbf9e848d4ddb"

inherit autotools gettext

S = "${WORKDIR}/deborphan"

EXTRA_OECONF = "--disable-nls"

do_install_append() {
    install -d ${D}${sbindir}
    install -m 0755 ${S}/util/orphaner.sh ${D}${sbindir}/orphaner
}
