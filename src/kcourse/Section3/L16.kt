package kcourse.Section3

fun main() {
    val revenueByWeek = listOf(
            listOf(8, 6, 5, 1, 2),
            listOf(4, 6, 5, 1, 2),
            listOf(8, 6, 6, 1, 2),
            listOf(8, 6, 5, 9, 2)
    )

    val total = revenueByWeek.flatten()

    val average = total.average()
    println(average)


}