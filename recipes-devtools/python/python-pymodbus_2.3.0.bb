SUMMARY = "A full modbus protocol written in python"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=53dbfa56f61b90215a9f8f0d527c043d"

SRC_URI[md5sum] = "6de2956f17b409d17c69f11cbf165105"
SRC_URI[sha256sum] = "8e59d49cdc3f9df8e90fa004baa4aae94814b9ecf1fc03620b1d67234896c444"

SRC_URI += "file://dont-hard-depend-on-conch.patch \
            file://fix-parsing-incomplete-rtu-frames.patch"

inherit pypi allarch
