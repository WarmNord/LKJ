package kcourse.HW

fun main() {
    val fullNames = mutableListOf<String>()
    for (i in 0..1000){
        fullNames.add("Name$i Fname$i")
    }

    val names = fullNames.map { it.substringBefore(" ") }
    val lnames = fullNames.map { it.substringAfter(" ") }



    val users = names.zip(lnames)
    for (user in users)
    {
        println("Name: ${user.first} Fname: ${user.second}")
    }
}