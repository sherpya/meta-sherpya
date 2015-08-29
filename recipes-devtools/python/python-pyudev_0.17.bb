SUMMARY = "pyudev is a LGPL licensed, pure Python binding for libudev"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"

SRC_URI[md5sum] = "0450afde50383538a987d16450853fb1"
SRC_URI[sha256sum] = "eb6f3c1f231ab3d11d6afee6a4b925c855030314568d9c6760d138465a092e8d"

inherit pypi

RDEPENDS_${PN} = "python python-subprocess python-ctypes libudev"
