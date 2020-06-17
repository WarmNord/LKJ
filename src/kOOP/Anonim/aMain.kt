package kOOP.Anonim

fun main() {
    travel(object : Transport("Bus") {
        override fun drive() {
            println("$name is goes")
        }
    })
}

fun travel(transport: Transport) {
    transport.drive()
}