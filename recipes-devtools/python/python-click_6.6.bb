SUMMARY = "A simple wrapper around optparse for powerful command line utilities."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=09e8b7869f94ba9e9a7b260d53c65dab"

SRC_URI[md5sum] = "d0b09582123605220ad6977175f3e51d"
SRC_URI[sha256sum] = "cc6a19da8ebff6e7074f731447ef7e112bd23adf3de5c597cf9989f2fd8defe9"

inherit pypi allarch

RDEPENDS_${PN} = "python-colorama"
