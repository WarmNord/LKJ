package kcourse.HW.OOPAnonClass

fun main() {
    val spr = Sportsman()
  /*  spr.ivokeWater(object : WaterNeed{
        override fun giveWater() {
            println("your Water")
        }
    })*/
    spr.invokeWater { println("Вода принесена") }
}