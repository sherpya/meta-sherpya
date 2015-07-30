DESCRIPTION = "BOSSA is a flash programming utility for Atmel's SAM family of flash-based ARM microcontrollers"
HOMEPAGE = "http://www.shumatech.com/web/products/bossa"
SECTION = "console/utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94411054a7f6921218ab9c05b6b4b15b"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/shumatech/BOSSA.git \
          file://compiler.patch \
          "
SRCREV = "master"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake bin/bossac
}

do_install () {
    mkdir -p ${D}${bindir}
    install -m 0755 ${S}/bin/bossac ${D}${bindir}
}
