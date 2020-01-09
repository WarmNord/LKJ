package jav.BaseProgStepic

import kcourse.Section1.scan

fun main() {
    val a = arrayOf(scan.nextLine())

    println(a.joinToString(separator = ", "))
}