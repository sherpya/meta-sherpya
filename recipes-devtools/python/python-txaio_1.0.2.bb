DESCRIPTION = "Compatibility API between asyncio/Twisted/Trollius"
HOMEPAGE = "https://pypi.python.org/pypi/txaio"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/t/txaio/txaio-${PV}.tar.gz"
SRC_URI[md5sum] = "ed64939ff3b15ebac7d1ac8243083b38"
SRC_URI[sha256sum] = "f3bd869a54e3e510d0d958ab168151a3003c0701c6362caf67a01c786ea82afc"

S = "${WORKDIR}/txaio-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-six python-twisted"
