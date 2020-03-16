SRC_URI_append_zturn-zynq7020 = " file://zynq7020-zturn.dts;subdir=git/arch/${ARCH}/boot/dts file://fragment.cfg "

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#PACKAGE_ARCH = "zturn-zynq7020"
PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE_zturn-zynq7020 += "zynq7020-zturn.dtb"
