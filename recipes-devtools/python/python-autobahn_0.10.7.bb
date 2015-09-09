DESCRIPTION = "AutobahnPython provides a WebSocket (RFC6455, Hybi-10 to -17, Hixie-76) framework for creating WebSocket-based clients and servers. \
AutobahnPython also includes an implementation of WAMP (The WebSockets Application Messaging Protocol), a light-weight,  \
asynchronous RPC/PubSub over JSON/WebSocket protocol."
HOMEPAGE = "http://autobahn.ws/python"
SECTION = "console/network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/a/autobahn/autobahn-${PV}.tar.gz"
SRC_URI[md5sum] = "43affb94dc2bcdae9d5d9263211972f1"
SRC_URI[sha256sum] = "c515f6c9e9ed8e2a20769fb4757d187444d01a7f298ae61347fcb8c99844b150"

S = "${WORKDIR}/autobahn-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-pprint python-twisted-protocols python-netserver python-twisted-web"
