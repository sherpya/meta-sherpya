SUMMARY = "Python Serial Port Extension"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d476d94926db6e0008a5b3860d1f5c0d"

SRC_URI[md5sum] = "2f72100de3e410b36d575e12e82e9d27"
SRC_URI[sha256sum] = "d657051249ce3cbd0446bcfb2be07a435e1029da4d63f53ed9b4cdde7373364c"

inherit pypi allarch

do_install_append() {
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/win32.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/serialwin32.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/serialjava.py*
}

RDEPENDS_${PN} = "\
    python-fcntl \
    python-io \
    python-stringold"