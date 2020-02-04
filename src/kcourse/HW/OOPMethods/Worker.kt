package kcourse.HW.OOPMethods

import java.time.Year
import java.util.*

class Worker(val name:String,val position: String, val year: Int) {

    fun work() = println("Working...")

    val wEx: Int //свойста создаются через объявление переменных val or var
    get() = Calendar.getInstance().get(Calendar.YEAR) - year

}

