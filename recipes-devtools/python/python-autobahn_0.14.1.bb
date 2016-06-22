SUMMARY = "WebSocket client & server library, WAMP real-time framework"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI[md5sum] = "576b63ce7fa7846f64650263842b712b"
SRC_URI[sha256sum] = "c1695e139e36daeaad9cb788dd3f9b907a3fd83b67884424e59b3e07032956e0"

inherit pypi allarch

RDEPENDS_${PN} = "python-twisted"
