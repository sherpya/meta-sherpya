SUMMARY = "IPython: Productive Interactive Computing"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.rst;md5=93ef43efbd25773bbce636bbad9d247f"

SRC_URI[md5sum] = "9c00df2f7e2e2636aba02671f45eea6b"
SRC_URI[sha256sum] = "7ec0737169c74056c7fc8298246db5478a2d6c90cfd19c3253222112357545df"

inherit pypi allarch

RDEPENDS_${PN} = "\
    python-pydoc \
    python-traitlets \
    python-pygments \
    python-pexpect \
    python-pathlib2 \
    python-pickleshare \
    python-simplegeneric \
    python-backports-shutil-get-terminal-size"

RRECOMMENDS_${PN} = "python-sqlite3"
