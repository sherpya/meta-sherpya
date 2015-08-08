DESCRIPTION = "AutobahnPython provides a WebSocket (RFC6455, Hybi-10 to -17, Hixie-76) framework for creating WebSocket-based clients and servers. \
AutobahnPython also includes an implementation of WAMP (The WebSockets Application Messaging Protocol), a light-weight,  \
asynchronous RPC/PubSub over JSON/WebSocket protocol."
HOMEPAGE = "http://autobahn.ws/python"
SECTION = "console/network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/a/autobahn/autobahn-${PV}.tar.gz"
SRC_URI[md5sum] = "75cbbead47bdac8ee606ca3ce9ee742e"                                                                         
SRC_URI[sha256sum] = "28c13950ddaffdb2038631e238158c7b0dec05a2bdf27c8ee9621c77a0a11214"  

S = "${WORKDIR}/autobahn-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python python-pprint python-twisted-protocols python-netserver python-twisted-web"
