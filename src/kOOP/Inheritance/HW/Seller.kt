package kOOP.Inheritance.HW

class Seller(name :String, age: Int): Worker(name,age),Cleaner {
    override fun work() {
        println("Sell things")
    }

    override fun clean() {
        println("Seller is cleaning")
    }
}