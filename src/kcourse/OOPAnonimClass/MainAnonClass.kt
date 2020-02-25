package kcourse.OOPAnonimClass

fun main() {

    travel(object : Transport("Bus"){
        override fun drive() {
            println("$name go")
        }
    })
/*
    val car: Transport = Car()
    val bycycle:Transport = Bycycle()

    if (car is Car && car.startEngine())

    println(car.name)

*/

}

fun travel(transport: Transport) {
    transport.drive()
}