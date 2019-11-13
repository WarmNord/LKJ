package kcourse.Section2

fun main() {
    val idexM = 3
    val season: String = when(idexM) {
        12, 32 -> {
            "Winter"
        }
        4, 3 -> {
            "Spring"
        }
        else -> {
           "nothing"
        }

    }
    println(season)
}
