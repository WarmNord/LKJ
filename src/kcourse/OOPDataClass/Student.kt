package kcourse.OOPDataClass
 class Student(var name: String, var lastName: String, var id: String) {
     fun copy(name: String =this.name, lastName: String = this.lastName , id: String = this.id) : Student {
         return Student(name, lastName, id)

     }

     /* operator fun component1() = name
      operator fun component2() = lastName
      operator fun component3() = id*/
    // data class
    // переопредлен метод toString()
    // переопредлен hasCode() зависит от полей объекта
    // переопредлен equals() зависит от полей класса
     // переопредлен метод copy()

}