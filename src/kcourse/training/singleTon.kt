package kcourse.training

fun main() {

    var ans: Int
    ans = singleExample.multiply()
    println("${singleExample.y}")
    println("${ans}")
    
}

object singleExample {

    private var  x = 4
    var  y: Int = 2

    fun multiply(): Int {
        return  x * y
    }
}