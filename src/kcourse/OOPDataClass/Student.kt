package kcourse.OOPDataClass

data class Student(val name: String, val lastName: String, val id: String) {

    /* operator fun component1() = name
     operator fun component2() = lastName
     operator fun component3() = id*/
    // data class
    // переопредлен метод toString()
    // переопредлен hasCode() зависит от полей объекта
    // переопредлен equals() зависит от полей класса
     // переопредлен метод copy()

}