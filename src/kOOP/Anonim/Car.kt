package kOOP.Anonim

class Car(override var name: String = "Car"): Transport(name) {
    override fun drive() {
        println("Car go")
    }

    fun startEngine(): Boolean {
       println("Start Car")
        return true
    }
}