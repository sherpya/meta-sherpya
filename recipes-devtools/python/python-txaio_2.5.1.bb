SUMMARY = "Compatibility API between asyncio/Twisted/Trollius"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI[md5sum] = "7b0f5321515d380ad5d32f01666b6ee7"
SRC_URI[sha256sum] = "625076477182e2dde78b79d0b2b0d6b3cecb0e24fe0ea7eaf2abd26a4c0dd1de"

inherit pypi allarch

DEPENDS = "python-tox"

RDEPENDS_${PN} = "python-six python-twisted"
