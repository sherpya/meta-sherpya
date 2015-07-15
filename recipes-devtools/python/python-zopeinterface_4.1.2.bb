SUMMARY = "Interface definitions for Zope products"
SECTION = "console/network"

LICENSE = "ZPL-2.1"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e54fd776274c1b7423ec128974bd9d46"

SRC_URI = "http://pypi.python.org/packages/source/z/zope.interface/zope.interface-${PV}.tar.gz"
SRC_URI[md5sum] = "04298faeaa70b4f3b23fa2ae8987262c"
SRC_URI[sha256sum] = "441fefcac1fbac57c55239452557d3598571ab82395198b2565a29d45d1232f6"

S = "${WORKDIR}/zope.interface-${PV}"

inherit setuptools

RPROVIDES_${PN} += "zope-interfaces"
FILES_${PN}-dbg += "${PYTHON_SITEPACKAGES_DIR}/*.egg/*/*/.debug"
FILES_${PN}-dev += "${PYTHON_SITEPACKAGES_DIR}/zope/interface/*.c"
FILES_${PN}-doc += "${PYTHON_SITEPACKAGES_DIR}/zope/interface/*.txt"
FILES_${PN}-tests = " \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/tests \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/common/tests \
"
