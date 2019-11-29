package jav.BaseProgStepic

import java.util.*

val sc = Scanner(System.`in`)
fun main() {
    val a = sc.nextLine()

    val m =  "$a".split(" ")

    when{
        m[0].startsWith("$m[1]")-> println("1")
        !( m[0].endsWith("*")) && !( m[0].startsWith("*")) && ( m[0].contains('*'))-> println("2")
        m[0].endsWith("*")-> println("3")
        !( m[0].contains('*'))-> println("4")
    }


}