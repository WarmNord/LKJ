package jav.BaseProgStepic

import java.util.*

val scan = Scanner(System.`in`)
fun main() {

    val a = scan.nextInt()

    var c: Int = 0
    for (i in a..1) {

        if (a % i == 0 && i < a) {

            c = i

        }

    }
    println(c)

}