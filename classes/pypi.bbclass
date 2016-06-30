def pypi_package(d):
    bpn = d.getVar('BPN', True)
    if bpn.startswith('python-'):
        return bpn[7:]
    return bpn

PYPI_PACKAGE ?= "${@pypi_package(d)}"
PYPI_PACKAGE_EXT ?= 'gz'

def pypi_src_uri(d):
    package = d.getVar('PYPI_PACKAGE', True)
    ext = d.getVar('PYPI_PACKAGE_EXT', True)
    pv = d.getVar('PV', True)
    return 'http://pypi.debian.net/%s/%s-%s.tar.%s' % (package, package, pv, ext)

PYPI_SRC_URI ?= "${@pypi_src_uri(d)}"

HOMEPAGE ?= "https://pypi.python.org/pypi/${PYPI_PACKAGE}/"
SECTION = "devel/python"
SRC_URI += "${PYPI_SRC_URI}"
S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

inherit setuptools
