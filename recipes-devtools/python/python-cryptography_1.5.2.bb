SUMMARY = "Provides cryptographic recipes and primitives to Python developers"

LICENSE = "Apache-2.0 | BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c3617db4fb6fae01f1d253ab91511e4"

SRC_URI[md5sum] = "f977a6ddb38b071213c0157fc77c62ab"
SRC_URI[sha256sum] = "eb8875736734e8e870b09be43b17f40472dc189b1c422a952fa8580768204832"

inherit pypi

DEPENDS += "python-cffi-native python-cffi"

RDEPENDS_${PN} = "\
    python-pyasn1 \
    python-six \
    python-ipaddress \
    python-idna \
    python-cffi \
    python-enum34 \
    python-pkg-resources \
    python-pycparser \
    python-subprocess \
    python-threading \
    python-numbers \
    python-contextlib"
