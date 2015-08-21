DESCRIPTION = "AutobahnPython provides a WebSocket (RFC6455, Hybi-10 to -17, Hixie-76) framework for creating WebSocket-based clients and servers. \
AutobahnPython also includes an implementation of WAMP (The WebSockets Application Messaging Protocol), a light-weight,  \
asynchronous RPC/PubSub over JSON/WebSocket protocol."
HOMEPAGE = "http://autobahn.ws/python"
SECTION = "console/network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/a/autobahn/autobahn-${PV}.tar.gz"
SRC_URI[md5sum] = "1e236b887e78c2bf779933c90cf7f06a"
SRC_URI[sha256sum] = "1bab6dac601a666763ec4b1e1c789920d331e8a404943a3d03e6701ff035faa1"

S = "${WORKDIR}/autobahn-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-pprint python-twisted-protocols python-netserver python-twisted-web"
