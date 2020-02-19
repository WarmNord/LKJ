package kcourse.HW.OOPInheritance

class softwareEng(name:String,age:Int, val plang:String): Worker(name, age), Cleaner{

    override fun work() = println("Write code on $plang")
    override fun clean() {
        println("SE clean")

    }
}