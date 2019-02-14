SUMMARY = "A micro-framework for developing production-ready web services with Python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af1d1274b0ee91dbdb4b4513021d3c0e"

SRC_URI[md5sum] = "d1bc497cd60870f63415cd0e5aebc0d3"
SRC_URI[sha256sum] = "30aaf0d78a987d5dbfe0968a07367ad0c73e02823cc8eef4c54f80ab848370d0"

inherit pypi setuptools allarch

DEPENDS += "python-incremental-native"

PACKAGES =+ "${PN}-tests"

RDEPENDS_${PN} = "python-twisted python-werkzeug python-incremental"
RDEPENDS_${PN}-tests = "${PN}"

FILES_${PN}-tests = "${PYTHON_SITEPACKAGES_DIR}/klein/test"
