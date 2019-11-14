package kcourse.HW

import org.omg.PortableInterceptor.INACTIVE

fun main() {

    val tpr:Int = 50

    val state:String = when {
        tpr < 0 -> "Ice"
        tpr in 0..100 -> "Liquid water"
        else -> "Vapor"
    }

    println(state)


}