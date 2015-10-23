DESCRIPTION = "Python attributes without boilerplate"
HOMEPAGE = "https://pypi.python.org/pypi/characteristic/"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e36e88132159fd857b145b9ec72beed3"

SRC_URI = "https://pypi.python.org/packages/source/c/characteristic/characteristic-${PV}.tar.gz"
SRC_URI[md5sum] = "b249368dd021fde1c06b4802867c0913"
SRC_URI[sha256sum] = "ded68d4e424115ed44e5c83c2a901a0b6157a959079d7591d92106ffd3ada380"

S = "${WORKDIR}/characteristic-${PV}"

inherit setuptools
inherit allarch

RDEPENDS_${PN} = "python"
