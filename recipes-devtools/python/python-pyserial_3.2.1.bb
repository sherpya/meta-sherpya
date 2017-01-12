SUMMARY = "Python Serial Port Extension"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d476d94926db6e0008a5b3860d1f5c0d"

SRC_URI[md5sum] = "7142a421c8b35d2dac6c47c254db023d"
SRC_URI[sha256sum] = "1eecfe4022240f2eab5af8d414f0504e072ee68377ba63d3b6fe6e66c26f66d1"

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
