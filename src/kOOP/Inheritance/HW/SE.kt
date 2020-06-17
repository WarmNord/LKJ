package kOOP.Inheritance.HW

class SE(name: String, age: Int, val pl: String):Worker(name,age), Cleaner {
    override fun work() {
        println("I'm write code on $pl")
    }

    override fun clean() {
        println("SE is cleaning")
    }
}