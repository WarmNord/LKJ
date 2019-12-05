package kcourse.Section3

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val square: (Int) -> Int = { it * it }

    val s: (Int, Int) -> Int = { a: Int, b: Int -> 2 * (a + b) }

    val hello: (String) -> String = { a: String -> "Hi, $a!" }

    val sort: (Array<Int>) -> Array<Int> = {

    for (i in it.size - 2 downTo 0) {
        for (j in 0..i) {
            if (it[j] < it[j + 1]) {
                val temp = it[j]
                it[j] = it[j + 1]
                it[j +1] = temp
            }
        }
    }
        it

    }


    val sArr = sort(arrayOf(0,1,59,765,56,48,85,254,4,6))
    for (i in sArr) {
        println(i)
    }
    
}