SUMMARY = "A micro-framework for developing production-ready web services with Python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af93f103c8ebef544a90dd32ae1f0460"

SRC_URI[md5sum] = "2ceca0a71382857a34f2d7382aac20ab"
SRC_URI[sha256sum] = "e90f2d9d3fe3a37be35821c886d8eb35d0cb5e4bd6d798513215b260adbe82c2"

inherit pypi allarch

RDEPENDS_${PN} = "python-twisted python-werkzeug"
