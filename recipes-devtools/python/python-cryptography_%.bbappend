# In order to compile the python-cryptography library with pthread option
# (it is a bug of porting python-cryptography in sumo and also other branches).
# Link: https://lists.yoctoproject.org/pipermail/yocto/2017-December/039405.html

export LDSHARED="${CCLD} -shared -pthread"
