SUMMARY = "Tiny shelve-like database with concurrency support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=905c08218089ffebea3a64c82fc4d7d0"

SRC_URI[md5sum] = "0ccdd8e65737a92eec47888dae61ff95"
SRC_URI[sha256sum] = "b9710d01f777b1bf3b69c8f889b1d05a5145668f79e980cbd0f849e059edd274"

RDEPENDS_${PN} = "python-pathlib2"

inherit pypi allarch
