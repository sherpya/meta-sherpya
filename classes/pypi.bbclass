def pypi_package(d):
    bpn = d.getVar('BPN', True)
    if bpn.startswith('python-'):
        return bpn[7:]
    return bpn

PYPI_PACKAGE ?= "${@pypi_package(d)}"

def pypi_src_uri(d):
    import xmlrpclib
    package = d.getVar('PYPI_PACKAGE', True)
    pv = d.getVar('PV', True)
    pypi = xmlrpclib.ServerProxy('https://pypi.python.org/pypi')
    results = pypi.package_urls(package, pv)
    for entry in results:
        if entry['packagetype'] == 'sdist':
            return entry['url']
    raise Exception('%s %s not found on pypi' % (package, pv))

PYPI_SRC_URI ?= "${@pypi_src_uri(d)}"

HOMEPAGE ?= "https://pypi.python.org/pypi/${PYPI_PACKAGE}/"
SECTION = "devel/python"
SRC_URI += "${PYPI_SRC_URI}"
S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

inherit setuptools
