SUMMARY = "WebSocket client & server library, WAMP real-time framework"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97c0bda20ad1d845c6369c0e47a1cd98"

SRC_URI[md5sum] = "26c24d0049c43f902ab0b8d16a3e3ce2"
SRC_URI[sha256sum] = "206a3a579a580ca3ce2532ac12ec52d447135c9ace7c4bf6065b832a7cff25ba"

inherit pypi allarch setuptools

PACKAGES =+ "${PN}-tests"

RDEPENDS_${PN} = "python-twisted"
RDEPENDS_${PN}-tests = "${PN}"

FILES_${PN}-tests = "${PYTHON_SITEPACKAGES_DIR}/autobahn/test \
                     ${PYTHON_SITEPACKAGES_DIR}/autobahn/*/test"
