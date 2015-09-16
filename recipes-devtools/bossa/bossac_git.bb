DESCRIPTION = "BOSSA is a flash programming utility for Atmel's SAM family of flash-based ARM microcontrollers"
HOMEPAGE = "http://www.shumatech.com/web/products/bossa"
SECTION = "console/utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae503"

S = "${WORKDIR}/git"

SRC_URI = "git://git.code.sf.net/p/b-o-s-s-a/code"
SRCREV = "master"

do_configure[noexec] = "1"

do_compile() {
    mkdir -p arm-dis
    oe_runmake bin/bossac
}

do_install () {
    mkdir -p ${D}${bindir}
    install -m 0755 ${S}/bin/bossac ${D}${bindir}
}
