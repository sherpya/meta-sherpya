# split out pkg-resources package
PACKAGES =+ "python-pkg-resources"
PROVIDES += "${PACKAGES}"

RDEPENDS_${PN} += "python-pkg-resources"

FILES_python-pkg-resources = "${PYTHON_SITEPACKAGES_DIR}/pkg_resources"
RDEPENDS_python-pkg-resources = "python-plistlib"

# avoid packaging as egg (unsplittable)
#DISTUTILS_INSTALL_ARGS += "--single-version-externally-managed --root /"
