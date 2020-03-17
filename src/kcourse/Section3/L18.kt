package kcourse.Section3


// функции высшего порядка управляют другими функциями


var name: String? = "nullgg"
fun main() {

   /* name?.let {
        if (it.length > 5) println(it)
    }
*/

    val list = mutableListOf<Int>()

    with(list){

        for (i in 0 until 1000)
        {
           add((Math.random() * 100).toInt())
        }

        println(sum())
        println(average())
        println(max())
        println(min())
        println(first())
        println(last())
    }





}