package kOOP.Worker

import java.time.Year
import java.util.*

class Worker(val name: String, val w: String, val year: Int) {

    val exp: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - year

    fun work() = println("I'm working")

}