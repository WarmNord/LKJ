package kOOP.Anonim.Water

fun main() {
    val s = Sportsman()
/*    s.needWater(object : WaterMan {
        override fun giveWater() {
            println("Your water")
        }
    })*/
    s.waterMan { println("Вода принесена") }

/*    view.setOnClickListener {

    }*/
}