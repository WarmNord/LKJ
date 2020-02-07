package kcourse.OOPInheritance

class Dog(weight: Float) : Animal("Dog",weight,"Earth") {

    override fun eat(){
        println("Eat bones")
    }

}