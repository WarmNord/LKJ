package kcourse.Section1


private var name: String? = "ghfdgfg"
fun main() {
    /** val name : String = "Ivan"
    var age : Int = 2
    println(name + " " + age) */

    val length : Int = name?.length?:0

    println(length)

}
