SUMMARY = "A Python crypto and SSL toolkit"
HOMEPAGE = "http://chandlerproject.org/bin/view/Projects/MeTooCrypto"

DEPENDS = "openssl swig-native python python-typing"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENCE;md5=b0e1f0b7d0ce8a62c18b1287b991800e"

#SRC_URI += "file://0001-setup.py-link-in-sysroot-not-in-host-directories.patch"

PYPI_PACKAGE = "M2Crypto"

SRC_URI[md5sum] = "9f02f0b88fbe225cc6ea8680945cafa0"
SRC_URI[sha256sum] = "05d94fd9b2dae2fb8e072819a795f0e05d3611b09ea185f68e1630530ec09ae8"

S = "${WORKDIR}/M2Crypto-${PV}"

inherit pypi

SWIG_FEATURES_x86-64 = "-D__x86_64__"
export SWIG_FEATURES

# Get around a problem with swig, but only if the
# multilib header file exists.
#
do_compile_prepend() {
    if [ "${SITEINFO_BITS}" = "64" ];then
        bit="64"
    else
        bit="32"
    fi

    if [ -e ${STAGING_INCDIR}/openssl/opensslconf-${bit}.h ] ;then
        for i in SWIG/_ec.i SWIG/_evp.i; do
            sed -i -e "s/opensslconf.*\./opensslconf-${bit}\./" "$i"
        done
    elif [ -e ${STAGING_INCDIR}/openssl/opensslconf-n${bit}.h ] ;then
        for i in SWIG/_ec.i SWIG/_evp.i; do
            sed -i -e "s/opensslconf.*\./opensslconf-n${bit}\./" "$i"
        done
    fi
}

BBCLASSEXTEND = "native"
