SUMMARY = "A native Python implementation of the DBus protocol for Twisted applications"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "b862aae54740f8f8eb1ae193db6fa2d3"
SRC_URI[sha256sum] = "02aa8979ba7a7153fdd656ab399458ac12d8b6df8115792a73f31c98862b04d6"

inherit pypi allarch

RDEPENDS_${PN} = "python-twisted python-six"
