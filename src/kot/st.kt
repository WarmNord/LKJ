package kot

val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextLine()
    val b = scan.nextLine()
    println(a[0] +" " + a[a.length - 1])
    println(b[0] +" " + b[b.length - 1])
}

