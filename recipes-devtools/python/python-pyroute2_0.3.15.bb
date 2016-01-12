SUMMARY = "A pure Python netlink and Linux network configuration library"
SECTION = "console/network"

LICENSE = "GPLv3 & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.Apache.v2;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "http://pypi.python.org/packages/source/p/pyroute2/pyroute2-${PV}.tar.gz"
SRC_URI[md5sum] = "09cf70377ddf45ffc27b4ad56bcdf52e"
SRC_URI[sha256sum] = "f5b7116fd97f73f97adc3b9c040a4ddbe61f18bb02f47e1c8399567c8791d270"

S = "${WORKDIR}/pyroute2-${PV}"

inherit setuptools allarch

RDEPENDS_${PN} = "python"
