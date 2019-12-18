package kcourse.HW.stepic

import java.util.*

fun main() {

        val c1 = scan.next()[0]
        val c2 = scan.next()[0]
    val b = scan.nextBoolean()
        print(isCaseEquals(c1,c2))

}



fun isCapitalized(s: String):Boolean {
   return(if (s[0].isUpperCase()) true else false)
}

fun isCaseEquals(c1: Char, c2: Char):Boolean {
    return (when {

        c1.isUpperCase() && c2.isUpperCase() == true -> true
        c1.isLowerCase() && c2.isLowerCase() == true -> true
        else -> false


    })
}

/*
fun check(s1: String,s2: String,ignoreCase: Boolean) {
    return (when {

        s1[0].isUpperCase() && s2[0].isUpperCase() == true -> true
        s1[0].isLowerCase() && s2[0].isLowerCase() == true -> true
        else -> false


    })





}
*/
