FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://sysfsutils.init \
    file://sysfs.conf"

inherit update-rc.d

INITSCRIPT_NAME = "sysfsutils"
INITSCRIPT_PARAMS = "start 06 S ."

do_install_append() {
    install -d ${D}${sysconfdir}/sysfs.d
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/sysfsutils.init ${D}${sysconfdir}/init.d/sysfsutils
    install -m 0644 ${WORKDIR}/sysfs.conf ${D}${sysconfdir}/sysfs.conf
}

RDEPENDS_${PN} += "sed"
