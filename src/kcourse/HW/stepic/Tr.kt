package kcourse.HW.stepic

import java.lang.Math.abs
import java.util.*
val sc = Scanner(System.`in`)
fun main() {

    val x1 = sc.nextInt()
    val y1 = sc.nextInt()

    val x2 = sc.nextInt()
    val y2 = sc.nextInt()

    if ((abs(x1 - x2) == abs(y1 - y2)) || (x1==x2) || (y1==y2)) println("YES") else println("NO")
}