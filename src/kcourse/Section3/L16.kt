package kcourse.Section3

fun main() {
  /*  val revenueByWeek = listOf(
            listOf(8, 6, 5, 1, 2),
            listOf(4, 6, 5, 1, 2),
            listOf(8, 6, 6, 1, 2),
            listOf(8, 6, 5, 9, 2)
    )

    val total = revenueByWeek.flatten()

    val average = total.average()
    println(average)

   */

    val data = mapOf(

            "file1" to listOf(15,40,45,15,12),
            "file2" to  listOf(560,-20,45,18,12),
            "file3" to  listOf(15,90,45,15,12)
    )

    val average = data.filterNot { it.value.any() { it < 0 } }.flatMap { it.value }.average()
    println(average)
}