package kOOP.Anonim.Water

class Sportsman {

   fun needWater(waterMan: WaterMan) {
        waterMan.giveWater()
    }

    inline fun waterMan(giveWater: () -> Unit) {
        giveWater()
    }
}