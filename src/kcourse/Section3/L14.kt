package kcourse.Section3

fun main() {

  /*  val array = (0..100).toList()

    val empl = array.map { "Employer #$it" }

    val first30 = empl.dropLast(30)
    for (i in first30)
    {
        println(i)
    }*/

    val array = generateSequence{(Math.random() * 100).toInt()}

    val evenList = array.take(10)

   for (i in evenList)
    {
        println(i)
    }
}
