package kcourse.Section3

fun main() {

   /* val listOfNumbers = mutableListOf<Int>()
        for (i in 0..99) {
            listOfNumbers.add(i)
        }

    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }

     for (i in listOfEvenNumbers)
     {
         println(i)
     }


    val listNames = mutableListOf<String>()

    for (i in 0..10) {
        listNames.add("A$i")
        listNames.add("B$i")
    }

    val listNamesA = listNames.filter { it.startsWith("B")}

    for (i in listNamesA)
    {
        println(i)
    }*/

    val numbers = (0..100).toList() // list of numbers from 0 to 100

  /*  val doubledNumbers = numbers.map { it * 2 } // Method MAP Element in new COllections may be different type

    for (i in doubledNumbers)
    {
        println(i)
    }*/

   /* val employees = numbers.map { "Employee #$it" }

    for ( i in employees)
    {
        println(i)
    }*/

    val array = arrayOf(6,4,56,-9,67)
    val sArray = array.sortedDescending()

    for (i in sArray){
        println(i)
    }

}