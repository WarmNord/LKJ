package kcourse.OOPDataClass

fun main() {
    val student1 = Student("Ivan", "Ivanov", "412344")
    val student2 = student1.copy(id = "234")

    val (name, lastName, id) = student1 // деструктор или дестурктивный опратор,

    println(name)
    println(lastName)
    println(id)

   /* println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2) //сравненение объектов == ; in Java equals()
    println(student1 === student2) //сравненение ссылок ===; in Java ==
*/

}