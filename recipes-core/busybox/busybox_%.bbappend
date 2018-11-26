# build busybox ntpd applet
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://ntpd.cfg"
