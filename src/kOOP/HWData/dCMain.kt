package kOOP.HWData

fun main() {
    val a1 = Address("Ekb","Street",45)
    val a2 = a1.copy()

    println(a1)
    println(a2)

    println(a1.hashCode())
    println(a2.hashCode())

    println(a1 == a2)

    val (nameCity: String, street: String, numberOfHouse: Int) = a1
    

}