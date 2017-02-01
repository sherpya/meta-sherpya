SUMMARY = "The Swiss Army knife of Python web development"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a68f5361a2b2ca9fdf26b38aaecb6faa"

SRC_URI[md5sum] = "cb4010478dd33905f95920e4880204a2"
SRC_URI[sha256sum] = "455d7798ac263266dbd38d4841f7534dd35ca9c3da4a8df303f8488f38f3bcc0"

PYPI_PACKAGE = "Werkzeug"

inherit pypi allarch

#PACKAGES =+ "${PN}-dbg-shared"

RDEPENDS_${PN} = "python-html python-codecs"
RDEPENDS_${PN}-dbg = "${PN}"

FILES_${PN}-dbg = "${PYTHON_SITEPACKAGES_DIR}/werkzeug/debug/shared"
