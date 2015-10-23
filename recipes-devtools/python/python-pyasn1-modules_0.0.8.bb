DESCRIPTION = "A collection of ASN.1-based protocols modules"
HOMEPAGE = "http://sourceforge.net/projects/pyasn1/"
SECTION = "devel/python"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=425e62320d430219736139b134db2fc4"

SRC_URI = "https://pypi.python.org/packages/source/p/pyasn1-modules/pyasn1-modules-${PV}.tar.gz"
SRC_URI[md5sum] = "178129bc7fbf07215c25230c5f053f81"
SRC_URI[sha256sum] = "10561934f1829bcc455c7ecdcdacdb4be5ffd3696f26f468eb6eb41e107f3837"

S = "${WORKDIR}/pyasn1-modules-${PV}"

inherit setuptools
inherit allarch

RDEPENDS_${PN} = "python-pyasn1"
