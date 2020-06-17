package kOOP.CO

import kotlin.random.Random
import kotlin.random.nextInt

class MyRandom {
    companion object {
        private const val m = "Monday"
        private const val f = "Friday"
        private const val w = "Wen"
        private const val s = "Sat"
        private const val s2 = "Sun"


        fun rand(a: Int, b: Int) =
                when {
                    a < b -> Random.nextInt(a..b)
                    else -> "No I can't do it"
                }


        fun what() = Random.nextBoolean()

        fun week(): String {
            val l = listOf<String>(m,f,w,s, s2)
            return l.random()
        }
    }
}

fun main() {
    println(MyRandom.rand(1,-10))

    println(MyRandom.what())

    println(MyRandom.week())
}