package kcourse.Section3

fun main() {

    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..99){
       listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter ({ number: Int -> number % 2 == 0})

    for (i in listOfEvenNumbers){
        println(i)
    }



}