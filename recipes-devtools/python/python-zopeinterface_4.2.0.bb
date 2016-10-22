SUMMARY = "Interface definitions for Zope products"

LICENSE = "ZPL-2.1"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e54fd776274c1b7423ec128974bd9d46"

SRC_URI[md5sum] = "2950a6db7e985e19c7a846cc20f5d82a"
SRC_URI[sha256sum] = "36762743940a075283e1fb22a2ec9e8231871dace2aa00599511ddc4edf0f8f9"

PYPI_PACKAGE = "zope.interface"

inherit pypi allarch

PACKAGES =+ "${PN}-tests"

RPROVIDES_${PN} += "zope-interfaces"
RDEPENDS_${PN}-tests = "${PN}"

FILES_${PN}-dbg += "${PYTHON_SITEPACKAGES_DIR}/*.egg/*/*/.debug"
FILES_${PN}-dev += "${PYTHON_SITEPACKAGES_DIR}/zope/interface/*.c"
FILES_${PN}-tests = " \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/tests \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/common/tests"

# remove setuptools runtime dependency
do_install_append() {
    sed -i -e 's/setuptools//g' ${D}${PYTHON_SITEPACKAGES_DIR}/*.egg-info/requires.txt
}
