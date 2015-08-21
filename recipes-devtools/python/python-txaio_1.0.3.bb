DESCRIPTION = "Compatibility API between asyncio/Twisted/Trollius"
HOMEPAGE = "https://pypi.python.org/pypi/txaio"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/t/txaio/txaio-${PV}.tar.gz"
SRC_URI[md5sum] = "48695623b8516b4c475e98678798480f"
SRC_URI[sha256sum] = "530d777682bba5ac78f8bb41b99bee2b3e7f920e54010098181f0b68bde1767e"

S = "${WORKDIR}/txaio-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-six python-twisted"
