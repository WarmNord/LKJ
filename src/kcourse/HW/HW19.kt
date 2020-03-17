package kcourse.HW

fun main() {

    val c = (0..100).toList()

    cColl(c){
        println(it.sum())
    }



}

//если не объявить функцию inline, то будет создан объект анонимного класса и потом вызван метод
inline fun  cColl(l: List<Int>, operator: (List<Int>) -> Unit) {
    operator(l)
}