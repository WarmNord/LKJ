package kcourse.HW.stepic

import java.util.*

val can = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s1 = can.next()
    val s2 = can.next()
    val b = can.nextBoolean()
    print(check(s1, s2))
}


fun check(str1: String, str2: String, ignoreCase: Boolean = false): Boolean {
    return when {
        !ignoreCase && (str1[0] == str2[0]) -> true
        !ignoreCase && (str1[0].isLowerCase() == str2[0].isLowerCase()) -> true
        !ignoreCase && (str1[0].isUpperCase() == str2[0].isUpperCase()) -> true
        ignoreCase && (str1[0].toLowerCase() == str2[0].toLowerCase()) -> true
        else -> false
    }

}

fun isCapitalized(s: String): Boolean {
    return (if (s[0].isUpperCase()) true else false)
}

fun isCaseEquals(c1: Char, c2: Char): Boolean {
    return (when {

        c1.isUpperCase() && c2.isUpperCase() == true -> true
        c1.isLowerCase() && c2.isLowerCase() == true -> true
        else -> false


    })
}



