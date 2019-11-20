SRC_URI += "file://zynq7020-zturn.dts;subdir=git/arch/${ARCH}/boot/dts \
            file://fragment.cfg \
            "

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#PACKAGE_ARCH = "zturn-zynq7020"
PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE += "zynq7020-zturn.dtb"
