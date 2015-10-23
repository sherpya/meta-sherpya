DESCRIPTION = "AutobahnPython provides a WebSocket (RFC6455, Hybi-10 to -17, Hixie-76) framework for creating WebSocket-based clients and servers. \
AutobahnPython also includes an implementation of WAMP (The WebSockets Application Messaging Protocol), a light-weight,  \
asynchronous RPC/PubSub over JSON/WebSocket protocol."
HOMEPAGE = "http://autobahn.ws/python"
SECTION = "console/network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92f7efe35161605ba200554c84c2b04b"

SRC_URI = "https://pypi.python.org/packages/source/a/autobahn/autobahn-${PV}.tar.gz \
    file://python-autobahn-ssl-fix.patch"
SRC_URI[md5sum] = "fa90fa91f9c0e711ca6e87c7e9d835b7"
SRC_URI[sha256sum] = "3fecc1e2a26a0421128ddcfb4e577f0bc669dd65d0e0fdad1c773965cbcef75a"

S = "${WORKDIR}/autobahn-${PV}"

inherit setuptools
inherit allarch

RDEPENDS_${PN} = "python python-pprint python-twisted-protocols python-netserver python-twisted-web"
