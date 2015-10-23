DESCRIPTION = "ASN.1 library for Python"
HOMEPAGE = "http://sourceforge.net/projects/pyasn1/"
SECTION = "devel/python"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=425e62320d430219736139b134db2fc4"

SRC_URI = "https://pypi.python.org/packages/source/p/pyasn1/pyasn1-${PV}.tar.gz"
SRC_URI[md5sum] = "f00a02a631d4016818659d1cc38d229a"
SRC_URI[sha256sum] = "853cacd96d1f701ddd67aa03ecc05f51890135b7262e922710112f12a2ed2a7f"

S = "${WORKDIR}/pyasn1-${PV}"

inherit setuptools
inherit allarch

RDEPENDS_${PN} = "python"
