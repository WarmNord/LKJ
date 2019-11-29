package kcourse.HW.stepic

fun main() {
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val d = scan.nextInt()
    val e = scan.nextInt()
    val f = scan.nextInt()

    var count = 2 * d + e * (a * b + c) - f
    println(count)
}