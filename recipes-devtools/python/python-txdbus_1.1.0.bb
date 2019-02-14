SUMMARY = "A native Python implementation of the DBus protocol for Twisted applications"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "f17c9204c7f56365c297ba68e6840900"
SRC_URI[sha256sum] = "6ff57f42c58d935956024b3c6824c1019db7d233d0af86aa0573b73b63b0817c"

inherit pypi setuptools allarch

PACKAGES =+ "${PN}-tests"

RDEPENDS_${PN} = "python-twisted python-six"
RDEPENDS_${PN}-tests = "${PN}"

FILES_${PN}-tests = "${PYTHON_SITEPACKAGES_DIR}/txdbus/test"
