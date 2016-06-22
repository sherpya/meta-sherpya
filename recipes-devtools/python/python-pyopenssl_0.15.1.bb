SUMMARY = "Simple Python wrapper around the OpenSSL library"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PE = "1"

SRC_URI[md5sum] = "f447644afcbd5f0a1f47350fec63a4c6"
SRC_URI[sha256sum] = "f0a26070d6db0881de8bcc7846934b7c3c930d8f9c79d45883ee48984bc0d672"

PYPI_PACKAGE = "pyOpenSSL"

inherit pypi allarch

PACKAGES =+ "${PN}-tests"
FILES_${PN}-tests = "${libdir}/${PYTHON_DIR}/site-packages/OpenSSL/test"

DEPENDS = "openssl python-cryptography"
RDEPENDS_${PN} = "python-threading python-six (>= 1.5.2) python-cryptography (>= 1.3)"
RDEPENDS_${PN}-tests = "${PN}"
