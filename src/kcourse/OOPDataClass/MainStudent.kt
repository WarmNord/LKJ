package kcourse.OOPDataClass

import kcourse.Section3.name


fun main() {
    val student1 = Student("Ivan", "Ivanov", "412344")
    val student2 = student1.copy()

   // val (name, lastName, id) = student1 // деструктор или дестурктивный опратор,


   /* println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2) //сравненение объектов == ; in Java equals()
    println(student1 === student2) //сравненение ссылок ===; in Java ==
*/

}