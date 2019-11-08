package kcourse.HW

private var a: String? = "qq"
private var b: String? = null
private var c: String? = "ggfg"

fun main() {
    val a1 = a?.length?:0
    val a2 = b?.length?:0
    val a3 = c?.length?:0

    print(a1 + a2 + a3)
}