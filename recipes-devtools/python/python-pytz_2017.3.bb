SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=39ea92752a35cf67d8a885d8e3af3c69"

PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "7006b56c0d68a162d9fe57d4249c3171"
SRC_URI[sha256sum] = "fae4cffc040921b8a2d60c6cf0b5d662c1190fe54d718271db4eb17d44a185b7"

inherit pypi allarch

RDEPENDS_${PN} += "python-datetime"
