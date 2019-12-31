package kcourse.Section3

var name: String? = null

fun main() {

    val list = mutableListOf<Int>()

    with(list) {
        for (i in 0 until 1000 ) {
          this.add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())


    }





}