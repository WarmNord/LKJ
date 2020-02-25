package kcourse.HW.OOPAnonClass

class Sportsman {
    fun ivokeWater(wb: WaterNeed){
        wb.giveWater()
    }

   inline fun invokeWater(bringWaterNeed: () -> Unit) {
        bringWaterNeed()
    }



}