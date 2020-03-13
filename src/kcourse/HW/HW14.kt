package kcourse.HW

fun main() {
   val array = generateSequence("emp №1") {
       val index = it.substring(5).toInt()
       "Emp №${index + 1}"
   }

    val list = array.take(100)

    for (i in list)
    {
        println(i)
    }
}