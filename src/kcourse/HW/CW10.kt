package kcourse.HW

fun main() {
printInfo(sn = "puff") }

fun printInfo(ln:String = "",n:String = "",sn:String = "") {

    if (ln.isNotEmpty()){
    println("Last Name: $ln")}

    if (n.isNotEmpty()){
    println("Name: $n")}

    if (sn.isNotEmpty()){
    println("Second Name: $sn")}
}


fun volume(a:Int, b:Int = a, c:Int = a) = a * b * c


