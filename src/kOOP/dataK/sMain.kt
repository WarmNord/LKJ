package kOOP.dataK

fun main() {
    val student1 = Student("Ivan","Ivanov", "412344")
    val student2 = student1.copy(id = "45")
    //val (name: String, lastName: String, id: String) = student1
    println(student2)

   /* println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)*/

}