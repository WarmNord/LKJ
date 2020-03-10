package kcourse.Section2

import java.util.*
import kotlin.collections.ArrayList

fun main() {
//по умолчанию классы коллекций неизменяемы
   // с помощью Mutable становятся изменяемыми
   // использовать абстракции вместо реализации - приводить к родительскому типу
val listOfNumbers: MutableList<Int> = mutableListOf()
   listOfNumbers.add(5)
   println( listOfNumbers[0])


   }





