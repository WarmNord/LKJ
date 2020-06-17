package jav.BaseProgStepic

fun main() {
    var sum = 0
    for (i in 2..19) {
        if (i % 4 == 0) {
            break
        }
        sum += i
    }
    println(sum)
}