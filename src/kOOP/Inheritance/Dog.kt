package kOOP.Inheritance

class Dog(weight: Float): Animal("Dog", weight, "Earth") {

    override fun eat(){
        println("eat bone")
    }
}