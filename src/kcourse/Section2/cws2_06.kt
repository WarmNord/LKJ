package kcourse.Section2

fun main() {
    val idexM = 3
    val season: String = when(idexM) {
        12, 32 -> {
            "Winter"
        }
        in 3..5 -> {
            "Spring"
        }
        else -> {
           "nothing"
        }

    }




    fun wt(tpr:Int) {

       val state:String = if (tpr < 0 ) {
            "Ice"
        } else if (tpr > 0 && tpr < 100 ) {
            "Liquid water"
        } else {
            "Vapor"
        }

        println(state)

    }

    wt(101)



}



