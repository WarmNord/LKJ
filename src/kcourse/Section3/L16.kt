package kcourse.Section3

fun main() {
   /* val revenurByWeek = listOf(
            listOf(6, 7, 8, 9, 0),
            listOf(4, 7, 3, 9, 0),
            listOf(6, 7, 11, 9, 3),
            listOf(22, 7, 3, 9, 6),
            listOf(9, 7, 7, 9, 6)
    )
    val total =
            revenurByWeek.flatten()

    val average = total.average()
    println(average)*/

    val data = mapOf (
            "f1" to listOf(13,43,67,25,45),
            "f2" to listOf(1006,-25,45,67,25),
            "f3" to listOf(28,54,34,43,67)

    )

    val average = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()

    println(average)








}