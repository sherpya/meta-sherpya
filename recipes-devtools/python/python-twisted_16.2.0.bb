SUMMARY = "An asynchronous networking framework written in Python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9672c25773d5c07baba86293eb58e09e"

SRC_URI[md5sum] = "8b35a88d5f1a4bfd762a008968fddabf"
SRC_URI[sha256sum] = "a090e8dc675e97fb20c3bb5f8114ae94169f4e29fd3b3cbede35705fd3cdbd79"

PYPI_PACKAGE = "Twisted"
PYPI_PACKAGE_EXT = "tar.bz2"

inherit pypi

do_install_append() {
    # remove some useless files before packaging
    find ${D} \( -name "*.bat" -o -name "*.c" -o -name "*.h" \) -exec rm -f {} \;
    # delete tests, I was unable to move them in -test package
    find ${D} -type d -name test | sort -r | xargs rm -fr
    # delete uneeded iocpreactor
    rm -fr ${D}${PYTHON_SITEPACKAGES_DIR}/twisted/internet/iocpreactor
}

RDEPENDS_${PN} = "python-netserver python-zopeinterface"
