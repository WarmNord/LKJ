package kcourse.Section2

fun main() {

    var name: String? = "Sergey"

    fun main() {
        if (name != null) {
            if (name.length > 5) {
                println("Больше 5-ти")
            } else {
                println("Меньше 5-ти")
            }
        }
    }
}

fun sum(a:String, b:String): Int {

   val a = return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e:Exception) {
        0
    }

}