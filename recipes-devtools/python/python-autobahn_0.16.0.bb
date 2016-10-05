SUMMARY = "WebSocket client & server library, WAMP real-time framework"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI[md5sum] = "9850702d0078c5a4aa17170afe2f233c"
SRC_URI[sha256sum] = "a1dcb4315a0914da56ec484659816de72dfad229be4ac19fa61bbc0111ada884"

inherit pypi allarch

RDEPENDS_${PN} = "python-twisted"
