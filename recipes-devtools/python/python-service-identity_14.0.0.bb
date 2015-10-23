DESCRIPTION = "Service identity verification for pyOpenSSL"
HOMEPAGE = "https://pypi.python.org/pypi/service_identity"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a0f079f4e6a215d6bd6f9d97cab4d5f"

SRC_URI = "https://pypi.python.org/packages/source/s/service_identity/service_identity-${PV}.tar.gz"
SRC_URI[md5sum] = "cea0b0156d73b025ecef660fb51f0d9a"
SRC_URI[sha256sum] = "3105a319a7c558490666694f599be0c377ad54824eefb404cde4ce49e74a4f5a"

S = "${WORKDIR}/service_identity-${PV}"

inherit setuptools
inherit allarch

RDEPENDS_${PN} = "python python-pyopenssl python-pyasn1 python-pyasn1-modules python-characteristic"
