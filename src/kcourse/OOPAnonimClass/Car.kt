package kcourse.OOPAnonimClass

    class Car(override var name:String = "Car"): Transport(name) {
        override fun drive() {
            println("Car go")
        }

        fun startEngine(): Boolean {
            println("Run Car")
        return true}
    }