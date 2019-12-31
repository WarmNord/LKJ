import java.util.*

object Cycle {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val a = scanner.nextInt()
        for (i in 1..a) {
            if (a % i == 0) {
                println(i)
            }
        }
    }
}