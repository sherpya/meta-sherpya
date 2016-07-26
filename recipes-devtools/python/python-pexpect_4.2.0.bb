SUMMARY = "Pexpect allows easy control of interactive console applications"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c7a725251880af8c6a148181665385b"

SRC_URI[md5sum] = "8071ec5df0f3d515daedafad672d1632"
SRC_URI[sha256sum] = "bf6816b8cc8d301a499e7adf338828b39bc7548eb64dbed4dd410ed93d95f853"

inherit pypi allarch

RDEPENDS_${PN} = "python-terminal python-ptyprocess"
