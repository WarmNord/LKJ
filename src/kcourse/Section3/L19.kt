package kcourse.Section3

fun main() {

     val result = modifyString("Hello world") {it.toUpperCase()}

    println(result)


}

fun modifyString(string: String, modify: (String) -> String ) : String {
    return modify(string)
}