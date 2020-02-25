package kcourse.HW.OOPComObj

class MyRandom {

    companion object {
        private const val MONDAY = "Monday"
        private const val FRIDAY = "Friday"
        fun randomInt(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randomBoolean() = randomInt(0, 1) > 0
        fun randomDayOfWeek(): String {
            val index = randomInt(1, 7)
            return when (index) {
                1 -> MONDAY
                5 -> FRIDAY
                else -> "Some of day"
            }
        }
    }


}

