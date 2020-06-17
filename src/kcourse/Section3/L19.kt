package kcourse.Section3

fun main() {

    val obj = mutableMapOf<String, String>()
    with(obj){
        keys
        values
    }
}

  inline  fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
    }

