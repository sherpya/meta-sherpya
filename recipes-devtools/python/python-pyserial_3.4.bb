SUMMARY = "Python Serial Port Extension"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d476d94926db6e0008a5b3860d1f5c0d"

SRC_URI[md5sum] = "ed6183b15519a0ae96675e9c3330c69b"
SRC_URI[sha256sum] = "6e2d401fdee0eab996cf734e67773a0143b932772ca8b42451440cfed942c627"

inherit pypi allarch

PACKAGES =+ "${PN}-miniterm"
PROVIDES += "${PACKAGES}"

RDEPENDS_${PN} = "\
    python-fcntl \
    python-io \
    python-stringold"
RDEPENDS_${PN}-miniterm = "${PN} python-argparse"

FILES_${PN}-miniterm = "\
    ${bindir}/miniterm.py \
    ${PYTHON_SITEPACKAGES_DIR}/serial/tools/miniterm.py* \
    ${PYTHON_SITEPACKAGES_DIR}/serial/tools/hexlify_codec.py*"

do_install_append() {
    # purge unneeded files
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/win32.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/serialwin32.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/serialjava.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/serialcli.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/tools/list_ports_windows.py*
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/serial/tools/list_ports_osx.py*
}
