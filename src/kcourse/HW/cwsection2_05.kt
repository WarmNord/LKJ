package kcourse.HW

fun main() {
    val a = 350
    if ((a > 200) && (a < 500)) {
        println("You can buy doner")
    } else if (a > 500) {
        println("You can buy pizza")
    } else if (a <= 200) {
        println("You can buy nothing")
    }
}