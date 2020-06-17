package kOOP.kEnum

import kOOP.kEnum.Month.*
import kOOP.kEnum.timeYear.*

fun main() {
    val month = DECEMBER
    when (month) {
        DECEMBER, JANUARY,FEBRUARY -> println(WINTER)
        MARCH,APRIL,MAY -> println(SPRING)
        JUNE,JULY,AUGUST -> println(SUMMER)
        SEPTEMBER,OCTOBER,NOVEMBER -> println(AUTUMN)
    }
    println(DECEMBER.tAverage)
}