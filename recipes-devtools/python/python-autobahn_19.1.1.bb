SUMMARY = "WebSocket client & server library, WAMP real-time framework"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97c0bda20ad1d845c6369c0e47a1cd98"

SRC_URI[md5sum] = "b296b8ae0f42e7df8052b28d574ede82"
SRC_URI[sha256sum] = "aebbadb700c13792a2967c79002855d1153b9ec8f2949d169e908388699596ff"

inherit pypi allarch

PACKAGES =+ "${PN}-tests"

RDEPENDS_${PN} = "python-twisted"
RDEPENDS_${PN}-tests = "${PN}"

FILES_${PN}-tests = "${PYTHON_SITEPACKAGES_DIR}/autobahn/test \
                     ${PYTHON_SITEPACKAGES_DIR}/autobahn/*/test"
