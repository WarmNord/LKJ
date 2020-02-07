package kcourse.HW.stepic

import java.util.*

val scan = Scanner(System.`in`)

fun main() {
    var a = 1
    var n = scan.nextInt()
    var sumnumb = 0
    var max = 0
    var maxnumb = 0
    for (i in a..n){

        var l = i
        var sumnumb = 0
        while (l != 0) {
            var s = l % 10
            sumnumb += s
            l /= 10

            if (max < sumnumb) {
                max = sumnumb
                maxnumb = i
            }
        }

    }
    println("$maxnumb $max ")

}




