SUMMARY = "A collection of ASN.1-based protocols modules"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=425e62320d430219736139b134db2fc4"

SRC_URI[md5sum] = "178129bc7fbf07215c25230c5f053f81"
SRC_URI[sha256sum] = "10561934f1829bcc455c7ecdcdacdb4be5ffd3696f26f468eb6eb41e107f3837"

inherit pypi allarch

RDEPENDS_${PN} = "python-pyasn1"
