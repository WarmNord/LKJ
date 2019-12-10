package kcourse.Section3

fun main() {
    /*val array = (0..1000).toList()
    val employees = array.map { "Employee №$it" }
    val first30 = employees.drop(950)

    for (employees in first30)
    {
        println(employees)
    }
     */

    val array = generateSequence(0) {it + 2}
    val evenList = array.take(100)
    for (i in evenList){
        println(i)
    }




}
