package kcourse.OOPMethods

import java.time.Year
import java.util.*

fun main() {

    val cat = Cat("Barsik", 12,3f) //это не функция, а свойство, которого есть getter, но нет setter

    cat.printInfo()
    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)
    
}

