package kOOP.HWData

 class Address(val nameCity: String, val street: String, val numberOfHouse: Int) {

     fun copy(nameCity: String = this.nameCity, street: String = this.street, numberOfHouse: Int = this.numberOfHouse): Address {
         return Address(nameCity, street, numberOfHouse)
     }
     operator fun component1() = nameCity
     operator fun component2() = street
     operator fun component3() = numberOfHouse
}