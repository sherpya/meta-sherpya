DESCRIPTION = "Klein is a micro-framework for developing production-ready web services with Python"
HOMEPAGE = "https://pypi.python.org/pypi/klein"
SECTION = "console/network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96bd8dde56e874702d94232fde20550a"

SRC_URI = "https://pypi.python.org/packages/source/k/klein/klein-${PV}.tar.gz"
SRC_URI[md5sum] = "dd4a790110d8e24b01ef8aff79f0b74e"
SRC_URI[sha256sum] = "1ed2a25ce90303a960e89b09d1641cb879fb8b862e198638becb27c9eb8216a5"

S = "${WORKDIR}/klein-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-twisted python-werkzeug"
