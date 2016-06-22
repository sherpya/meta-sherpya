SUMMARY = "Provides cryptographic recipes and primitives to Python developers"

LICENSE = "Apache-2.0 | BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c3617db4fb6fae01f1d253ab91511e4"

SRC_URI[md5sum] = "a9763e3831cc7cdb402c028fac1ceb39"
SRC_URI[sha256sum] = "bb149540ed90c4b2171bf694fe6991d6331bc149ae623c8ff419324f4222d128"

inherit pypi

# bug in package setup?
FILES_${PN}-dbg += "${PYTHON_SITEPACKAGES_DIR}/${PYPI_PACKAGE}/hazmat/bindings/.debug"

DEPENDS += "python-cffi-native python-cffi python-enum34 python-six python-pyasn1"

RDEPENDS_${PN} = "\
    python-pyasn1 \
    python-six \
    python-cffi \
    python-enum34 \
    python-setuptools \
    python-pycparser \
    python-subprocess \
    python-threading \
    python-numbers \
    python-contextlib"
