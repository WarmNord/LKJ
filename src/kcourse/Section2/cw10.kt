package kcourse.Section2

fun main() {
    printInfo(Sname = "ffff", Lname = "ffdd", Fname = "fdsf")

}

fun printInfo(Lname: String = "", Fname: String = "", Sname: String = "") {

    if (Lname.isNotEmpty()) {
        println("Lname: $Lname")
    }

    if (Fname.isNotEmpty()) {
        println("Fname: $Fname")
    }

    if (Sname.isNotEmpty()) {
        println("Sname: $Sname")
    }



}

