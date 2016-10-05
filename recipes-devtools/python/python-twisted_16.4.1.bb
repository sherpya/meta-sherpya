SUMMARY = "An asynchronous networking framework written in Python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7fde5c4b582b346163fcb52536484884"

SRC_URI[md5sum] = "c6d09bdd681f538369659111f079c29d"
SRC_URI[sha256sum] = "1d8d73f006c990744effb35588359fd44d43608649ac0b6b7edc71176e88e816"

PYPI_PACKAGE = "Twisted"
PYPI_PACKAGE_EXT = "tar.bz2"

inherit pypi

do_install_append() {
    # remove some useless files before packaging
    find ${D} \( -name "*.bat" -o -name "*.c" -o -name "*.h" \) -exec rm -f {} \;
    # delete tests, I was unable to move them in -test package
    find ${D} -type d -name test | sort -r | xargs rm -fr
    # delete uneeded iocpreactor
    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/twisted/internet/iocpreactor
}

RDEPENDS_${PN} = "python-netserver python-zopeinterface"
