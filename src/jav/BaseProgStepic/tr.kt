package jav.BaseProgStepic

import java.util.Scanner

object tr {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val k = sc.nextInt()
        val m = sc.nextInt()

        println(k / m)
    }
}
