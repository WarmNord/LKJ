package kOOP.Inheritance.HW

class Director(name: String, age: Int): Worker(name, age) {
    override fun work() {
        println("Management the process")
    }
}