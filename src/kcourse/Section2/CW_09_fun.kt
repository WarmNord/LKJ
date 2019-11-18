package kcourse.Section2

fun main() {
    println(sum(5,5,5,5))


}

fun max(a:Int, b:Int)= if (a > b) a else b

fun crop(a:String) = a.substring(0,Math.min(5,a.length))

fun sum(vararg numbers:Int): Int{
    var result = 0
    for (num:Int in numbers){
        result += num
    }
    return result
}