package kcourse.HW.stepic

import java.util.*

val scan = Scanner(System.`in`)

fun main() {
    var a = 1
    var n = scan.nextInt()
    var cnt = 0
    for (i in a..n){

        var l = i
        while (l != 0) {
            var s = l % 10
            if (s == 7) cnt += 1
            l /= 10

        }

    }
    println(cnt)

}




