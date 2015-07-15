DESCRIPTION = "Compatibility API between asyncio/Twisted/Trollius"
HOMEPAGE = "https://pypi.python.org/pypi/txaio"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a7fea4651ba35c7631c959b804f5a44"

SRC_URI = "https://pypi.python.org/packages/source/t/txaio/txaio-${PV}.zip"
SRC_URI[md5sum] = "762755ba1ded4b7caf07247ab33efc5f"
SRC_URI[sha256sum] = "4b38afc5d416b23426ed4e7f582d949317df5173c50efec999f2cc97ed368a57"

S = "${WORKDIR}/txaio-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-six python-twisted"

