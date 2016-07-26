SUMMARY = "Library for building powerful interactive command lines in Python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2cde7da89f0c1f3e49bf968d00d554f"

SRC_URI[md5sum] = "6c4133d099603f496c761491043bf0ef"
SRC_URI[sha256sum] = "805e026f0cbad27467e93f9dd3e3777718d401a62788c1e84ca038e967ad8ba2"

PYPI_PACKAGE = "prompt_toolkit"

inherit pypi allarch

RDEPENDS_${PN} = "python-six python-wcwidth"
