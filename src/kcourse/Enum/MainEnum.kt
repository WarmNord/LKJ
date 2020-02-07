package kcourse.Enum

import kcourse.Enum.Month.*
import kcourse.Enum.Season.*


fun main() {

    val month: Month = SEPTEMBER

    val season = when(month){

        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(month.tempAverage)
    println(season)
}