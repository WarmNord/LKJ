package kcourse.Section3

fun main() {
/*
    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..99){
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }

    for (i in listOfEvenNumbers )
    {
        println(i)
    }


val name = listOf("Ivan","Andrey","Alex","Fil")

    val namesStartA = name.filter { it.startsWith("A") }
    for (name in namesStartA) {
        println(name)
    }


    val numbers = (0..100).toList()

    val empl = numbers.map { "Employeer #$it" }
    for (empl in empl){
        println(empl)
    }
    */

    val array = arrayOf(8, 34, 6, -9)
    val sortefar = array.sortedDescending()

    for (i in sortefar) {
        println(i)
    }


}