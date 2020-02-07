package kcourse.HW.OOPDataCl

fun main() {
    val adres1 = Adress("NY","Blue",8)
    val adres2 = adres1.copy()

    val(name, st, nm) = adres1

    println(adres1)
    println(adres2)

    println(adres1.hashCode())
    println(adres2.hashCode())

    println(adres1 == adres2)
    println(adres2 === adres2)
}