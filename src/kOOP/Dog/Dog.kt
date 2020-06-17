package kOOP.Dog

class Dog {
    val name: String = ""
        get() {
            return field.toLowerCase().capitalize()
        }
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
    var weigth: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

}