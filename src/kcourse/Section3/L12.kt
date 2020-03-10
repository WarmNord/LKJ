package kcourse.Section3

fun main() {
    //нигде не дали имя, поэтому функция анонимная - лямбда выражение
    //функция в фигурных скобках
    //Если функция ничего не возвращает, то после  val sum:(Int, Int) -> пишется Unit(аналог void in Java)
  val sum:(Int, Int) -> Int = { a, b -> a + b}

    // it - переменная, созданная компилятором, возможно, если только 1 параметр используется
    val square:(Int) ->  Int = { it * it}

    val p: (Int,Int) -> Int = {a,b -> 2 * (a + b)}

    val n:(String) -> Unit = { println("Hi, $it!")}

    val ar:(Array<Int>) -> Array<Int> = {it -> it.sortedArrayDescending()}


    val a =sum(2,10)

    
}