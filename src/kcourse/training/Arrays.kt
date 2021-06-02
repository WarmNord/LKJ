package kcourse.training

fun printArray(items: Map<String,Any>) {

    items.forEach{ key, value -> println("$key is $value")}
}

fun main(args: Array<String>) {
    var items = arrayOf(5, 7, 12, 4, 0, 1, true)
    //var items_list = listOf(5, 7, 12, 4, 0, 1)
    var items_list = mutableListOf<Any>(5, 7, 12, 4, 0, 1)
    // var someArray = arrayOf(true)
    //println(items.set(0, 45))
    //println(items[0])
    //println(items[1])
    //println(items.size)

    var dogs = listOf<Any>("Bob", "Charley")
    items_list.add("Dogs")
    items_list.addAll(4, dogs )

    var user = mutableMapOf( "name" to "Bob", "age" to 1, "isHasCar" to true)
   // user.put("city", "NY")

    printArray(user)
    //user.
   // var user = mapOf( "name" to "Bob", "age" to 1, "isHasCar" to true)

    // for (i in items) println(i)
    // items.forEach { println(it) }
    //items.forEachIndexed() { index, i -> println("$i index $index") }


    //user.forEach { key, value -> println("$key is $value") }
}