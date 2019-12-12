package kcourse.HW.stepic

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val a = scanner.nextLine()

    val k = a.split(" ")

    val n = Array<Int>(10,{0})

    for (k in k){
        n[k] = scanner.nextInt()
    }





    println(n.sortedArrayDescending())




}