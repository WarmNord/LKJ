package kcourse.HW.stepic

import java.util.*


val scanner = Scanner(System.`in`)

fun main() {


    val str = scanner.nextLine()
    val numArr = Arrays.stream(str.split(" ".toRegex()).toTypedArray()).mapToInt { s: String -> s.toInt() }.toArray()

    println(numArr.sortedArrayDescending())
}
