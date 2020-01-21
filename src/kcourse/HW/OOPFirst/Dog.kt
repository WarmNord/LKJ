package kcourse.HW.OOPFirst

class Dog {

    var name: String = ""
        get() = field.toLowerCase().capitalize()


    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var weigth: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}