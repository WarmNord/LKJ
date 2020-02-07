package kcourse.HW.OOPDataCl

 class Adress(val nameCity: String, val street: String, val numbHouse: Int) {

     fun copy(nameCity: String = this.nameCity, street: String = this.street,  numbHouse: Int = this.numbHouse): Adress {
         return Adress(nameCity,street,numbHouse)
     }

     operator fun component1() = nameCity
     operator fun component2() = street
     operator fun component3() = numbHouse
}