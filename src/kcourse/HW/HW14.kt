package kcourse.HW

fun main() {
    val array = generateSequence(1) {
        it + 1
    }

    val listemployee = array.take(100)

    for (i in listemployee) {
        println("Employee №$i")
    }
}