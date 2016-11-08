SUMMARY = "A cross-platform library for retrieving information onrunning processes and system utilization"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f02e99f7f3c9a7fe8ecfc5d44c2be62"

SRC_URI[md5sum] = "362a03686ce36940d22a548ecb47d7e0"
SRC_URI[sha256sum] = "5411e22c63168220f4b8cc42fd05ea96f5b5e65e08b93b675ca50653aea482f8"

PYPI_PACKAGE_EXT = "zip"

inherit pypi

PACKAGES =+ "${PN}-tests"
FILES_${PN}-tests = "${PYTHON_SITEPACKAGES_DIR}/psutil/tests"

RDEPENDS_${PN} += "python-subprocess"
