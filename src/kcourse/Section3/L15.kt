package kcourse.Section3

import kcourse.HW.stepic.isCapitalized
import org.omg.PortableInterceptor.INACTIVE

fun main() {

    val names = mutableListOf<String>()
    val phones = mutableListOf<Int>()

    for (i in 0..1000){
        names.add("Name $i")
        phones.add(7895 + i)
    }

    val users = names.zip(phones)

    for (users in users)
    {
        println("name ${users.first}  phone ${users.second}")
    }

    val a = "bvz vjt"

    println(a.substringBefore(" "))


    val famName = mutableListOf<String>()

    for (i in 0..100){
        famName.add("F$i N$i")
    }

    val f = famName.map { it.substringBefore(" ") }

    val n = famName.map { it.substringAfter(" ") }

    val pair = f.zip(n)

    for ( pair in pair){
        println("${pair.first} ${pair.second}")
    }

}