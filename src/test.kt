
fun sum(a: Int, b: Int) = a + b
fun main() {
    val s1: (Int, Int) -> Int = ::sum
    print(s1(2, 4))
}