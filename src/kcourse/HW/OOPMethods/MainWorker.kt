package kcourse.HW.OOPMethods

fun main() {
    val w = Worker("Andy","QA",2018)




}

fun Worker.printInfo() { //extension функция
    println("Name $name, Position $position, Year $year, Experience $wEx")

}