DESCRIPTION = "BOSSA is a flash programming utility for Atmel's SAM family of flash-based ARM microcontrollers"
HOMEPAGE = "http://www.shumatech.com/web/products/bossa"
SECTION = "console/utils"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bcf9399f7b9b96149837290bcdc3ad39"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/shumatech/BOSSA.git;protocol=https;branch=master"
SRCREV = "3279031813093aa404b8561c8dd7a39dd24ebc70"

SRC_URI[md5sum] = "2dd3248a3170e7a67abcc202b24d8738"
SRC_URI[sha256sum] = "98a92d81ea3bf4acabb4df85f55ab584bc9b370d2a7bf0ca2e2454527d2381ea"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake bin/bossac
}

do_install () {
    mkdir -p ${D}${bindir}
    install -m 0755 ${S}/bin/bossac ${D}${bindir}
}
