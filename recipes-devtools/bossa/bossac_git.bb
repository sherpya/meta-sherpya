DESCRIPTION = "BOSSA is a flash programming utility for Atmel's SAM family of flash-based ARM microcontrollers"
HOMEPAGE = "http://www.shumatech.com/web/products/bossa"
SECTION = "console/utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94411054a7f6921218ab9c05b6b4b15b"

SRCREV = "master"

S = "${WORKDIR}/git"

SRC_URI = "https://github.com/shumatech/BOSSA.git;protocol=https \
          file://compiler.patch \
          "
SRC_URI[md5sum] = "935f32ceee7951c03f1144e177e817da"
SRC_URI[sha256sum] = "f8ea5eb7146a8ffd9658e2f27db776b662a6e8309e4fff56f443643a99c76d00"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake bin/bossac
}

do_install () {
    mkdir -p ${D}${bindir}
    install -m 0755 ${S}/bin/bossac ${D}${bindir}
}
