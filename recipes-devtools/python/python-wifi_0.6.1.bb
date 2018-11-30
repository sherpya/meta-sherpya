SUMMARY = "Python module that provides read and write access to a wireless network card's capabilities using the Linux Wireless Extensions"

LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://docs/LICENSE.LGPL;md5=fbc093901857fcd118f065f900982c24"

SRC_URI[md5sum] = "033227169230286a63b9c059e7465c77"
SRC_URI[sha256sum] = "7bff6afbc03b1cb13f987e5cf3b597b8821a1b86e5b34182406d98657f1b2c91"

PYPI_PACKAGE = "python-wifi"
PYPI_PACKAGE_EXT = "tar.bz2"

inherit pypi setuptools allarch

do_install_append() {
    # docs/examples are going in /usr/share instead of the correct directories
    rm -fr ${D}/usr/share/docs ${D}/usr/share/examples ${D}/usr/share/README
}
