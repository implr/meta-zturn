DESCRIPTION = "Recipe to extract platform init from HDF"
SECTION = "bsp"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "virtual/hdf"

PROVIDES = "virtual/xilinx-platform-init"

PACKAGE_ARCH ?= "${MACHINE_ARCH}"

inherit xsctbit deploy xilinx-platform-init

XSCTH_MISC = "-hwpname ${XSCTH_PROJ}_hwproj -hdf_type ${HDF_EXT}"

do_compile[noexec] = "1"


SYSROOT_DIRS += "${PLATFORM_INIT_DIR}"

do_install() {
    install -d ${D}${PLATFORM_INIT_DIR}
    for i in ${XSCTH_WS}/${XSCTH_PROJ}_hwproj/ps7_init_gpl.*; do
            install -m 0644 $i ${D}${PLATFORM_INIT_DIR}/
    done
}


FILES_${PN} += "${PLATFORM_INIT_DIR}/*"
