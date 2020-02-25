package kcourse.OOPSingleTon

class DataBase private constructor(){

    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun inserData(str: String) {
        data.add(str)
    }

        fun getInstance(): DataBase {
            return DataBase()
    }
}