SUMMARY = "A configuration system for Python applications"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=eec4de4d599518742e54e75954e33b46"

SRC_URI[md5sum] = "d0725f9818bd9e112a6531da26d433b8"
SRC_URI[sha256sum] = "7d7e3070484b2fe490fa55e0acf7023afc5ed9ddabec57405f25c355158e152a"

inherit pypi allarch

RDEPENDS_${PN} = "python-ipython-genutils python-decorator python-argparse"
