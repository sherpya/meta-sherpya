SUMMARY = "Python binding for libudev"

LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"

SRC_URI[md5sum] = "30c19f94dba43b6f5a010285838a3f45"
SRC_URI[sha256sum] = "14d85bc9611dbf798732996cb7107858f58a3a1b9d246e4063c7a20ade65842a"

inherit pypi allarch

RDEPENDS_${PN} = "python-subprocess python-ctypes libudev"
