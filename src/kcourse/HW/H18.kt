package kcourse.HW

val list:MutableList<Int>? = mutableListOf()

fun main() {
    list?.let { with(list){
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
        }
        val result = filter { it % 2 ==  0}.take(100)
        for ( i in result){
            println(i)
        }
    } }

}